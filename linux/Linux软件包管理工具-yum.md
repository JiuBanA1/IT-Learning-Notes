### 前言
yum是RedHat、CentOS等中使用的软件包管理器，用于安装与更新和管理软件包。不过注意的是，Red Hat已经开始将其软件包管理转移到dnf上，dnf是yum的增强版，并且在使用上与yum非常相似，yum和dnf在一定程度上是名字不同，但命令基本上是相同的。
### 1、安装软件包
使用以下命令来安装一个软件包，例如安装名为"example_package"的软件包：
```
sudo yum install example_package
```
### 2、更新软件包
使用以下命令来更新已安装的软件包：
```
sudo yum update
```
### 3、升级软件包
如果你想升级系统中的所有软件包，可以运行以下命令：
```
sudo yum upgrade
```
### 4、搜索软件包
可以使用以下命令搜索特定的软件包，例如搜索名为"example_package"的软件包：
```
yum search example_package
```
### 5、移除软件包
若要移除不再需要的软件包，可以运行以下命令：
```
sudo yum remove example_package
```
### 6、清理缓存
yum会在安装、更新或移除软件包时保存缓存。要清理旧的软件包缓存，可以运行以下命令：
```
sudo yum clean all
```
### 7、查看已安装的软件包
 若要查看已安装的软件包列表，可以运行以下命令：
```
yum list installed
```
