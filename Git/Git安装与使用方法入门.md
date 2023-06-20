## Git简介
Git是一个帮助开发者追踪代码变化和团队协作的工具。它记录了代码修改的历史，并允许回到过去的版本。开发者可以创建分支来独立开发新功能，而不影响主代码。团队成员可以共享代码，并轻松合并修改。Git提供了高效的工作流程和协作机制，使代码管理更简单。总之，Git是一个强大而灵活的工具，适用于个人和团队开发。
## Git下载与安装
Windows操作系统：
1、打开Git官方网站（[https://git-scm.com）](https://git-scm.com%29./)；
2、在主页上，上面写着 "Download for Windows"。点击这个按钮。
![屏幕截图 2023-06-17 231245.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687014848705-800880bf-8434-4af6-8319-eed12291433d.png#averageHue=%23eae9e0&clientId=u36569ee6-8028-4&from=paste&height=697&id=hzFF1&originHeight=1046&originWidth=1859&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1468599&status=done&style=none&taskId=u3441fe55-1d03-4c4b-bd19-a028c067d37&title=&width=1239.3333333333333)
3、单击“Click here to download”下载最新的 （**2.41.0**） **64 位**版本的 **Git for Windows**，这是最近维护的版本。
![屏幕截图 2023-06-17 232351.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687015506517-7770c062-72b5-4995-a0d8-412e65185646.png#averageHue=%23f2f1eb&clientId=u8c5280f2-7182-4&from=paste&height=705&id=u811f2573&originHeight=1058&originWidth=1847&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1071135&status=done&style=none&taskId=u352babff-cd77-4603-8bf6-eaac6e8d6bf&title=&width=1231.3333333333333)
4、一旦下载完成，双击该安装程序文件，跟随安装向导的步骤。在安装过程中，你可以选择一些配置选项，但通常使用默认设置即可。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687016344986-8315e34b-10b5-42c9-9a19-34c0303b7b31.png#averageHue=%23f1eeeb&clientId=u8c5280f2-7182-4&from=paste&height=380&id=u7f49068c&originHeight=570&originWidth=736&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=43256&status=done&style=none&taskId=ud88d82fe-b41e-4fd7-9882-dfe5d152995&title=&width=490.6666666666667)
5、安装完成后，你可以通过Terminal或其他终端应用程序访问Git。
## Git配置环境变量
把git的bin 目录，路径完整加入系统变量，在cmd中输入git；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687156925165-a30fd5bd-be03-4ab7-b497-56e940448216.png#averageHue=%23f2f2f1&clientId=u8c5280f2-7182-4&from=paste&height=161&id=u40ac5b2e&originHeight=241&originWidth=1014&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=12096&status=done&style=none&taskId=u5f00983f-e0ea-4d9a-bc2d-309c9790920&title=&width=676)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687157042598-7d17b5c6-479d-41b6-ab2d-a5975667cccc.png#averageHue=%23151515&clientId=u8c5280f2-7182-4&from=paste&height=619&id=ube978771&originHeight=929&originWidth=1221&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=104257&status=done&style=none&taskId=u37e126e0-2f46-4360-b7d8-ad0af1b8e9d&title=&width=814)
在cmd内输入 git --version 查看git 版本信息如下；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687157205256-21f94e50-40fe-4606-8224-c5d19f5d5257.png#averageHue=%23171717&clientId=u8c5280f2-7182-4&from=paste&height=212&id=KAm9a&originHeight=318&originWidth=847&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=24857&status=done&style=none&taskId=u222b420e-b837-4f3f-94e4-ebf1186493f&title=&width=564.6666666666666)
## Git使用方法入门
1、可以在开始菜单中找到 Git Bash。Git Bash 是一个类似于命令行界面的工具，可以在 Windows 上使用 Git 命令。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687157743335-e720df27-8c54-44ef-8f27-8b2c253cbf45.png#averageHue=%23f2f2f2&clientId=u8c5280f2-7182-4&from=paste&height=427&id=ua4462284&originHeight=640&originWidth=1084&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=313296&status=done&style=none&taskId=u8bf36a1b-053c-4774-8ace-474a9f2f9bf&title=&width=722.6666666666666)
2、在使用 Git 之前，你需要设置你的用户信息，包括用户名和电子邮件地址。在 Git Bash 中运行以下命令来配置用户信息：
```xml
git config --global user.name "your_username"
git config --global user.email your_email@domain.com
git config --list 查看所有配置
```
3、创建一个新的 Git 仓库：要开始使用 Git，你可以在本地创建一个新的 Git 仓库。在 Git Bash 中，导航到你想要创建仓库的目录，然后运行以下命令：
```xml
git init
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687158544503-76c80ad7-02a8-4f54-b8f4-6f43da8dc7c9.png#averageHue=%231b1b1a&clientId=u8c5280f2-7182-4&from=paste&height=148&id=ua78b1780&originHeight=222&originWidth=896&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=17061&status=done&style=none&taskId=u9e92dda2-51ed-4673-9140-d59865cbe52&title=&width=597.3333333333334)
执行万命令后可以看到，仅仅在项目目录多出了一个.git目录（注意这个默认是隐藏的文件夹，需要手动在查看选项里面去掉隐藏的文件才能显示），关于版本等所有信息都在这个目录里面
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687159245265-c440658d-f85b-4628-86f9-7612d3d64a23.png#averageHue=%23fdfcfb&clientId=u8c5280f2-7182-4&from=paste&height=201&id=uac4000e2&originHeight=301&originWidth=1357&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=24566&status=done&style=none&taskId=uf572ad45-8177-4207-be64-0d305c7f42f&title=&width=904.6666666666666)
4、克隆现有仓库（可选）：如果你想要克隆一个现有的 Git 仓库到你的本地，可以使用以下命令：
```xml
git clone 仓库URL
//将 仓库URL 替换为你想要克隆的仓库的 URL。
```
这里以github为例，找一个开源项目点**Code**，HTTPS下面的链接粘贴到执行上面命令的链接地址即可。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687159542365-1fae0abe-bc59-4df3-8f96-73ce8cfad7ed.png#averageHue=%23dbb380&clientId=u8c5280f2-7182-4&from=paste&height=713&id=u48865206&originHeight=1070&originWidth=1891&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=159710&status=done&style=none&taskId=u8412d76a-b0c7-49e4-aaa0-076977b04ee&title=&width=1260.6666666666667)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687161515814-97eb29ba-54fa-43d4-9c34-a7ab31d006a3.png#averageHue=%230b0a09&clientId=u8c5280f2-7182-4&from=paste&height=339&id=uea0bdc95&originHeight=509&originWidth=899&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=51510&status=done&style=none&taskId=u4626a985-8287-4a8d-8aad-09fad125b19&title=&width=599.3333333333334)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687161544168-a7343101-be0d-417e-8e01-c34a810d5c5f.png#averageHue=%23fcfcfb&clientId=u8c5280f2-7182-4&from=paste&height=267&id=u984c513b&originHeight=400&originWidth=1230&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31451&status=done&style=none&taskId=u61cc00f4-297f-4795-8d08-7a9d22f15c5&title=&width=820)
