### 1、目录的切换
打开终端窗口（”ctrl+alt+t“）
一般使用（”pwd“）显示当前所在的目录
比如：当前目录是在home下面的，与用户名相同的文件夹，可以使用（”cd“）命令来切换目录；
进入下载目录（”cd /home/a/下载“）这种从给目录开头的一长串路经”叫做绝对路径“；
进入图片目录（”cd .. /图片/“）".."代表当前路径的上级路径，相对于当前的目录而言的”叫做相对路径“，（”.“）代表当前路径；
如果，想快速切换，上一个所在目录可以（”cd -“）；
如果，想快速切换，追原始的目录可以（”cd --“）；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682687696632-4d2f095d-9a30-4c11-b492-e3e044c37f6b.png#averageHue=%235d1a3c&clientId=ua7feb574-ab3f-4&from=paste&height=800&id=u977895e6&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2262356&status=done&style=none&taskId=u27cdb566-c615-43b4-84ef-7f3cb849b0a&title=&width=1280)
### 2、查看目录及文件
（”ls“）来查看当前目录下的目录及文件；
（”ls --help“）来查看他的详细使用方法；
（”ls -l“）查看当前目录下这些目录和文件的详细信息；
（”ls -lh“）以方便阅读的形式显示文件大小；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682689498189-429ba055-aff5-4859-8984-9e147d26f2d4.png#averageHue=%23621c3e&clientId=ua7feb574-ab3f-4&from=paste&height=771&id=u19bed786&originHeight=1157&originWidth=1876&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2264503&status=done&style=none&taskId=u0dbf0b28-79e3-40da-81df-01c6017eda0&title=&width=1250.6666666666667)
### 3、目录的常见操作
（”mkdir test“）新建目录，test目录名字；
（”mkdir -p test1/test2“）创建多级目录；
（”cp -r  test1 test“）复制目录，把 test1 复制到 test 里面；
（”mv test3 test1“）移动目录，把 test3 移动到 test1 里面；
（”rmdir test3“）目录是空的可以直接用；
（”rm -r test“）它会将连同目录及其文件一起删掉；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682695320775-befb8f07-e395-424a-896c-d285b25a50bd.png#averageHue=%235e1a3e&clientId=ua7feb574-ab3f-4&from=paste&height=800&id=ubf064d0d&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2375772&status=done&style=none&taskId=u44e1af1f-8e33-4b58-a257-06998350107&title=&width=1280)
### 4、文件的常见操作
（”touch 123.txt“）创建文件，123文件名字；
（”cp 123.txt  456.txt“）复制文件，重命名为456.txt；
（”mv 123.txt  test“）把123.txt移动到txt目录中；
（”rm 123.txt“）删除文件，（”rm *.txt“）以txt结尾的全部删除；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682696430040-aec33910-2c9d-4572-b0e0-6d241eecf11b.png#averageHue=%23651d42&clientId=ua7feb574-ab3f-4&from=paste&height=800&id=u5af21e2b&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2463996&status=done&style=none&taskId=uedcaa9b5-e754-4b23-abb9-193631a0cb8&title=&width=1280)
### 5、查看文件及目录大小
1、首先打开终端窗口；
可以使用（“ ll -h”），来查看当前目录和文件以及它的大小；
可以使用（“ sudo du -ah /etc ”），来查看目录中的子目录和文件，比如查看 etc ；
可以使用（“ sudo du -sh /etc ”），来查看 etc 磁盘占用情况；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682952527573-1d277ee5-7d85-4319-9a72-c73657ba10e3.png#averageHue=%235f1a3e&clientId=u28d4e763-ec44-4&from=paste&height=800&id=uca1b4ef6&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2131826&status=done&style=none&taskId=u8c81cc7e-c6ff-4328-a65a-63700b45370&title=&width=1280)
2、图形程序查看文件及目录大小
双击win键，进入所有程序中找到磁盘占用分析器，点击磁盘占用分析器，然后就可以看到信息；
### 6、命令查看硬盘信息
首先在终端窗口进行查看 ctrl+alt+t 打开终端窗口 ；
输入命令  ll /dev|grep sd； 
查看单个比如“sda盘”输入命令 sudo fdisk -l /dev/sda；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1682951097066-ea797b46-702f-4a60-a397-93df89c880df.png#averageHue=%23611c40&clientId=u0da50811-7792-4&from=paste&height=800&id=uc5426b5f&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2458154&status=done&style=none&taskId=u8a6c977a-f835-4816-82b5-4ac85f9d676&title=&width=1280)
2、图形程序查看硬盘信息
双击win键，进入所有程序中找到磁盘，点击磁盘，然后就可以看到信息；
### 
