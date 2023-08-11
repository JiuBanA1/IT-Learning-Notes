## 前言
MyBatis注解是一种用于配置MyBatis映射关系和SQL操作的方式，通过在Java接口或方法上使用注解来代替XML配置，使得配置更加简洁明了。在MyBatis中，可以使用以下几个主要的注解来定义映射关系和SQL操作。
1、**@Select**：用于定义SELECT查询操作。
2、**@Insert**：用于定义INSERT插入操作。
3、**@Update**：用于定义UPDATE更新操作。
4、**@Delete**：用于定义DELETE删除操作。
5、**@Options**：用于定义一些选项，例如获取自动生成的主键。
6、**@Param**：用于给SQL语句中的参数取别名，方便在注解中引用。
## MyBatis注解代码示例
### 1. 定义Mapper接口
```java
public interface UserMapper {
    @Select("SELECT * FROM users WHERE id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("INSERT INTO users (name, email) VALUES (#{name}, #{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertUser(User user);

    @Update("UPDATE users SET name = #{name}, email = #{email} WHERE id = #{id}")
    void updateUser(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteUser(@Param("id") int id);
}
```
### 2. 配置Mapper接口扫描
```java
<!-- mybatis-config.xml -->
<configuration>
    <mappers>
        <package name="com.example.mapper"/>
        <!-- 可以添加其他包路径 -->
    </mappers>
</configuration>
```
在上面的例子中，我们定义了一个**UserMapper**接口，使用注解来代替XML配置。**@Select**注解用于定义查询操作，**@Insert**用于定义插入操作，**@Update**用于定义更新操作，**@Delete**用于定义删除操作。**@Options**注解用于配置选项，这里用于获取自动生成的主键。**@Param**注解用于给SQL语句中的参数取别名，以解决参数名冲突的问题。
