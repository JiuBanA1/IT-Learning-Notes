![微信图片_20230317085809.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679015101257-e303b39f-0835-4889-914a-96fbd723895a.jpeg#averageHue=%23fefbf6&clientId=u15c733b0-b9aa-4&from=paste&height=448&id=uf4e06e22&originHeight=672&originWidth=1104&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31216&status=done&style=none&taskId=u6578cb13-456b-4f38-a60b-85987f85d80&title=&width=736)
## **SQL**
> 全称Structured Query Language，结构化查询语言。操作关系型数据库的编程语言，定义了一套操作关系型数据库统一**标准。**

### **SQL通用语法 **
> 1、SQL语句可以单行或多行书写，以分号结尾。
> 2、SQL语句可以使用空格/缩进来增强语句的可读性。
> 3、MySQL数据库的SQL语句不区分大小写，关键字建议使用大写。
> 4、注释： 单行注释：-- 注释内容 或 # 注释内容；多行注释：/* 注释内容 */

### **SQL分类 **
> SQL语句，根据其功能，主要分为四类：DDL、DML、DQL、DCL。

| **分类** | **全称** | **说明** |
| --- | --- | --- |
| **DDL ** | **Data Definition Language ** | 数据定义语言，用来定义数据库对象(数据库，表，
字段) |
| **DML** | **Data Manipulation **
**Language ** | 数据操作语言，用来对数据库表中的数据进行增删改
 |
| **DQL **
 | **Data Query Language **
 | 数据查询语言，用来查询数据库中表的记录
 |
| **DCL **
 | **Data Control Language**
 | 数据控制语言，用来创建数据库用户、控制数据库的
访问权限
 |

## **DDL **
> Data Definition Language，数据定义语言，用来定义数据库对象(数据库，表，字段) 。

## **数据库操作**
### **1、查询所有数据库**
`show databases ; `
### 2、**查询当前数据库**
`select database() ; `
### 3、**创建数据库**
`create database [ if not exists ] 数据库名[ default charset 字符集] [ collate 排序规则] ; `
### **案例**
```sql
CREATE DATABASE warehouse; 
-- 创建warehouse一个数据库, 使用数据库默认的字符集。
SELECT DATABASE() 
-- 查询当前数据库
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677824832773-f4cdd0ca-d0e2-4544-ad9d-58bae728c679.png#averageHue=%23fcfcfc&clientId=uef9b6183-0df5-4&from=paste&height=800&id=u9de2932e&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=236337&status=done&style=none&taskId=ufcac8463-4b25-4638-82f3-392114a4272&title=&width=1280)
**补充：**
> 在同一个数据库服务器中，不能创建两个名称相同的数据库，否则将会报错。

> 可以通过if not exists 参数来解决这个问题，数据库不存在, 则创建该数据库，如果存在，则不创建。

`create database if not extists itcast; `
### 4、删除数据库 
```sql
drop database [ if exists ] 数据库名 ;
```
> 如果删除一个不存在的数据库，将会报错。此时，可以加上参数 if exists ，如果数据库存在，再 
> 执行删除，否则不执行删除。

### 5、切换数据库 
```sql
use 数据库名 ;
```
> 我们要操作某一个数据库下的表时，就需要通过该指令，切换到对应的数据库下，否则是不能操作的。






