## Tomcat 简介
Tomcat 服务器是一个免费的开放源代码的Web 应用服务器，属于轻量级应用服务器，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试JSP 程序的首选，对于一个初学者来说；
## Tomcat 安装
官网：[https://tomcat.apache.org/](https://tomcat.apache.org/)
左侧Download下面是Tomcat最新的几个版本（7、8、9、10、11）的下载链接，右侧是对每个版本的最新版进行特性介绍，主要讲述与上一版本相比新增了哪些特性。
选择相对应的版本Download，例如“ Tomcat 10 ”；
![屏幕截图 2023-05-25 140241.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684994595753-b5c6cc6f-9b75-4c00-b01c-b6f49bce5b09.png#averageHue=%23f4f1ec&clientId=u48a11249-f68f-4&from=paste&height=684&id=ua69758ab&originHeight=1026&originWidth=1884&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=331775&status=done&style=none&taskId=u06e9e8e0-48fd-42a9-a70f-9d2d83bdcb7&title=&width=1256)
选择64位的windows的安装包，下载后解压；
![屏幕截图 2023-05-25 140452.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684994826393-6e877807-b5ad-4ce0-b420-65ce2d8243a8.png#averageHue=%23fbfbfa&clientId=u48a11249-f68f-4&from=paste&height=514&id=u9aa97249&originHeight=771&originWidth=1542&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=96138&status=done&style=none&taskId=u1dd5e688-6e5a-48f1-b1a9-d0dd595277a&title=&width=1028)
##  Tomcat 启动和配置  
### 文件夹作用

1. bin：可执行文件（启动文件startup.bat、关闭文件shutdown.bat）
2. conf：配置文件（修改端口号：server.xml，建议将server.xml备份）
3. lib：依赖的jar包
4. log：日志文件（记录出错等信息）
5. temp：临时文件
6. webapps：可执行的项目。默认作为存放开发项目的目录
7. work：存放由jsp翻译成的.java源文件,以及编译的.class字节码文件(jsp ->java ->class)
8. 其他文件

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684995768014-1513495a-75a2-4003-a35a-fa83a40f32f0.png#averageHue=%23fdfcfc&clientId=u48a11249-f68f-4&from=paste&height=450&id=u6008f0e0&originHeight=675&originWidth=1276&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=55472&status=done&style=none&taskId=uca5f4c89-0735-4b3d-9194-fc2085ade1b&title=&width=850.6666666666666)
### 启动，关闭Tomcat；
startup启动，shutdown关闭；
![屏幕截图 2023-05-25 142935.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684996242262-b2997a2c-acb2-43af-96a7-28b640999670.png#averageHue=%23fbfafa&clientId=u48a11249-f68f-4&from=paste&height=492&id=u8e621c1e&originHeight=738&originWidth=1387&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=82156&status=done&style=none&taskId=ub2605b18-309c-42f2-972f-5d2ee5b4cc7&title=&width=924.6666666666666)
### 常见问题

1. Java环境变量没有配置
   1. JAVA_HOME中的路径不能用分号结尾，如C:\Program Files\Java\jdk1.8.0_121
   2. JAVA_HOME的路径是JDK路径，而不是JRE的路径。
   3. CATALINA_HOME中的路径不能以\结尾。
   4. 在环境变量中修改添加变量时，一定要注意分号、空格，是否有多余的字母。
2. 闪退问题：需要配置兼容性
3. 乱码问题：配置文件中设置
###  配置  
点击 conf（配置）文件，找到 server.xml（服务器核心配置文件）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684996490279-29907491-2f45-4f5b-9f45-00a3903f8a67.png#averageHue=%23fcfcfb&clientId=u48a11249-f68f-4&from=paste&height=351&id=ucacfc763&originHeight=527&originWidth=1307&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=43535&status=done&style=none&taskId=uc1a67d9d-52d7-49ef-9c07-a5993211d19&title=&width=871.3333333333334)
配置启动的端口号（默认）；
```xml
<Connector port="8080" protocol="HTTP/1.1"
  connectionTimeout="20000"
  redirectPort="8443"
  />
```
### 环境变量
Tomcat在运行时必须指定使用的JDK，由于我们可能下载了多个JDK版本，所以使用Tomcat前，必须配置好 JAVA_HOME，来指定我们需要使用哪一个JDK。
当配置好JAVA_HOME之后我们便可以启动Tomcat了，但只能在安装目录的bin目录下找到 startup.bat 双击启动，如果我们想使用命令行启动，则需要配置CATALINA_HOME 和 Path。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684998218448-f4ab5495-33c8-405b-98e0-5aafaea51181.png#averageHue=%23eceae9&clientId=u535d7aff-e104-4&from=paste&height=539&id=u035368f6&originHeight=809&originWidth=1227&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=128707&status=done&style=none&taskId=u34fff905-95a2-4ba8-a9e4-b8650c709da&title=&width=818)
再在Path变量里新增一条 Tomcat 中的bin目录路径
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684998309643-994dc160-d5ff-4989-8369-f97116d8d9dd.png#averageHue=%23edeceb&clientId=u535d7aff-e104-4&from=paste&height=488&id=u3a2e0ea4&originHeight=732&originWidth=1146&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=123073&status=done&style=none&taskId=ub6949e72-4956-4167-b415-d3033f8e2ad&title=&width=764)
此时，打开命令行，输入 startup 命令然后回车，如图所示：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684998668875-5b9ee527-ce85-439e-9754-95d8e71e6e03.png#averageHue=%231c1c1c&clientId=u6cf34e73-9160-4&from=paste&height=800&id=u37d32cf0&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=280996&status=done&style=none&taskId=u2bdf15cc-1af6-493b-8ba1-8389aadf1ac&title=&width=1280)
这说明 Tomcat 服务器已经可以在命令行中正常启动了，我们可以在网址栏中输入 [http://localhost:8080/](http://localhost:8080/)来访问Tomcat服务器主界面（访问格式： 访问地址 ：端口号）用来检验 Tomcat 是否安装配置成功，如图所示：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684998913049-c57968c3-5ab6-4164-835b-885e2a4be402.png#averageHue=%23f8e9be&clientId=u6cf34e73-9160-4&from=paste&height=725&id=u5ab50a5f&originHeight=1087&originWidth=1898&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=298739&status=done&style=none&taskId=ua868b22a-b375-45d0-959c-347d24a5512&title=&width=1265.3333333333333)
