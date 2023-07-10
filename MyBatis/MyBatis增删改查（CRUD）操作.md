## 前言
CRUD操作指的就是增加（Create）、读取（Retrieve）、更新（Update）、删除（Delete）这四种基本数据库操作；
MyBatis提供了一种简洁且灵活的方式来执行这些操作，通过配置映射文件和编写对应的SQL语句，将Java对象与数据库表进行映射和操作。
## 准备任务
首先，你需要在你的项目中添加MyBatis的依赖等；
创建数据库连接idea，
接下来，你需要创建一个MyBatis的配置文件（通常是一个XML文件）；
**注意：**com.mysql.cj.jdbc.Driver是从MySQL Connector/J版本8.0开始引入的。在此版本之前，MySQL Connector/J使用的是com.mysql.jdbc.Driver驱动程序类。
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
                <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                <property name="url" value="jdbc:mysql://localhost:3306/数据库名"/>
                <property name="username" value="root"/>
                <property name="password" value="password"/>
            </dataSource>
        </environment>
    </environments>
    <mappers>
        <!-- 在这里添加您的数据访问接口 Mapper.xml映射文件 -->
        <mapper resource="Mapper.xml"/>
    </mappers>
</configuration>
```
## 创建Mapper.xml映射文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<!-- Mapper.xml -->
<!-- 定义命名空间为 com.example.Mapper -->

<mapper namespace="com.example.poo.Mapper">

    <!-- 查询所有用户 -->
    <select id="getAllUsers" resultType="com.example.pojo.User">
        SELECT * FROM tb_user
    </select>

    <!-- 根据用户ID查询用户 -->
    <select id="getUserById" parameterType="java.lang.Integer" resultType="com.example.pojo.User">
        SELECT * FROM tb_user WHERE id = #{id}
    </select>

    <!-- 插入新用户 -->
    <insert id="insertUser" parameterType="com.example.pojo.User">
        INSERT INTO tb_user (id, name, age) VALUES (#{id}, #{name}, #{age})
    </insert>

    <!-- 更新用户信息 -->
    <update id="updateUser" parameterType="com.example.pojo.User">
        UPDATE tb_user SET name = #{name}, age = #{age} WHERE id = #{id}
    </update>

    <!-- 根据用户ID删除用户 -->
    <delete id="deleteUser" parameterType="java.lang.Integer">
        DELETE FROM tb_user WHERE id = #{id}
    </delete>
</mapper>

```
## 创建实体类 User
```java
public class User {
    private Integer id;
    private String name;
    private Integer age;

    // 构造方法、Getter和Setter方法
    // ...
}
```
## 创建Mapper接口
```java
public interface Mapper {
    List<User> getAllUsers();

    User getUserById(Integer id);

    void insertUser(User user);

    void updateUser(User user);

    void deleteUser(Integer id);
}
```
## 创建utils包
编写MyBatis工具类，在文件夹utils下新建 -->MybatisUtils.class文件，编写代码如下：
```java
package com.daimalu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory -->sqlSession
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    //使用mybatis第一步，获取sqlSessionFactory对象
    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //既然有了sqlSessionFactory,顾名思义，我们就可以从中获得sqlSession的实例了
    //sqlSession 完全包含了面向数据库执行SQL命令所需的所有方法
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
```
## 创建测试类
使用MyBatis框架进行数据库操作的测试类；
每个方法都执行了不同的数据库操作，包括获取所有用户、根据ID获取用户、插入用户、更新用户和删除用户。注释中提供了对每个方法的解释和操作的简要描述。
```java
import com.example.poo.Mapper;
import com.example.pojo.User;
import com.example.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MyBatisTest {
    private SqlSession sqlSession;
    private Mapper mapper;

    @Before
    public void setUp() {
        // 获取 SqlSession 实例
        sqlSession = MybatisUtils.getSqlSession();
        // 获取 Mapper 接口的实例
        mapper = sqlSession.getMapper(Mapper.class);
    }

    @After
    public void tearDown() {
        // 关闭 SqlSession
        sqlSession.close();
    }

    @Test
    public void testGetAllUsers() {
        // 从数据库获取所有用户
        List<User> users = mapper.getAllUsers();
        for (User user : users) {
            // 打印每个用户
            System.out.println(user);
        }
    }

    @Test
    public void testGetUserById() {
        // 根据ID从数据库获取用户
        User user = mapper.getUserById(1);
        // 打印用户信息
        System.out.println(user);
    }

    @Test
    public void testInsertUser() {
        // 创建一个新的 User 对象
        User user = new User();
        user.setId(2);
        user.setName("John");
        user.setAge(25);

        // 插入用户信息到数据库
        mapper.insertUser(user);
        sqlSession.commit();

        System.out.println("用户插入成功。");
    }

    @Test
    public void testUpdateUser() {
        // 创建一个新的 User 对象
        User user = new User();
        user.setId(1);
        user.setName("Jane");
        user.setAge(30);

        // 更新数据库中对应ID的用户信息
        mapper.updateUser(user);
        sqlSession.commit();

        System.out.println("用户更新成功。");
    }

    @Test
    public void testDeleteUser() {
        // 删除数据库中对应ID的用户信息
        mapper.deleteUser(2);
        sqlSession.commit();

        System.out.println("用户删除成功。");
    }
}

```
