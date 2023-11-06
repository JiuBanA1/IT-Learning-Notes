## 一、查看Zabbix官方教程（重点） 
打开官方网址：[https://www.zabbix.com/cn](https://www.zabbix.com/cn)，点击ZABBIX下载。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1696834108419-2fad0c96-e70e-45aa-a583-e9ef8e882b88.png#averageHue=%230e2236&clientId=uc1d297f2-99db-4&from=paste&height=668&id=u9cf6c3ce&originHeight=1002&originWidth=1895&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1221974&status=done&style=none&taskId=uebb6a1ce-e115-41de-9fc8-870b70d7cb6&title=&width=1263.3333333333333)
选择你的Zabbix服务器的平台，比如：Zabbix5.0 LTS、CentOS 7、Mysql、Apache等。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1696929000932-f793a90a-2710-4ad1-9590-c21ecd155386.png#averageHue=%23fcfbfb&clientId=uff1d0c31-1d55-4&from=paste&height=652&id=u3bd32571&originHeight=978&originWidth=1866&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=105174&status=done&style=none&taskId=u223d6b5c-fd98-46d0-aaee-23b7809a0d1&title=&width=1244)
往下滑，查看安装和配置Zabbix教程
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1696834341651-8405a1bb-a541-4a0b-a0c9-3528f3692fb7.png#averageHue=%23faf9f9&clientId=uc1d297f2-99db-4&from=paste&height=659&id=ub00d4365&originHeight=988&originWidth=1867&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=114027&status=done&style=none&taskId=uc518ce66-871f-48fb-b777-e9263b3c41b&title=&width=1244.6666666666667)
## 二、安装 Docker 创建 Mysql 容器
### 安装 Docker 依赖包
```
sudo yum install -y yum-utils device-mapper-persistent-data lvm2
```
### 添加 Docker 官方仓库
```
sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
```
### 安装 Docker 引擎
```
sudo yum install -y docker-ce
```
### 启动 Docker 服务并设置开机自启
```
sudo systemctl start docker
sudo systemctl enable docker
```
### 验证 Docker 是否成功安装
```
docker --version
```
### 拉取 MySQL 镜像
拉取官方的最新版本的镜像：
```
docker pull mysql:latest
```
### 查看本地镜像
使用以下命令来查看是否已安装了 mysql：
```
docker images
```
### 运行容器
安装完成后，我们可以使用以下命令来运行 mysql 容器：
```
docker run -itd --name mysql-test -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
```
**-e MYSQL_ROOT_PASSWORD=123456**：通过 **-e** 参数，你设置了 MySQL 数据库的 root 用户的密码为 "123456"。这是安全设置，确保数据库具有密码保护。
### 停止和启动容器
使用**docker stop**命令可以停止一个正在运行的容器：
```
docker stop <容器ID或名称>
```
使用**docker start**命令可以启动一个已经停止的容器：
```
docker start <容器ID或名称>
```
### 列出正在运行的容器
使用**docker ps**命令可以列出当前正在运行的容器：
```
docker ps
```
如果想查看所有包括已停止的容器，可以加上**-a**选项：
```
docker ps -a
```
## 三、安装和配置Zabbix
### 1、安装 Zabbix 存储库
```
rpm -Uvh https://repo.zabbix.com/zabbix/5.0/rhel/7/x86_64/zabbix-release-5.0-1.el7.noarch.rpm

yum clean all
```
### 2、安装Zabbix server，Web前端，agent
```
yum install zabbix-server-mysql zabbix-agent
```
### 3、安装 Zabbix 前端
启用红帽软件集合
```
yum install centos-release-scl
```
### 4、编辑配置文件
```
vim  /etc/yum.repos.d/zabbix.repo
```
```
[zabbix-frontend]
...
enabled=1
...
```
### 5、安装 Zabbix 前端包
```
yum install zabbix-web-mysql-scl zabbix-apache-conf-scl
```
### 6、创建初始数据库
#### （1）进入容器
有时候你可能需要进入容器的命令行环境来进行调试或执行其他任务。可以使用**docker exec**命令进入正在运行的容器：
上面的命令将进入容器的bash终端。
```
docker exec -it <容器ID或名称> bash
```
#### （2）登录MySQL
登录MySQL，输入mysql密码
```
mysql -uroot -p
```
输入命令更改root用户访问权限，host值改为%就代表在任何客户端机器上能以root用户登录mysql服务器；
```
mysql> create database zabbix character set utf8 collate utf8_bin;
mysql> create user 'zabbix'@'%' identified by 'password';
mysql> grant all privileges on zabbix.* to 'zabbix'@'%';
mysql> set global log_bin_trust_function_creators = 1;
mysql> quit;
```
### 7、导入初始架构和数据，系统将提示您输入新创建的密码。
mysql*是版本号，可以tab键查看
```
docker cp /usr/share/doc/zabbix-server-mysql*/create.sql.gz 容器名:/
```
进入容器比如：（mysql-test）
```
docker exec -it mysql-test bash
```
```
zcat create.sql.gz | mysql -uzabbix -p zabbix
```
### 8、导入数据库架构后禁用log_bin_trust_function_creators选项
```
mysql -uroot -p
password

mysql> set global log_bin_trust_function_creators = 0;
mysql> quit;
```
### 9、为Zabbix server配置数据库
```
 vim /etc/zabbix/zabbix_server.conf
```
password就是，导入初始架构和数据新创建的密码
```
DBPassword=password
```
### 10、为Zabbix前端配置PHP
```
vim /etc/opt/rh/rh-php72/php-fpm.d/zabbix.conf
```
国内时区改成 Asia/Shanghai（上海时区）
```
php_value[date.timezone] = Asia/Shanghai（时区）
```
### 11、启动Zabbix server和agent进程
启动Zabbix server和agent进程，并为它们设置开机自启：
```
systemctl restart zabbix-server zabbix-agent httpd rh-php72-php-fpm
systemctl enable zabbix-server zabbix-agent httpd rh-php72-php-fpm
```
### 12、关闭selinux
```
vim /etc/selinux/config

把SELINUX=enforcing改成SELINUX=disabled
```
### 13、CentOS关闭防火墙
```
# 停止Firewalld服务
systemctl stop firewalld

# 启动Firewalld服务
systemctl start firewalld
```
## 四、打开 Zabbix 网页
使用 Apacheweb 服务器时，Zabbix UI的默认URL是 http://host/zabbix  (host 就是ip)。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1697078543251-96f84bb9-d59e-4ae3-ba24-252337346fd5.png#averageHue=%2399ca9a&clientId=uc786eda8-2bd5-4&from=paste&height=623&id=u76ba4e03&originHeight=934&originWidth=1731&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=91128&status=done&style=none&taskId=u1372064b-085f-42dc-b894-b83f56937c5&title=&width=1154)
点击下一步，配置数据库连接，（localhost 改成 127.0.0.1），输入mysql密码。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1697078681423-b542eb56-a25c-4710-bafc-5b63c38e3ad2.png#averageHue=%23f5f6f7&clientId=uc786eda8-2bd5-4&from=paste&height=595&id=ueb916204&originHeight=892&originWidth=1511&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=59779&status=done&style=none&taskId=ub3ba8827-7074-4f8b-99b6-1400d19d8a4&title=&width=1007.3333333333334)
无法连接到数据库，解决方法：修改mysql的身份认证方式。
```
ALTER USER '用户名'@'%' IDENTIFIED WITH sha256_password BY '密码';
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1697079179513-4a17213d-e840-4596-a151-423bb809a1fe.png#averageHue=%23f5f5f6&clientId=u83c244f2-7e26-4&from=paste&height=576&id=u29ada154&originHeight=864&originWidth=1528&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=69251&status=done&style=none&taskId=ue8db1ef0-ec0b-456d-a48b-d000a212164&title=&width=1018.6666666666666)
在安装完成后，默认的web界面登录用户和密码，首次登录。
用户名：Admin	密码：zabbix
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1697079872067-feb40002-5018-4b41-8960-36da2828bde0.png#averageHue=%23f9b35d&clientId=u83c244f2-7e26-4&from=paste&height=641&id=u49b32040&originHeight=962&originWidth=1877&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=102383&status=done&style=none&taskId=u719a1424-edb8-489e-b3df-27e1200f045&title=&width=1251.3333333333333)

