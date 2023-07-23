## 一、什么是AOP面向切面编程？
AOP（Aspect-Oriented Programming，面向切面编程）是一种编程范式，旨在通过将横切关注点（如日志记录、事务管理等）从主业务逻辑中分离出来，提高代码的模块化和可维护性。
## 二、什么是静态代理？
静态代理是在编译时就已经确定了被代理对象和代理对象的关系，代理对象在运行时不会发生改变。通过静态代理，可以在调用被代理对象的方法之前或之后执行额外的逻辑，实现功能的增强或控制。
## 三、Spring AOP 中使用静态代理的示例
### 添加依赖
```xml
<dependencies>
  <!-- Spring Framework -->
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.9</version>
  </dependency>

  <!-- MyBatis -->
  <dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.13</version>
  </dependency>

  <!-- JUnit -->
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

  <!-- MySQL Connector/J -->
  <dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.23</version>
  </dependency>
</dependencies>

```
### 创建SomeService接口
```java
public interface SomeService {
    void doSome();

    void doOther();
}
```
### 创建SomeServiceImpl实现该接口
```java
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("业务方法doSome执行了。。。。");
    }

    @Override
    public void doOther() {
        System.out.println("业务方法doOther执行了。。。。");
    }
}
```
### 创建静态代理类
```java
public class ServiceProxy implements SomeService {

    SomeService target = new SomeServiceImpl();

    @Override
    public void doSome() {
        System.out.println("日志功能，当前时间为:" + new Date());
        target.doSome();
        System.out.println("提交事务");
    }

    @Override
    public void doOther() {
        System.out.println("日志功能，当前时间为:" + new Date());
        target.doOther();
        System.out.println("提交事务");
    }
}
```
### 测试类中进行测试
```java
public class MyTest01 {

    @Test
    public void test01() {
        SomeService service = new ServiceProxy();
        service.doSome();
        System.out.println("===========================");
        service.doOther();
    }
}
```
