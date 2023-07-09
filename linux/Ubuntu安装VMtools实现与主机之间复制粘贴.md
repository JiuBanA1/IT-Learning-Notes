## 一、安装 VMware Tools
右键点击你创建的系统，然后出现菜单下滑找到安装 VMware Tools（T） 这个点击安装；
![屏幕截图 2023-07-08 161030.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688803871512-f0b30621-f060-42de-af6f-32e00ab8b661.png#averageHue=%23bbbaba&clientId=ufc70af4d-42ed-4&from=paste&height=537&id=uf89e4abd&originHeight=805&originWidth=1160&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=70401&status=done&style=none&taskId=ud82c274c-a19e-47ad-b6ff-7116ca58209&title=&width=773.3333333333334)
右键点击你创建的系统，然后出现菜单下滑找到设置;
然后弹出虚拟机设置-->点击选项-->客户机隔离-->启用复制粘贴；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688804136896-a30efb9f-b54a-4611-957c-1818cfb93451.png#averageHue=%23f9f8f8&clientId=ufc70af4d-42ed-4&from=paste&height=348&id=ud19f85d6&originHeight=522&originWidth=989&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=45743&status=done&style=none&taskId=u03d2e603-de7c-454d-bd4d-d163e81355a&title=&width=659.3333333333334)
## 二、Ubuntu命令
这些命令假设你的Ubuntu系统已连接到互联网并且已配置为使用apt软件包管理器；
如果你的网络环境有限，你可能需要提前配置好网络或更换软件源；
Ubuntu上安装和配置VMtools以实现与主机之间的文本复制粘贴功能；
1、打开终端（Terminal）。
2、运行以下命令以卸载旧版本的open-vm-tools：
```java
sudo apt-get autoremove open-vm-tools
```
3、运行以下命令以安装open-vm-tools：
```java
sudo apt-get install open-vm-tools
```
4、运行以下命令以安装open-vm-tools的桌面组件（可选）：
桌面组件提供了更好的集成体验，包括拖放文件和共享剪贴板。
```java
sudo apt-get install open-vm-tools-desktop
```
5、安装完成后，重新启动Ubuntu虚拟机以使更改生效：
VMtools应该已成功安装并配置，应该能够在主机和Ubuntu虚拟机之间实现文本的复制和粘贴操作。
```java
sudo reboot
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1688803201345-f6ab8d18-e2ca-43f8-a726-5bc5f674f3ba.png#averageHue=%23651e44&clientId=ufc70af4d-42ed-4&from=paste&height=800&id=ufb9ed6c2&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2560561&status=done&style=none&taskId=u2600301a-e8b7-4765-b12b-d325fffdcc0&title=&width=1280)
