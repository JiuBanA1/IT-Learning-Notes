## Maven仓库介绍
当使用 Maven 构建项目时，有三种仓库起着重要作用：	

1. 本地仓库：就像你自己的书库。当你使用 Maven 下载依赖项时，它们会被保存在你电脑上的一个特定目录中，以后可以重复使用。这个本地仓库存储了项目所需的库文件和插件，使得构建过程更快速，因为不需要每次都从互联网下载。
2. 中央仓库：类似于一个全球共享的图书馆。中央仓库是 Maven 社区维护的一个公共存储库，其中包含了大量的开源库文件和插件。当你在 Maven 项目中声明依赖项时，如果没有指定其他远程仓库，Maven 会自动从中央仓库下载所需的依赖项。中央仓库是 Maven 默认的远程仓库，你可以从中央仓库获取到大量常见的开源库文件和插件。
3. 远程仓库：类似于其他人的书库。远程仓库是其他人或组织维护的存储库，可以用来存储和分享自定义的库文件和插件。当你在项目中需要特定的依赖项或插件，而这些不在中央仓库中，你可以配置远程仓库的位置，以便 Maven 可以从远程仓库中下载所需的文件。
## Maven配置本地仓库
1、在maven安装目录下新建文件夹 repository 作为本地仓库
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686813370303-36d347af-d58d-4c64-bc95-707e7bfd183d.png#averageHue=%23fdfcfb&clientId=u4615065e-a55c-4&from=paste&height=246&id=WTn9c&originHeight=369&originWidth=1097&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=28227&status=done&style=none&taskId=ufa5928f4-963b-479c-88a2-5897b4a4b88&title=&width=731.3333333333334)
2、找到conf下的settings.xml文件进行配置
```xml
<localRepository>····<localRepository>中间内容替换成自己本地仓库的地址
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686813622597-a9dbdf9f-fe5d-4284-8377-d1ac20f3a5cf.png#averageHue=%23232120&clientId=u4615065e-a55c-4&from=paste&height=317&id=uce092bc2&originHeight=475&originWidth=1437&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=99191&status=done&style=none&taskId=u1aa181fa-7061-4efd-8aa1-78d94817801&title=&width=958)
## Maven配置远程仓库（公共或中央仓库）
在 settings.xml 文件中配置仓库，下面是阿里云的中央仓库
```xml
<mirror> 
 <!-- 指定镜像 ID -->
<id>nexus-aliyun</id> 
 <!-- 匹配中央仓库。-->
<mirrorOf>central</mirrorOf>
<!-- 指定镜像名称 --> 
<name>Nexus aliyun</name> 
<!-- 指定镜像路径 -->
<url>http://maven.aliyun.com/nexus/content/groups/public</url> 
</mirror>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686814885466-986a68fc-ee7c-4aac-9432-96c4ebe0f0fd.png#averageHue=%2320201f&clientId=u4615065e-a55c-4&from=paste&height=737&id=u8b4b52c6&originHeight=1105&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=264316&status=done&style=none&taskId=ua0b6e9ae-2870-40f4-8209-538c456a875&title=&width=1280)
## Maven配置远程仓库（私有）
确保将上面的URL替换为您实际的远程仓库URL。
在Maven的settings.xml文件中配置认证信息，在<servers>标签内添加一个<server>子标签，确保**your-username**和**your-password**替换为实际的认证信息。
```xml
<servers>
  <server>
    <id>remote-repo</id>
    <url>http://example.com/repository</url>
    <username>your-username</username>
    <password>your-password</password>
  </server>
</servers>
```
## 配置jdk
找到<profiles></profile>标签，在里面添加以下代码，配置JDK的版本，要与安装的版本对应
```xml
 <profile>
    <id>jdk-17</id>
    <activation>
        <activeByDefault>true</activeByDefault>
        <jdk>17</jdk>
    </activation>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <maven.compiler.compilerVersion>17</maven.compiler.compilerVersion>
    </properties>
</profile>
```
