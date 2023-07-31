## 一、什么是容器？
容器化技术的核心概念是使用容器来创建一个独立的、隔离的运行环境，其中包含了应用程序所需的所有组件，如代码、运行时、系统工具、库和配置文件等。这使得应用程序和其依赖项能够以可靠且一致的方式在不同的计算机或云平台上运行。
容器与传统的虚拟机相比，具有更轻量级和更快速的特点。传统虚拟机在运行时需要完整的操作系统和虚拟化层，而容器共享主机操作系统的内核，因此其资源占用更少，启动速度更快。
## 二、什么是容器映像？
容器映像就像集装箱在物流中可以容纳不同类型的货物，并且可以轻松地从一个地方移动到另一个地方一样，容器映像也能够承载应用程序及其运行所需的所有组件，例如代码、运行时环境、库、配置文件等，并在不同的计算环境中运行，如物理服务器、虚拟机、云服务器等。
## 三、容器网络
默认情况下，容器是隔离运行的，并且对其他进程一无所知或同一台计算机上的容器。如何允许一个容器与另一个容器通信呢？答案是联网。如果将两个容器放在同一个网络上，它们可以相互通信。
## 四、Ubuntu环境Docker安装
### 卸载旧版本（可选）
如果你之前已经安装过旧版本的Docker，可以选择卸载它们。运行以下命令以卸载旧版本：
```
sudo apt-get remove docker docker-engine docker.io containerd runc
```
### 安装依赖
确保系统安装了所需的依赖项，包括apt-transport-https、ca-certificates、curl、software-properties-common：
```
sudo apt-get update
sudo apt-get install -y apt-transport-https ca-certificates curl software-properties-common
```
### 添加Docker官方GPG密钥
运行以下命令以添加Docker官方GPG密钥到系统：
```
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg
```
### 添加Docker APT源
添加Docker的APT源到系统：
```
echo "deb [signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null
```
### 安装Docker Engine
运行以下命令安装Docker Engine：
```
sudo apt-get update
sudo apt-get install -y docker-ce docker-ce-cli containerd.io
```
### 启动Docker服务
安装完成后，启动Docker服务并设置为开机自启动：
```
sudo systemctl start docker
sudo systemctl enable docker
```
### 验证Docker安装
运行以下命令验证Docker是否安装成功：
```
docker --version
```
## 五、Red Hat环境Docker安装
### 删除旧版本（如果有）
```
sudo yum remove docker docker-client docker-client-latest docker-common docker-latest docker-latest-logrotate docker-logrotate docker-engine

```
### 安装依赖包
```
sudo yum install -y yum-utils device-mapper-persistent-data lvm2
```
### 添加 Docker 官方仓库
```
sudo yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
```
### 安装 Docker 引擎
```
sudo yum install -y docker-ce
```
### 启动 Docker 服务并设置开机自启
```
sudo systemctl start docker
sudo systemctl enable docker
```
### 验证 Docker 是否成功安装
```
docker --version
```
