## 前言
MySQL数据库远程连接（局域网）是指在局域网内的不同计算机或设备之间，通过网络连接到MySQL数据库服务器的过程。在这种情况下，MySQL数据库服务器位于局域网中的一台计算机上，而需要连接到该服务器的客户端则可以是同一局域网内的其他计算机或设备。
## 客户端
客户端如果本地有mysql，需要关闭；
windows，打开任务管理器，点击服务，找到mysql关闭；
Linux，系统中关闭本地 MySQL 服务；
## 开启访问权限
登录mysql命令
```
mysql -u root -p
```
切换到名为 "mysql" 的数据库
```
use mysql
```
查看 "user" 表中的 "user" 和 "host" 列的数据
```
select user, host from user;
```
输入命令更改root用户访问权限，host值改为%就代表在任何客户端机器上能以root用户登录mysql服务器；
```
update user set host='%' where user='root';
```
更新设定，运行命令
```
flush privileges;
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690537181509-1837731f-addd-4d24-b7f7-1946db9115be.png#averageHue=%23131313&clientId=ufd2c9008-85d4-4&from=paste&height=545&id=ud051e82c&originHeight=817&originWidth=1360&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=66813&status=done&style=none&taskId=u574e3317-ed27-4382-90ba-2d0e8ecb77a&title=&width=906.6666666666666)
## 防火墙设置
### windows
命令：用于在防火墙配置中永久地开放TCP端口 3306。在这里，端口 3306 是 MySQL 数据库服务器默认监听的端口。
```
firewall-cmd --permanent --add-port=3306/tcp
```
可视化：打开防火墙，防火墙高级设置，给入站规则新建规则，选择TCP端口填3306端口号，选择允许所有连接，完成；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690538235102-6689518d-12ea-4f46-81b7-652a1c2b9580.png#averageHue=%23f6f5f4&clientId=ufd2c9008-85d4-4&from=paste&height=293&id=udf673433&originHeight=440&originWidth=1057&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=134926&status=done&style=none&taskId=ufdc9989d-d4e7-4940-ae13-606d41a81c3&title=&width=704.6666666666666)
### Linux
CentOS、Red Hat，防火墙管理工具是firewalld，以下是TCP端口3306的命令：
```
sudo firewall-cmd --permanent --add-port=3306/tcp
sudo firewall-cmd --reload
```
Ubuntu，防火墙管理工具是ufw，以下是TCP端口3306的命令：
```
sudo ufw allow 3306/tcp
sudo ufw reload
```
## 测试连接
将MySQL数据库中的 **localhost** 变成要连接的 IP 地址时；
实际上在将数据库的连接主机从本地主机切换为指定的 IP 地址，这使得 MySQL 数据库能够接受来自特定 IP 地址的远程连接。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690539619265-6a2812f7-a02f-4738-ba33-83f5f73022e0.png#averageHue=%23f7f6f6&clientId=ufd2c9008-85d4-4&from=paste&height=422&id=u847d32be&originHeight=633&originWidth=810&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=21636&status=done&style=none&taskId=u9e9a7e30-1667-415d-a8ec-ba29d27dceb&title=&width=540)

