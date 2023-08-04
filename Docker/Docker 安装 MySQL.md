### 一、查看 MySQL 版本
访问 MySQL 镜像库地址：[https://hub.docker.com/_/mysql?tab=tags](https://hub.docker.com/_/mysql?tab=tags) 。
可以通过 Tags 查看其他版本的 MySQL，默认是最新版本 **mysql:latest** 。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690439525498-c85adc08-1b5a-4ddf-b191-51d175e6f659.png#averageHue=%23dcb37b&clientId=u62ceb681-7a3e-4&from=paste&height=707&id=u57857651&originHeight=1061&originWidth=1886&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=180548&status=done&style=none&taskId=u9ab84b45-c193-4c23-8f88-aded483bb87&title=&width=1257.3333333333333)
你也可以在下拉列表中找到其他你想要的版本：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690439648385-fc900f9c-3f6d-48a3-88fa-2da00bcfc9d5.png#averageHue=%23e8be7d&clientId=u62ceb681-7a3e-4&from=paste&height=718&id=uc9d4345b&originHeight=1077&originWidth=1880&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=146047&status=done&style=none&taskId=u420158d8-2c95-48f8-b3d4-018cd45d85d&title=&width=1253.3333333333333)
### 二、拉取 MySQL 镜像
拉取官方的最新版本的镜像：
```
docker pull mysql:latest
```
### 三、查看本地镜像
使用以下命令来查看是否已安装了 mysql：
```
docker images
```
### 四、运行容器
安装完成后，我们可以使用以下命令来运行 mysql 容器：
```
docker run -itd --name mysql-test -p 3306:3306 -e MYSQL_ROOT_PASSWORD=123456 mysql
```
**1、-itd**：这是 **docker run** 命令的参数组合，**-i** 和**-t** 是命令中的两个参数，用于在容器与终端之间建立交互式连接；**-d**：将容器设置为 "detached" 模式，容器在后台运行。
**2、--name mysql-test**：通过 **--name** 参数，你为容器指定了一个名称 "mysql-test"。这个名称是你自己定义的容器标识符，用于在后续操作中识别和管理容器。
**3、-p 3306:3306**：通过 **-p** 参数，你将主机的 3306 端口映射到容器的 3306 端口。这样，你可以通过主机的 3306 端口访问容器内的 MySQL 服务。例如，通过主机的 IP 地址和 3306 端口，你可以使用 MySQL 客户端连接到容器中的 MySQL 数据库。
**4、-e MYSQL_ROOT_PASSWORD=123456**：通过 **-e** 参数，你设置了 MySQL 数据库的 root 用户的密码为 "123456"。这是安全设置，确保数据库具有密码保护。
**5、mysql**：这是要运行的 Docker 镜像的名称。在这里，你指定了 "mysql"，表示你要使用 Docker Hub 上的官方 MySQL 镜像。
### 五、停止和启动容器
使用**docker stop**命令可以停止一个正在运行的容器：
```
docker stop <容器ID或名称>
```
使用**docker start**命令可以启动一个已经停止的容器：
```
docker start <容器ID或名称>
```
### 六、列出正在运行的容器
使用**docker ps**命令可以列出当前正在运行的容器：
```
docker ps
```
如果想查看所有包括已停止的容器，可以加上**-a**选项：
```
docker ps -a
```
### 七、进入容器
有时候你可能需要进入容器的命令行环境来进行调试或执行其他任务。可以使用**docker exec**命令进入正在运行的容器：
上面的命令将进入容器的bash终端。
```
docker exec -it <容器ID或名称> bash
```
### 八、登录MySQL
登录MySQL，输入mysql密码
```
mysql -u root -p
```
### 九、IDEA 连接 MySQL
1、打开IntelliJ IDEA并导航到**Database**选项卡（通常位于右侧），点击**+**按钮，然后选择**Data Source** > **MySQL**。
2、填写连接详细信息如下：
**Host**：使用主机机器的IP地址，或者如果您在本地机器上运行容器，则使用**localhost**。
**Port**：使用**3306**端口。
**Database**：如果您想直接连接到特定的数据库，请填写该数据库的名称；否则可以保留为空。
**User**和**Password**：使用您在运行MySQL容器时设置的root凭据。
最后，测试连接以确保连接成功。

