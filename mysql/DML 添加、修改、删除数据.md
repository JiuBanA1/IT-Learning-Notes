![微信图片_20230317085809.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679015114744-0b3026a9-175b-4123-8d47-202e00df8913.jpeg#averageHue=%23fefbf6&clientId=u7767df14-3761-4&from=paste&height=448&id=u7e162af9&originHeight=672&originWidth=1104&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31216&status=done&style=none&taskId=uf6644c00-d95e-4c8d-a947-76af06492a7&title=&width=736)
## DML 
> DML英文全称是Data Manipulation Language(数据操作语言)，用来对数据库中表的数据记录进行增、删、改操作。

## 一、添加数据
### 1、给指定字段添加数据
```sql
INSERT INTO 表名 (字段名1, 字段名2, ...) VALUES (值1, 值2, ...);
```
**案例**
给employee表所有的字段添加数据 ；
```sql
insert into employee(id,workno,name,gender,age,idcard,entrydate)
values(1,'1','Itcast','男',10,'123456789012345678','2000-01-01');
```
插入数据完成之后，我们有两种方式，查询数据库的数据：
```sql
select * from employee;
```
### 2、给全部字段添加数据
```sql
INSERT INTO 表名 VALUES (值1, 值2, ...);
```
**案例**
插入数据到employee表，具体的SQL如下
```sql
insert into employee values(2,'2','张无忌','男',18,'123456789012345670','2005-01-
01');
```
### 3、批量添加数据
```sql
INSERT INTO 表名 (字段名1, 字段名2, ...) VALUES (值1, 值2, ...), (值1, 值2, ...), (值
1, 值2, ...) ;
```
```sql
INSERT INTO 表名 VALUES (值1, 值2, ...), (值1, 值2, ...), (值1, 值2, ...) ; 
```
**案例**
批量插入数据到employee表，具体的SQL如下
```sql
insert into employee values(3,'3','韦一笑','男',38,'123456789012345670','2005-01-
01'),(4,'4','赵敏','女',18,'123456789012345670','2005-01-01');
```
## 二、修改数据
修改数据的具体语法为:
```sql
UPDATE 表名 SET 字段名1 = 值1 , 字段名2 = 值2 , .... [ WHERE 条件 ] ;
```
**案例**
A. 修改id为1的数据，将name修改为itheima
```sql
update employee set name = 'itheima' where id = 1; 
```
B. 修改id为1的数据, 将name修改为小昭, gender修改为 女
```sql
update employee set name = '小昭' , gender = '女' where id = 1;
```
C. 将所有的员工入职日期修改为 2008-01-01
```sql
update employee set entrydate = '2008-01-01';
```
## 三、删除数据
删除数据的具体语法为：
```sql
DELETE FROM 表名 [ WHERE 条件 ] ; 
```
**案例**
A. 删除gender为女的员工
```sql
delete from employee where gender = '女';
```
B. 删除所有员工
```sql
delete from employee;
```
