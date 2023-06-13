## 前言
 Servlet 数据库访问之前，Java MySQL 连接设置相关驱动及配置。
## 测试数据
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686559100126-85d5b6ee-4463-42c1-9283-f78192544ece.png#averageHue=%23f6f4f2&clientId=ubc23136f-7e9d-4&from=paste&height=131&id=u3e7f16e5&originHeight=196&originWidth=731&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=15998&status=done&style=none&taskId=uaf2f93d9-e8e7-4475-8f8d-a9cffb87dd4&title=&width=487.3333333333333)
```plsql
-- 创建表
CREATE TABLE `websites` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` CHAR(20) NOT NULL DEFAULT '' COMMENT '站点名称',
  `url` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '网址',
  `alexa` INT(11) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',
  `country` CHAR(10) NOT NULL DEFAULT '' COMMENT '国家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 插入数据
INSERT INTO `websites` (`name`, `url`, `alexa`, `country`) VALUES
('Google', 'https://www.google.com/', 1, 'USA'),
('淘宝', 'https://www.taobao.com/', 13, 'CN'),
('q', 'http://www.runoob.com', 5892, ''),
('微博', 'http://weibo.com/', 20, 'CN'),
('Facebook', 'https://www.facebook.com/', 3, 'USA');
```
## 访问数据库
下面的实例演示了如何使用 Servlet 访问 RUNOOB 数据库。
```java
package com.runoob.test;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
* Servlet implementation class DatabaseAccess
*/
@WebServlet("/DatabaseAccess")
    public class DatabaseAccess extends HttpServlet {
        private static final long serialVersionUID = 1L;
        // JDBC 驱动名及数据库 URL
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

        // 数据库的用户名与密码，需要根据自己的设置
        static final String USER = "root";
        static final String PASS = "123456";
        /**
* @see HttpServlet#HttpServlet()
*/
        public DatabaseAccess() {
            super();
            // TODO Auto-generated constructor stub
        }


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Connection conn = null;
            Statement stmt = null;
            // 设置响应内容类型
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String title = "Servlet Mysql 测试";
            String docType = "<!DOCTYPE html>\n";
            out.println(docType +
                        "<html>\n" +
                        "<head><title>" + title + "</title></head>\n" +
                        "<body bgcolor=\"#f0f0f0\">\n" +
                        "<h1 align=\"center\">" + title + "</h1>\n");
            try{
                // 注册 JDBC 驱动器
                Class.forName("com.mysql.jdbc.Driver");

                // 打开一个连接
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

                // 执行 SQL 查询
                stmt = conn.createStatement();
                String sql;
                sql = "SELECT id, name, url FROM websites";
                ResultSet rs = stmt.executeQuery(sql);

                // 展开结果集数据库
                while(rs.next()){
                    // 通过字段检索
                    int id  = rs.getInt("id");
                    String name = rs.getString("name");
                    String url = rs.getString("url");

                    // 输出数据
                    out.println("ID: " + id);
                    out.println(", 站点名称: " + name);
                    out.println(", 站点 URL: " + url);
                    out.println("
");
                }
                out.println("</body></html>");

                // 完成后关闭
                rs.close();
                stmt.close();
                conn.close();
            } catch(SQLException se) {
                // 处理 JDBC 错误
                se.printStackTrace();
            } catch(Exception e) {
                // 处理 Class.forName 错误
                e.printStackTrace();
            }finally{
                // 最后是用于关闭资源的块
                try{
                    if(stmt!=null)
                        stmt.close();
                }catch(SQLException se2){
                }
                try{
                    if(conn!=null)
                        conn.close();
                        }catch(SQLException se){
                    se.printStackTrace();
                }
                }

                }

                    /**
                    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
                    */
                    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                    // TODO Auto-generated method stub
                    doGet(request, response);
                }
                }
```
现在调用这个 Servlet，输入链接：http://localhost:8080/Tomcat部署的项目名/DatabaseAccess，将显示以下响应结果：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1686559351262-ee951005-ccfa-4450-bbe3-7e774b114d46.png#averageHue=%23eae9e8&clientId=ubc23136f-7e9d-4&from=paste&height=239&id=uecc69ce7&originHeight=359&originWidth=1570&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=79966&status=done&style=none&taskId=u3e398d6e-82e9-4fef-af7f-a4e749a7ddf&title=&width=1046.6666666666667)
