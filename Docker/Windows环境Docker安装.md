## 前言
Docker Desktop是Docker官方提供的用于Windows的图形化桌面应用程序，它使得在本地环境中使用Docker变得非常简单。
## 安装Docker Desktop的步骤
1、前往Docker官方网站：[https://www.docker.com/products/docker-desktop](https://www.docker.com/products/docker-desktop)
2、在页面中选择 "Download for Windows" 下载Docker Desktop安装程序。
3、运行下载的安装程序，并按照安装向导的指示进行安装，在安装过程中，可能需要授予安装程序管理员权限。
4、安装完成后，Docker Desktop将会自动启动，并在系统托盘中显示Docker图标点击图标，你可以访问Docker的控制面板，开始使用Docker。
5、安装完成后，Docker已经在你的Windows 11系统上准备就绪，你可以在Docker容器中运行应用程序和服务了。
## Docker Desktop 更新WSL
### WSL 的手动安装步骤
[https://learn.microsoft.com/zh-cn/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package](https://learn.microsoft.com/zh-cn/windows/wsl/install-manual#step-4---download-the-linux-kernel-update-package)
### 拉取（Pull）镜像
首先打开cmd，你可以通过**docker pull**命令来下载Docker镜像。例如，如果你想拉取Ubuntu的官方镜像，可以运行以下命令：
```
docker pull ubuntu
```
### 查看已下载的镜像
使用**docker images**命令可以列出所有本地已下载的Docker镜像：
```
docker images
```
### 输出"Hello Docker!"
```
docker run ubuntu /bin/echo "Hello Docker!"
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690034215627-2781e0e3-06a0-4ac3-b114-49e3e2ab2491.png#averageHue=%23171717&clientId=uf3ad5080-94c6-4&from=paste&height=445&id=ueb76eb8c&originHeight=667&originWidth=1422&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=79867&status=done&style=none&taskId=u5b21ae86-10f3-4316-811b-2cf8bd54f04&title=&width=948)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690034263406-0adf6672-feb4-4308-82d0-e30dac4c8148.png#averageHue=%23e8edf5&clientId=uf3ad5080-94c6-4&from=paste&height=800&id=u1c0a0717&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=110406&status=done&style=none&taskId=u13a3603d-ccdf-495a-b236-33810aec770&title=&width=1280)
## Linux的windows子系统
1、打开"控制面板"：可以通过在开始菜单中搜索"控制面板"并打开它来完成。
2、控制面板中，选择"程序"，点击启动或关闭windows功能。
3、启动或关闭windows功能中，开启或关闭，Linux的windows子系统。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1690438443697-37d964c5-0e1d-4079-b97e-b3296fbcb835.png#averageHue=%23f8f7f7&clientId=u1c177b30-edfe-4&from=paste&height=591&id=ufbb97b4e&originHeight=887&originWidth=1468&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=112040&status=done&style=none&taskId=ubf3137eb-dbde-4f44-9fdc-f0ed4c7f86f&title=&width=978.6666666666666)
4、列出已安装的Linux发行版：在PowerShell或CMD中运行以下命令，将显示已安装的Linux发行版列表及其名称：
```
wsl --list
```
5、卸载所需的Linux发行版：选择您要删除的Linux发行版，并运行以下命令（请将"<Name>"替换为要卸载的Linux发行版的名称）：
```
wsl --unregister <Name>
```
### Windows PowerShell
Windows PowerShell 是一种功能更强大的高级命令行工具，适用于系统管理、任务自动化和复杂脚本编写。
Windows 终端是一个传统的命令行工具，适用于执行简单的命令和批处理文件。
