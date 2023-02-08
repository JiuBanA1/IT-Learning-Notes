## if 语句的语法

```java
if(布尔表达式){
    //如果布尔表达式为true将执行的语句
}
```

#### 示例：

```java
public class Test {
   public static void main(String args[]){
      int a = 1;
      if( a < 2 ){
         System.out.print("这是 if 语句");
      }
   }
}
```

## if...else多重选择结构语法

```java
if(布尔表达式){
   //如果布尔表达式的值为true
}else{
   //如果布尔表达式的值为false
}
```

#### 示例：

```java
public class Test {
   public static void main(String args[]){
      int a = 3;
      if( a < 2 ){
         System.out.print("这是 if 语句");
      }else{
         System.out.print("这是 else 语句");
      }
   }
}
```

## 嵌套 if 选择结构语法

```java
if(布尔表达式 1){
   	//如果布尔表达式 1的值为true执行代码
}else if(布尔表达式 2){
   	//如果布尔表达式 2的值为true执行代码
}else if(布尔表达式 3){
   	//如果布尔表达式 3的值为true执行代码
}else {
   	//如果以上布尔表达式都不为true执行代码
```

#### 示例：

```java
   public static void main(String args[]){
      int x = 3;
      int y = 1;
 
      if( x == 3 ){
         if( y == 1 ){
             System.out.print("X = 30 and Y = 10");
          }
       }
    }
```

## **switch case**语句语法

```java
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}
```

#### 这里的 expression 都支持哪些类型呢？
> -   基本数据类型：byte, short, char, int。
> -   字符串类型：String（Jdk 7+ 开始支持）。

#### 使用 switch case 语句也有以下几点需要注意。

> 1.  case 里面必须跟 break，不然程序会一个个执行下去，直到 case 或者 default 出现。
> 1.  case 条件里面只能是常量或者字面常量。
> 1.  default 语句可有可无，最多只能有一个。

#### 示例：

```java
System.out.print("请输入名次：");
String mC = input.next();
switch (mC) {
case "第一名": //情况
		System.out.println("参加麻省理工大学组织的1个月夏令营");
		break; //中断
case "第二名":
		System.out.println("奖励惠普笔记本电脑一部");
		break;
case "第三名":
		System.out.println("奖励移动硬盘一个");
		break;
default: //默认
		System.out.println("继续加油");
		break;
}
```
***
switch case 语句有如下规则：

 - switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch支持字符串 String 类型了，同时 case 标签必须为字符串常量或字面量。

 - switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。

 - case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。

 - 当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。

 - 当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。

 - switch 语句可以包含一个 default 分支，该分支一般是 switch 语句的最后一个分支（可以在任何位置，但建议在最后一个）。default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。
***
