## Dockerfile 介绍
当使用Docker构建容器化应用程序时，Dockerfile是一个用于定义容器镜像的文本文件。它包含了一系列指令，告诉Docker如何从基础镜像（通常是官方或自定义的操作系统镜像）构建出最终的镜像，以及如何配置容器中的环境、文件和应用程序。
Dockerfile 的编写是构建容器的基础，它允许您定义容器的构建步骤、环境和配置。通过合理使用各种指令，您可以构建出一个满足应用程序需求的定制化镜像，从而实现应用的容器化部署。
## Dockerfile 示例 
当您创建 Docker 容器来运行 MySQL 数据库时，您需要编写一个 Dockerfile 来定义容器的构建步骤。以下是一个基本的 Dockerfile 示例，用于构建一个运行 MySQL 的容器。
1、创建一个文本文件，并将以下内容粘贴到文件中，然后将文件命名为 **Dockerfile**：
```
# 使用官方的 MySQL 镜像作为基础镜像
FROM mysql:latest

# MySQL密码
ENV MYSQL_ROOT_PASSWORD=123456

# 暴露 MySQL 的默认端口
EXPOSE 3306
```
2、打开终端，并导航到包含 Dockerfile 的目录。
3、执行以下命令来构建 Docker 镜像：
```
docker build -t my-mysql-container .
```
其中，**my-mysql-container** 是你为镜像指定的名称，**.** 表示 Dockerfile 在当前目录。
4、查看已下载的镜像
使用**docker images**命令可以列出所有本地已下载的Docker镜像：
```
docker images
```
5、运行 mysql 命令
```
docker run -itd --name mysql-test -p 3306:3306   my-mysql-containe
```
其中，**my-mysql-container** 是你为镜像指定的名称。
