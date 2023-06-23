## 前言
分支是指在同一个代码仓库中的不同版本线。它们可以被用来同时开展不同的开发任务、修复bug或实现新功能，而不会影响到主要的代码线。每个分支都可以独立地进行修改、提交和合并操作。
## 一、查看可用分支
在终端或命令提示符中，导航到你的Git项目所在的目录，使用 **cd** 命令切换目录；
可以使用以下命令查看当前仓库中已存在的分支：
```xml
git branch
```
该命令会列出所有已存在的分支，并在当前分支前面标记一个星号。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687506026580-d85eeea7-5179-40c0-aa81-5579ad9152cb.png#averageHue=%23a47e37&clientId=ude9c83ba-9a65-4&from=paste&height=135&id=uc36039c9&originHeight=203&originWidth=548&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=14215&status=done&style=none&taskId=u652365aa-3f19-436e-9be9-8734c428946&title=&width=365.3333333333333)
## 二、创建新分支
使用以下命令创建一个新的分支：
```xml
git branch <分支名>
```
例如，要创建一个名为branch1的新分支，可以运行：
```xml
git branch branch1
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687506182668-92b09064-5393-45f3-8f47-401e67b9b926.png#averageHue=%23030201&clientId=ude9c83ba-9a65-4&from=paste&height=171&id=u3ea3b2a8&originHeight=257&originWidth=535&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=19742&status=done&style=none&taskId=u0f6ad59e-d60c-4d02-9695-fdcca3f653a&title=&width=356.6666666666667)
## 三、切换到新分支
创建分支后，使用以下命令切换到新创建的分支：
```xml
git checkout <分支名>
```
或者，可以使用以下命令来创建并切换到新分支：
```xml
git checkout -b <分支名>
```
例如，要切换到名为branch1的新分支，可以运行：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687506369511-6e95a550-5ec3-4460-b511-d5ddc2a51c18.png#averageHue=%23040302&clientId=ude9c83ba-9a65-4&from=paste&height=207&id=u11d8fc88&originHeight=310&originWidth=544&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=27555&status=done&style=none&taskId=u92d79f70-3dea-4fed-b15f-978fa0ceac9&title=&width=362.6666666666667)
## 四、在新分支上进行工作
切换到新创建的分支后，你可以在该分支上进行修改、添加、删除文件等操作。在这个分支上的更改不会影响其他分支。
## 五、提交更改
在新分支上进行了一些修改后，使用以下命令将更改提交到该分支：
```xml
git add <文件名>
git commit -m "提交信息"
```
## 六、切换回主分支
完成在新分支上的工作后，你可以切换回主分支或其他任何分支。
在 Git 中，主分支通常被称为 **master** 或 **main** 分支。这是默认的主要开发分支，用于存储项目的稳定版本和主要代码线。
```xml
git checkout <主分支名>
```
具体使用哪个名称取决于你的 Git 版本和项目设置，你可以通过查看分支列表
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687507243207-4293f415-5ae8-41e5-8299-c6c6364fbd8d.png#averageHue=%23040302&clientId=u7f5b09c5-f572-4&from=paste&height=206&id=uf45bf25a&originHeight=309&originWidth=586&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=25970&status=done&style=none&taskId=u4da695c4-f603-4b77-9d65-41f6fecc956&title=&width=390.6666666666667)
