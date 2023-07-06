### 删除LibreOffice套件
1、打开终端。您可以使用快捷键**Ctrl + Alt + T**来打开终端。
2、输入以下命令以卸载LibreOffice套件：
```java
sudo apt-get remove libreoffice*
```
### 删除所有与LibreOffice相关的软件包
1、系统可能会要求您输入管理员密码。输入密码后，按下Enter键继续。
2、终端会列出要删除的软件包，并要求您确认操作。按下**Y**键，然后按下Enter键继续。
3、完成卸载后，您可以输入以下命令来删除与LibreOffice相关的配置文件：
```java
sudo apt-get purge libreoffice*
```
### 删除与LibreOffice相关的配置文件
1、系统可能再次要求您输入管理员密码。输入密码后，按下Enter键继续。
2、终端会再次列出要删除的软件包，并要求您确认操作。按下**Y**键，然后按下Enter键继续。
3、删除完成后，您可以输入以下命令来清理不再需要的依赖项：
```java
sudo apt-get autoremove
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688608641714-f249c75d-f49e-423e-bd03-1e2673f3f724.png#clientId=ua3c58d07-a08c-4&from=paste&height=635&id=uf7dadaeb&originHeight=953&originWidth=1773&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1211647&status=done&style=none&taskId=uc7b06f01-ddb7-4217-8775-8c47dcc66d6&title=&width=1182)
