## 前言
配置好本地仓库，中央仓库这里是（阿里云）不然用的是国外的，速度很慢，在本地仓库里的依赖不够多的时候，大部分时候还得靠远程仓库；
## IDEA配置Maven环境
Customize-->All settings
Settings-->搜索 maven-->设置IDEA使用本地安装的Maven，并修改配置文件路径-->Apply—>OK；
Maven home directory：点击修改找到自己的maven路径；
User settings file：maven目录/conf/settings.xml 文件；
注：要勾选override才可以浏览编辑文件；
![屏幕截图 2023-06-16 113935.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686886820553-b899e922-7921-42e9-a7ed-0c69bcdec055.png#averageHue=%23333638&clientId=ued28158b-cb47-4&from=paste&height=800&id=u5df6c98f&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=63630&status=done&style=none&taskId=u410fa60c-230a-4309-bf45-8efebc06ff3&title=&width=1280)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686878298471-461cd7ea-444b-47ba-8a29-55a20a2f898b.png#averageHue=%233d4247&clientId=u9a9c727c-6740-4&from=paste&height=701&id=u661a62e5&originHeight=1051&originWidth=1439&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=107339&status=done&style=none&taskId=u7cbe8d1b-7404-4a2a-8db4-031a195af0d&title=&width=959.3333333333334)
## 配置运行程序虚拟机参数
使用IDEA创建maven项目时，idea会根据maven archetype的配置，执行 mvn archetype:generate 命令，并且需要指定一个archetype-catalog.xml文件。
该命令的参数-DarchetypeCatalog，可选值为[remote, internal, local]，用来指定archetype-catalog.xml文件从哪里获取。
默认为remote，即从 [https://repo1.maven.org/maven2/archetype-catalog.xml](https://repo1.maven.org/maven2/archetype-catalog.xml) 下载archetype-catalog.xml文件。体积约为10M，就会导致下载速度很慢，从而创建过程经常会被卡住。
### 解决的方法
就是修改maven的VM Options参数配置；
Runner-->VM Options-->添加-DarchetypeCatalog=internal
```xml
-DarchetypeCatalog=internal
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686886426147-cc82a535-9a7e-4fa4-b3ef-9682b2527685.png#averageHue=%233d4246&clientId=u17d20e20-90fb-4&from=paste&height=712&id=u335ff8d7&originHeight=1068&originWidth=1457&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=95430&status=done&style=none&taskId=uec54486f-c38d-43de-8365-8de497f296f&title=&width=971.3333333333334)
## IDEA创建maven项目（默认）
Projects-->New Project-->Maven-->Create；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688364666706-6735ba6c-50ad-4179-b360-a52286b199aa.png#averageHue=%233d4144&clientId=u11353864-72ca-4&from=paste&height=663&id=u5cd2adb4&originHeight=994&originWidth=1171&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=77826&status=done&style=none&taskId=u88d3ecc4-3c0d-454f-854b-a9ff7826393&title=&width=780.6666666666666)
## Archetype的选择说明
简单的说，Archetype是Maven工程的模板工具包。一个Archetype定义了要做的相同类型事情的初始样式或模型。这个名称给我们提供来了一个一致的生成Maven工程的方式。Archetype会帮助作者给用户创建Maven工程模板，并给用户提供生成相关工程模板版本的参数化方法。
### 常用Archetype
maven-archetype-webapp（简单的Java Web应用程序）
基本内容包括：一个packaging为war且带有junit依赖声明的pom.xml、src/main/webapp/目录、src/main/webapp/index.jsp文件、src/main/webapp/WEB-INF/web.xml文件；
### IDEA创建maven项目（简单的Java Web应用程序）
Projects-->New Project-->Maven Archetype-->maven-archetype-webapp-->Create；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688364530668-2d24dc82-7a5f-465e-994b-4a653b6308ce.png#averageHue=%233d4245&clientId=u11353864-72ca-4&from=paste&height=652&id=u1ac965e4&originHeight=978&originWidth=1169&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=86823&status=done&style=none&taskId=u9c28bdf3-a9a9-4c2f-a249-cd39c1e22b5&title=&width=779.3333333333334)

