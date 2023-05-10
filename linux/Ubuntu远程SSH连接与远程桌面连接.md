## 一、查看网络信息
### 1、图形程序查看网络信息
打开设置，找到网络，进入网络界面中，点击设置图标，查看；
### 2、命令查看网络信息
使用命令，（“ ip address show”），就可以查看，也可以简写（“ ip a”）；
使用ifconfig，需要提示安装工具；
## 二、远程桌面连接
首先需要在Ubuntu里进行些设置，点击界面右上角的控制区，选择设置选项；
弹出界面进入网络中，点击设置图标，查看一下当前这个Ubuntu IP地址；
切换到共享界面，在这里就有远程桌面，一开始是已关闭的状态，无法进行操作；
点击右上角的开关，将开启这个功能，然后启动远程桌面，启动远程控制；
然后下面的认证，可以修改，然后就可以了；
来到其他电脑的上面，搜索并启动远程桌面连接；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682776975802-5db73798-ea47-4a72-8c93-1207194b57cf.png#averageHue=%238da4ba&clientId=ucd3914b0-7b53-4&from=paste&height=800&id=ua1542f5d&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1999277&status=done&style=none&taskId=u4f05c975-2734-4628-9fbf-c83b881b777&title=&width=1280)
## 三、远程SSH连接
### 1、安装客户端
要安装SSH客户端并连接到远程服务器，请按照以下步骤操作：
1、打开终端并输入以下命令以安装SSH客户端：
```
sudo apt-get update
sudo apt-get install openssh-client
```
2、输入您的Ubuntu计算机管理员密码以确认安装。
3、安装完成后启动SSH服务，输入以下命令：
```
sudo service ssh start
```
4、确认SSH服务器正在运行，输入以下命令：
```
sudo service ssh status
```
5、**root**是您要连接到的远程计算机的用户名，**192.168.1.1**是您要连接到的远程计算机的IP地址。
用ssh登录服务器的命令为：
>ssh root@192.168.1.1
>输入root用户的密码
如果您要连接到的远程计算机不是默认使用的端口，则需要添加 **-p** 标志，ssh服务的默认端口号为22例如：
用ssh登录服务器的命令为：
>ssh –p 22 root@192.168.1.1
>输入root用户的密码
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682873291038-62f65b6c-e8b7-4f3d-90e4-f10e7a235cbf.png#averageHue=%2390c3b3&clientId=ue4f32cfd-9c6b-4&from=paste&height=800&id=u2911dc8e&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1228611&status=done&style=none&taskId=u3e692351-6c7d-4d1b-b3e4-41c78fe7d02&title=&width=1280)
### 2、安装服务端
要安装SSH服务端并启动SSH连接，请按照以下步骤操作：
1、打开终端并输入以下命令以安装SSH服务端：
```
sudo apt-get update
sudo apt-get install openssh-server
```
2、输入您的Ubuntu计算机的管理员密码以确认安装。
3、安装完成后启动SSH服务，输入以下命令：
```
sudo service ssh start
```
4、确认SSH服务器正在运行，输入以下命令：
```
sudo service ssh status
```
5、如上所述
**root**是您要连接到的远程计算机的用户名，**192.168.1.1**是您要连接到的远程计算机的IP地址。
用ssh登录服务器的命令为：
>ssh root@192.168.1.1
>输入root用户的密码
如果您要连接到的远程计算机不是默认使用的端口，则需要添加 **-p** 标志，ssh服务的默认端口号为22例如：
用ssh登录服务器的命令为：
>ssh –p 22 root@192.168.1.1
>输入root用户的密码
### 3、SSH客户端和服务端的区别
SSH客户端是一种客户端软件，可以连接到SSH服务器并进行远程操作。它允许用户在远程主机上执行命令，将文件传输到远程主机，或从远程主机上下载文件。
SSH服务端是一种服务器软件，它在远程主机上运行，并接受来自SSH客户端的连接。它提供远程访问、管理和共享资源的功能。
在安全方面，SSH客户端和服务端都使用加密技术来保护通信安全。客户端和服务端之间的加密通道可防止未授权方访问敏感数据或信息。
因此，SSH客户端和服务端都是互相独立的软件，并且在不同的情境下起不同的作用。
