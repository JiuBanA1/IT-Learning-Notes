## 一、IDEA安装Docker插件
打开 IntelliJ IDEA，点击菜单栏中的 "File" -> "Settings"（或 "IntelliJ IDEA" -> "Preferences"），在左侧栏中选择 "Plugins"，搜索并安装 "Docker" 插件。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691649281418-bc4faa84-ecb4-4b6d-bf43-110a746ecdfa.png#averageHue=%2334383b&clientId=u136e717b-8f3e-4&from=paste&height=615&id=udf26bf30&originHeight=922&originWidth=1687&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=159513&status=done&style=none&taskId=u2a6e2726-9c56-4a32-b63a-aa426941ce0&title=&width=1124.6666666666667)
## 二、IDEA连接Docker
### 1、Docker for Windows 连接
"Docker for Windows" 是指在 Windows 操作系统上运行 Docker 容器；
### 2、SSH 连接
"SSH 连接" 用什么用户下载docker，就用什么用户连接SSH;
### 3、Connection successful 连接成功
如下图进行连接测试看看是否能和docker的宿主机连接成功，输入正确的地址后下方会自动显示连接成功的说明。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691660779829-a2a48480-72c8-404d-9057-717bbc3eb251.png#averageHue=%233d4145&clientId=u3927b931-e358-4&from=paste&height=662&id=u9a0c4b73&originHeight=993&originWidth=1462&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=89858&status=done&style=none&taskId=u7854367d-e057-454c-b3cc-b90820e1c81&title=&width=974.6666666666666)
## 三、查看Docker面板
配置好了docker插件后，会在项目服务（services）下面生成一个Docker面板，可以看到docker中的镜像和容器。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691854232611-78119d35-63fb-41b3-aba1-e8377f00ea40.png#averageHue=%233b4043&clientId=uc20d1538-8249-4&from=paste&height=302&id=uefa02101&originHeight=453&originWidth=1236&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=46224&status=done&style=none&taskId=u9c7d04fa-c483-4f95-92bf-6a66f03c5db&title=&width=824)
## 四、使用插件生成镜像
使用插件生成镜像，点击当前文件（currentfile），选择编辑配置，添加新的运行配置找到docker，有docker Image，docker-compose，dockerfile三种选择；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1691853553766-82d9d2af-6e70-4549-ab68-186c6c3854ba.png#averageHue=%233e4247&clientId=uc20d1538-8249-4&from=paste&height=351&id=ue70fee8a&originHeight=527&originWidth=672&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=37544&status=done&style=none&taskId=udaccd386-9807-47af-9b9a-41c7f6eb91b&title=&width=448)
