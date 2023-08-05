### 一、查看 tomcat 版本
访问 tomcat 镜像库地址：[https://hub.docker.com/_/tomcat](https://hub.docker.com/_/tomcat)，可以通过 Tags 查看其他版本的 tomcat;
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691042650181-2f984619-ffed-41c6-94aa-c20614a03bba.png#averageHue=%23dab76e&clientId=uee25d2f6-29b2-4&from=paste&height=597&id=u475b5128&originHeight=896&originWidth=1884&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=132907&status=done&style=none&taskId=u38f94088-8353-484f-af8d-31c33a8866f&title=&width=1256)
### 二、拉取 Tomcat Docker 镜像
打开终端或命令提示符，运行以下命令从 Docker Hub 拉取 Tomcat Docker 镜像：
```
docker pull tomcat
```
### 三、创建 Tomcat 容器
 一旦 Tomcat 镜像下载完成，可以基于该镜像创建一个容器。运行以下命令创建 Tomcat 容器：
```
docker run -d -p 8080:8080 --name tomcat-container tomcat
```
1、-d：此标志以后台模式运行容器。
2、-p 8080:8080：此标志将主机的 8080 端口映射到容器的 8080 端口，允许您通过http://localhost:8080 访问 Tomcat。
3、--name tomcat-container：此标志给运行的容器指定名称 "tomcat-container"。
### 四、访问 Tomcat
现在容器正在运行，您可以通过在Web浏览器中输入 **http://localhost:8080** 来访问 Tomcat 服务器。您将看到 Tomcat 的默认欢迎页面。
### 五、停止和启动容器
使用**docker stop**命令可以停止一个正在运行的容器：
```
docker stop <容器ID或名称>
```
使用**docker start**命令可以启动一个已经停止的容器：
```
docker start <容器ID或名称>
```
