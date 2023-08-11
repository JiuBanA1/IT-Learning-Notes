## 一、Log4j与Logback的区别？
### 发展历史和维护
Log4j是最早的Java日志框架之一，具有较长的历史；然而Log4j 1.x版本在性能和并发性方面存在一些限制，并且已经停止维护。
Logback是由Log4j创始人Ceki Gülcü开发的后继项目，旨在解决Log4j的问题，并提供更好的性能和可靠性，因此Logback可以被视为Log4j的升级版。
Logback是Log4j的升级版，具有更好的性能、效率和灵活性。如果你正在开始一个新项目或者计划升级现有项目的日志框架，Logback是一个较好的选择。
## 二、Slf4j 依赖
使用 Slf4j 可以让你的应用程序与具体的日志实现库解耦，从而可以灵活地切换和配置不同的日志库，例如 Log4j、Logback等。
打开项目的 pom.xml 文件，在其中添加依赖的配置。
```xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>1.7.32</version> <!-- 替换为您想要使用的Slf4j版本 -->
</dependency>
```
## 三、Logback使用
**1、logback-core**：logback-core是Logback框架的核心组件，它提供了日志记录的基本功能和API。它实现了日志事件的处理和分发，以及日志的格式化和输出等核心功能。logback-core是一个独立的模块，可以与其他日志门面（如Slf4j）配合使用。
```xml
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-core</artifactId>
    <version>1.2.6</version> <!-- 替换为您想要使用的版本 -->
</dependency>
```
**2、logback-classic**：logback-classic是logback框架的经典实现，它扩展了logback-core，并提供了对Slf4j的支持。它使用Slf4j作为日志门面，并提供了与Slf4j的互操作性，可以无缝地与Slf4j集成。logback-classic还提供了更多的功能，如上下文（Context）管理、日志配置文件解析、配置自动重新加载等。
```xml
 <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.6</version> <!-- 替换为您想要使用的Logback版本 -->
 </dependency>
```
### logback.xml配置文件
在main的资源resources目录下创建 **logback.xml **文件
这是一个简单的logback.xml配置文件，将日志输出到控制台，将日志输出到文件。
```xml
<configuration
    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>
    
    <appender name="FILE" class="ch.qos.logback.core.FileAppender">
        <file>logs/application.log</file>
        <encoder>
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>
    
    <root level="INFO">
        <appender-ref ref="CONSOLE"/>
        <appender-ref ref="FILE"/>
    </root>
</configuration>
```
在代码中使用 Logback 记录日志，在你的 Java 代码中导入 Logback 的相关类。
例如，使用Logback的示例代码，放在测试类如下；
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class 测试类名  {
    private static final Logger logger = LoggerFactory.getLogger(测试类名 .class);

    public void doSomething() {
        logger.info("Logging with Logback");
    }
}
```
## 四、Log4j使用
在 Maven 项目的 pom.xml 文件中，移除 Logback 的依赖项，并添加 Log4j 的依赖项。您可以使用以下依赖项配置；
```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-api</artifactId>
  <version>1.7.32</version>
</dependency>

<dependency>
  <groupId>org.apache.logging.log4j</groupId>
  <artifactId>log4j-api</artifactId>
  <version>2.14.1</version>
</dependency>

<dependency>
  <groupId>org.apache.logging.log4j</groupId>
  <artifactId>log4j-core</artifactId>
  <version>2.14.1</version>
</dependency>
```
创建 Log4j 的配置文件，通常命名为 **log4j2.xml**。将以下内容复制到配置文件中；
确保 **log4j2.xml** 配置文件位于项目的类路径下（通常是 **src/main/resources** 目录）。
```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="CONSOLE" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"/>
        </Console>
        <File name="FILE" fileName="logs/application.log">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"/>
        </File>
    </Appenders>
    <Loggers>
        <Root level="INFO">
            <AppenderRef ref="CONSOLE"/>
            <AppenderRef ref="FILE"/>
        </Root>
    </Loggers>
</Configuration>
```
在代码中使用 Log4j 进行日志记录，在你的 Java 代码中导入 Logback 的相关类。
例如，使用 Log4j 的示例代码，放在测试类如下。
```java
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class 测试类名 {
    private static final Logger logger = LogManager.getLogger(测试类名.class);

    public void doSomething() {
        logger.info("Logging with Log4j");
    }
}
```
## 五、查看日志内容
1、运行应用程序：在 IDEA 中，选择您的应用程序的入口点类（例如 **MyBatisTest**），右键单击并选择 "Run" 或 "Debug"。
2、打开控制台窗口：一旦应用程序开始运行，控制台窗口将自动打开。
如果您无法看到控制台窗口，请在底部工具栏中选择 "View" -> "Tool Windows" -> "Run" 。
"View" -> "Tool Windows" -> "Debug"，以显示运行/调试窗口，其中包含控制台选项卡。
3、查看日志输出：在控制台窗口的选项卡中，您将看到应用程序的日志输出，您可以滚动查看日志消息，以及根据需要过滤和搜索特定的日志消息。
