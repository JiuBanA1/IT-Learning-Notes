## 1、什么是JDBC？
JDBC是Java数据库连接的简称。它是Java语言中用于访问关系型数据库的API，提供了一套标准的接口，使得Java应用程序能够与各种关系型数据库进行通信。
## 2、JDBC如何连接数据库？
加载数据库驱动程序：在Java程序中使用Class.forName()方法加载数据库驱动程序。
连接数据库：使用DriverManager.getConnection()方法建立与数据库的连接，传入数据库的URL、用户名和密码等参数。
创建Statement对象：使用Connection对象的createStatement()方法创建Statement对象，用于执行SQL语句。
执行SQL语句：使用Statement对象的executeQuery()方法执行SQL查询语句，使用executeUpdate()方法执行SQL更新语句。
处理结果集：使用ResultSet对象处理SQL查询语句返回的结果集。
关闭连接：在程序结束时，需要使用Connection对象的close()方法关闭与数据库的连接，释放资源。
## 3、JDBC 驱动有哪些分类，它们的区别是什么？
JDBC 驱动分为四种，包括 JDBC-ODBC 桥接驱动程序、本地 API 驱动程序、网络协议驱动程序和纯 Java 驱动程序。JDBC-ODBC 桥接驱动程序使用 ODBC 接口连接数据库，适用于各种操作系统和数据库管理系统，但在性能方面不如其他驱动程序。
本地 API 驱动程序使用底层操作系统的数据库客户端库或特定二进制代码连接数据库，性能较好，但在可移植性方面比较差。
网络协议驱动程序使用网络协议连接数据库，具有良好的跨平台性和可移植性，在数据库服务器上需要安装和配置中间件。
纯 Java 驱动程序完全由 Java 代码实现，具有良好的跨平台性和可移植性，无需为每个数据库安装特定的客户端库或中间件，分为两种类型：基于 JDBC-ODBC 桥接驱动程序实现的需要安装 ODBC 驱动程序，而完全不依赖于任何外部库或中间件的性能则较好，但实现较为困难。
## 4、如何防止SQL注入攻击？
在实际开发中，建议使用PreparedStatement对象代替Statement对象，以防止SQL注入攻击。PreparedStatement对象可以使用Connection.prepareStatement()方法创建。
```java
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM student WHERE name = ?");
pstmt.setString(1, "张三");
ResultSet rs = pstmt.executeQuery();
```
## 5、PreparedStatement和Statement有什么区别？
预编译：PreparedStatement在执行之前会先进行预编译，将SQL语句编译成一个可执行的代码块，以提高执行效率。而Statement每次执行SQL语句时都需要编译一次，效率较低。
参数绑定：PreparedStatement可以使用参数占位符，将SQL语句中的参数与具体的数值绑定，可以有效避免SQL注入等安全问题。而Statement需要手动拼接参数，容易造成安全漏洞。
执行效率：由于PreparedStatement在预编译阶段已经将SQL语句编译成可执行的代码块，因此在执行时通常比Statement更快。
## 6、什么是事务，在 JDBC 中如何处理事务？
事务是并发控制的单位，是用户定义的一个操作序列。有四个特性 (ACID)：原子性 (Atomicity)、一致性 (Consistency)、隔离性 (Isolation) 和持久性 (Durability)。
原子性表示事务中包括的所有操作要么全部成功，要么全部失败回滚；
一致性表示事务结束时，数据库状态应该与预期的一致；
隔离性表示多个事务同时对数据库进行操作时，每个事务都应该感知不到其他事务的存在；
持久性表示事务提交后，其结果应该被永久保存在数据库中。
### JDBC 的事务处理主要分为以下几个步骤：
获取数据库连接：使用 DriverManager.getConnection() 方法获取数据库连接对象 Connection。
开启事务：在获取到 Connection 对象之后，将自动提交设置为 false，即调用 setAutoCommit(false) 方法关闭自动提交模式。
执行 SQL 语句：在开启事务后，对数据库进行增删改操作，将多次操作当做一个整体进行处理，称之为一个事务。
提交事务或回滚事务：当所有的 SQL 语句执行完成后，根据执行结果决定是提交事务（commit）还是回滚事务（rollback）。
关闭连接：不再需要 Connection 对象时，关闭 Connection 连接。
```java
Connection conn = null;
try {
    // 获取数据库连接
    conn = DriverManager.getConnection(url, user, password);
    // 关闭自动提交，开启事务
    conn.setAutoCommit(false);
    // 执行 SQL 语句
    statement.execute("insert into table1 values(1,'name1')");
    statement.execute("update table2 set name='name2' where id=2");
    // 提交事务
    conn.commit();
} catch (SQLException e) {
    // 回滚事务
    if (conn != null) {
        conn.rollback();
    }
    e.printStackTrace();
} finally {
    // 关闭连接
    if (conn != null) {
        conn.close();
    }
}
```
