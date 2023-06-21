## 一、Git添加
1、在终端或命令提示符中，导航到你的Git项目所在的目录，使用 **cd** 命令切换目录。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687359316034-fd500b34-ab8b-4397-8a15-a84864192621.png#averageHue=%23a37a2c&clientId=u535e8bf3-f972-4&from=paste&height=133&id=uaaca0fe1&originHeight=200&originWidth=613&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=12132&status=done&style=none&taskId=u50e28bcd-2ef9-49bc-9f9c-f57d2c8b628&title=&width=408.6666666666667)
2、在目标目录中，运行以下命令来初始化一个新的Git仓库，这将在当前目录下创建一个名为**.git**的隐藏文件夹，它是Git仓库的核心部分。
```xml
git init
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687359823454-af385bf4-2fa4-4fe4-b82f-46b4a021ba89.png#averageHue=%23030201&clientId=u535e8bf3-f972-4&from=paste&height=180&id=ue47feb5f&originHeight=270&originWidth=723&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=20950&status=done&style=none&taskId=uc6dd26d3-818a-4214-9819-080c9135b95&title=&width=482)
3、使用以下命令将文件添加到Git的暂存区（Staging Area），这样会将所有新创建或修改的文件添加到暂存区，（需要新建一个文件，里面有内容）。
```xml
git add 文件名
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687360513629-9a00f9d7-7c7f-4205-bb84-f431d769c3d6.png#averageHue=%23030201&clientId=ucafdc39e-6853-4&from=paste&height=221&id=u01c96e6f&originHeight=332&originWidth=702&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=27197&status=done&style=none&taskId=ufc02131e-4673-4e4a-b3bc-20f70eabdc0&title=&width=468)
如果你有多个文件需要添加，可以使用以下命令来一次性添加多个文件：
```xml
git add 文件名1 文件名2 ...
```
如果要添加整个目录中的所有文件，可以使用以下命令：
```xml
git add .
```
4、确保你已经添加了所有要提交的文件，可以使用以下命令来查看当前文件的状态，这会显示哪些文件已添加到暂存区以及哪些文件还未添加。
```xml
git status
```
这表示你已经成功地将名为 **one/新建文件.txt** 的文件添加到Git仓库的暂存区。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687360996215-151d8034-7f16-40e6-bb12-08ac015168db.png#averageHue=%23040302&clientId=ucafdc39e-6853-4&from=paste&height=226&id=udfc30e33&originHeight=339&originWidth=712&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=27770&status=done&style=none&taskId=u1faefe7e-6740-4e87-9bd9-39ada79a89a&title=&width=474.6666666666667)
## 二、Git提交文件
1、使用以下命令将暂存区的文件提交到Git仓库，将**提交说明**替换为对提交的简要描述，例如修复了某个Bug、添加了新功能等。
```xml
git commit -m "提交说明"
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687361539928-b9622f2e-c805-4129-9811-352d6dee00bb.png#averageHue=%23070605&clientId=ucafdc39e-6853-4&from=paste&height=124&id=ud2e1dd63&originHeight=186&originWidth=865&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=24715&status=done&style=none&taskId=uc1473c37-205f-4250-b73d-48d7cadb595&title=&width=576.6666666666666)
## 三、查看Git仓库的提交历史和当前状态
要查看Git仓库的提交历史和当前状态，可以使用**git log**和**git status**命令。
1、**git log**命令用于显示Git仓库的提交历史。在终端中执行以下命令，这将显示最近的提交记录，包括每个提交的作者、提交日期和提交信息等。
```xml
git log
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687361960751-e481445f-4144-429b-824d-7a47c4ff8cee.png#averageHue=%23a0851f&clientId=ucafdc39e-6853-4&from=paste&height=124&id=ua2675b76&originHeight=186&originWidth=713&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=20598&status=done&style=none&taskId=u66615e58-b431-4839-be56-2de7e965fcd&title=&width=475.3333333333333)
2、**git status**命令用于查看当前Git仓库的状态，包括已修改但未暂存的文件、已暂存但未提交的更改等。在终端中执行以下命令：
```xml
git status
```
这将显示当前分支的名称、已修改但未暂存的文件、已暂存但未提交的更改等信息，如果没有任何未提交的更改，输出将显示 "nothing to commit, working tree clean"，当前没有任何未提交的更改，工作区是干净的。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1687362126828-8229463f-3a06-4a53-9221-175f23420f31.png#averageHue=%239a8847&clientId=ucafdc39e-6853-4&from=paste&height=103&id=u65da8d64&originHeight=154&originWidth=622&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=12348&status=done&style=none&taskId=u588f6f23-02da-46f7-9d5d-03a02c848f9&title=&width=414.6666666666667)
