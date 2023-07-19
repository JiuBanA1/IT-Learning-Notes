## 一、Spring框架是什么
Spring框架是一个用于构建企业级Java应用程序的开源框架。它提供了一套全面的编程和配置模型，用于开发Java应用程序，特别是基于Java平台的企业级应用程序。
Spring框架的设计目标是简化Java开发，并提供了许多功能和模块，以帮助开发人员构建可扩展、可维护和灵活的应用程序。
## 二、IoC控制反转
IoC（Inversion of Control）控制反转，指导开发人员如何使用对象，管理对象的。把对象的创建，属性赋值，对象的生命周期都交给代码之外的容器管理，IoC的用处在于减少组件之间的耦合，增加代码的可扩展性和可维护性。它通过外部容器来管理对象的创建和依赖注入，使得系统更灵活、可配置，并能够适应需求的变化。
## 三、添加依赖
```xml
      	<dependency>
            <groupId>org.mybatis</groupId>
            <artifactId>mybatis</artifactId>
            <version>3.5.13</version>
        </dependency>
        
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-engine</artifactId>
            <version>5.7.2</version>
            <scope>test</scope>
        </dependency>
        
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.23</version>
        </dependency>
```
### Spring Context 
是一个XML注释，用于在Maven或Gradle构建工具的配置文件中提供对Spring Framework中的Spring Context模块的依赖声明。
Spring Context模块是Spring Framework的核心模块之一，提供了IoC容器和依赖注入的支持。它是实现控制反转（IoC）和依赖注入（DI）的基础。
```xml

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.9</version>
</dependency>
```
## 四、创建配置文件
在项目的资源文件夹（例如**src/main/resources**）下创建一个名为**beans.xml**的配置文件，内容如下：
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="someService" class="com.example.SomeServiceImpl" />
</beans>
```
这个元素用于声明一个bean。在这个例子中，**id**属性指定了bean的唯一标识符为"someService"，**class**属性指定了bean的实现类为**com.example.SomeServiceImpl**。
这个配置文件告诉Spring容器创建一个名为"someService"的bean，并使**com.example.SomeServiceImpl**类来实例化它。创建的bean将被放置在Spring的容器中，可以通过在应用程序中引用其ID来访问和使用。
## 五、创建实现类
```java
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("hello world");
    }
}
```
## 六、创建接口
```java
public interface SomeService {
    void doSome();
}

```
## 七、编写测试类
```java
import com.example.port.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void testdoSomething() {
        //SomeService service = new SomeServiceImpl();
        //service.doSome();

        //1.指定spring配置文件：从类路径(classpath)之下开始的路径
        String config="beans.xml";

        //2.创建容器对象 ApplicationContext 表示spring容器对象。通过ctx获取某个java对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        //3.从容器中获取指定名称的对象，使用getBean("id")
        SomeService service = (SomeService)ctx.getBean("someService");

        //4.调用对象的方法
        service.doSome();
    }
}
```
