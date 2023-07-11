### 安装 CentOS 7：
   - 下载 CentOS 7 的安装镜像文件（ISO）。
   - 创建可启动的安装媒体，例如刻录到光盘或制作启动 USB 驱动器。
   - 将安装媒体插入计算机并启动。
   - 在启动过程中，选择适当的语言和键盘布局。
   - 接受许可协议后，选择安装类型（如服务器、桌面或自定义）和分区设置。
   - 设置主机名、时区、管理员密码等。
   - 完成安装并重新启动计算机。
### 基本配置：

   - 登录到 CentOS 7。
   - 确认网络连接并配置网络设置，可以使用 **nmtui** 或编辑网络配置文件 **/etc/sysconfig/network-scripts/ifcfg-<interface>**。
   - 更新系统软件包：运行 **sudo yum update** 命令。
   - 配置防火墙：使用 **firewall-cmd** 命令管理防火墙规则。
   - 设置 SELinux：可以使用 **semanage** 命令或编辑 **/etc/selinux/config** 文件来配置 SELinux。
### 包管理

   - 安装软件包：使用 **yum install** 命令安装软件包，例如 **sudo yum install package_name**。
   - 升级软件包：运行 **sudo yum update** 命令升级已安装的软件包。
   - 卸载软件包：使用 **yum remove** 命令卸载软件包，例如 **sudo yum remove package_name**。
   - 搜索软件包：使用 **yum search** 命令搜索软件包，例如 **sudo yum search keyword**。
### 用户和权限管理：

   - 创建用户：使用 **useradd** 命令创建用户，例如 **sudo useradd username**。
   - 设置用户密码：运行 **sudo passwd username** 命令为用户设置密码。
   - 授予管理员权限：将用户添加到 **sudoers** 文件中，可以使用 **visudo** 命令编辑该文件。
   - 文件和目录权限：使用 **chmod** 命令更改文件和目录的权限，例如 **chmod 755 filename**。
   - 所有者和组：使用 **chown** 和 **chgrp** 命令更改文件和目录的所有者和组。
### 系统管理：

   - 系统服务：使用 **systemctl** 命令管理系统服务，例如 **sudo systemctl start service_name**。
   - 日志文件：查看系统日志文件，例如 **/var/log/messages**、**/var/log/syslog** 和 **/var/log/secure**。
   - 进程管理：使用 **ps** 命令查看运行中的进程，使用 **kill**命令终止进程，例如 **kill PID**（PID 是进程的标识符）。
   - 系统监控：使用工具如 **top**、**htop**、**nmon** 或 **sar** 监控系统资源使用情况。
   - 时间和日期：使用 **date** 命令查看和设置系统的时间和日期。
   - 定时任务：使用 **crontab** 命令创建和管理定时任务，例如 **crontab -e** 编辑用户的定时任务。
### 文件管理：

   - 目录导航：使用 **cd** 命令进入目录，使用 **ls** 命令列出文件和目录。
   - 创建和删除文件和目录：使用 **touch** 命令创建文件，使用 **mkdir** 命令创建目录，使用 **rm** 命令删除文件和目录。
   - 复制和移动文件：使用 **cp** 命令复制文件，使用 **mv** 命令移动文件。
   - 文件查找：使用 **find** 命令按条件查找文件，例如 **find /path -name filename**。
   - 文件权限和属性：使用 **ls -l** 命令查看文件的权限和属性，使用 **chmod** 命令更改文件的权限。
