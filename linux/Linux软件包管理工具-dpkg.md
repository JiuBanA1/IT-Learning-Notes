### 前言
dpkg是Debian和Ubuntu等Linux发行版中用于管理软件包的基本包管理工具
dpkg的一些常用命令，通过这些命令，你可以有效地管理你的Linux系统上的软件包。请注意，使用dpkg时需要谨慎，因为它不会自动解决依赖关系，可能导致软件包不完整或系统不稳定。通常建议使用高级包管理工具如apt来安装、升级和移除软件包，它们会更好地处理依赖关系。
### 一、什么是.deb
.deb（Debian Package）： .deb是Debian和基于Debian的Linux发行版（如Ubuntu）中使用的软件包格式。dpkg是.deb软件包的管理工具。
### 二、安装软件包
用于安装名为 VS Code.deb的软件包
```
sudo dpkg -i VS Code.deb
```
### 三、卸载软件包
用于卸载名为VS Code的软件包，但会保留其配置文件。
```
sudo dpkg -r VS Code
```
用于彻底卸载名为VS Code的软件包，包括配置文件。
```
sudo dpkg -P VS Code
```
### 四、查询软件包状态
查询是否已安装名为VS Code的软件包，并显示其版本信息。
```
dpkg -l VS Code
```
### 五、查询已安装的软件包列表
显示系统上所有已安装的软件包列表。
```
dpkg -l
```
### 六、解决依赖问题
用于修复损坏的软件包依赖关系。
```
sudo apt-get install -f
```
