## 一、什么是JDK？
#### 1、大概介绍
> JDK是 Java 语言的软件开发工具包，主要用于移动设备、嵌入式设备上的java应用程序；JDK是整个Java开发的核心，它包含了Java的运行环境和Java工具。

#### 2、JDK的重要性
> 没有JDK的话，无法编译Java程序（指java源码 . java 文件），如果想只运行Java程序（指 class 或 jar 或其它归档文件) 。

## 二、Java中JDK8、JDK11该怎么选择？
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223062674-3a718a85-be54-476f-8f76-bb088cf100ea.png#averageHue=%2381878d&clientId=u825363cc-fc37-4&from=paste&height=404&id=u66815c86&name=image.png&originHeight=432&originWidth=779&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=378479&status=done&style=none&taskId=u2eb1fa48-825f-4b83-bebd-b42412643c1&title=&width=729.3333740234375)
#### 1、JDK的稳定版本
> JDK更新换代，而到目前为止，JDK存在了三个长期支持版，分别是JDK8、JDK11和JDK17。

#### 2、而我们所说的长期支持版是什么呢？
> 这三个版本是Oracle长期维护的JDK版本，而企业里面，就是需要长期支持版本，因为企业的项目需要稳定的开发环境。

#### 3、如何选择
**JDK8：**
> JDK8，因为相比以往的JDK7、JDK5这些，JDK8的生态很好，开发者使用起来也比之前的版本舒适，同时JDK8支持了几乎所有的开发功能需求，设计比较完善，JDK8也是迄今为止维护支持时间最长的版本。

**JDK11：**
> 使用JDK8开发程序时，总存在一些弊端，也多了许许多多的需求，所以慢慢的，Oracle也发布了另一个长期支持更新维护版本JDK11，对比JDK8，有了很多内部的升级；但是到现在，JDK8仍然是主流。

## 三、JDK和JRE是什么关系？
> JDK，Java开发工具包；JRE，Java运行时环境；更通俗的解释就是说，只要开发Java程序，就需要下载和安装该软件，对于开发人员来说，一旦开发完Java程序之后，也是要运行并且测试的，因此JDK和JRE是一个包含关系。

## 四、JDK包含的基本组件

- javac – 编译器，将源程序转成字节码
- jar – 打包工具，将相关的类文件打包成一个文件
- javadoc – 文档生成器，从源码注释中提取文档
- jdb – debugger，查错工具
- java – 运行编译后的java程序（.class后缀的）
- appletviewer：小程序浏览器，一种执行HTML文件上的Java小程序的Java浏览器
- Javah：产生可以调用Java过程的C/C++过程，或建立能被Java程序调用的C/C++过程的头文件
- Javap：Java反汇编器，显示编译类文件中的可访问功能和数据，同时显示字节代码含义
- Jconsole: Java进行系统调试和监控的工具
## 五、JDK下载步骤
> Java已经被Oracle收购，进入Oracle官网下载

[https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
> 点击产品

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223386471-d4d6f677-b281-4b1a-94ec-319e6b78f4a4.png#averageHue=%2347423d&clientId=u825363cc-fc37-4&from=paste&height=630&id=ua3da2444&name=image.png&originHeight=945&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=560668&status=done&style=none&taskId=u920b2fab-64c6-4b11-b4b1-59a9188dd46&title=&width=1148)
> 点击Java

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223446765-5dc23be2-eed5-4320-aa01-39fa18db2004.png#averageHue=%233b3733&clientId=u825363cc-fc37-4&from=paste&height=594&id=u73a005ec&name=image.png&originHeight=891&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=301408&status=done&style=none&taskId=ub8275962-19c0-4137-b650-01a50294907&title=&width=1148)
> 点击下载Java，进入Java的下载页

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223522875-e35aa84f-f023-4aad-a948-dcf1df014dfa.png#averageHue=%2347816b&clientId=u825363cc-fc37-4&from=paste&height=625&id=ued42f922&name=image.png&originHeight=937&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=442091&status=done&style=none&taskId=ube637012-0084-4d81-aba0-9529865c432&title=&width=1148)
> 找到心仪的JDK版本，进行下载

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676223622409-bb7053d3-826e-4fb9-b89d-7fa069ed3b00.png#averageHue=%23fcfbfa&clientId=u825363cc-fc37-4&from=paste&height=541&id=u213d1e1e&name=image.png&originHeight=811&originWidth=1722&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=285834&status=done&style=none&taskId=u3e98d47d-e68a-47a0-ac6b-4b80ffff022&title=&width=1148)
