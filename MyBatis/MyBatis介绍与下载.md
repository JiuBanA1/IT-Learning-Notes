## MyBatis 介绍
MyBatis是一种开源的Java持久化框架，用于将SQL数据库访问和映射任务与Java对象之间的映射分离。它提供了一种简单的方式来对数据库进行操作，通过使用XML或注解的方式描述数据库操作语句，可以更方便地管理和维护SQL语句。MyBatis具有灵活性和高度可定制性，可以与各种数据库进行集成
## MyBatis 主要特点
1、简单易用：MyBatis采用直观的编程接口，使得数据库操作变得简单和直观。通过使用XML或注解来描述SQL语句，可以快速上手并快速开发。
2、灵活性：MyBatis不强制开发者使用特定的数据模型或数据库访问层结构，而是允许开发者根据自己的需求进行灵活的映射和组织。
3、SQL控制：MyBatis提供了对SQL语句的完全控制能力，开发者可以自由地编写和优化SQL语句，而不受框架的限制。
4、缓存支持：MyBatis提供了缓存支持，可以在应用程序和数据库之间减少对数据库的访问，提高性能。
5、映射器支持：MyBatis提供了映射器（Mapper）的概念，将SQL语句与接口方法进行映射，可以更方便地进行数据库操作。
6、插件机制：MyBatis具有插件机制，可以通过插件扩展和增强框架的功能。
总之，MyBatis是一个简单易用、灵活性高、功能强大的Java持久化框架，广泛应用于各种Java项目中，帮助开发者简化数据库操作，并提高应用程序的性能和可维护性。
## MyBatis 下载
官方地址：[https://github.com/mybatis/mybatis-3](https://github.com/mybatis/mybatis-3)
打开之后往下滑，找到 Download Latest 下载最新版本。
![屏幕截图 2023-06-29 173752.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688031517480-51361bd3-9b55-478d-935c-4ea9d86cc1a2.png#averageHue=%23f6f4f3&clientId=u81522adb-82bd-4&from=paste&height=346&id=u644c3cfc&originHeight=519&originWidth=884&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=59426&status=done&style=none&taskId=ua15f3b55-4d42-4e8b-adf6-ff728245889&title=&width=589.3333333333334)
这里可以看到三个包，第一个是我们要的架包，后两个是不同系统下的源码，我们下载第一个架包。
![屏幕截图 2023-06-29 173948.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688031643375-4e49b33b-ed1c-41ed-909e-074a84c74874.png#averageHue=%23fefefd&clientId=u81522adb-82bd-4&from=paste&height=293&id=u31cf0a99&originHeight=439&originWidth=926&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31517&status=done&style=none&taskId=ue0f56485-046e-4c72-93f0-14180e41587&title=&width=617.3333333333334)
下载完后解压，这就是Mybatis的相关文件
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688366649564-20f9eb3c-bacd-40e0-b597-e18b5e0dc243.png#averageHue=%23fcfbfb&clientId=u2689eb03-7d18-4&from=paste&height=251&id=u322d7280&originHeight=377&originWidth=1050&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=28314&status=done&style=none&taskId=u2ffb22f8-41fb-4102-b2c2-b8848ab55fd&title=&width=700)
## IDEA创建maven项目（默认）
Projects-->New Project-->Maven-->Create；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688364666706-6735ba6c-50ad-4179-b360-a52286b199aa.png#averageHue=%233d4144&clientId=u11353864-72ca-4&from=paste&height=663&id=u5cd2adb4&originHeight=994&originWidth=1171&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=77826&status=done&style=none&taskId=u88d3ecc4-3c0d-454f-854b-a9ff7826393&title=&width=780.6666666666666)
有时候Maven项目不全，需要右键src-->New-->Directory-->添加main\resources-->test\resources；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688366771578-908e4dd5-23bf-443b-ac98-07075c561609.png#averageHue=%233e4349&clientId=u2689eb03-7d18-4&from=paste&height=393&id=u772531b4&originHeight=589&originWidth=1084&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=90818&status=done&style=none&taskId=uf6019576-37f9-44ce-82bb-52affac0ee9&title=&width=722.6666666666666)
