> 使用IDEA的时候，需要连接Database，连接时遇到了一些小问题，下面记录一下操作流程以及遇到的问题的解决方法。

## MySQL连接IDEA详细教程
> 打开idea，点击右侧的 Database

![屏幕截图 2023-03-10 172243.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678440276176-1f6ffe04-f2ab-4ea8-a4f4-9bd03b278abd.png#averageHue=%23a28a60&clientId=u95925b56-2b4e-4&from=paste&height=800&id=u993a827b&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=93225&status=done&style=none&taskId=u87091eca-bb7a-40d0-abc7-40053f347b5&title=&width=1280)
> 或者 选择 View --> Tool Windows --> Database

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678440669029-206221c6-7fe1-4696-9ed9-b22a6fa5dab9.png#averageHue=%2387a6a1&clientId=u95925b56-2b4e-4&from=paste&height=800&id=uaa894f5b&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=146919&status=done&style=none&taskId=u29f83ea5-f2ae-4f30-ab97-816039986ec&title=&width=1280)
> 点击 + 号 ，选择 Data Source ，选择 数据库 (下面以MySQL为例)

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678440828028-e62ca995-e56e-4843-b29c-225fb8030716.png#averageHue=%235c7478&clientId=u95925b56-2b4e-4&from=paste&height=800&id=u068692bb&originHeight=1200&originWidth=1919&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=173764&status=done&style=none&taskId=u59994f1f-feb3-4e86-a66f-d9af38d099e&title=&width=1279.3333333333333)
> 选择 mysql 后弹出以下界面

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678440908976-95138cda-5efa-4477-b026-3134b383f1f1.png#averageHue=%233c4044&clientId=u95925b56-2b4e-4&from=paste&height=800&id=u8a0e6cb8&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=166238&status=done&style=none&taskId=u705984d7-d996-47c9-8a22-6bad71019d0&title=&width=1280)
> 配置驱动：

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678444861669-5fb73126-76ba-4c7f-8184-4c434291b670.png#averageHue=%233c4044&clientId=u95925b56-2b4e-4&from=paste&height=800&id=u6ad6a9a7&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=210756&status=done&style=none&taskId=u4c17a261-bbfa-4c13-a6f9-61c8b2d628c&title=&width=1280)
> 填上信息后，点击 Test Connect 测试

①、连接的名称
②、连接的数据库地址和端口号（连接本地的数据库就默认为localhost，端口号为3306）
③、MySQL数据库的用户名和密码
④、需要连接的数据库名称
⑤、配置完成之后，点击测试连接，查看是否连接成功。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678441069202-523ea642-8ffa-4847-a14c-11d32d7e751d.png#averageHue=%233c4449&clientId=u95925b56-2b4e-4&from=paste&height=406&id=u65e500d6&originHeight=609&originWidth=986&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=291108&status=done&style=none&taskId=u3a5423b6-9da5-41ac-aa37-93588ff4425&title=&width=657.3333333333334)
> 如下图，连接创建成功

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678441771805-e0faf3b2-71dc-400b-8d27-94be3ba017d3.png#averageHue=%2381a599&clientId=u95925b56-2b4e-4&from=paste&height=800&id=udea4c0a4&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=91765&status=done&style=none&taskId=u4bda6737-f901-46fc-98db-99fc03662b3&title=&width=1280)
> 成功连接了 mysql ，还没有具体连接到你的数据库，这一部分介绍在idea中创建数据库、数据表。

> 右键 刚刚创建好的连接，点击 New --> Schema

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678441909288-f6980bcd-fa13-4ca2-97dc-bfbba4eca320.png#averageHue=%236b8f92&clientId=u95925b56-2b4e-4&from=paste&height=800&id=ub60d984d&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=144466&status=done&style=none&taskId=u070838f3-4aa5-4270-91b9-8418bb2067d&title=&width=1280)
> 点击后弹出以下窗口，输入名字，这个名字是所创建的数据库库名

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678442450117-93526aba-f56b-466a-b87d-bd34babfd6a4.png#averageHue=%233b3f41&clientId=u95925b56-2b4e-4&from=paste&height=800&id=uc6416cce&originHeight=1200&originWidth=1889&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=112334&status=done&style=none&taskId=uac23ab58-6968-4275-bbcc-0a49a0ea12a&title=&width=1259.3333333333333)
> 创建完成后如下

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678442802386-559ae286-0c7c-4ea4-b568-cb2b4601a5db.png#averageHue=%237ba191&clientId=u95925b56-2b4e-4&from=paste&height=765&id=u55ad8123&originHeight=1148&originWidth=1892&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=75702&status=done&style=none&taskId=udc54058f-9b97-45d9-9f73-bcc409c69fb&title=&width=1261.3333333333333)
> 右键 数据库库名 ，点击 New --> Table ，创一个新的数据表

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678443339387-ed409583-ad1b-46f4-8d25-d2b5c8aec5df.png#averageHue=%23668d92&clientId=u95925b56-2b4e-4&from=paste&height=800&id=u8f44fbbc&originHeight=1200&originWidth=1918&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=145194&status=done&style=none&taskId=u4fa30a34-701d-4896-9f10-4b1096f6787&title=&width=1278.6666666666667)
> 点击后弹出下面这个界面

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1678443533477-f1597d30-c9c0-4386-ae52-50766566856f.png#averageHue=%233b3f42&clientId=u95925b56-2b4e-4&from=paste&height=800&id=ub8e92f8f&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=127479&status=done&style=none&taskId=u9a3abe7a-a851-47b5-8887-8a2e992bdef&title=&width=1280)
