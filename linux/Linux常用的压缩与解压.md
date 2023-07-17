## 1、gzip压缩解压
因为都是系统自带的我们不需要安装；
ls 看一下目录当前的文件，创建一个 touch 123.txt 文件；
原文件消失，压缩解压
gzip 进行压缩，（“ gzip 123.txt ”），这样就压缩完毕了;
gzip 进行解压，（“ gzip -d 123.txt.gz”），这样就解压完毕了;
原文件保留，gzip -k 123.txt、gzip -dk 123.txt.gz ;
## 2、bzip2压缩解压
因为都是系统自带的我们不需要安装；
原文件消失，压缩解压
bzip2进行压缩，（“ bzip2  123.txt ”），这样就压缩完毕了;
bzip2 进行解压，（“ bzip2  -d 123.txt.bz2”），这样就解压完毕了;
原文件保留，bzip2 -k 123.txt、bzip2 -dk 123.txt.bz ;
## 3、tar压缩解压
因为都是系统自带的我们不需要安装；
tar命令可以将一个或多个文件和文件夹打包到一个文件中；
该文件可以是tar格式，test 压缩文件名，以.tar为扩展名：（“ tar -cvf test.tar test1 test2 test3 ”）；
要解压缩tar文件，可以使用以下命令：（“ tar -xvf test.tar ”）；
## 4、zip压缩解压
因为都是系统自带的我们不需要安装；
命令可以将一个或多个文件和文件夹打包到一个文件中；
该文件可以是zip格式，test 压缩文件名，以.zip为扩展名：（“zip test.zip test1 test2 test3”）；
要解压缩tar文件，可以使用以下命令：（“unzip test.zip”）；



