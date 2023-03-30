## 前言
> 在本教程中，您将学习如何创建、运行和打包打印到系统输出的简单 Java 应用程序。在此过程中，您将熟悉IntelliJ IDEA功能，以提高开发人员的工作效率：编码辅助和补充工具。

## IDE解释
> IDE（集成开发环境），它提供了程序开发环境的应用程序，例如代码编写功能、分析功能、编译功能、调试功能等，所有具备这一特性的软件都可以叫集成开发环境，常见的IDE有：vscode、IntelliJ IDEA等。

## IDEA汉化
> 找到“**Plugins 插件 **”输入**“Chiese”**找到中文语言包，下载它然后重启进入IDEA

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1675529428784-8e0be8b0-26ac-451f-9556-f0f211c482c1.png#averageHue=%23f8f7f7&clientId=u266fcfe3-6930-4&from=paste&height=800&id=ub684e86e&name=image.png&originHeight=1200&originWidth=1919&originalType=binary&ratio=1&rotation=0&showTitle=false&size=151137&status=done&style=none&taskId=u436b1a65-fd12-4fea-869e-81dc362353a&title=&width=1279.3333333333333)
## 准备项目
### 创建新的 Java 项目
> 1. 启动IntelliJ IDEA屏幕打开，单击“**New Project 新建项目**”，也可以从主菜单中选择“**Open从电脑本地导入**”。
> 2. 在“**新建项目**”向导中，从左侧列表中选择“**New Project 新建项目**”。
> 3. 命名项目（例如），并根据需要更改默认位置。
> 4. 在本教程中，我们不会使用版本控制系统，因此请禁用“**创建 Git 存储库**”选项。
> 5. 确保在“**语言”**中选择了“**Java**”，在“**构建系统**”中选择了**“IntelliJ。**

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1675525869684-18fc3432-8442-429f-9027-e03fbfd606ba.png#averageHue=%23ededec&clientId=uf9ff4d93-379b-4&from=paste&id=IGBsv&name=image.png&originHeight=544&originWidth=1384&originalType=url&ratio=1&rotation=0&showTitle=false&size=86844&status=done&style=none&taskId=ud7874f19-f0d6-4ce7-ad41-4c80022da4a&title=)
> 1. 要在IntelliJ IDEA中开发Java应用程序，如果已在 IntelliJ IDEA 中定义了的 JDK，请从 **JDK** 列表中选择它。
> 2. 如果计算机上已安装 JDK，请选择“添加 JDK”并指定 **JDK** 主目录的路径。

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1675525870121-b787cf36-4237-4921-9330-6a0f5d4376a7.png#averageHue=%23e7e7e7&clientId=uf9ff4d93-379b-4&from=paste&id=cGLbm&name=image.png&originHeight=1329&originWidth=1456&originalType=url&ratio=1&rotation=0&showTitle=false&size=372229&status=done&style=none&taskId=u582811d0-abab-4f84-a8e4-d3193294c64&title=)
> 3. 如果您的计算机上没有的 JDK，请选择“**下载 JDK**”。
> 4. 在下一个对话框中，指定 JDK，根据需要更改安装路径。
> 5. 然后单击**下载**，单击**创建**，之后将为您创建并加载新项目。

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1675525869445-d8b217ab-e551-4250-ab22-d0b0326711c3.png#averageHue=%23eeeeee&clientId=uf9ff4d93-379b-4&from=paste&id=Gccz8&name=image.png&originHeight=382&originWidth=972&originalType=url&ratio=1&rotation=0&showTitle=false&size=47048&status=done&style=none&taskId=u32715c66-d2e9-44b1-94bb-94414f3b400&title=)
### 创建包和类

1. 在“**项目**”工具窗口中，右键单击 **src** 文件夹，选择“**新建**”，然后选择**“Java 类**”。
2. 在**“名称**”字段中，键入并单击“**确定**”创建包和类
3. 项目视图是主要工具窗口之一，它包含项目目录，快捷键按**alt 1**打开

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1675530158569-e8cec0c0-82fe-49d9-a361-d24e27191543.png#averageHue=%23f6f6f5&clientId=u266fcfe3-6930-4&from=paste&height=305&id=FUWjd&name=image.png&originHeight=457&originWidth=921&originalType=binary&ratio=1&rotation=0&showTitle=false&size=81445&status=done&style=none&taskId=ue9d1fec5-5d98-4ff0-bc01-af31f36d4de&title=&width=614)
## 运行应用程序
> 1. 单击运行，然后在弹出窗口中选择**运行“HelloWorld.main（）”**将开始编译代码。
> 2. 编译完成后，“**运行”**工具窗口将在屏幕底部打开。

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1675530761084-c1fd3801-544a-4b9e-92ad-79571593abd4.png#averageHue=%23f5f5f4&clientId=u452814dc-38a6-4&from=paste&height=361&id=ud3b89a8f&name=image.png&originHeight=541&originWidth=911&originalType=binary&ratio=1&rotation=0&showTitle=false&size=149997&status=done&style=none&taskId=u99d7e8b4-2b1f-4ecf-9ffd-06c0caad54f&title=&width=607.3333333333334)


