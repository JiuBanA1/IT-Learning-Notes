## 一、配置 Git
打开 IDEA 设置，之后按照下面图片中的步骤进行操作即可。需要注意的是，在 Path Git executable 中，也就是设置 Git 可执行路径中，找到本机电脑上 Git 的安装位置，根据情况进行路径选择。
![屏幕截图 2023-06-28 152109.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687937008111-92e0b427-8a07-4d5c-8241-34df6fe1f204.png#averageHue=%233d4246&clientId=ua5f61bab-6cb6-4&from=paste&height=705&id=u7f6d5211&originHeight=1057&originWidth=1468&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=133545&status=done&style=none&taskId=u322e8dcf-5f74-4972-8ff8-fc1f2994f48&title=&width=978.6666666666666)
## 二、创建项目远程仓库
这里使用代码托管平台 Gitee 为例，进行创建远程仓库。如下图所示，新建仓库，仓库名称为 project（自定义），仓库介绍自定义没有影响，其他都按照默认设置即可，最后点击创建。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687937098587-de48e3f8-d221-4485-8409-0da912d48086.png#averageHue=%23fefdfd&clientId=ua5f61bab-6cb6-4&from=paste&height=678&id=u7b44124e&originHeight=1017&originWidth=1891&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=109564&status=done&style=none&taskId=u490f7272-7d0a-47cf-b48e-eca06ed90ec&title=&width=1260.6666666666667)
## 三、初始化本地仓库
### 方法一：
选中，创建Git储存库，Create Git Repository；
![屏幕截图 2023-06-28 154450.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687938430832-37366d1a-f722-44c2-a28e-3609e5331eeb.png#averageHue=%233d4144&clientId=ua5f61bab-6cb6-4&from=paste&height=655&id=u3e65af49&originHeight=982&originWidth=1158&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=79056&status=done&style=none&taskId=uf47b567d-9f16-4e03-bf89-51037ac4a25&title=&width=772)
### 方法二：
创建完远程仓库之后，还要通过 IDEA 开发工具来初始化一个本地仓库，相比于 Git Bash 这样的命令行来说，IDEA 非常方便可以进行可视化的 Git 管理。
如下图所示，在工具栏中的 VCS，鼠标光标移动到Create Git Repository，点击 Create Git Repository。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687937824699-d066203b-d607-485f-b12a-f8ce275dc28c.png#averageHue=%23a7a685&clientId=ua5f61bab-6cb6-4&from=paste&height=740&id=ubac07457&originHeight=1110&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=106737&status=done&style=none&taskId=u15f9896d-312d-4603-a42f-1ba8ac9a7a8&title=&width=1280)
点击 Create Git Repository 之后，弹出一个小窗口，选择要初始化的本地项目。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687937892934-4e579bab-d972-40e0-acb0-d51fcb8b52b2.png#averageHue=%23659565&clientId=ua5f61bab-6cb6-4&from=paste&height=748&id=ub0bb3bed&originHeight=1122&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=107919&status=done&style=none&taskId=ud6fc7df5-64e1-4784-b942-2ebd00e85b3&title=&width=1280)
## 四、连接远程仓库
初始化本地仓库，并且创建完远程仓库项目之后，下一步就需要将本地和远程进行对接交互了。
工具栏 Git -> Remotes，点击 Remotes 添加远程仓库连接信息。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687948445169-07edd39c-2674-4039-9b41-c302d0dad578.png#averageHue=%23829975&clientId=ua5f61bab-6cb6-4&from=paste&height=743&id=u2818752f&originHeight=1114&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=155618&status=done&style=none&taskId=u1851c465-6018-4fca-8e69-a790875dd5d&title=&width=1280)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687948556280-e77b0260-6dbd-4186-b913-728a3e74ffd8.png#averageHue=%2388b27a&clientId=ua5f61bab-6cb6-4&from=paste&height=741&id=ufbaa73c1&originHeight=1111&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=312299&status=done&style=none&taskId=ud10e2655-c551-42f1-b19a-985f69d27b1&title=&width=1280)
之后弹出一个登录 gitee 的窗口，输入自己在注册 gitee 的账号和密码即可，然后点击 Log In，验证通过之后，Git Remotes 中便出现了远程项目的 Name 和 URL，最后点击 OK，这样就正式连接远程仓库项目了。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687948607099-1c435286-368c-4d33-b5d9-29644736bac9.png#averageHue=%233e4246&clientId=ua5f61bab-6cb6-4&from=paste&height=237&id=u59ec100b&originHeight=356&originWidth=496&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=16022&status=done&style=none&taskId=ud09cb5be-bdb5-4bdc-85ee-bc6fa9ab95b&title=&width=330.6666666666667)
## 五、提交与拉取到本地仓库
在工具栏中，点击绿色的图标，表示 commit 到本地仓库，弹出一个窗口，选择我们的项目；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687949018042-d3d9fab9-5382-4228-a31f-57c3d3f5eef4.png#averageHue=%233c4044&clientId=ua5f61bab-6cb6-4&from=paste&height=461&id=ude731154&originHeight=692&originWidth=1011&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=75273&status=done&style=none&taskId=u7c2ef0f5-fb9d-4307-97be-7af2aec4cc4&title=&width=674)
点一下蓝色的箭头，连接远程仓库；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963883745-5b7b0d4a-8b26-4259-8da8-1cc55c37c0ec.png#averageHue=%233d4348&clientId=u9f6ce103-4feb-4&from=paste&height=280&id=u7a9368c8&originHeight=420&originWidth=965&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=28900&status=done&style=none&taskId=udbb25382-28ed-4b3c-b07e-49b5a3e85f4&title=&width=643.3333333333334)
找到上面的Git-->pull，输入远程仓库的分支“master”；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963128775-fbe31eff-e0b3-4ba4-9c05-a32362650159.png#averageHue=%233d454e&clientId=u9f6ce103-4feb-4&from=paste&height=165&id=yrQTY&originHeight=248&originWidth=548&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=13575&status=done&style=none&taskId=u8c77c3e5-cf05-47bd-8ad8-f7bf8c6da49&title=&width=365.3333333333333)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963156251-11412aee-fa45-403e-a3c2-d3cf614a706f.png#averageHue=%233e444a&clientId=u9f6ce103-4feb-4&from=paste&height=110&id=VKwsP&originHeight=165&originWidth=672&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=13948&status=done&style=none&taskId=u73beddb2-f14d-4cfb-8ea0-b9a13f364c5&title=&width=448)
在 commit中填入提交记录说明，最后点击右下角的 commit，提交完成之后，在 IDEA 界面下边信息提示栏中，Log 日志，可以看到提交记录，表示提交成功。
![屏幕截图 2023-06-28 224804.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963724325-0ba92566-b1de-4e1c-99fd-e7262f7acb24.png#averageHue=%2365866d&clientId=u9f6ce103-4feb-4&from=paste&height=616&id=u2069bbc8&originHeight=924&originWidth=1204&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=94456&status=done&style=none&taskId=u22358e77-79a7-4b9d-9185-ed012eb0255&title=&width=802.6666666666666)
## 六、推送到远程仓库
推送项目到远程仓库，按照下图操作即可。在 push 之前需要对每个文件内容进行检查，推送成功之后，可以在 IDEA 中看到提示信息，也可以在远程仓库中查看结果。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963754408-1a871cbf-3a6c-4587-b7ca-4877e8d924e6.png#averageHue=%233a3f42&clientId=u9f6ce103-4feb-4&from=paste&height=187&id=u8c347302&originHeight=280&originWidth=773&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=17566&status=done&style=none&taskId=u53de1199-2127-499d-af74-70e462b49e8&title=&width=515.3333333333334)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963934966-507311c7-6186-4b35-80a4-a6bfa81b396b.png#averageHue=%233c4044&clientId=u9f6ce103-4feb-4&from=paste&height=519&id=u6eadb14c&originHeight=779&originWidth=1187&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=44762&status=done&style=none&taskId=uade25771-5991-4dd8-8d91-737361e4ae7&title=&width=791.3333333333334)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687963961162-5bd8f737-dc2b-4ba5-b8df-318d9859cfc9.png#averageHue=%23fcfbfb&clientId=u9f6ce103-4feb-4&from=paste&height=665&id=u4567408b&originHeight=997&originWidth=1902&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=206063&status=done&style=none&taskId=u82e7fc13-49a0-4469-a956-83e44af1b56&title=&width=1268)
## 七、克隆远程仓库到本地
### 方法一：
点击Get from VCS；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688018566589-cefff638-e8ba-44c7-aa6f-5594e71adac9.png#averageHue=%23313437&clientId=uc8bfbbeb-fd1d-4&from=paste&height=450&id=u918b012d&originHeight=675&originWidth=1320&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=20500&status=done&style=none&taskId=u58296053-4676-4527-902c-ce2a8521913&title=&width=880)
输入远程仓库要克隆的URL；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688018206859-008ad3f2-02cb-4582-871d-3776a074d59f.png#averageHue=%233d4143&clientId=u35c6831f-7764-4&from=paste&height=351&id=mgk5t&originHeight=527&originWidth=1190&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=30494&status=done&style=none&taskId=u1e97efd4-683f-4f25-a883-db4f305548b&title=&width=793.3333333333334)
### 方法二：
创建一个新项目，工具栏点VCS，找到Get from Version Control；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688018186793-6708787a-1331-4285-9956-0f9bd543b882.png#averageHue=%23a0a787&clientId=u35c6831f-7764-4&from=paste&height=488&id=u165833ae&originHeight=732&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=93914&status=done&style=none&taskId=ue8f9dc5b-8c60-4bbd-a025-3b244a6be13&title=&width=1280)
## 八、Git分支操作
点击+号，会弹出一个窗口，如图下；
![屏幕截图 2023-06-29 140743.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688018979739-c7707425-5794-49a1-9f47-d3059b16eb2d.png#averageHue=%236e807a&clientId=uc8bfbbeb-fd1d-4&from=paste&height=608&id=uabf55e5d&originHeight=912&originWidth=1334&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=94581&status=done&style=none&taskId=u1ac84f5a-5994-42a9-a241-46a8564796f&title=&width=889.3333333333334)
右键会出现，如图下；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688019455217-c55574d2-a693-40f6-abee-dbee8e7dfd4e.png#averageHue=%23494e54&clientId=uf7418a27-588f-4&from=paste&height=327&id=u3c3bc272&originHeight=490&originWidth=718&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=63550&status=done&style=none&taskId=u97337353-61ce-4f63-87bd-4b1405cd945&title=&width=478.6666666666667)
