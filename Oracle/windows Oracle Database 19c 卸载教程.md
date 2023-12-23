### 打开任务管理器
ctrl+Shift+Esc可以快速打开任务管理器，找到oracle所有服务然后停止。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1700181679244-54a05293-b4ec-4d04-a0eb-be2cbda9f253.png#averageHue=%23f7f5f2&clientId=u32cb0323-7fca-4&from=paste&height=553&id=uce2325c2&originHeight=829&originWidth=1118&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=122972&status=done&style=none&taskId=ue0f640a5-ffec-491b-baf2-1d3ef74c46c&title=&width=745.3333333333334)
### 停止数据库服务
在开始卸载之前，确保数据库服务已经停止。你可以使用以下命令停止数据库服务：
```
net stop OracleServiceORCL
```
### Universal Installer 卸载Oracle数据库程序
一般情况运行Oracle自带的卸载程序，如使用Universal Installer 工具卸载。
点击开始菜单找到Oracle，然后点击Oracle安装产品,再点击Universal Installer。
点击之后稍等一会然后会进入进入下图界面,点击卸载产品。
选中要删除的Oracle产品，然后点击删除。
点击全部展开，选中Oracle Database 19c。
### 使用Oracle Installer卸载
Oracle提供了一个用于卸载数据库的Installer，运行 **deinstall** 脚本来启动卸载过程，./deinstall.bat。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1700184909411-6872b771-0927-419f-a777-f7a4457020af.png#averageHue=%23191919&clientId=uaa0592d6-9fba-4&from=paste&height=605&id=u8d4848d9&originHeight=907&originWidth=1258&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=89226&status=done&style=none&taskId=ufea6f06a-9fb1-4214-94ee-bb86ee15566&title=&width=838.6666666666666)
### 删除注册表项
在Windows系统上，你可能需要手动删除一些注册表项。请小心操作注册表，确保你知道你在做什么。
打开注册表编辑器（运行 **regedit**）。
导航到 **HKEY_LOCAL_MACHINE\SOFTWARE\Oracle**。
删除 **KEY_OraDB19Home1** 或类似的项。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1700184677084-61c0bc3b-ad50-4666-9cc7-0af940b51fb5.png#averageHue=%23f8f5f2&clientId=uaa0592d6-9fba-4&from=paste&height=531&id=u9e1891b1&originHeight=796&originWidth=1122&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=127747&status=done&style=none&taskId=ud58ef857-129f-4694-93f7-57b47deca6c&title=&width=748)
### 重新启动系统
在完成上述步骤后，重新启动系统以确保所有更改都生效。
