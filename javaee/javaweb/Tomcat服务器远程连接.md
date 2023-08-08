## IDEA配置远程Tomcat服务器
1、选择 Edit configulations，添加远程Tomcat服务器；
![20201122173109585.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245057569-e71ee9a0-275a-4e36-87dd-df8d802a5e44.png#averageHue=%236b6956&clientId=u3020311e-4aff-4&from=paste&height=378&id=u8b64aee3&originHeight=567&originWidth=1125&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=91330&status=done&style=none&taskId=ufe13dea8-3ab1-446f-8519-f76662b913d&title=&width=750)
2、添加远程Tomcat服务器，选择Remote；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245093656-52e234ee-daa8-4ec5-b8f1-38c55b0c7bde.png#averageHue=%233f4346&clientId=u3020311e-4aff-4&from=paste&height=651&id=uf98abd63&originHeight=977&originWidth=1177&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=284123&status=done&style=none&taskId=u2307cc12-57f8-4b7d-a7e9-c94693f3690&title=&width=784.6666666666666)
3、修改远程连接设置，添加远程主机的IP，默认端口8080，修改tomcat服务器，选择sftp；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245126662-770f247e-4b69-4961-941c-cd573397a227.png#averageHue=%233c4144&clientId=u3020311e-4aff-4&from=paste&height=618&id=u7dbfcfb2&originHeight=927&originWidth=1530&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=228416&status=done&style=none&taskId=u6064f8dd-7405-456f-805c-f6955f966a5&title=&width=1020)
4、添加SFTP，输入远程服务器的IP，登录用户名与密码，点击测试；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245161032-b02c86ba-d400-43aa-9ed2-1ff4d91fadb7.png#averageHue=%233c4042&clientId=u3020311e-4aff-4&from=paste&height=388&id=uf799961d&originHeight=582&originWidth=1145&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=47220&status=done&style=none&taskId=ua953b71e-8892-47b8-9ec6-571586fdd72&title=&width=763.3333333333334)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245218585-d4d90132-803c-4130-a8a7-e7adb18f8fa5.png#averageHue=%233d4143&clientId=u3020311e-4aff-4&from=paste&height=434&id=ud9a71d81&originHeight=651&originWidth=1153&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=108756&status=done&style=none&taskId=ub2721793-8303-4329-9819-ea19a27a034&title=&width=768.6666666666666)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245229776-87c93df7-8ab9-4ea1-8353-45c9eeaded5a.png#averageHue=%233d4143&clientId=u3020311e-4aff-4&from=paste&height=464&id=ud0b7e2c4&originHeight=696&originWidth=1161&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=96553&status=done&style=none&taskId=ue40e2ba9-2c8c-4c48-bf42-4b306a8a461&title=&width=774)
5、选择新建的sftp，项目部署远程主机的路径，选择要部署的工程；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245261934-09f60b90-1802-4783-800f-6d08e783bcb6.png#averageHue=%233d4143&clientId=u3020311e-4aff-4&from=paste&height=629&id=ufe6a40cd&originHeight=944&originWidth=1533&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=212232&status=done&style=none&taskId=uaed4dda3-efa8-4bed-8b85-4eace6d4790&title=&width=1022)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245289238-517e4f8a-115e-4e92-9271-59fa464884a9.png#averageHue=%233c3f42&clientId=u3020311e-4aff-4&from=paste&height=540&id=u10e19f63&originHeight=810&originWidth=1675&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=108756&status=done&style=none&taskId=ud15c8909-4baa-451f-a3e2-41ab307c1b5&title=&width=1116.6666666666667)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691245306889-7677b501-4cab-4d50-85b1-420b09b64937.png#averageHue=%233c3f42&clientId=u3020311e-4aff-4&from=paste&height=611&id=u8bb6f27c&originHeight=917&originWidth=1545&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=91338&status=done&style=none&taskId=u384d897c-bb50-4ae6-a97e-3094c0af584&title=&width=1030)
## 防火墙设置
### windows
命令：用于在防火墙配置中永久地开放TCP端口 8080。在这里，端口 8080 是 MySQL 数据库服务器默认监听的端口。
```
firewall-cmd --permanent --add-port=8080/tcp
```
可视化：打开防火墙，防火墙高级设置，给入站规则新建规则，选择TCP端口填8080端口号，选择允许所有连接，完成；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690538235102-6689518d-12ea-4f46-81b7-652a1c2b9580.png#averageHue=%23f6f5f4&clientId=ufd2c9008-85d4-4&from=paste&height=293&id=RiYyU&originHeight=440&originWidth=1057&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=134926&status=done&style=none&taskId=ufdc9989d-d4e7-4940-ae13-606d41a81c3&title=&width=704.6666666666666)
### Linux
CentOS、Red Hat，防火墙管理工具是firewalld，以下是TCP端口3306的命令：
```
sudo firewall-cmd --permanent --add-port=8080/tcp
sudo firewall-cmd --reload
```
Ubuntu，防火墙管理工具是ufw，以下是TCP端口3306的命令：
```
sudo ufw allow 8080/tcp
sudo ufw reload
```
