## 一、什么是多重选择结构？
> 多重选择结构是一种程序控制结构，它允许程序在多个条件之间进行选择，并执行相应的操作。它使用一系列的if-else语句，以及一个或多个switch语句，以便在多个条件之间进行选择。

## 二、if 语句的语法
#### 1、什么是嵌套if语句？
> 嵌套if语句是一种程序控制结构，它允许程序在多个条件之间进行选择，并执行相应的操作。它使用一系列的if-else语句，以及一个或多个嵌套if语句，以便在多个条件之间进行选择。

#### 2、if 语句循环基本用法：
> if(布尔表达式){}

#### 3、案例：
```java
public class Test {
   public static void main(String args[]){
      int a = 1;
      if( a < 2 ){
         System.out.print("if");
      }
   }
}
```
## 二、if...else多重选择结构语法
#### 1、什么是if-else语句？
> if-else语句是一种条件语句，它允许程序在满足特定条件时执行一系列操作，否则执行另一系列操作。它使用一个if语句来检查条件，如果条件为真，则执行一系列操作，否则执行另一系列操作。

#### 2、if...else 循环基本用法：
> if(布尔表达式){
>    // 如果布尔表达式的值为true
> }else{
>    // 如果布尔表达式的值为false
> }

#### 3、案例：
```java
public class Test {
   public static void main(String args[]){
      int a = 3;
      if( a < 2 ){
         System.out.print("if");
      }else{
         System.out.print("else");
      }
   }
}
```
## 三、嵌套 if 选择结构语法
#### 1、嵌套if 循环基本用法：
> if(布尔表达式 1){
>    	// 布尔表达式1，执行代码
> }else if(布尔表达式 2){
>    	// 布尔表达式 2，执行代码
> }else {
>    	// 布尔表达式都不为true，执行代码

#### 2、案例：
```java
public static void main(String args[]){
      int x = 1;
      int y = 2;
      if(x==1){
          System.out.println("true");
	  }else if(y==2){
          System.out.println("true");
	  }else {
          System.out.println("true");
      }
}
```
## **四、switch case**语句语法
#### 1、什么是switch语句？
> switch语句是一种条件语句，它允许程序在多个条件之间进行选择，并执行相应的操作。它使用一系列的case语句，以及一个或多个switch语句，以便在多个条件之间进行选择。

#### 2、switch case 循环基本用法：
> switch(expression){
>     case value :	// 条件
>        // 语句
>        break;	// 中断
> 
>     default : 	// 结束
>        //.......
>       break;
> }

#### 3、这里的 switch 都支持哪些类型呢？
> - 基本数据类型：byte, short, char, int。
> - 字符串类型：String（Jdk 7+ 开始支持）。

#### 4、使用 switch case 语句也有以下几点需要注意。
> 1. case 里面必须跟 break，不然程序会一个个执行下去，直到 case 或者 default 出现。
> 2. case 条件里面只能是常量或者字面常量。
> 3. default 语句可有可无，最多只能有一个。

#### 5、案例：
```java
System.out.print("请输入名次：");
String mC = input.next();
switch (mC) {
case "第一名": 
		System.out.println("参加麻省理工大学组织的1个月夏令营");
		break; 
case "第二名":
		System.out.println("奖励惠普笔记本电脑一部");
		break;
case "第三名":
		System.out.println("奖励移动硬盘一个");
		break;
default: 
		System.out.println("继续加油");
		break;
}
```
## 五、嵌套switch语句
#### 1、什么是嵌套switch语句？
> 嵌套switch语句是一种多层switch语句，它允许在一个switch语句中嵌套另一个switch语句，以便在某些情况下执行不同的操作。

#### 2、嵌套switch语法的基本结构如下：
```java
switch (condition) {
  case 1:
    switch (innerCondition) {
      case 1:
        // code block
        break;
      case 2:
        // code block
        break;
      default:
        // code block
        break;
    }
    break;
  case 2:
    // code block
    break;
  default:
    // code block
    break;
}

```
## 六、多重选择结构的优点？
> 多重选择结构的优点包括：1）它可以提供多个选择，从而使程序更加灵活；2）它可以提供更多的控制，从而使程序更加精确；3）它可以提供更多的可读性，从而使程序更加易于理解和维护。

## 七、多重选择结构的缺点？
> 多重选择结构的缺点包括：1）它可能会使程序变得复杂，从而使程序变得难以理解和维护；2）它可能会增加程序的运行时间，从而使程序变得更加低效；3）它可能会增加程序的内存占用，从而使程序变得更加低效。

