## 一、用户与用户组信息查看
查看用户，首先调出终端窗口，（“sudo cat /etc/passwd”），输入一下当前用户密码；
查看用户组，（“sudo cat /etc/group”）,里面就是用户组的信息；
## ![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684823017489-4068bebf-7a4d-4886-bbd3-db0285418a20.png#averageHue=%2358183a&clientId=u6f65cfdd-92a3-4&from=paste&height=800&id=u1a4b00e7&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2226484&status=done&style=none&taskId=u3ee157a1-0408-486a-85e7-e4e2f33d5a7&title=&width=1280)
## 二、用户管理
### 1、user1
添加用户，可以使用（“sudo useradd user1”），然后用户名字，新加的用户名字，然后就创建完毕；
查看，可以使用（“sudo grep user1 /etc/passwd  /etc/group”）筛选这个用户在哪里，在使用etc/passwd， /etc/group用户与用户组信息查看；
### 2、user2
创建一个标准的用户，可以使用（“sudo useradd -m -p 123456 -s /bin/bash user2”），-m自动的给他创建主目录，-p设置一下他的密码，-s指定一下它的登录环境；
查看，可以使用（“sudo grep user2 /etc/passwd /etc/group”）筛选这个用户在哪里，在使用etc/passwd， /etc/group用户与用户组信息查看；
### 3、设置密码与删除用户
查看文件里有没有用户的信息，使用（id user2 ），可以看到它加入那些组；
给用户设置密码，比如（sudo passwd user1  ），user1之前没有设置密码；
删除用户，（“sudo userdel user2”），查看（“ sudo cat /etc/passwd | grep user2”）没有说明已经删除成功；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684825258908-cd72bf06-caae-4c9a-bfe7-fb4d789d31f7.png#averageHue=%235a193b&clientId=u6f65cfdd-92a3-4&from=paste&height=794&id=u057315b2&originHeight=1191&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2299549&status=done&style=none&taskId=uf25763b9-c59c-4aa7-832d-721546c1fde&title=&width=1280)
## 三、用户组管理
添加用户组，使用命令（“sudo groupadd group1”），用户组名字group1；
查看，可以使用（“ sudo cat  /etc/group /etc/gshadow | grep group1”）;
删除用户，可以使用（“ sudo groupdel group1”）;
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684825854130-9cf7029c-ba04-4ac9-a5f0-06492d217a98.png#averageHue=%2359193b&clientId=u6f65cfdd-92a3-4&from=paste&height=800&id=u0789e9f3&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2209545&status=done&style=none&taskId=ud4d0cb07-f1ae-4f73-8e86-c0a73716335&title=&width=1280)
## 四、用户的切换
打开终端窗口，创建一个标准的用户，可以使用（“sudo useradd -m -p 123456 -s /bin/bash user3”），-m自动的给他创建主目录，-p设置一下他的密码，-s指定一下它的登录环境；
切换到user3用户，可以使用（“ sudo su user3”），然后使用（“ exit ”）来返回普通用户，也可以切换到root用户（“ sudo su root”）也可以使用参数“ - ”；
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684826559859-c1252856-8fc7-401c-bafd-56e8690ac04e.png#averageHue=%235d1a3d&clientId=u6f65cfdd-92a3-4&from=paste&height=800&id=u47c9b1ee&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=2246631&status=done&style=none&taskId=u00197c67-f959-4b44-a161-ca0dbdb38a1&title=&width=1280)








