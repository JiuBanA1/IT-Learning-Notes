## 一、什么是JDK？

### 1、大概介绍

> JDK是 Java 语言的软件开发工具包，主要用于移动设备、嵌入式设备上的java应用程序；JDK是整个Java开发的核心，它包含了Java的运行环境和Java工具。

### 2、详细介绍

[JDK_百度百科](https://baike.baidu.com/item/jdk/1011)

### 3、JDK的重要性

> 没有JDK的话，无法编译Java程序（指java源码 . java 文件），如果想只运行Java程序（指 class 或 jar 或其它归档文件) 。

## 二、JDK的更新历程

| 版本                  | 发行日期       |
| ------------------- | ---------- |
| JDK 1.1.4           | 1997-09-12 |
| JDK 1.1.5           | 1997-12-13 |
| JDK 1.1.6           | 1998-04-24 |
| JDK 1.1.7           | 1998-09-28 |
| JDK 1.1.8           | 1999-04-08 |
| J2SE 1.2            | 1998-12-04 |
| J2SE 1.2.1          | 1999-03-30 |
| J2SE 1.2.2          | 1999-07-08 |
| J2SE 1.3            | 2000-05-08 |
| J2SE 1.3.1          | 2001-05-17 |
| J2SE 1.4.0          | 2002-02-13 |
| J2SE 1.4.1          | 2002-09-16 |
| J2SE 1.4.2          | 2003-06-26 |
| J2SE 5.0            | 2004-09    |
| Java SE 5.0 (1.5.0) | 2004-09-30 |
| Java SE 6.0 (1.6.0) | 2006-04    |
| Java SE 7.0 (1.7.0) | 2011-07-28 |
| Java SE 8.0 (1.8.0) | 2014-03-18 |
| Java SE 9           | 2017-09-21 |
| Java SE 10          | 2018-03-14 |
| Java SE 11          | 2018-09-26 |
| Java SE 12          | 2019-03-20 |
| Java SE 13          | 2019-09-17 |
| Java SE 14          | 2020-03-17 |
| Java SE 15          | 2020-09    |
| Java SE 16          | 2021-03    |
| Java SE 17          | 2021-09    |

## 三、Java中JDK8、JDK11该怎么选择？

### 1、JDK的稳定版本

> JDK更新换代，而到目前为止，JDK存在了三个长期支持版，分别是JDK8、JDK11和JDK17。

### 2、而我们所说的长期支持版是什么呢？

> 这三个版本是Oracle长期维护的JDK版本，而企业里面，就是需要长期支持版本，因为企业的项目需要稳定的开发环境。
> 
### 3、如何选择

**JDK8：**

> JDK8，因为相比以往的JDK7、JDK5这些，JDK8的生态很好，开发者使用起来也比之前的版本舒适，同时JDK8支持了几乎所有的开发功能需求，设计比较完善，JDK8也是迄今为止维护支持时间最长的版本。

**JDK11：**

> 使用JDK8开发程序时，总存在一些弊端，也多了许许多多的需求，所以慢慢的，Oracle也发布了另一个长期支持更新维护版本JDK11，对比JDK8，有了很多内部的升级；但是到现在，JDK8仍然是主流。

## 四、JDK包含的基本组件

> javac – 编译器，将源程序转成字节码
> 
> jar – 打包工具，将相关的类文件打包成一个文件
> 
> javadoc – 文档生成器，从源码注释中提取文档
> 
> jdb – debugger，查错工具
> 
> java – 运行编译后的java程序（.class后缀的）
> 
> appletviewer：小程序浏览器，一种执行HTML文件上的Java小程序的Java浏览器
> 
> Javah：产生可以调用Java过程的C/C++过程，或建立能被Java程序调用的C/C++过程的头文件
> 
> Javap：Java反汇编器，显示编译类文件中的可访问功能和数据，同时显示字节代码含义
> 
> Jconsole: Java进行系统调试和监控的工具

## 五、JDK下载、安装、配置环境变量

## 1、JDK下载步骤

**Java已经被Oracle收购，进入Oracle官网下载**

[Oracle 甲骨文中国 | 云应用和云平台](https://www.oracle.com/cn/)

> 点击产品

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/de15c058e2ca45908e6b60806926483e~tplv-k3u1fbpfcp-zoom-1.image)

> 点击Java

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/a5588974088b49ce97dc378a1dca17ee~tplv-k3u1fbpfcp-zoom-1.image)

> 点击下载Java，进入Java的下载页

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/2291ece170a44dbbbdd867fb2e467809~tplv-k3u1fbpfcp-zoom-1.image)

> 找到心仪的JDK版本，进行下载

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/76fdba3d4fb84b6ebf2fe8e6e2bfddae~tplv-k3u1fbpfcp-zoom-1.image)

### 2、JDK安装步骤

> 找到下载后的jdk的安装包，双击进行安装，然后也可以更改安装地址。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/46e54317667e430a964b88b766841936~tplv-k3u1fbpfcp-zoom-1.image)

> 然后就到了jre的安装，如果不想安装到默认的C盘，点击更改按钮。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/8c0842ad84f14402925202a33be049db~tplv-k3u1fbpfcp-zoom-1.image)

> jre的安装需要我们自己手动创建一个安装的文件夹。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/a8fcb441e939458c9343d69cd754ad28~tplv-k3u1fbpfcp-zoom-1.image)

> 点击确定后，就可以继续安装了，到此jdk和jre安装完成。
> 
![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/fed8768ee9c84d93a4b2ff9b4bdd5bc3~tplv-k3u1fbpfcp-zoom-1.image)

### 3、配置环境变量

**图形界面程序：**

> 此电脑上右键选择属性，然后点击高级系统设置，就会打开系统属性。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/985fe66cc801498292175baaa2004a97~tplv-k3u1fbpfcp-zoom-1.image)

> 点击下面的环境变量，就会打开环境变量的设置窗口。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/ed5c8cb684494e3ea7296c7635d6a9f4~tplv-k3u1fbpfcp-zoom-1.image)

> 在系统变量里，点击新建，配置JAVA_HOME变量，变量值就是jdk的安装路径。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/be5deed370554f28a97b927ee7f3fdc3~tplv-k3u1fbpfcp-zoom-1.image)

> 修改path路径，在windows系统中，path变量是内置好的，我们需要将jdk下的bin目录配置到path里。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/619b8cd5e9f24e568444821f1160b23a~tplv-k3u1fbpfcp-zoom-1.image)

> 两次新建，将jdk下的bin目录和jdk下jre里的bin目录配置进去

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/87ec9ed7bd4c478193e4a23611be5c97~tplv-k3u1fbpfcp-zoom-1.image)

## 六、JDK和JRE是什么关系？

> JDK（Java development Kit）Java开发工具包；JRE（Java Runtime Environment）Java运行时环境；更通俗的解释就是说，只要开发Java程序，就需要下载和安装该软件，对于开发人员来说，一旦开发完Java程序之后，也是要运行并且测试的，因此JDK和JRE是一个包含关系。
