## Maven 简介
Maven 是一款基于 Java 平台的项目管理和整合工具，它将项目的开发和管理过程抽象成一个项目对象模型（POM）。开发人员只需要做一些简单的配置，Maven 就可以自动完成项目的编译、测试、打包、发布以及部署等工作。
Maven 是使用 Java 语言编写的，因此它和 Java 一样具有跨平台性，这意味着无论是在 Windows ，还是在 Linux 或者 Mac OS 上，都可以使用相同的命令进行操作。
Maven 简化并标准化了项目构建过程。它将项目的编译，生成文档，创建报告，发布，部署等任务无缝衔接，构建成一套完整的生命周期。
## 约定优于配置
约定优于配置（Convention Over Configuration）是 Maven 最核心的涉及理念之一 ，Maven对项目的目录结构、测试用例命名方式等内容都做了规定，凡是使用 Maven 管理的项目都必须遵守这些规则。
Maven 项目构建过程中，会自动创建默认项目结构，开发人员仅需要在相应目录结构下放置相应的文件即可。
例如，下表显示了项目源代码文件，资源文件和其他配置在 Maven 项目中的默认位置。 

| 文件 | 目录 |
| --- | --- |
| Java 源代码 | src/main/java |
| 资源文件 | src/main/resources  |
| 测试源代码 | src/test/java  |
| 测试资源文件 | src/test/resources |
| 打包输出文件 | target |
| 编译输出文件 | target/classes |

## Maven 特点

- 项目设置遵循统一的规则。
- 任意工程中共享。
- 依赖管理包括自动更新。
- 一个庞大且不断增长的库。
- 可扩展，能够轻松编写 Java 或脚本语言的插件。
- 只需很少或不需要额外配置即可即时访问新功能。
- **基于模型的构建** − Maven能够将任意数量的项目构建到预定义的输出类型中，如 JAR，WAR 或基于项目元数据的分发，而不需要在大多数情况下执行任何脚本。
- **项目信息的一致性站点** − 使用与构建过程相同的元数据，Maven 能够生成一个网站或PDF，包括您要添加的任何文档，并添加到关于项目开发状态的标准报告中。
- **发布管理和发布单独的输出** − Maven 将不需要额外的配置，就可以与源代码管理系统（如 Subversion 或 Git）集成，并可以基于某个标签管理项目的发布。它也可以将其发布到分发位置供其他项目使用。Maven 能够发布单独的输出，如 JAR，包含其他依赖和文档的归档，或者作为源代码发布。
- **向后兼容性** − 您可以很轻松的从旧版本 Maven 的多个模块移植到 Maven 3 中。
- 子项目使用父项目依赖时，正常情况子项目应该继承父项目依赖，无需使用版本号，
- **并行构建** − 编译的速度能普遍提高20 - 50 %。
- **更好的错误报告** − Maven 改进了错误报告，它为您提供了 Maven wiki 页面的链接，您可以点击链接查看错误的完整描述。
## Maven 安装与配置
Maven是一个基于 Java 的项目管理工具，因此最基本的要求是在计算机上安装 JDK。
Maven 对系统要求如下表：

| JDK | JDK 7.0 及以上。 |
| --- | --- |
| 内存 | 没有最低要求。 |
| 磁盘空间 | Maven 安装本身大约需要 10MB。除此之外，其他磁盘空间将用于本地 Maven 存储库。本地存储库的大小将根据使用情况而有所不同，但至少应为 500MB。 |
| 操作系统 | 没有最低要求。 |

### Maven 下载
官方地址 [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)，下载完成后，解压到合适的位置即可；
![屏幕截图 2023-05-26 090714.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685063305178-7a3bb974-0cd7-4ba9-b5b7-e3833df93817.png#averageHue=%23fbfbfa&clientId=u6b9c0328-0f47-4&from=paste&height=479&id=u6ae5343d&originHeight=718&originWidth=1554&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=150979&status=done&style=none&taskId=u13681cc5-b5b6-462b-8b85-4188b966363&title=&width=1036)
### 配置 Maven 环境变量
右键点击“计算机”图标，选择 "属性"，然后点击 "高级系统设置"，点击"环境变量"。
新建系统变量 MAVEN_HOME，变量值为 Maven 的安装目录 ，如下图。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685063922340-bf3517a8-3143-4f1f-891a-58747c102a0f.png#averageHue=%23edebea&clientId=u5ce9cdc1-c7a7-4&from=paste&height=529&id=u41089819&originHeight=793&originWidth=1395&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=137343&status=done&style=none&taskId=u447aae7f-6266-4de4-aa27-47e8b1f9bc2&title=&width=930)
编辑系统变量 Path，添加变量值；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685064012479-ef49cf38-864c-42b8-b5d5-29ee9104ca75.png#averageHue=%23f1f0f0&clientId=u5ce9cdc1-c7a7-4&from=paste&height=581&id=u4b6a55f6&originHeight=872&originWidth=1242&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=104535&status=done&style=none&taskId=u5d330ed7-b704-4865-b299-8a482cc7179&title=&width=828)
在命令提示符下执行 mvn -version  ，输出结果如下图所示，证明 Maven 配置成功。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685064775430-b0b76731-6bb9-4353-ad44-4dc69aded9e9.png#averageHue=%231c1c1c&clientId=u5ce9cdc1-c7a7-4&from=paste&height=242&id=u8e42fbc2&originHeight=363&originWidth=1336&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=47205&status=done&style=none&taskId=ue047ef6e-3e12-4deb-9023-4578d808157&title=&width=890.6666666666666)
