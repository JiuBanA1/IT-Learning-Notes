## 1、gzip压缩解压
因为都是系统自带的我们不需要安装；
ls 看一下目录当前的文件，创建一个 touch 123.txt 文件；
gzip 进行压缩，（“ gzip 123.txt ”），这样就压缩完毕了;
原文件已经消失，生成文件的是 123.txt.gz ;
gzip 进行解压，（“ gzip -d 123.txt.gz”），这样就解压完毕了;
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1683014759394-b5deca5b-4eaa-4017-b351-7d6cc7f6c4cf.png#averageHue=%235d1a3c&clientId=ufa7dcc50-9d66-4&from=paste&height=800&id=u5cb1efd9&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1754114&status=done&style=none&taskId=u76b4c540-8f0a-4158-af40-cd8ed3e33d3&title=&width=1280)
## 2、bzip2压缩解压
因为都是系统自带的我们不需要安装；
bzip2进行压缩，（“ bzip2 -k 123.txt ”），这样就压缩完毕了;
原文件保留，生成文件的是 123.txt.bz2 ;
bzip2 进行解压，（“ bzip2 -k  -d 123.txt.bz2”），这样就解压完毕了;
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1683015607535-03e5858f-c52a-4df7-9313-517c3a313a08.png#averageHue=%23641e43&clientId=u30c8cf19-b976-4&from=paste&height=800&id=u506f4fb7&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1899258&status=done&style=none&taskId=u54463f30-e382-48a6-a1fd-ffdf364944b&title=&width=1280)
## 3、rar压缩解压
首先需要安装它，（“ sudo apt install rar”），验证密码进行安装；
还需要安装解压工具，（“ sudo apt intsall unrar”）；
rar进行压缩，（“ rar a 123.rar ”），这样就压缩完毕了;
unrar进行解压，（“ unrar e 123.rar ”），这样就解压完毕了;
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1683019751143-967537de-fb77-4ceb-9d9c-011a15268941.png#averageHue=%23641e43&clientId=u92b25692-48db-4&from=paste&id=lC8Fe&originHeight=1200&originWidth=1920&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=1873778&status=done&style=none&taskId=u13854c5c-e7bc-43fd-ae97-e119722c393&title=)
## tar归档压缩与解压包
tar命令可以将一个或多个文件和文件夹打包到一个文件中；
该文件可以是tar格式，以.tar为扩展名：（“ tar -cvf test.tar test1 test2 test3 ”）；
要解压缩tar文件，可以使用以下命令：（“ tar -xvf test.tar ”）；
tar压缩格式，以.tar.gz或.tgz为扩展名：（”tar -cvf test.tar.gz test1 test2 test3“)；
要解压缩tar.gz文件，可以使用以下命令：（“ tar -xvf test.tar.gz ”）；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1683020670658-ecb33229-0859-46d9-b97d-f9eefd47f581.png#averageHue=%23641e43&clientId=u92b25692-48db-4&from=paste&height=800&id=uac503265&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1916147&status=done&style=none&taskId=ucc833b0a-7688-4962-a7a6-e8c3dabe53d&title=&width=1280)
