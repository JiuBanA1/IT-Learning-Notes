## 一、JDBC介绍
JDBC是Java数据库连接的简称。它是Java语言中用于访问关系型数据库的API，提供了一套标准的接口，使得Java应用程序能够与各种关系型数据库进行通信。
## 二、JDBC环境的搭建
## 三、JDBC的开发步骤
### 1、加载JDBC驱动程序
在程序运行之前，需要将JDBC驱动程序加载到内存中。可以使用Class.forName()方法加载驱动程序。例如，如果要使用MySQL数据库，则需要加载com.mysql.jdbc.Driver类。
```java
Class.forName("com.mysql.jdbc.Driver");
```
### 2、建立数据库连接
使用DriverManager.getConnection()方法建立与数据库的连接。需要提供数据库的URL、用户名和密码。
```java
String url = "jdbc:mysql://localhost/test";
String user = "root";
String password = "123456";
Connection conn = DriverManager.getConnection(url, user, password);
```
### 3、创建Statement对象 
创建一个Statement对象，用于向数据库发送SQL语句。
```java
 Statement stmt = conn.createStatement();
```
### 4、执行SQL语句
使用Statement对象的executeQuery()或executeUpdate()方法执行SQL语句。
executeQuery()方法用于执行SELECT语句，返回一个ResultSet对象，而executeUpdate()方法用于执行INSERT、UPDATE和DELETE语句，返回一个整数，表示受影响的行数。
```java
 ResultSet rs = stmt.executeQuery("SELECT * FROM student");
```
### 5、处理结果集 
如果执行的是SELECT语句，那么需要处理返回的结果集。可以使用ResultSet对象的next()方法遍历结果集，并使用getXXX()方法获取每个字段的值。
```java
 while (rs.next()) {
         int id = rs.getInt("id");
         String name = rs.getString("name");
         int age = rs.getInt("age");
         System.out.println("id: " + id + ", name: " + name + ", age: " + age);
      }
```
### 6、关闭连接 
使用Connection、Statement和ResultSet对象的close()方法关闭连接。
```java
rs.close();
stmt.close();
conn.close();
```
### 7、示例程序
```java
import java.sql.*;

public class JdbcDemo {
   public static void main(String[] args) throws Exception {
      // 加载JDBC驱动程序
      Class.forName("com.mysql.jdbc.Driver");

      // 建立数据库连接
      String url = "jdbc:mysql://localhost/test";
      String user = "root";
      String password = "123456";
      Connection conn = DriverManager.getConnection(url, user, password);

      // 创建Statement对象
      Statement stmt = conn.createStatement();

      // 执行SQL语句
      ResultSet rs = stmt.executeQuery("SELECT * FROM student");

      // 处理结果集
      while (rs.next()) {
         int id = rs.getInt("id");
         String name = rs.getString("name");
         int age = rs.getInt("age");
         System.out.println("id: " + id + ", name: " + name + ", age: " + age);
      }

      // 关闭连接
      rs.close();
      stmt.close();
      conn.close();
   }
}

```
### 8、注意
在实际开发中，建议使用PreparedStatement对象代替Statement对象，以防止SQL注入攻击。PreparedStatement对象可以使用Connection.prepareStatement()方法创建。
```java
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM student WHERE name = ?");
pstmt.setString(1, "张三");
ResultSet rs = pstmt.executeQuery();
```
