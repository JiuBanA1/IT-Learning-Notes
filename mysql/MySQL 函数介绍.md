![微信图片_20230317085809.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679015138562-c3f62ec9-90df-4bb2-8529-27c405845875.jpeg#averageHue=%23fefbf6&clientId=u6e15fe56-7fbc-4&from=paste&height=448&id=u40d27966&originHeight=672&originWidth=1104&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31216&status=done&style=none&taskId=u63d4a43c-c703-423f-b335-503919e88b7&title=&width=736)
## MySQL 函数介绍
> MySQL中的函数主要分为以下四类： 字符串函数、数值函数、日期函数、流程函数；

## MySQL 字符串函数
MySQL中内置了很多字符串函数，常用的几个如下：
#### 1、concat : 字符串拼接
select concat('Hello' , ' MySQL'); 
#### 2、 lower : 全部转小写
select lower('Hello');
#### 3、upper : 全部转大写
select upper('Hello'); 
#### 4、lpad : 左填充
select lpad('01', 5, '-'); 
#### 5、rpad : 右填充
select rpad('01', 5, '-'); 
#### 6、 trim : 去除空格
select trim(' Hello My ')
## MySQL 数值函数
常见的数值函数如下：
#### 1、 ceil：向上取整
select ceil(1.1); 
#### 2、floor：向下取整
select floor(1.9); 
#### 3、 rand：获取随机数
select rand(); 
#### 4、round：四舍五入 
select round(2.344,2); 
## MySQL 日期函数
#### 1、curdate：当前日期
select curdate(); 
#### 2、curtime：当前时间
select curtime(); 
#### 3、now：当前日期和时间
select now(); 
#### 4、 YEAR , MONTH , DAY：当前年、月、日
select YEAR(now()); 
select MONTH(now()); 
select DAY(now());
#### 5、date_add：增加指定的时间间隔
select date_add(now(), INTERVAL 70 YEAR );
####  6、datediff：获取两个日期相差的天数
select datediff('2021-10-01', '2021-12-01'); 
## MySQL 流程函数
> 流程函数也是很常用的一类函数，可以在SQL语句中实现条件筛选，从而提高语句的效率。

| **函数 ** | **功能** |
| --- | --- |
| IF(value , t , f) | 如果value为true，则返回t，否则返回f  |
| IFNULL(value1 , value2) | 如果value1不为空，返回value1，否则返回value2 |
| CASE WHEN [ val1 ] THEN [res1] ... ELSE [ default ] END  | 如果val1为true，返回res1，... 否 则返回default默认值 |
| CASE [ expr ] WHEN [ val1 ] THEN [res1] ... ELSE [ default ] END | 如果expr的值等于val1，返回 res1，... 否则返回default默认值 |

A. if
```sql
select if(false, 'Ok', 'Error'); 
```
B. ifnull
```sql
select ifnull('Ok','Default');

select ifnull('','Default');

select ifnull(null,'Default');
```
C. case when then else end
需求: 查询emp表的员工姓名和工作地址 (北京/上海 ----> 一线城市 , 其他 ----> 二线城市)
```sql
select
name,
( case workaddress when '北京' then '一线城市' when '上海' then '一线城市' else
'二线城市' end ) as '工作地址'
from emp;
```
