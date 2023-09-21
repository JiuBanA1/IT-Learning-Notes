## 前言
Docker Compose 是一个工具，旨在帮助定义和 共享多容器应用程序。使用 Compose，我们可以创建一个 YAML 文件来定义服务 只需一个命令，就可以旋转或拆除所有内容。
使用 Compose 的最大优点是您可以在文件中定义应用程序堆栈，并将其保留在 您的项目存储库（现在受版本控制），并轻松使其他人能够参与您的项目。 有人只需要克隆你的存储库并启动撰写应用程序。
## 安装 Docker Compose
如果你安装了适用于 Windows、或 Linux 的 Docker 桌面，那么您已经拥有 Docker Compose！ 
Linux 如果不是 Docker 桌面，可以使用存储库安装与更新
### Ubuntu 安装与更新
```
#安装
sudo apt-get update
sudo apt-get install docker-compose-plugin
```
```
#更新
sudo apt-get update
sudo apt-get install docker-compose-plugin
```
### Red Hat 安装与更新
```
sudo yum update
sudo yum install docker-compose-plugin
```
```
sudo yum update
sudo yum install docker-compose-plugin
```
### 验证是否安装 Docker Compose
```
docker compose version
```
## 创建 docker-compose.yml 文件
在你的项目目录中创建一个名为 **docker-compose.yml** 的文件。在这个文件中，你可以定义你的应用程序的服务、网络和卷等。
### 创建一个MySQL 与 tomcat 示例
```
version: '3.8'

services:
  mysql:
    image: mysql:latest
    container_name: mysql_db
    environment:
      MYSQL_ROOT_PASSWORD: your_root_password
    ports:
      - "3306:3306"
    volumes:
      - data_group:/var/lib/mysql

  tomcat:
    image: tomcat:latest
    container_name: tomcat_server
    ports:
      - "8080:8080"
    volumes:
      - data_group:/usr/local/tomcat/webapps

volumes:
  data_group:
    external: true

```
1、version: '3.8'：这个文件使用的是Docker Compose的版本3.8。
2、这个服务使用最新的MySQL镜像（mysql:latest）；并将容器命名为"mysql_db"；在environment部分，我们设置了MySQL数据库的root用户密码；通过ports部分，我们将容器的3306端口映射到主机的3306端口，允许从主机连接MySQL服务；定义了一个命名卷mysql_data，用于持久化MySQL数据库的数据。
3、这个服务使用最新的Tomcat镜像（tomcat:latest）；并将容器命名为"tomcat_server"；通过ports部分，我们将容器的8080端口映射到主机的8080端口，允许从主机访问Tomcat服务；定义了一个命名卷tomcat_data，用于持久化Tomcat的web应用程序（webapps）数据。
4、在volumes部分，我们对之前定义的两个命名卷mysql_data和tomcat_data进行了声明。这样，Docker将会为这两个命名卷创建持久化存储，并确保在容器重新创建时保留数据。
5、最后可以使用"volumes"关键字的扩展语法来将多个卷组合成一个组。让我们将"mysql_data"和"tomcat_data"放入一个组，并命名该组为"data_group"。
## 使用Docker Compose启动服务
Linux中也差不多，windows 中打开命令行终端（PowerShell或CMD）并导航到保存docker-compose.yml文件的目录。例如，如果您保存在 **D:\docker** 目录下，可以通过以下命令进入该目录；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690947331968-94da8406-6c84-49a1-a659-eb47267ed74f.png#averageHue=%23131313&clientId=u069985db-2910-4&from=paste&height=548&id=ue876d3ca&originHeight=822&originWidth=1711&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=96652&status=done&style=none&taskId=u2ead7022-1e6a-444e-85f8-244693d49a7&title=&width=1140.6666666666667)
**-d**标志是可选的，它使得Docker Compose在后台运行 容器。
```
docker-compose up -d
```
用**docker images**命令可以列出所有本地已下载的Docker镜像：
```
docker images
```
