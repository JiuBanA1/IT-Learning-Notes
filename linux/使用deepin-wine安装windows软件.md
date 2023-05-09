### 1、详细看
[https://github.com/zq1997/deepin-wine](https://github.com/zq1997/deepin-wine)
### 2、添加仓库
首次使用时，你需要运行如下一条命令将移植仓库添加到系统中。
```
wget -O- https://deepin-wine.i-m.dev/setup.sh | sh
```
### 3、应用安装
自此以后，你可以像对待普通的软件包一样，使用apt-get系列命令进行各种应用安装、更新和卸载清理了。
比如安装微信只需要运行下面的命令。
```
sudo apt-get install com.qq.weixin.deepin
```
将com.qq.weixin.deepin替换为下列包名，可以继续安装其他应用：

| 应用 | 包名 |
| --- | --- |
| 微信 | com.qq.weixin.deepin |
| QQ | com.qq.im.deepin |
| TIM | com.qq.office.deepin |
| 钉钉 | com.dingtalk.deepin |
| 阿里旺旺 | com.taobao.wangwang.deepin |
| QQ音乐 | com.qq.music.deepin |
| QQ视频 | com.qq.video.deepin |
| 爱奇艺 | com.iqiyi.deepin |

**完整列表参见**[https://deepin-wine.i-m.dev](https://deepin-wine.i-m.dev)**。**
### 4、常见问题，没有应用图标，重启即可；
### 5、卸载与清理按照层次从浅到深可以分为如下四个层级。
如果只是想清除APP账户配置啥的那么请按照1清理；如果你发现程序奔溃之类的，请按照1-2清理；如果需要卸载APP，按照1-2-3清理；如果你想把一切回到最初的起点，执行1-2-3-4清理。

1. 清理应用运行时目录例如QQ/TIM会把帐号配置、聊天文件等保存~/Documents/Tencent Files目录下，而微信是~/Documents/WeChat Files，删除这些文件夹以移除帐号配置等数据。
2. 清理wine容器deepin-wine应用第一次启动后会在~/.deepinwine/目录下生成一个文件夹（名字各不相同）用于存储wine容器（可以理解我一个“Windows虚拟机”），如果使用出了问题，可以试试删除这个目录下对应的子文件夹。
3. 卸载软件包执行sudo apt-get purge --autoremove <包名>命令把你安装过的包给移除。
4. 移除软件仓库
```
sudo rm /etc/apt/sources.list.d/deepin-wine.i-m.dev.list \
        /etc/profile.d/deepin-wine.i-m.dev.sh
sudo apt-get update
```
### 5、使用deepin-wine安装windows软件
![图片.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682408529395-55d15c26-1300-4b77-a905-7dba257d3549.png#averageHue=%23300a24&clientId=ua82e43e3-352a-4&from=paste&height=629&id=u62f71bc4&originHeight=993&originWidth=1495&originalType=binary&ratio=1.5789473684210527&rotation=0&showTitle=false&size=230009&status=done&style=none&taskId=ub4c11334-3ce3-44df-a93b-ab85bb15973&title=&width=946.8333333333334)


