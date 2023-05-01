![微信图片_20230317085809.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679015108424-f77dfe95-1a34-4578-b264-eccb5c44f4d0.jpeg#averageHue=%23fefbf6&clientId=ue62759fb-8330-4&from=paste&height=448&id=u0238667a&originHeight=672&originWidth=1104&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31216&status=done&style=none&taskId=uccc7c90e-3957-4816-9a7c-bcefdae5534&title=&width=736)
## 一、查询创建
### 1、查询当前数据库所有表
```sql
show tables;
```
### 2、查看指定表结构 
```sql
desc 表名 ;
```
通过这条指令，我们可以查看到指定表的字段，字段的类型、是否可以为NULL，是否存在默认值等信 
息。 
### 3、查询指定表的建表语句
```sql
show create table 表名 ;
```
通过这条指令，主要是用来查看建表语句的，而有部分参数我们在创建表的时候，并未指定也会查询 
到，因为这部分是数据库的默认值，如：存储引擎、字符集等。
### 4、创建表结构
CREATE TABLE 表名( 
字段1 字段1类型 [ COMMENT 字段1注释 ], 
字段2 字段2类型 [COMMENT 字段2注释 ], 
字段3 字段3类型 [COMMENT 字段3注释 ], 
...... 
字段n 字段n类型 [COMMENT 字段n注释 ] 
) [ COMMENT 表注释 ] ;
```sql
create table tb_user(
	id int comment '编号',
	name varchar(50) comment '姓名',
	age int comment '年龄',
	gender varchar(1) comment '性别'
) comment '用户表';
```
## 二、数据类型
> MySQL中的数据类型有很多，主要分为三类：数值类型、字符串类型、日期时间类型。

### 1、数值类型
| 类型 | 大小 | 范围（有符号） | 范围（无符号） | 用途 |
| --- | --- | --- | --- | --- |
| TINYINT | 1 Bytes | (-128，127) | (0，255) | 小整数值 |
| SMALLINT | 2 Bytes | (-32 768，32 767) | (0，65 535) | 大整数值 |
| MEDIUMINT | 3 Bytes | (-8 388 608，8 388 607) | (0，16 777 215) | 大整数值 |
| INT或INTEGER | 4 Bytes | (-2 147 483 648，2 147 483 647) | (0，4 294 967 295) | 大整数值 |
| BIGINT | 8 Bytes | (-9,223,372,036,854,775,808，9 223 372 036 854 775 807) | (0，18 446 744 073 709 551 615) | 极大整数值 |
| FLOAT | 4 Bytes | (-3.402 823 466 E+38，-1.175 494 351 E-38)，0，(1.175 494 351 E-38，3.402 823 466 351 E+38) | 0，(1.175 494 351 E-38，3.402 823 466 E+38) | 单精度
浮点数值 |
| DOUBLE | 8 Bytes | (-1.797 693 134 862 315 7 E+308，-2.225 073 858 507 201 4 E-308)，0，(2.225 073 858 507 201 4 E-308，1.797 693 134 862 315 7 E+308) | 0，(2.225 073 858 507 201 4 E-308，1.797 693 134 862 315 7 E+308) | 双精度
浮点数值 |
| DECIMAL | 对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2 | 依赖于M和D的值 | 依赖于M和D的值 | 小数值 |

**例如：**
1）年龄字段 -- 不会出现负数, 而且人的年龄不会太大 
`age tinyint unsigned `
2）分数 -- 总分100分, 最多出现一位小数 
`score double(4,1)`
### 2、字符串类型
| 类型 | 大小 | 用途 |
| --- | --- | --- |
| CHAR | 0-255 bytes | 定长字符串 |
| VARCHAR | 0-65535 bytes | 变长字符串 |
| TINYBLOB | 0-255 bytes | 不超过 255 个字符的二进制字符串 |
| TINYTEXT | 0-255 bytes | 短文本字符串 |
| BLOB | 0-65 535 bytes | 二进制形式的长文本数据 |
| TEXT | 0-65 535 bytes | 长文本数据 |
| MEDIUMBLOB | 0-16 777 215 bytes | 二进制形式的中等长度文本数据 |
| MEDIUMTEXT | 0-16 777 215 bytes | 中等长度文本数据 |
| LONGBLOB | 0-4 294 967 295 bytes | 二进制形式的极大文本数据 |
| LONGTEXT | 0-4 294 967 295 bytes | 极大文本数据 |

**例如：** 
1）用户名 username ------> 长度不定, 最长不会超过50 
`username varchar(50) `
2） 性别 gender ---------> 存储值, 不是男,就是女 
`gender char(1)` 
3）手机号 phone --------> 固定长度为11 
`phone char(11)`
### 3、日期时间类型
| 类型 | 大小
( bytes) | 范围 | 格式 | 用途 |
| --- | --- | --- | --- | --- |
| DATE | 3 | 1000-01-01/9999-12-31 | YYYY-MM-DD | 日期值 |
| TIME | 3 | '-838:59:59'/'838:59:59' | HH:MM:SS | 时间值或持续时间 |
| YEAR | 1 | 1901/2155 | YYYY | 年份值 |
| DATETIME | 8 | '1000-01-01 00:00:00' 到 '9999-12-31 23:59:59' | YYYY-MM-DD hh:mm:ss | 混合日期和时间值 |
| TIMESTAMP | 4 | '1970-01-01 00:00:01' UTC 到 '2038-01-19 03:14:07' UTC
结束时间是第 **2147483647** 秒，北京时间 **2038-1-19 11:14:07**，格林尼治时间 2038年1月19日 凌晨 03:14:07 | YYYY-MM-DD hh:mm:ss | 混合日期和时间值，时间戳 |

1）生日字段 birthday 
`birthday date` 
2）创建时间 createtime 
`createtime datetime`
## 三、表操作-案例
### 设计一张员工信息表，要求如下： 
1. 编号（纯数字） 
2. 员工工号 (字符串类型，长度不超过10位) 
3. 员工姓名（字符串类型，长度不超过10位） 
4. 性别（男/女，存储一个汉字） 
5. 年龄（正常人年龄，不可能存储负数） 
6. 身份证号（二代身份证号均为18位，身份证中有X这样的字符） 
7. 入职时间（取值年月日即可）
### 对应的建表语句如下：
```sql
create table emp(
	id int comment '编号',
	workno varchar(10) comment '工号',
	name varchar(10) comment '姓名',
	gender char(1) comment '性别',
	age tinyint unsigned comment '年龄',
	idcard char(18) comment '身份证号',
	entrydate date comment '入职时间'
) comment '员工表';
```
## 四、表操作-修改
### 1、添加字段
```sql
ALTER TABLE 表名 ADD 字段名 类型 (长度) [ COMMENT 注释 ] [ 约束 ]; 
```
**案例**
> 为emp表增加一个新的字段”昵称”为nickname，类型为varchar(20)

```sql
ALTER TABLE emp ADD nickname varchar(20) COMMENT '昵称'; 
```
### 2、修改数据类型
```sql
ALTER TABLE 表名 MODIFY 字段名 新数据类型 (长度);
```
### 3、修改字段名和字段类型
```sql
ALTER TABLE 表名 CHANGE 旧字段名 新字段名 类型 (长度) [ COMMENT 注释 ] [ 约束 ];
```
**案例**
> 将emp表的nickname字段修改为username，类型为varchar(30)

```sql
ALTER TABLE emp CHANGE nickname username varchar(30) COMMENT '昵称';
```
### 4、删除字段
```sql
ALTER TABLE 表名 DROP 字段名;
```
**案例**
> 将emp表的字段username删除

```sql
ALTER TABLE emp DROP username;
```
### 5、修改表名
```sql
ALTER TABLE 表名 RENAME TO 新表名;
```
**案例**
> 将emp表的表名修改为 employee

```sql
ALTER TABLE emp RENAME TO employee;
```
## 五、表操作-删除
### 1、删除表 
```sql
DROP TABLE [ IF EXISTS ] 表名;
```
> 可选项 IF EXISTS 代表，只有表名存在时才会删除该表，表名不存在，则不执行删除操作(如果不 
> 加该参数项，删除一张不存在的表，执行将会报错)。 

**案例**
> 如果tb_user表存在，则删除tb_user表

```sql
DROP TABLE IF EXISTS tb_user;
```
### 2、删除指定表, 并重新创建表
```sql
TRUNCATE TABLE 表名;
```
