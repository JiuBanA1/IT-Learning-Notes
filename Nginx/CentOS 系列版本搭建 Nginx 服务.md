## Nginx 介绍
Nginx 是一个广泛使用的Web服务器和反向代理服务器。
**反向代理和负载均衡**：Nginx支持反向代理和负载均衡，能够分发请求到多个后端服务器，提高了可用性和性能。
**SSL/TLS支持**：Nginx支持SSL/TLS协议，使您能够配置HTTPS并提供安全的数据传输。
**低资源消耗**：Nginx设计得非常轻量，占用较少的内存和CPU资源，因此在资源受限的环境中表现出色。
**简单的配置**：Nginx的配置文件易于理解和维护，使管理员能够快速进行配置更改。
## Nginx 安装 CentOS 系列版本
安装Nginx： 使用**yum**包管理器安装Nginx，运行以下命令：
```
sudo yum install nginx
```
系统将提示您确认安装。输入"Y"并按Enter键。
启动Nginx服务： 安装完成后，启动Nginx服务，可以运行以下命令：
```
sudo systemctl start nginx
```
您还可以将Nginx设置为在系统启动时自动启动：
```
sudo systemctl enable nginx
```
用于查看 Nginx 服务的当前状态和运行信息的命令。执行此命令后，您将看到与 Nginx 服务相关的信息，包括是否正在运行、主要配置文件的路径、进程ID、活动端口等等。
```
sudo systemctl status nginx
```
重启 Nginx 服务。
```
sudo systemctl restart nginx
```
要查看 Nginx 的版本号，您可以在终端中运行以下命令。
```
niginx --version
```
配置防火墙，添加80端口。
```
sudo firewall-cmd --permanent --add-port=80/tcp
sudo firewall-cmd --reload
```
## Nginx 删除 CentOS 系列版本
停止Nginx服务： 在卸载Nginx之前，首先停止正在运行的Nginx服务。运行以下命令：
```
sudo systemctl stop nginx
```
卸载Nginx： 使用**yum**包管理器卸载Nginx，运行以下命令：
```
sudo yum remove nginx
```
系统将提示您确认卸载。输入"Y"并按Enter键。
清除相关配置文件和数据： 
Nginx配置文件目录：**/etc/nginx**
Nginx默认网站目录：**/usr/share/nginx**
Nginx日志文件目录：**/var/log/nginx**
使用**rm -r**命令来删除不需要的文件和目录。
```
sudo rm -r /etc/nginx
sudo rm -r /usr/share/nginx
sudo rm -r /var/log/nginx
```
配置防火墙，删除80端口。
```
sudo firewall-cmd --permanent --remove-port=80/tcp
sudo firewall-cmd --reload
```
