![微信图片_20230317085809.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679015146515-3bb42d18-6e9a-4f2f-9a22-dd04e0a5df26.jpeg#averageHue=%23fefbf6&clientId=u23e80d5a-c285-4&from=paste&height=448&id=uddc3e3a0&originHeight=672&originWidth=1104&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=31216&status=done&style=none&taskId=u0f3423e3-7cf1-4a64-b751-40413efaba4&title=&width=736)
## 1、非空约束
限定某个字段/某列的值不允许为空，空字符串’'不等于NULL，0也不等于NULL
```sql
CREATE TABLE 表名称( 
	字段名 数据类型, 
	字段名 数据类型 NOT NULL, 
	字段名 数据类型 NOT NULL 
);
#添加not null
ALTER TABLE 表名称 MODIFY 字段名 数据类型 NOT NULL;

#去掉not null，相当于修改某个非注解字段，该字段允许为空
ALTER TABLE 表名称 MODIFY 字段名 数据类型
```
## 2、 唯一约束
用来限制某个字段/某列的值不能重复

- 同一个表可以有多个唯一约束
- 唯一约束可以是某一个列的值唯一，也可以多个列组合的值唯一。
- 唯一性约束允许列值为空。
- 在创建唯一约束的时候，如果不给唯一约束命名，就默认和列名相同。
- MySQL会给唯一约束的列上默认创建一个唯一索引。
```sql
CREATE TABLE 表名称(
	字段名 数据类型, 字段名 数据类型 UNIQUE, 
	字段名 数据类型 UNIQUE KEY, 字段名 数据类型 
);
CREATE TABLE 表名称( 
	字段名 数据类型, 
	字段名 数据类型, 
	字段名 数据类型, 
	[CONSTRAINT 约束名] UNIQUE KEY(字段名) 
);
# 指定唯一键约束
# 方式一：
ALTER TABLE 表名称 ADD UNIQUE KEY(字段列表);
# 方式二：
ALTER TABLE 表名称 MODIFY 字段名 字段类型 UNIQUE;
```
## 3、主键约束
用来唯一标识表中的一行记录

- 主键约束相当于唯一约束+非空约束的组合，主键约束列不允许重复，也不允许出现空值
- 一个表最多只能有一个主键约束
- 主键约束对应着表中的一列或者多列
- 如果是多列组合的复合主键约束，那么这些列都不允许为空值，并且组合的值不允许重复
- 当创建主键约束时，系统默认会在所在的列或列组合上建立对应的主键索引
```sql
CREATE TABLE 表名称( 
	字段名 数据类型 PRIMARY KEY, #列级模式 
	字段名 数据类型, 
	字段名 数据类型 
);
CREATE TABLE 表名称( 
	字段名 数据类型, 
	字段名 数据类型, 
	字段名 数据类型, 
	[CONSTRAINT 约束名] PRIMARY KEY(字段名) #表级模式 
);

ALTER TABLE 表名称 ADD PRIMARY KEY(字段列表); #字段列表可以是一个字段，也可以是多个字段，如果是多 个字段的话，是复合主键
ALTER TABLE 表名称 ADD PRIMARY KEY(字段名1,字段名2);
```
## 4、自增长约束
某个字段的值自增

- 一个表最多只能有一个自增长列
- 当需要产生唯一标识符或顺序值时，可设置自增长
- 自增长列约束的列必须是键列（主键列，唯一键列）
- 自增约束的列的数据类型必须是整数类型
```sql
-- 建表
CREATE TABLE 表名称( 
	字段名 数据类型 PRIMARY KEY AUTO_INCREMENT,
	字段名 数据类型 UNIQUE KEY not null,
	字段名 数据类型 UNIQUE KEY,
	字段名 数据类型 NOT NULL DEFAULT 默认值
);
CREATE TABLE 表名称( 
	字段名 数据类型 DEFAULT 默认值 ,
	字段名 数据类型 UNIQUE KEY AUTO_INCREMENT,
	字段名 数据类型 NOT NULL DEFAULT 默认值,
	PRIMARY KEY(字段名) 
);
-- 增加自增约束
ALTER TABLE 表名称 MODIFY 字段名 数据类型 AUTO_INCREMENT;
-- 删除自增约束，去掉auto_increment相当于删除
ALTER TABLE 表名称 MODIFY 字段名 数据类型; 

```
## 5、外键约束
限定某个表的某个字段的引用完整性

- 从表的外键列，必须引用/参考主表的主键或唯一约束的列
- 在创建外键约束时，如果不给外键约束命名，默认名不是列名，而是自动产生一个外键名（例如student_ibfk_1;），也可以指定外键约束名。
- 创建(CREATE)表时就指定外键约束的话，先创建主表，再创建从表
- 删表时，先删从表（或先删除外键约束），再删除主表
- 从表的外键列与主表被参照的列名字可以不相同，但是数据类型必须一样，逻辑意义一致
- 在“从表”中指定外键约束，并且一个表可以建立多个外键约束
- 当创建外键约束时，系统默认会在所在的列上建立对应的普通索引，索引名是外键的约束名，删除外键约束后，必须手动删除对应的索引
```sql
CREATE TABLE 主表名称( 
字段1 数据类型 PRIMARY KEY, 
字段2 数据类型 
);
CREATE TABLE 从表名称( 
字段1 数据类型 PRIMARY KEY, 
字段2 数据类型, 
[CONSTRAINT <外键约束名称>] FOREIGN KEY（从表的某个字段) REFERENCES 主表名(被参考字段) 
);
#(从表的某个字段)的数据类型必须与主表名(被参考字段)的数据类型一致，逻辑意义也一样 
#(从表的某个字段)的字段名可以与主表名(被参考字段)的字段名一样，也可以不一样
-- FOREIGN KEY: 在表级指定子表中的列
-- REFERENCES: 标示在父表中的列
```
### 约束等级

- Cascade方式：在父表上update/delete记录时，同步update/delete掉子表的匹配记录
- Set null方式：在父表上update/delete记录时，将子表上匹配记录的列设为null，但是要注意子表的外键列不能为not null
- No action方式：如果子表中有匹配的记录，则不允许对父表对应候选键进行update/delete操作
- Restrict方式：同no action， 都是立即检查外键约束（如果没有指定等级，就相当于Restrict方式。）
- Set default方式：父表有变更时，子表将外键列设置成一个默认的值，但Innodb不能识别
## 6、默认值约束
给某个字段/某列指定默认值，一旦设置默认值，在插入数据时，如果此字段没有显式赋值，则赋值为默
认值。
说明：默认值约束一般不在唯一键和主键列上加
```sql
CREATE TABLE 表名称( 
	字段名 数据类型 PRIMARY KEY, 
	字段名 数据类型 UNIQUE KEY NOT NULL, 
	字段名 数据类型 UNIQUE KEY, 
	字段名 数据类型 NOT NULL DEFAULT 默认值, 
);
# 在给某个字段加非空约束也一样，如果这个字段原来有默认值约束，你想保留，也要在modify语句中保留默 认值约束，否则就删除了
ALTER TABLE 表名称 MODIFY 字段名 数据类型 DEFAULT 默认值;
ALTER TABLE 表名称 MODIFY 字段名 数据类型 DEFAULT 默认值 NOT NULL;

```
