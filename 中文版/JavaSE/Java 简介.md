## 一、Java 简介
> Java 是由 Sun Microsystems 公司于 1995 年 5 月推出的 Java 面向对象程序设计语言和 Java 平台的总称；由 James Gosling和同事们共同研发，并在 1995 年正式推出。

## 二、Oracle 公司
> Sun Microsystems 公司被 Oracle 公司收购后，Java 也随之成为 Oracle 公司的产品。
> Oracle开发的关系数据库产品因性能卓越而闻名，许多大型网站也选用了Oracle系统，是世界最好的数据库产品。

![](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1673963305328-0973916d-cf78-46b1-adb5-01a2f8035667.jpeg#averageHue=%23949481&from=url&id=cR0ke&originHeight=731&originWidth=1300&originalType=binary&ratio=1&rotation=0&showTitle=false&status=done&style=none&title=)
## 三、Java平台体系
> JavaSE（J2SE）（Platform Standard Edition，平台标准版）包括：Java 基础、Java 面向对象、Java 语言高级。
> JavaEE（J2EE）(Platform Enterprise Edition，平台企业版) 包括：Javaweb、Java框架、微服务与分布式、中间件。
> JavaME（J2ME）(Platform Micro Edition，平台微型版) JavaEE 可以理解，不用去深究。

## 四、Java语言主要特点
![](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676215662909-bf52b700-cca5-40f2-9d25-b6ef1ae1e5be.png#averageHue=%234e524b&clientId=u13af7a18-ae1f-4&from=paste&height=404&id=u5c4c6ca1&originHeight=354&originWidth=640&originalType=url&ratio=1.5&rotation=0&showTitle=false&status=done&style=none&taskId=ufc376b7f-3a50-4ca9-abbc-94dfb4967bd&title=&width=731)
#### 1、Java 语言是简单的
> Java 语言的语法与 C 语言和 C++ 语言很接近，使得大多数程序员很容易学习和使用。另一方面，Java 丢弃了 C++ 中很少使用的、很难理解的、令人迷惑的那些特性，如操作符重载、多继承、自动的强制类型转换。特别地，Java 语言不使用指针，而是引用。并提供了自动分配和回收内存空间，使得程序员不必为内存管理而担忧。

#### 2、Java 语言是面向对象的
> Java 语言提供类、接口和继承等面向对象的特性，为了简单起见，只支持类之间的单继承，但支持接口之间的多继承，并支持类与接口之间的实现机制（关键字为 implements）。Java 语言全面支持动态绑定，而 C++语言只对虚函数使用动态绑定。总之，Java语言是一个纯的面向对象程序设计语言。

#### 3、Java语言是分布式的
> Java 语言支持 Internet 应用的开发，在基本的 Java 应用编程接口中有一个网络应用编程接口（java net），它提供了用于网络应用编程的类库，包括 URL、URLConnection、Socket、ServerSocket 等。Java 的 RMI（远程方法激活）机制也是开发分布式应用的重要手段。

#### 4、Java 语言是健壮的
> Java 的强类型机制、异常处理、垃圾的自动收集等是 Java 程序健壮性的重要保证。对指针的丢弃是 Java 的明智选择。Java 的安全检查机制使得 Java 更具健壮性。

#### 5、Java语言是安全的
> Java通常被用在网络环境中，为此，Java 提供了一个安全机制以防恶意代码的攻击。除了Java 语言具有的许多安全特性以外，Java 对通过网络下载的类具有一个安全防范机制（类 ClassLoader），如分配不同的名字空间以防替代本地的同名类、字节代码检查，并提供安全管理机制（类 SecurityManager）让 Java 应用设置安全哨兵。

#### 6、Java 语言是体系结构中立的
> Java 程序（后缀为 java 的文件）在 Java 平台上被编译为体系结构中立的字节码格式（后缀为 class 的文件），然后可以在实现这个 Java 平台的任何系统中运行。这种途径适合于异构的网络环境和软件的分发。

#### 7、Java 语言是可移植的
> 这种可移植性来源于体系结构中立性，另外，Java 还严格规定了各个基本数据类型的长度。Java 系统本身也具有很强的可移植性，Java 编译器是用 Java 实现的，Java 的运行环境是用 ANSI C 实现的。

#### 8、Java 语言是解释型的
> 如前所述，Java 程序在 Java 平台上被编译为字节码格式，然后可以在实现这个 Java 平台的任何系统中运行。在运行时，Java 平台中的 Java 解释器对这些字节码进行解释执行，执行过程中需要的类在联接阶段被载入到运行环境中。

#### 9、Java 是高性能的
> 与那些解释型的高级脚本语言相比，Java 的确是高性能的。事实上，Java 的运行速度随着 JIT(Just-In-Time）编译器技术的发展越来越接近于 C++。

#### 10、Java 语言是多线程的
> 在 Java 语言中，线程是一种特殊的对象，它必须由 Thread 类或其子（孙）类来创建。任何一个线程均有它的 run 方法，而 run 方法中包含了线程所要运行的代码。线程的活动由一组方法来控制。Java 语言支持多个线程的同时执行，并提供多线程之间的同步机制（关键字为 synchronized）。

#### 11、Java 语言是动态的
> Java 语言的设计目标之一是适应于动态变化的环境。Java 程序需要的类能够动态地被载入到运行环境，也可以通过网络来载入所需要的类。这也有利于软件的升级。另外，Java 中的类有一个运行时刻的表示，能进行运行时刻的类型检查。

## 五、发展历史
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676216652318-e15111bd-d149-48d9-9c13-59365d68e073.png#averageHue=%230b2617&clientId=u75f08b82-8340-4&from=paste&id=udf5446e0&name=image.png&originHeight=618&originWidth=996&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=597801&status=done&style=none&taskId=ud86406c8-f282-4cff-845a-b664ff24246&title=)

---

- 1995 年 5 月 23 日，Java 语言诞生
- 1996 年 1 月，第一个 JDK-JDK1.0 诞生
- 1996 年 4 月，10 个最主要的操作系统供应商申明将在其产品中嵌入 JAVA 技术
- 1996 年 9 月，约 8.3 万个网页应用了 JAVA 技术来制作
- 1997 年 2 月 18 日，JDK1.1 发布
- 1997 年 4 月 2 日，JavaOne 会议召开，参与者逾一万人，创当时全球同类会议规模之纪录
- 1997 年 9 月，JavaDeveloperConnection 社区成员超过十万
- 1998 年 2 月，JDK1.1 被下载超过 2,000,000次
- 1998 年 12 月 8 日，JAVA2 企业平台 J2EE 发布
- 1999 年 6月，SUN 公司发布 Java 的三个版本：标准版（JavaSE, 以前是 J2SE）、企业版（JavaEE 以前是 J2EE）和微型版（JavaME，以前是 J2ME）
- 2000 年 5 月 8 日，JDK1.3 发布
- 2000 年 5 月 29 日，JDK1.4 发布
- 2001 年 6 月 5 日，NOKIA 宣布，到 2003 年将出售 1 亿部支持 Java 的手机
- 2001 年 9 月 24 日，J2EE1.3 发布
- 2002 年 2 月 26 日，J2SE1.4 发布，自此 Java 的计算能力有了大幅提升
- 2006 年 12 月，SUN 公司发布 JRE6.0
- 2009 年 04 月 20 日，甲骨文 74 亿美元收购 Sun，取得 Java 的版权。
- 2010 年 11 月，由于甲骨文对于 Java 社区的不友善，因此 Apache 扬言将退出 JCP。
- 2011 年 7 月 28 日，甲骨文发布 Java7.0 的正式版。
- 2014 年 3 月 18 日，Oracle 公司发表 Java 8
- 2017 年 9 月 21 日，Oracle 公司发表 Java 9
- 2018 年 3 月 21 日，Oracle 公司发表 Java 10
- 2018 年 9 月 25 日，Java 11 
- 2019 年 3 月 20 日，Java 12 
- 2019-09-17，Java 13
- 2020-03-17，Java 14
- 2020-09，Java 15
- 2021-03，Java 16
- 2021-09，Java 17
- 2022 年 3 月 22 ，Java 18
- 2022 年 10 月 17 日，Java 19

---



