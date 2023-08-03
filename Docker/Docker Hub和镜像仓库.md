## 前言
Docker Hub 是 Docker 公司提供的官方公共 Docker 镜像注册表，允许用户存储、分享和获取 Docker 镜像。在 Docker Hub 上，你可以找到许多官方和社区维护的 Docker 镜像，这些镜像涵盖了各种常见的应用程序和服务，如数据库、Web 服务器、应用程序框架等。
## 镜像加速
国内从 DockerHub 拉取镜像有时会遇到困难，此时可以配置镜像加速器。
阿里云镜像获取地址：[https://cr.console.aliyun.com/cn-hangzhou/instances/mirrors](https://cr.console.aliyun.com/cn-hangzhou/instances/mirrors)，登陆后，左侧菜单选中镜像加速器就可以看到你的专属地址;
```tcl
{
  "builder": {
    "features": {
      "buildkit": true
    },
    "gc": {
      "defaultKeepStorage": "20GB",
      "enabled": true
    }
  },
  "experimental": false,
  "registry-mirrors": [""]
}

```
## 创建存储库
1、[注册](https://www.docker.com/pricing?utm_source=docker&utm_medium=webreferral&utm_campaign=docs_driven_upgrade)或登录到 [Docker Hub](https://hub.docker.com/)。
2、选择“**创建存储库**”按钮。
3、如果您查看下图，可以看到一个示例 Docker 命令，此命令将推送到此存储库。
![](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690458879024-71894841-6a93-42d5-b8a6-d928a8b18f9e.png#averageHue=%23c0c7cd&clientId=u39a81ed2-5e45-4&from=paste&id=ua4e3116a&originHeight=280&originWidth=996&originalType=url&ratio=1.5&rotation=0&showTitle=false&status=done&style=none&taskId=u95823446-0194-4351-894b-61c187af26e&title=)
4、在命令行中，尝试运行在 Docker Hub 上看到的推送命令，将使用你的命名空间，而不是“docker/getting-started:tagname”。
```
docker push docker/getting-started:tagname
```
### 推送镜像（可选）
如果你创建了自己的 Docker 镜像，并希望将其分享给他人，你可以将镜像推送到 Docker Hub。首先，你需要登录到 Docker Hub
```
docker login
```
然后，使用 **docker push** 命令将镜像推送到 Docker Hub：
```
docker push <username>/<image_name>:<tag>
```
其中，**<username>** 是你在 Docker Hub 上的用户名，**<image_name>** 是镜像的名称，**<tag>** 是镜像的版本标签。
## 搜索镜像
登录后，你可以使用 Docker Hub 的搜索功能来查找感兴趣的镜像。你可以在搜索栏中输入关键词，然后浏览结果。
## 拉取镜像
要使用 Docker Hub 上的镜像，你需要将它们拉取到本地计算机，你可以使用 **docker pull** 命令来完成这个操作，语法如下：
```
docker pull <image_name>:<tag>
```
其中，**<image_name>** 是要拉取的镜像名称，**<tag>** 是镜像的版本标签。
