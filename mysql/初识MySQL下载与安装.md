## 前言
> 而目前主流的关系型数据库管理系统的市场占有率排名如下：

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676964128382-6ae17b03-66b7-43df-ac8b-bd509de6a284.png#averageHue=%23f2f1f0&clientId=u11ac7b77-c93c-4&from=paste&height=234&id=u54fda765&originHeight=351&originWidth=999&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=120564&status=done&style=none&taskId=u9a5ea656-d613-46e2-99c4-e1f0059e9f1&title=&width=666)
> Oracle：大型的收费数据库，Oracle公司产品，价格昂贵。 
> MySQL：开源免费的中小型数据库，后来Sun公司收购了MySQL，而Oracle又收购了Sun公司。 
> SQL Server：Microsoft 公司推出的收费的中型数据库，C#、.net等语言常用。

## MySQL版本
> 虽然已经迭代到了8.0版本，也有很多的特性，但是业内仍未大规模应用，稳定性有待验证，不过非核心业务可以逐步尝鲜使用了。

> MySQL 5.7版，选择这个版本主要考虑稳定性，另外就是考虑业务规模大了或者混合云情况下的版本统一，简化维护成本。

## MySQL类型
> MySQL Community Server，社区免费版，但没有技术支持。一般我们选这个版本就行了。
> MySQL Enterprise 企业收费版。
> MySQL Cluster 这个主要是用于服务器集群。

## MySQL官网有.zip和.msi两种安装形式；
> zip是压缩包，直接解压缩以后使用的，需要自己配置各种东西；
> msi是安装包，系统直接帮我们安装搞定；

## MySQL 下载
#### 1、MySQL 属于 Oracle 旗下产品，进入Oracle官网下载
[https://www.oracle.com/](https://www.oracle.com/)
#### 2、点击产品，找到MySQL
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676858419383-cf6fe52a-3302-4004-97a5-b921b1c47091.png#averageHue=%23423e3b&clientId=u188f7cf2-46d0-4&from=paste&height=727&id=u9d46e865&originHeight=1091&originWidth=1898&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=444622&status=done&style=none&taskId=u9ef3a967-3d96-4da8-9e3d-5e679178c71&title=&width=1265.3333333333333)
#### 3、进入MySQL页面
[https://www.mysql.com/](https://www.mysql.com/)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676859727148-ec6eefbd-c06d-416e-b5a6-e3a5e0827a57.png#averageHue=%23f0dabe&clientId=u72546ec0-4984-4&from=paste&height=637&id=ud5af2d0f&originHeight=956&originWidth=1882&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=554457&status=done&style=none&taskId=udde5fa99-ff6b-4871-a5ca-94cf66bf582&title=&width=1254.6666666666667)
#### 4、点击Download（下载），选择MySQL Community (GPL) Downloads（MySQL 社区下载） 
![屏幕截图_20230220_125504.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676868977823-eb7254c1-77a4-47d4-9381-1a7790fc2dbf.png#averageHue=%23ede2b3&clientId=u72546ec0-4984-4&from=paste&height=631&id=uef0858fd&originHeight=946&originWidth=1201&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=286416&status=done&style=none&taskId=u89bd1962-d755-4090-93b6-c5ec3a08b85&title=&width=800.6666666666666)
#### 5、点击 MySQL Community Server
![屏幕截图_20230220_131300.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676870235064-014e23e8-9c3b-48eb-be1f-1d4aa64e002d.png#averageHue=%23fefefe&clientId=u2d98272a-b14b-4&from=paste&height=641&id=u3da85d23&originHeight=961&originWidth=1872&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=152742&status=done&style=none&taskId=u283c3377-8b88-49a9-a8c4-075168d3e11&title=&width=1248)
#### 6、打开下载页面
![屏幕截图_20230220_132436.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676887272070-ab4b5635-d4c2-4a89-9df2-2cf055027155.png#averageHue=%23f9f8f8&clientId=u4142899c-4374-4&from=paste&height=687&id=ufe31eac3&originHeight=1030&originWidth=1886&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=255755&status=done&style=none&taskId=u0c973dc6-30ae-4440-b5ec-f6342f5ef0c&title=&width=1257.3333333333333)
#### 7、MySQL MSI下载，点击 Go to Download Page 进入下载页面
![屏幕截图_20230220_184345.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676889966062-e4eeb8cf-2eaa-4f4d-9536-ff691775e129.png#averageHue=%23ccae86&clientId=u4142899c-4374-4&from=paste&height=719&id=u42f58aad&originHeight=1078&originWidth=1872&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=296527&status=done&style=none&taskId=ub25ca91f-a6a5-4a4a-85e9-112a68a5b16&title=&width=1248)
#### 8、下载MySQL 5.7版，点击Archives（档案）
![屏幕截图_20230220_185054.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676890512139-7cc7cd09-9a5e-4445-b04d-18544eabe0e9.png#averageHue=%23d3b490&clientId=u4142899c-4374-4&from=paste&height=674&id=u77d6e171&originHeight=1011&originWidth=1846&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=200625&status=done&style=none&taskId=u9f426352-8b04-49c8-a9c4-0bd7457ab86&title=&width=1230.6666666666667)
#### 9、选择对应的版本，进行下载![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676891369420-c1d3f7e3-881e-4625-95e8-bf3f4281289c.png#averageHue=%23faf9f6&clientId=u4142899c-4374-4&from=paste&height=670&id=u4fd11e7a&originHeight=1005&originWidth=1896&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=224734&status=done&style=none&taskId=u2bf93428-0490-4856-af83-f30d2f7bf33&title=&width=1264)
## MySQL 安装
#### 1、双击下面这个安装程序。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676891778859-1adabe3f-f70e-461c-8d54-d385734a8c4f.png#averageHue=%23f4f1ed&clientId=u4142899c-4374-4&from=paste&height=27&id=ubb8d5117&originHeight=41&originWidth=396&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=3718&status=done&style=none&taskId=u7cf90199-96bb-488d-aff9-cd9f3b6a8bf&title=&width=264)
#### 2、选择"Custom"，点击"Next"（自定义）
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676892228409-eec66e35-4ce0-493a-a57c-b4704f105be9.png#averageHue=%23e8dfc8&clientId=u4142899c-4374-4&from=paste&height=579&id=ufca48083&originHeight=869&originWidth=1165&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=161847&status=done&style=none&taskId=u50173af5-64a6-4897-b835-e2d0cd850b7&title=&width=776.6666666666666)
#### 3、我们进行如下的操作
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676892632019-9b24d9cf-073c-479b-a14a-d1e0b606a5e1.png#averageHue=%23ded1b4&clientId=u4142899c-4374-4&from=paste&height=582&id=ucd8a921b&originHeight=873&originWidth=1159&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=132736&status=done&style=none&taskId=ud97933b6-30bd-43c8-8bef-e73d0b2d8fa&title=&width=772.6666666666666)
#### 4、查看默认安装路径
第一步：点击![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676895513326-ef6f7b23-8bf1-4c8f-89e5-d8fa00b5da7f.png#averageHue=%23f8f5f2&clientId=u4142899c-4374-4&from=paste&height=19&id=ueacbe824&originHeight=28&originWidth=259&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=5577&status=done&style=none&taskId=u2bd5dbab-95ac-432e-b695-f8e4d667b35&title=&width=172.66666666666666)
第二步：点击![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676895600879-c87f29e7-189d-4e93-b45b-e0e534e2b936.png#averageHue=%23ececff&clientId=u4142899c-4374-4&from=paste&height=28&id=u00a886af&originHeight=42&originWidth=166&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2613&status=done&style=none&taskId=u5fe6a6b3-4e80-4435-a381-082a32b363d&title=&width=110.66666666666667)
![屏幕截图_20230220_201951.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676895660855-89eb4c55-655f-4059-9442-c524d6313815.png#averageHue=%23ddd5b7&clientId=u4142899c-4374-4&from=paste&height=580&id=ucc9879d0&originHeight=870&originWidth=1161&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=149252&status=done&style=none&taskId=u86d9666a-143b-41af-b756-626b6966fcc&title=&width=774)
第三步：查看默认安装路径![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676895688777-db69cc24-c81a-4541-bbc0-9a9a706f98b1.png#averageHue=%23d5c4aa&clientId=u4142899c-4374-4&from=paste&height=579&id=ub439a0bc&originHeight=868&originWidth=1161&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=184185&status=done&style=none&taskId=ue3b060b9-29f4-4cb0-8f96-2ecb4cdca62&title=&width=774)
#### 5、出现如下界面后，证明可以了，点击"Execute"
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676896507831-c6a8bd41-ed34-4067-abda-c48c0eb453f9.png#averageHue=%23ddcfb1&clientId=u4142899c-4374-4&from=paste&height=581&id=u5a736c1e&originHeight=872&originWidth=1159&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=92670&status=done&style=none&taskId=ufdc09f8d-9b55-49af-839c-72bec544c57&title=&width=772.6666666666666)
#### 6、一直到当出现如下界面后，设置好密码后，点击"Next"
> **直到最后，直接点击"Finish"（完成）**

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676896984059-efad074f-bb88-4bec-9881-7b1a52ee4d99.png#averageHue=%23e6dbc2&clientId=u4142899c-4374-4&from=paste&height=582&id=ufea8ebd6&originHeight=873&originWidth=1159&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=138268&status=done&style=none&taskId=u58415f00-cf8a-47b3-8baa-b7625cfdc11&title=&width=772.6666666666666)
## MySQL starting the server失败解决方法
> 如果电脑是第一次安装MySQL，一般不会出现这样的报错。

#### 1、starting the server失败，通常是因为上次安装的该软件未清除干净。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676971181806-c534e875-8621-4db2-8d2d-56e409d7178e.png#averageHue=%23dad1c3&clientId=ua7e1a2e9-2a2a-4&from=paste&height=504&id=ub531d45b&originHeight=756&originWidth=1070&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=191106&status=done&style=none&taskId=u1a5823d1-d0c2-4f1f-8eae-54955c86014&title=&width=713.3333333333334)
#### 2、starting the server失败后，不要动任何设置，右键我的电脑，点击管理。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676971354440-6c58afe3-5429-41ed-acf0-8499b19e4f6e.png#averageHue=%23ededed&clientId=ua7e1a2e9-2a2a-4&from=paste&height=301&id=u2ec2575f&originHeight=452&originWidth=376&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=22030&status=done&style=none&taskId=uccfb1b97-486e-40e8-8edf-5472081920c&title=&width=250.66666666666666)
#### 3. 点击服务和应用程序，点击服务。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676971398535-eb566543-9047-4253-b73f-64564020b13d.png#averageHue=%23fcfcfc&clientId=ua7e1a2e9-2a2a-4&from=paste&height=431&id=u5c4e874b&originHeight=646&originWidth=1092&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=95630&status=done&style=none&taskId=u45bfa846-c412-4fe4-90b4-521f05fa34f&title=&width=728)
 
#### 4、找到MySQL右键，点击属性，选择登录，选择本地系统账户。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676971574498-0332d253-5295-4837-a1c1-258db4095384.png#averageHue=%23f6f6f6&clientId=ua7e1a2e9-2a2a-4&from=paste&height=553&id=u930d5356&originHeight=830&originWidth=693&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=54120&status=done&style=none&taskId=u1bb57b35-b1e2-4178-af6f-c6517941d0e&title=&width=462)
#### 6、改好以后，回到安装界面，点击Execute，这样就会安装成功了。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1676971181806-c534e875-8621-4db2-8d2d-56e409d7178e.png#averageHue=%23dad1c3&clientId=ua7e1a2e9-2a2a-4&from=paste&height=504&id=TqBFu&originHeight=756&originWidth=1070&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=191106&status=done&style=none&taskId=u1a5823d1-d0c2-4f1f-8eae-54955c86014&title=&width=713.3333333333334)
## 配置环境
> 配置安装好MySQL之后，还需要配置环境变量，这样才可以在任何目录下连接MySQL。

### 1、此电脑”右键→属性→高级系统设置→环境变量
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677749998399-63b2be2a-7ac9-4149-896b-f74f2766d6d5.png#averageHue=%23f5f4f3&clientId=ueba3882a-695a-4&from=paste&height=551&id=u0dd0e2dc&originHeight=826&originWidth=734&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=37688&status=done&style=none&taskId=ua26039cf-2513-4116-9dfd-04ab43a9254&title=&width=489.3333333333333)
### 2、环境变量→新建
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677750083043-08492f32-66cb-4a6d-8f40-e27980a898ca.png#averageHue=%23f1efee&clientId=ueba3882a-695a-4&from=paste&height=606&id=u0d3bd296&originHeight=909&originWidth=943&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=74677&status=done&style=none&taskId=u2a2c3b0c-b438-4fbc-ab6e-f9880afc4e4&title=&width=628.6666666666666)
### 3、点击“新建”，将MySQL Server的安装目录下的bin目录添加到环境变量
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677754249133-150374cd-d99a-406c-aaf7-eab4faa1dd26.png#averageHue=%23f1f0ef&clientId=u8a9336c5-c0e8-4&from=paste&height=171&id=uefc00e91&originHeight=256&originWidth=1014&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=17999&status=done&style=none&taskId=uc49813fc-dcc9-4e1d-91ce-733d2979ac8&title=&width=676)
## 客户端连接
### 使用MySQL提供的客户端命令行工具
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677754787976-16f67993-48f5-4934-89f2-6c6d33ff06d1.png#averageHue=%23e5e5e5&clientId=u8a9336c5-c0e8-4&from=paste&height=42&id=u64df4845&originHeight=63&originWidth=427&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=17554&status=done&style=none&taskId=u8867814d-e511-4d6a-838b-fc2d84ef557&title=&width=284.6666666666667)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677754728228-a6e9e538-83a9-41ac-a890-f78ae6fd7cd9.png#averageHue=%230f0f0f&clientId=u8a9336c5-c0e8-4&from=paste&height=800&id=u92e8b5a9&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=58250&status=done&style=none&taskId=u20f92d1a-28d8-4ed0-9650-0982ceb7982&title=&width=1280)

 
