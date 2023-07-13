## 前言
使用命令时会出现以提示，命令不可正常使用。
根据提示信息，我们可以知道，需要通过Red Hat Subscription，开发者订阅。
## 进入开发者页面
[https://developers.redhat.com/products/rhel/download](https://developers.redhat.com/products/rhel/download)，下滑看到No-cost RHEL for developers subscription 面向开发人员的免费 RHEL 订阅，选择Activate your subscription 激活你的订阅；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689217988602-8e5034cd-b7b3-48eb-8073-10f6da3bae9e.png#averageHue=%23ada9a7&clientId=ua7ee4cdf-d279-4&from=paste&height=707&id=rgcgA&originHeight=1060&originWidth=1891&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=476793&status=done&style=none&taskId=u4f4d9c06-7947-42d2-9289-617b457ff1c&title=&width=1260.6666666666667)
## 创建红帽账户
选择 Register for a Red Hat account 注册一个Red Hat帐户；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689218478962-dbd85a80-32d7-4dd2-a298-7bb4bc031274.png#averageHue=%23706b6a&clientId=ua7ee4cdf-d279-4&from=paste&height=700&id=ue01322f1&originHeight=1050&originWidth=1878&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=100688&status=done&style=none&taskId=ud31d43f3-3d5b-41d3-bace-c9bfb5c3ae9&title=&width=1252)
进入 Register for a Red Hat account 页面，全部勾选；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689218675566-52256a72-578a-4a3f-84d9-6c7a7f7e1a55.png#averageHue=%23fdfcfc&clientId=ua7ee4cdf-d279-4&from=paste&height=423&id=ufaa5ae2e&originHeight=634&originWidth=1326&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=58887&status=done&style=none&taskId=u9a95ca99-8b0e-4041-bc38-d4c6efa81bc&title=&width=884)
## 阅读Red Hat订阅； 
下滑看到No-cost RHEL for developers subscription 面向开发人员的免费 RHEL 订阅，选择 Read the FAQ 阅读常见问题；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689219082112-f27e54fe-44bf-4cd5-a4e3-2a59f2dd43de.png#averageHue=%23f9f6f3&clientId=ua7ee4cdf-d279-4&from=paste&height=461&id=ua9277c7a&originHeight=692&originWidth=1872&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=161587&status=done&style=none&taskId=uca5775bd-f406-451d-b28d-7b6ecc57102&title=&width=1248)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689219144693-36ee7846-e80c-4f00-a657-13c4c282b2f1.png#averageHue=%23e7e6e5&clientId=ua7ee4cdf-d279-4&from=paste&height=653&id=u53ed1fc1&originHeight=979&originWidth=1890&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=278163&status=done&style=none&taskId=ub4112a1a-1388-4f20-ab6f-0f96e6ca960&title=&width=1260)
## 激活订阅
由于免费红帽开发人员个人订阅是订阅，是否需要续订？此订阅的期限是多少？
红帽开发人员个人订阅为期一年。到期后，必须重新注册才能继续访问与订阅相关的所有支持和权益。
激活方式，打开终端输入以下代码（中途输入Red Hat账号）：
```java
sudo subscription-manager remove --all
sudo subscription-manager unregister
sudo subscription-manager clean
sudo subscription-manager register
sudo subscription-manager refresh
sudo subscription-manager attach --auto
```
最后会在终端显示，状态已订阅；
## 查看订阅状态
登录 Red Hat，点击你的用户，选择 Subscriptions 订阅管理；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689220026213-69f5ffcb-22ad-4620-bb60-5648fe7c9a1e.png#averageHue=%23fefefe&clientId=ua7ee4cdf-d279-4&from=paste&height=415&id=u8d43426a&originHeight=622&originWidth=1214&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=80930&status=done&style=none&taskId=uc67fdd28-38dd-4d4a-8c81-696b113ac99&title=&width=809.3333333333334)
Simple content access for Red Hat Subscription Management 红帽订阅管理的简单内容访问，注意是关闭；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1689220342577-8083aed2-c081-4ed2-a3fa-c3aa84ee77fd.png#averageHue=%23e8e7e7&clientId=ua7ee4cdf-d279-4&from=paste&height=679&id=u8e3f4ea9&originHeight=1018&originWidth=1888&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=163120&status=done&style=none&taskId=uc1c0d736-a3bc-4d2a-8b9b-616a33a3eb9&title=&width=1258.6666666666667)
