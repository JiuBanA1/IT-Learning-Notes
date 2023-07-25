## Ubuntu安装MySQL 8.0
### 1、更新软件包列表
在添加 MySQL APT 存储库后，运行以下命令以更新软件包列表：
```xml
sudo apt update
```
### 2、安装 MySQL 8.0
现在，你可以使用以下命令来安装 MySQL 8.0：
```xml
sudo apt install mysql-server-8.0
```
在安装 MySQL 8.0（或其他软件包）时，通常不会显示密码，因为安装过程不需要您提供密码。安装过程中可能会提示您设置 MySQL root 用户的密码，但这是在 MySQL 服务器配置的步骤中完成的，而不是在 **apt** 安装命令中提供的。
### 3、root 用户的密码
当你安装 MySQL 8.0 后，可以通过以下步骤设置 MySQL root 用户的密码。
（1）在终端中运行以下命令以登录到 MySQL 服务器：
```xml
sudo mysql -u root
```
如果是第一次登录，可能不需要输入密码。如果要求密码，请直接按 "Enter" 键。
（2）一旦登录到 MySQL 命令行界面，可以使用以下 SQL 命令设置 MySQL root 用户的密码：
```xml
ALTER USER 'root'@'localhost' IDENTIFIED BY '123456';
```
将 **'123456'** 替换为您希望设置的实际密码。
（3）设置密码后，使用以下命令刷新权限使更改生效：
```xml
FLUSH PRIVILEGES;
```
（4）退出 MySQL 命令行界面：
```xml
exit;
```
### 4、启动 MySQL 服务
安装完成后，MySQL 服务器应该已经自动启动。如果没有启动，您可以运行以下命令手动启动服务：
```xml
sudo systemctl start mysql
```
启用 MySQL 服务的开机启动，可以运行以下命令：
```
sudo systemctl enable mysql
```
## Ubuntu安装Navicat
### 1、下载 Navicat
下载 Navicat 安装包： 前往 Navicat 官方网站下载页面：[https://www.navicat.com](https://www.navicat.com/en/)
然后选择适用于你的 Linux 系统的安装包（例如：**Direct download（64 bit）**）并下载它。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689825608950-0f151a35-ba14-48b0-a474-f7bd78021e3f.png#averageHue=%23fefefe&clientId=u54806124-f923-4&from=paste&height=530&id=u74b55f2c&originHeight=795&originWidth=1717&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=71836&status=done&style=none&taskId=u7b86d987-1d13-4595-a2d8-e9198384828&title=&width=1144.6666666666667)
### 2、额外的软件包
从 Ubuntu 22.04 开始，可能需要额外的软件包。通过执行以下命令进行安装：
```
sudo apt install libfuse2
```
### 3、执行命令
注意：cd Java/chmod +x navicat16-premium-en.AppImage；
路径要正确，"chmod +x navicat16-premium-en.AppImage”包名一致；
```
cd Java/chmod +x navicat16-premium-en.AppImage
./navicat16-premium-en.AppImage
```
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '123456';
### 4、MySQL时被拒绝访问
如果在MySQL中收到“1698 - Access denied for user 'root'@'localhost'”错误，这意味着使用root用户连接到MySQL时被拒绝访问。
使用sudo登录MySQL
```
sudo mysql
```
切换到mysql数据库
```
USE mysql;
```
更新root用户的认证插件为mysql_native_password，并设置新密码，请将 "**123456"** 替换为您要设置的新密码
```
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '123456';
```
刷新权限并退出MySQL
```
FLUSH PRIVILEGES;
EXIT;
```
