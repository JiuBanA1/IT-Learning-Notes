## 一、什么是JDK？
#### 1、大概介绍
> JDK是 Java 语言的软件开发工具包，主要用于移动设备、嵌入式设备上的java应用程序；JDK是整个Java开发的核心，它包含了Java的运行环境和Java工具。

#### 2、JDK的重要性
> 没有JDK的话，无法编译Java程序（指java源码 . java 文件），如果想只运行Java程序（指 class 或 jar 或其它归档文件) 。

## 二、Java中JDK8、JDK11该怎么选择？
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676983051679-4582e9b1-353c-42e5-aa54-6909fd3c10c6.png#averageHue=%23868d93&clientId=ua800d6e7-b375-4&from=paste&height=398&id=ue2515d1d&name=image.png&originHeight=597&originWidth=1079&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=701946&status=done&style=none&taskId=u3d09d143-de4e-4ec4-8a84-9ee8e1dfe3a&title=&width=719.3333333333334)
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
## JDK 安装
### 1、双击运行安装包，出现安装程序，点击下一步
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677749615789-144d6007-29fc-4144-b3e9-a95bb74656ac.png#averageHue=%23edecec&clientId=ueba3882a-695a-4&from=paste&height=353&id=u3aeffc4b&name=image.png&originHeight=530&originWidth=704&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=25777&status=done&style=none&taskId=u562e840f-6fce-4818-a438-307974c4c38&title=&width=469.3333333333333)
### 2、修改JDK安装目录
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677749666857-3a0bbed5-f3e2-4864-a822-b0d3521d5a61.png#averageHue=%23e3c767&clientId=ueba3882a-695a-4&from=paste&height=354&id=u1d987a48&name=image.png&originHeight=531&originWidth=706&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31578&status=done&style=none&taskId=u18fd6cd4-85c2-40ec-a346-d39ea3190aa&title=&width=470.6666666666667)
### 3、根据提示安装完成，这就完成jdk安装了，可以直接点关闭了
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677749759485-dcba7d20-bd37-412b-8d8b-2c864a77415c.png#averageHue=%23ececec&clientId=ueba3882a-695a-4&from=paste&height=359&id=uca400340&name=image.png&originHeight=538&originWidth=713&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=28658&status=done&style=none&taskId=u5edc86b2-3a5f-4878-beee-546d6f2500c&title=&width=475.3333333333333)
## JDK 环境配置
### 1、此电脑”右键→属性→高级系统设置→环境变量
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677749998399-63b2be2a-7ac9-4149-896b-f74f2766d6d5.png#averageHue=%23f5f4f3&clientId=ueba3882a-695a-4&from=paste&height=551&id=u0dd0e2dc&name=image.png&originHeight=826&originWidth=734&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=37688&status=done&style=none&taskId=ua26039cf-2513-4116-9dfd-04ab43a9254&title=&width=489.3333333333333)
### 2、环境变量→新建
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677750083043-08492f32-66cb-4a6d-8f40-e27980a898ca.png#averageHue=%23f1efee&clientId=ueba3882a-695a-4&from=paste&height=606&id=u0d3bd296&name=image.png&originHeight=909&originWidth=943&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=74677&status=done&style=none&taskId=u2a2c3b0c-b438-4fbc-ab6e-f9880afc4e4&title=&width=628.6666666666666)
### 3、点击“新建”，新建系统变量JAVA_HOME，值为JDK安装bin目录
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677750292993-22ef0037-ae1a-40eb-81eb-8a8217df13e4.png#averageHue=%23f2f1f1&clientId=ueba3882a-695a-4&from=paste&height=167&id=ub20b1bac&name=image.png&originHeight=251&originWidth=1013&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=17305&status=done&style=none&taskId=u001e286d-f9da-4f10-b29a-3b19ca2df31&title=&width=675.3333333333334)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677750904380-7011a7cf-f789-4d45-b624-53508af70e3c.png#averageHue=%23eeedec&clientId=u605ebfe6-850c-4&from=paste&height=595&id=u6b297620&name=image.png&originHeight=892&originWidth=976&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=95697&status=done&style=none&taskId=u1c000b66-7112-4010-ab5b-0e91c750f88&title=&width=650.6666666666666)
### 4、JDK的配置验证
同时按住win + R，输入cmd，回车，进入命令提示符窗口，输入**java**，然后回车，看到如下类似信息，表示环境变量安装成功。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677750505129-1e402ab9-da74-4cba-a23f-65ed1fbc9ed4.png#averageHue=%23141414&clientId=ueba3882a-695a-4&from=paste&height=800&id=u440dba44&name=image.png&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=173569&status=done&style=none&taskId=u22a51017-e201-4e79-ba0b-6862ded8cfb&title=&width=1280)
