## Servlet 遵循过程
Servlet 生命周期可被定义为从创建直到毁灭的整个过程：

- Servlet 初始化后调用 **init ()** 方法。
- Servlet 调用 **service()** 方法来处理客户端的请求。
- Servlet 销毁前调用 **destroy()** 方法。
- 最后，Servlet 是由 JVM 的垃圾回收器进行垃圾回收的。
## init()方法
init 方法被设计成只调用一次。它在第一次创建 Servlet 时被调用，在后续每次用户请求时不再调用。
当用户调用一个 Servlet 时，就会创建一个 Servlet 实例，每一个用户请求都会产生一个新的线程，适当的时候移交给 doGet 或 doPost 方法。init() 方法简单地创建或加载一些数据，这些数据将被用于 Servlet 的整个生命周期。
```java
public void init() throws ServletException {
  // 初始化代码...
}
```
## Service()方法
service() 方法是执行实际任务的主要方法。Servlet 容器（即 Web 服务器）调用 service() 方法来处理来自客户端（浏览器）的请求，并把格式化的响应写回给客户端。
```java
public void service(ServletRequest request, 
                    ServletResponse response) 
      throws ServletException, IOException{
}
```
## destroy()方法
destroy() 方法只会被调用一次，在 Servlet 生命周期结束时被调用。destroy() 方法可以让您的 Servlet 关闭数据库连接、停止后台线程、把 Cookie 列表或点击计数器写入到磁盘，并执行其他类似的清理活动。
```java
  public void destroy() {
    // 终止化代码...
  }
```
## doGet() 和 doPost() 方法
doGet() 和 doPost() 方法是常见的两个方法，它们通常被用来处理客户端（通常是浏览器）发来的 GET 或 POST 请求。

1. doGet() 方法：当客户端发送 GET 请求时，服务器会自动调用 doGet() 方法进行处理。doGet() 方法负责处理请求，并向客户端返回响应结果，通常用于请求数据，例如查看、搜索等操作。
2. doPost() 方法：当客户端发送 POST 请求时，服务器会自动调用 doPost() 方法进行处理。doPost() 方法也负责处理请求，并向客户端返回响应结果。相较于 doGet() 方法，doPost() 方法更加安全，因为 POST 请求可以对提交的数据进行更好的加密和保护，通常用于提交表单或者处理业务操作，例如注册、登录等。
```java
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 处理 GET 请求
}

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // 处理 POST 请求
}
```
