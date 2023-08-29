### Maven 下载
官方地址 [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)，下载完成后，解压到合适的位置即可；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691657846828-7660718e-06ef-4d88-8977-1554f04d36f9.png#averageHue=%23f7f6f5&clientId=u75e11983-8780-4&from=paste&height=716&id=u0f3d9f54&originHeight=1074&originWidth=1900&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=324601&status=done&style=none&taskId=u669c55e0-ecba-455e-8113-7a24dfedfeb&title=&width=1266.6666666666667)
### 解压缩下载的文件
解压缩下载的文件： 使用以下命令解压缩下载的Maven分发版文件;
```
tar -xzvf apache-maven-3.8.8-bin.tar.gz
```
### 移动Maven文件夹
移动Maven文件夹： 将解压后的Maven文件夹移动到您选择的安装位置，例如**/opt**目录：
```
sudo mv apache-maven-3.8.8 /opt/
```
### 配置环境变量
配置环境变量： 打开您的shell配置文件（通常是**.bashrc**、**.bash_profile**、**.zshrc**等），并添加Maven的**bin**目录到您的**PATH**环境变量中。使用文本编辑器（如**nano**、**vim**等）编辑配置文件：
```
vim ~/.bashrc
```
在文件的末尾添加以下行（假设您将Maven安装在**/opt**目录）：
```
export PATH=/opt/apache-maven-3.8.8/bin:$PATH
```
保存文件后，执行以下命令使配置生效：
```
source ~/.bashrc
```
### 验证安装
验证安装： 在终端中运行以下命令，验证Maven是否已成功安装：
```
mvn -version
```
如果一切设置正确，您应该看到Maven的版本信息。
### 注意
注意：您需要正确设置**JAVA_HOME**环境变量才能运行Maven；
