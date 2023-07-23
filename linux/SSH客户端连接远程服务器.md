## 一、什么是客户端连接远程服务器
发起连接的一方，计算机或设备（称为客户端）与另一个计算机或设备（称为远程服务器）建立连接。
客户端通过网络连接到远程服务器，远程服务器则是提供所需服务或资源的一方。
客户端通常使用特定的协议（如SSH、HTTP、FTP等）与远程服务器进行通信。
示例：你使用SSH客户端从本地计算机连接到远程服务器以执行远程命令。
## 二、什么是服务端连接远程服务器
指的是在服务端设备上建立到其他远程服务器的连接。服务端设备充当客户端的角色（启动SSH客户端），通过SSH协议与远程服务器进行通信。
## 三、查看网络信息
### 1、图形程序查看网络信息
打开设置，找到网络，进入网络界面中，点击设置图标，查看；
### 2、命令查看网络信息
使用命令，（“ ip address show”），就可以查看，也可以简写（“ ip a”）；
## 四、SSH客户端（Linux）
1、打开终端：在Linux中，你可以通过在应用程序菜单中搜索"终端"；
2、安装SSH客户端：大多数Linux发行版都预装了SSH客户端。如果你的系统上没有安装，可以使用适用于您的发行版的软件包管理器来安装它。
对于Debian/Ubuntu发行版，使用**apt-get**命令：
```python
sudo apt-get install openssh-client
```
对于CentOS/Red Hat发行版，使用**yum**命令：
```python
sudo yum install openssh-clients
```
3、连接到远程服务器：如果你的用户名是"myuser"，远程服务器的IP地址是"192.168.0.1"，可以使用以下命令连接到服务器：
```python
ssh myuser@192.168.0.1
```
4、输入密码：连接到远程服务器后，SSH客户端将要求您输入密码。输入正确的密码后，你将成功登录到远程服务器。
## 五、SSH客户端（windows）
Windows内置了OpenSSH客户端，您可以直接使用命令行进行SSH连接。
1、连接到远程服务器：如果你的用户名是"myuser"，远程服务器的IP地址是"192.168.0.1"，可以使用以下命令连接到服务器：
```python
ssh myuser@192.168.0.1
```
2、输入密码：连接到远程服务器后，SSH客户端将要求您输入密码。输入正确的密码后，你将成功登录到远程服务器。
## 六、SSH远程服务器
1、安装OpenSSH服务器软件：在终端中执行适合你Linux发行版的包管理器命令来安装OpenSSH服务器软件包。以下是一些常见发行版的安装命令示例：
对于Debian/Ubuntu发行版：
```python
sudo apt update
sudo apt install openssh-server
```
对于CentOS/Red Hat发行版：
```python
sudo yum update
sudo yum install openssh-server
```
2、启动SSH服务：安装完成后，使用适当的命令启动SSH服务。以下是一些常见发行版的命令示例：
对于Debian/Ubuntu发行版：
```python
sudo systemctl start ssh
```
对于CentOS/Red Hat发行版：
```python
sudo systemctl start sshd
```
