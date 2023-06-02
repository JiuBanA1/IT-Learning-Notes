## Servlet 简介
Servlet 是运行在 Web 服务器或应用服务器上的程序，它是作为来自 Web 浏览器或其他 HTTP 客户端的请求和 HTTP 服务器上的数据库或应用程序之间的中间层。
使用 Servlet，您可以收集来自网页表单的用户输入，呈现来自数据库或者其他源的记录，还可以动态创建网页。
总而言之，Servlet 是用于处理 Web 请求和响应的标准 Java 技术，是 Web 应用程序开发不可或缺的组成部分。
## Servlet 环境设置
### 导入jar包
File-> Project Structure-> libraries 选择“+”，选择java-> 找到tomcat路径下的lib文件夹里选择servlet-api 与 jsp-api；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685600025455-002d3ac0-8a24-44e0-94f5-c66da1c7020f.png#averageHue=%233d4247&clientId=u917e4662-f8a2-4&from=paste&height=484&id=ua95b0395&originHeight=726&originWidth=501&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=42834&status=done&style=none&taskId=u6e91c009-2c28-4fe6-9aa8-b5b4d731da0&title=&width=334)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685600640034-0558dee0-dc1a-4419-802d-0402ca6485a5.png#averageHue=%233d4145&clientId=ubec67bdb-d456-4&from=paste&height=455&id=u3c7be1cb&originHeight=682&originWidth=1507&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=46479&status=done&style=none&taskId=ua46a0b00-263b-4b1c-b8d3-34c5e6a5a60&title=&width=1004.6666666666666)
### web.xml文件配置
在 WEB-INF 目录下创建 web.xml 文件；
```html

<servlet>
	<!-- Servlet别名 自定义-->
  <servlet-name>TestServlet</servlet-name>
  <!--servlet的类全名-->
  <servlet-class>ccc.com.servlet.testServlet</servlet-class>
</servlet>

<servlet-mapping>
  <!-- 将Servlet和URL绑定 -->
	<!--给Servlet提供（映射)一个可供客户端访问的URI-->
  <servlet-name>TestServlet</servlet-name>
  <!--必须和servlet中的name相同-->
  <url-pattern>/test</url-pattern>
  <!-- servlet的映射路径（访问serclet的名称） -->
</servlet-mapping>


```
在src文件下新建包 ccc.com.servlet，在里面新建一个类 testServlet；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685601146446-7b866bae-1484-45e8-a338-39c4f15de301.png#averageHue=%233a4043&clientId=ubec67bdb-d456-4&from=paste&height=377&id=uc39f0284&originHeight=566&originWidth=491&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=25827&status=done&style=none&taskId=u219a6869-3d35-4bf5-ac45-282d5ab67fd&title=&width=327.3333333333333)
testServlet类里继承HttpServlet，代码如下：
```java
public class testServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getParameter("id"));
    }
}
```
在index.jsp里面写入以下代码，注意name属性要对应；
```java
<form action="/test" method="get">
    <input type="text" name="id">
    <input type="submit" value="提交">
  </form>
```
然后我们启动服务器进入浏览器页面
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685605888469-fd38f06c-45d3-42f2-b46e-c4ebf6d6f36d.png#averageHue=%23fafaf9&clientId=u91c52240-c18e-4&from=paste&height=119&id=u9d4a9b1c&originHeight=178&originWidth=668&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=8375&status=done&style=none&taskId=u972adc2e-9db8-4bab-a18f-1a176e0f0ed&title=&width=445.3333333333333)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685605904372-e36da31d-084c-4a85-8d90-d1a99cf93ab2.png#averageHue=%23fafaf9&clientId=u91c52240-c18e-4&from=paste&height=240&id=u7f73646a&originHeight=360&originWidth=913&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=29958&status=done&style=none&taskId=u16146382-9c91-4544-bca6-4efa88dd519&title=&width=608.6666666666666)
找到Run-> Edit Configurations ->右边找到Deployment
![屏幕截图 2023-06-01 155817.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685606361929-12082579-8c21-40b1-98ce-f40342f61589.png#averageHue=%233c4044&clientId=u91c52240-c18e-4&from=paste&height=707&id=u32eb99bb&originHeight=1061&originWidth=1545&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=55155&status=done&style=none&taskId=u3aa3d9b1-9332-44cc-920d-603899c275b&title=&width=1030)
把他改成/
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685606410024-a4d7e74c-7ac9-47ac-999d-5c0527db4527.png#averageHue=%233d4245&clientId=u91c52240-c18e-4&from=paste&height=173&id=u41f8157d&originHeight=259&originWidth=1084&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=10611&status=done&style=none&taskId=ufefdee62-966f-47ee-b4e4-eec2149834f&title=&width=722.6666666666666)
重新启动服务器然后输入框里随便输入字符串点击提交，就可以发现已经在控制台打印出来了；
![屏幕截图 2023-06-01 160317.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685606683226-c2caebcd-f7f0-4ee1-9922-7e7af7934918.png#averageHue=%23a39071&clientId=u91c52240-c18e-4&from=paste&height=268&id=u3a06a3f9&originHeight=402&originWidth=1277&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=89377&status=done&style=none&taskId=uc0ca54d3-c4dd-4c4b-af77-5a378f06d6b&title=&width=851.3333333333334)
要设置 servlet 返回数据，可以调用 HttpServletResponse 对象的方法，例如：
```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 设置响应内容类型
    response.setContentType("text/html;charset=UTF-8");

    // 获取输出流对象
    PrintWriter out = response.getWriter();
    try {
        // 将响应信息输出到客户端浏览器
        out.println("<html>");
        out.println("<head>");
        out.println("<title>成功</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>成功</h1>");
        out.println("</body>");
        out.println("</html>");
    } finally {
        // 关闭输出流对象
        out.close();
    }
}
```
结果如下：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1685607539509-8d495725-96d7-4b15-877b-57f496aa3649.png#averageHue=%23fafafa&clientId=u91c52240-c18e-4&from=paste&height=184&id=ue71fe4b8&originHeight=276&originWidth=930&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=12589&status=done&style=none&taskId=ua7b181ba-f773-4536-bb8d-2afcb08589c&title=&width=620)
### @WebServlet注解配置
这种方式的话比较简单，只需要添加一个@WebServlet；
```java
@WebServlet(name = "TestServlet",urlPatterns = "/test")
    
public class testServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(request.getParameter("id"));
    }
}
```
### web.xml文件的方式和@WebServlet区别
相比于 web.xml 文件的方式，在使用 @WebServlet 注解时，不再需要手动编写 XML 文件来描述 Servlet 的配置信息，而是通过直接在 Servlet 对应的类上添加注解来完成。这样做的好处是：

1. 更加方便：不用像 web.xml 那样繁琐地编写 XML 文件；
2. 更加简洁：去除了 XML 中大量的模板式代码和冗余的信息；
3. 更加高效：在应用启动时只需扫描注解，而不必解析整个 XML 文件；
4. 更加灵活：注解更容易被理解和调整。

虽然使用 @WebServlet 注解能够带来很多好处，但也有局限性，不能用于配置其它组件，并且无法适应更复杂的场景。在实际开发中，要根据需要来选择合适的方式来进行配置。
