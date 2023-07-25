## 前言
APT（Advanced Package Tool）是Linux系统上的包管理工具，能自动解决软件包依赖关系并从远程存储库中获取安装软件包。推荐使用APT管理软件包，因为它简便易用且有效地处理依赖关系，无需手动配置环境变量。这样，您可以轻松地安装和更新软件包，而APT会自动处理所有必需的依赖项，确保系统的稳定性和功能正常运行
## Ubuntu安装JDK
### 1、更新软件包列表
```xml
sudo apt update
```
### 2、安装OpenJDK
对于不同的Java版本，可以使用以下命令来安装不同的OpenJDK软件包
**安装OpenJDK 8**
```xml
sudo apt install openjdk-8-jdk
```
**安装 OpenJDK 17**
```xml
sudo apt install openjdk-17-jdk
```
### 3、验证安装
安装完成后，您可以通过以下命令验证 OpenJDK 17 是否已成功安装：
```xml
java -version
```
## Ubuntu安装IntelliJ IDEA
### 1、下载 IntelliJ IDEA
下载 IntelliJ IDEA 安装包： 前往 JetBrains 官方网站下载页面：[https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
然后选择适用于你的 Linux 系统的 **.tar.gz** 安装包（例如：**2022.3.3 - Linux x86_64 (tar.gz)**）并下载它。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689817151602-efc4b43a-4b45-4d26-a32c-1a1c2885d29b.png#averageHue=%23c6a77f&clientId=ue93bcde8-c47e-4&from=paste&height=672&id=u48d2c119&originHeight=1008&originWidth=1888&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=256759&status=done&style=none&taskId=u41ca00dc-5766-4389-bb42-c2db67c55fa&title=&width=1258.6666666666667)
### 2、解压缩 IntelliJ IDEA 安装包
打开终端，然后进入包含下载的 **.tar.gz** 文件的目录。使用以下命令解压缩 IntelliJ IDEA 安装包：
这将解压缩 IntelliJ IDEA 安装包，并在当前目录下创建一个新的目录，其中包含解压后的文件。
```xml
tar -xzf ideaIU-2022.3.3.tar.gz
```
### 3、移动 IntelliJ IDEA 到安装目录
 使用以下命令将解压缩后的 IntelliJ IDEA 文件移动到你希望安装的目录。例如，将其移动到 **/Java**目录下：
```xml
sudo mv idea-IU-223.6016.4 /Java/idea
```
请注意，**idea-IU-223.6016.4** 是解压缩后 IntelliJ IDEA 的实际文件夹名称。在您的情况下，它可能有所不同，根据你下载的 IntelliJ IDEA 版本而定。
### 4、启动 IntelliJ IDEA
 现在，你可以通过在终端中运行 **idea.sh** 脚本来启动 IntelliJ IDEA：
```xml
cd java/idea/bin
./idea.sh
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689818160735-b3eaac91-3c43-4f95-adb0-65d549dee77a.png#averageHue=%233f5b9b&clientId=u90488671-7a41-4&from=paste&height=689&id=u1922b93d&originHeight=1034&originWidth=1746&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=902232&status=done&style=none&taskId=uffffdbdd-6ad6-44f5-af11-cbd40884277&title=&width=1164)
