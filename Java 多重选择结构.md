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
