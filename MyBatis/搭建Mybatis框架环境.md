## 一、添加依赖
### mybatis依赖
如果你使用的是 Maven等构建工具，你需要在项目的构建文件中添加对 MyBatis JAR 文件的依赖。
打开项目的 pom.xml 文件，在其中添加依赖的配置。
```xml
<dependencies>
  <dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.13</version>
  </dependency>

  <!-- 其他依赖 -->

</dependencies>
```
### mysql依赖
在MySQL的依赖是通过使用相关的数据库驱动程序实现的。要在MyBatis中使用MySQL，您需要在项目的构建文件中添加MySQL驱动程序的依赖项。
打开项目的 pom.xml 文件，在其中添加依赖的配置。
```xml
  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.23</version> 
  </dependency>
```
### JUnit 5单元测试
JUnit 5是一个功能强大且灵活的单元测试框架，它提供了丰富的工具和API，使得编写和运行单元测试变得更简洁、可读性更好，并具有更好的扩展性和定制性。
打开项目的 pom.xml 文件，在其中添加依赖的配置。
```xml
<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-api</artifactId>
  <version>5.7.2</version> <!-- 替换为您想要使用的JUnit版本 -->
  <scope>test</scope>
</dependency>

<dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-engine</artifactId>
  <version>5.7.2</version> <!-- 替换为您想要使用的JUnit版本 -->
  <scope>test</scope>
</dependency>
```
### Slf4j 依赖
使用 Slf4j 可以让你的应用程序与具体的日志实现库解耦，从而可以灵活地切换和配置不同的日志库，例如 Log4j、Logback等。
打开项目的 pom.xml 文件，在其中添加依赖的配置。
```xml
<dependency>
  <groupId>org.slf4j</groupId>
  <artifactId>slf4j-api</artifactId>
  <version>1.7.32</version> <!-- 替换为您想要使用的Slf4j版本 -->
</dependency>
```
### Logback框架
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
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688460141360-6c72b835-f43e-43c1-a061-ac4d38984774.png#averageHue=%236b755b&clientId=u3e1c0b1f-29b0-4&from=paste&id=u22c38615&originHeight=1122&originWidth=1920&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=241665&status=done&style=none&taskId=ua9fcb749-076e-4d4b-b6f2-f36e7e7a4cb&title=)
## 二、logback.xml配置文件
在main的资源resources目录下创建 **logback.xml **文件
这是一个简单的logback.xml配置文件，将日志输出到控制台，将日志输出到文件。
```xml
<configuration>
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
## 三、Mapper.xml映射文件
MyBatis的映射文件用于定义数据库操作的SQL语句和映射关系，它的主要作用是将Java代码与SQL语句和数据库表之间进行映射，实现数据的持久化操作。
在Mapper XML文件中，您可以定义各种数据库操作，如查询、插入、更新、删除等。
在main的资源resources目录下创建 **Mapper.xml**文件
```xml
<!-- MyMapper.xml -->
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
"http://mybatis.org/dtd/mybatis-3-mapper.dtd">

<!--Mapper 配置文件的命名空间被命名为 nameull-->
<mapper namespace="nameull">

  <!--id="idull"：指定了该查询语句的唯一标识符，可以通过这个标识符在代码中进行调用-->

  <!--查询结果的每一行将会映射为一个 com.example.mybatis.pojo.User 类型的实例-->

  <select id="idull" resultType="com.example.mybatis.pojo.User">

    <!-- 查询所有-->
    select * from tb_user;
  </select>

</mapper>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688460140840-c51a40d0-d969-4559-b35c-62632624baeb.png#averageHue=%235f583d&clientId=u3e1c0b1f-29b0-4&from=paste&id=u80eee8c1&originHeight=433&originWidth=1007&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=63203&status=done&style=none&taskId=u4ce2c750-13c8-42ca-abad-42b5b2bf283&title=)
0、idea连接数据库，
1、创建 **com.example.mybatis.pojo **包 User 类，把创建表结构sql代码复制User类中；
2、创建 **com.example.mybatis.mapper **包 Usermapper 类；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688460140695-75bcfe49-7b38-409b-8abd-50252fa7cb1a.png#averageHue=%23547a55&clientId=u3e1c0b1f-29b0-4&from=paste&id=u8d8a3eb9&originHeight=586&originWidth=1117&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=69125&status=done&style=none&taskId=uee0768b2-a0fe-4d18-9856-81769856d75&title=)
## 四、mybatis-config.xml配置文件
在main的资源resources目录下创建 **mybatis-config.xml **文件
用于配置 MyBatis 的运行参数，以下是一个基本配置示例：
```xml
<!DOCTYPE configuration
PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
"http://mybatis.org/dtd/mybatis-3-config.dtd">
<configuration>
  <environments default="development">
    <environment id="development">
      <transactionManager type="JDBC"/>
      <dataSource type="POOLED">
        <!-- 配置您的数据库连接信息 -->
        <property name="driver" value="com.mysql.jdbc.Driver"/>
        <property name="url" value="jdbc:mysql://localhost:3306/数据库名"/>
        <property name="username" value="root"/>
        <property name="password" value="password"/>
      </dataSource>
    </environment>
  </environments>
  <mappers>
    <!-- 在这里添加您的数据访问接口 Mapper.xml映射文件 -->
    <mapper resource="MyMapper.xml"/>
  </mappers>
</configuration>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688460141090-355186ba-2f1d-4d6d-b074-7b5594d89e1b.png#averageHue=%232e2d2c&clientId=u3e1c0b1f-29b0-4&from=paste&id=u7dd21f04&originHeight=652&originWidth=1261&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=136649&status=done&style=none&taskId=u21e03f32-002f-49be-b652-d6b8f144953&title=)
## 五、测试类
创建 **com.example.mybatis.text **包 MyBatisText 类；
```java
package com.example.mybatis.text;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    public static <User> void main(String[] args) {
        try {
            // 加载mybatis核心配置文件，获取SqlSessionFactory
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // 获取SqlSession对象
            SqlSession sqlSession = sqlSessionFactory.openSession();

            // 执行查询操作
            // nameull.idull，Mapper.xml映射文件（前面提过）
            List<User> userList = sqlSession.selectList("nameull.idull");
            for (User user : userList) {
                System.out.println(user);
            }

            // 关闭SqlSession
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688460141308-d6ee942a-b652-4d80-ac7f-8a36f9151ff6.png#averageHue=%235e5747&clientId=u3e1c0b1f-29b0-4&from=paste&id=ud5972c49&originHeight=1026&originWidth=1800&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=218286&status=done&style=none&taskId=ua9dab743-00ce-4b6b-93d7-6305b4dc500&title=)

