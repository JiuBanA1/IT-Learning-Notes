在使用 JDBC 之前，需要下载相应的 JDBC 驱动程序，该驱动程序应该与你使用的数据库的版本相对应，可以在数据库官网上找到相应的 JDBC 驱动程序。
## JDBC数据库驱动下载
点击官方链接
[https://www.mysql.com/downloads/](https://www.mysql.com/downloads/)
点击 DOWNLOADS，把页面滚动到最下面，点击 MySQL Community (GPL) Downloads
![屏幕截图 2023-03-27 144137.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679981796221-0880d5cb-db9b-4563-8ddb-e3c93cc7cd3b.png#averageHue=%23ebe5b2&clientId=u345562ec-50cf-4&from=paste&height=653&id=u2b52f4cb&originHeight=980&originWidth=1202&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=261982&status=done&style=none&taskId=u877ed6d6-afda-418f-89da-c9c1abed3d8&title=&width=801.3333333333334)
点击 Connector/J
 ![屏幕截图 2023-03-28 133834.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679981961064-4e50ff8a-b8d4-4b27-94ce-bffa259294ae.png#averageHue=%23fefefe&clientId=u345562ec-50cf-4&from=paste&height=494&id=uaa6674b7&originHeight=741&originWidth=1339&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=99357&status=done&style=none&taskId=u052b2ee1-fb07-4cd6-be2a-ce435ba7191&title=&width=892.6666666666666)
点击 General Availability(GA) Releases，在 Select Operating System 下拉列表选择 Platform Independent，然后选择任意一种压缩包格式后面的 Download
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679982112860-843856bb-65b0-4e1d-bd30-cf887ce12a92.png#averageHue=%23dcb483&clientId=u345562ec-50cf-4&from=paste&height=530&id=udd8c8744&originHeight=795&originWidth=1464&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=92028&status=done&style=none&taskId=u17fc1390-7d88-4c21-8844-311fb0b40bd&title=&width=976)点击 No thanks，just start my download，下载完成后解压，找到mysql-connector-j-8.0.32
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679982382440-1a4d2aa0-1cfe-4379-9a92-9f9ff21fe068.png#averageHue=%23fbfbfa&clientId=u345562ec-50cf-4&from=paste&height=450&id=u28bdc136&originHeight=675&originWidth=1235&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=93468&status=done&style=none&taskId=u8dcd6ede-db76-4980-af6c-84b42bc2834&title=&width=823.3333333333334)
## Intellij IDEA安装JDBC驱动
在项目文件中创建一个命名为lib目录，然后将上面的那个jar文件复制到这里
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679984756670-7968b5c5-760b-44f7-b241-05a1b46e20ad.png#averageHue=%23e8e7e6&clientId=u345562ec-50cf-4&from=paste&height=401&id=ua4d437b9&originHeight=601&originWidth=808&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=34311&status=done&style=none&taskId=ud863ae32-bf5e-49b9-8ba2-e74845857f7&title=&width=538.6666666666666)
点击菜单上的File，选择project structure
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679984990097-27989b88-909c-41b2-80b8-2546d7173380.png#averageHue=%23e4e3e2&clientId=u345562ec-50cf-4&from=paste&height=483&id=ud652d192&originHeight=724&originWidth=781&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=41307&status=done&style=none&taskId=ub75b6c08-3457-4bb2-aecd-e3e4cf57317&title=&width=520.6666666666666)
选择modules ，点击里面的加号，选择JARs or directories
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679985131300-9b325f57-e6d1-4bf1-b16e-888d31cd01f6.png#averageHue=%23f4f4f3&clientId=u345562ec-50cf-4&from=paste&height=294&id=u49970ebd&originHeight=441&originWidth=1513&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=35210&status=done&style=none&taskId=u436ba743-4862-4d23-bf76-c9c5da8bb8f&title=&width=1008.6666666666666)
把刚刚复制到lib目录下的jar包添加进来，然后点击勾选，点击apply；
jar文件是没有导入的，它没有展开的选项；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1679985216430-cc342683-92cd-4836-a818-7be62d737cf0.png#averageHue=%23f9f9f8&clientId=u345562ec-50cf-4&from=paste&height=790&id=ub9f7c9f9&originHeight=1185&originWidth=1530&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=57071&status=done&style=none&taskId=u524f4003-6a6b-4c0b-9629-7dbeef0f1b2&title=&width=1020)


