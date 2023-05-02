![微信图片_20230317085809.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679015130874-68b03fba-16d0-4707-89ec-1eade339c80f.jpeg#averageHue=%23fefbf6&clientId=u50a87c6a-19f3-4&from=paste&height=448&id=u21d323e9&originHeight=672&originWidth=1104&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31216&status=done&style=none&taskId=u1a3e7b55-46b7-4660-ae12-60d05ca6495&title=&width=736)
## DCL 
> DCL英文全称是Data Control Language(数据控制语言)，用来管理数据库用户、控制数据库的访问权限。

## 查询用户
1、查询用户
```sql
select * from mysql.user;
```
2、创建用户
```sql
CREATE USER '用户名'@'主机名' IDENTIFIED BY '密码';
```
3、修改用户密码
```sql
ALTER USER '用户名'@'主机名' IDENTIFIED WITH mysql_native_password BY '新密码' ;
```
4、删除用户
```sql
DROP USER '用户名'@'主机名' ;
```
### 案例
A. 创建用户itcast, 只能够在当前主机localhost访问, 密码123456;
```sql
create user 'itcast'@'localhost' identified by '123456';
```
B. 创建用户heima, 可以在任意主机访问该数据库, 密码123456;
```sql
create user 'heima'@'%' identified by '123456';
```
C. 修改用户heima的访问密码为1234;
```sql
alter user 'heima'@'%' identified with mysql_native_password by '1234';
```
D. 删除 itcast@localhost 用户
```sql
drop user 'itcast'@'localhost';
```
## 权限控制
| **权限 ** | **说明** |
| --- | --- |
| ALL, ALL PRIVILEGES  | 所有权限 |
| SELECT  | 查询数据 |
| INSERT  | 插入数据 |
| UPDATE  | 修改数据 |
| DELETE  | 删除数据  |
| ALTER  | 修改表 |
| DROP  | 删除数据库/表/视图  |
| CREATE  | 创建数据库/表 |

1、查询权限 
```sql
SHOW GRANTS FOR '用户名'@'主机名' ;
```
2、授予权限
```sql
GRANT 权限列表 ON 数据库名.表名 TO '用户名'@'主机名';
```
3、撤销权限
```sql
REVOKE 权限列表 ON 数据库名.表名 FROM '用户名'@'主机名';
```
### 案例
A. 查询 'heima'@'%' 用户的权限 
```sql
show grants for 'heima'@'%';
```
B. 授予 'heima'@'%' 用户itcast数据库所有表的所有操作权限 
```sql
grant all on itcast.* to 'heima'@'%';
```
C. 撤销 'heima'@'%' 用户的itcast数据库的所有权限
```sql
revoke all on itcast.* from 'heima'@'%';
```
