## 一、变量

### 1、什么是变量？

> 变量分为两种：基本类型的变量、引用类型的变量

### 2、基本类型的变量

> 变量须先定义后使用，在定义变量的时候，可以给它一个初始值，例如：`int a = 1;`

> 定义了一个整型int类型的变量，名称为a，初始值为1，不写初始值，就相当于默认值，默认值是0。

```java
// 注意：等号“=”是赋值语句，不是数学意义上的相等

public class Text{
    public static void main(String[] args) {
        int a=1; 				// 定义int类型变量a，并赋予初始值1
        System.out.println(a); 	                // 打印该变量的值
    }
}
```

> 变量的重要特点是可以重新赋值，例如：对变量a，先赋值1，再赋值2，观察两次打印的结果。

```java
public class Text {
    public static void main(String[] args) {
        int a = 1; 				// 定义int类型变量a，并赋予初始值1
        System.out.println(a); 	                // 打印该变量的值
        a = 2; 					// 重新赋值为2
        System.out.println(a);           	// 打印该变量的值
    }
}
```

> 变量不但可以重新赋值，还可以赋值给其他变量。

```java
public class Text {
    public static void main(String[] args) {
        int a = 1; 				// 定义int类型变量a，并赋予初始值1
        System.out.println(a); 	                // 打印该变量的值
        a = 2; 					// 重新赋值为2
        System.out.println(a); 	                // 打印该变量的值
        int n=a;			        // 定义int类型变量n，并赋予初始值a
        System.out.println(n);                  // 打印该变量的值
    } 
}
```

## 基本数据类型
> 
> Java语言提供了八种基本数据类型，六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
> 
| **基本数据类型**   | **默认值**  | **大小（字节）** | **取值范围**      | **示例**          |
| ------------ | -------- | ---------- | ------------- | --------------- |
| byte（位）      | 0        | 1          | -2^7—2^7-1   | byte a=10;      |
| boolean（布尔值） | false    | 1          | true/false    | boolean b=true; |
| char（字符）     | '\u0000' | 2          | 0—2^16-1      | char c='c'      |
| short（短整数）   | 0        | 2          | -2^15—2^15-1 | short d=10;     |
| int（整数）      | 0        | 4          | -2^31—2^31-1 | int e=10;       |
| long（长整数）    | 0        | 8          | -2^63—2^63-1 | long f=10L;     |
| float（单精度）   | 0.0f     | 4          | -2^31—2^31-1 | float g=10.0F;  |
| double（双精度）  | 0.0d     | 8          | -2^63—2^63-1 | double h=10.0;  |

## 布尔值

> 布尔类型使用boolean关键字声明，并且只能是true或false：

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);     // 输出 true
System.out.println(isFishTasty);   // 输出 false
```

> 可以使用比较运算符，例如，大于(> )运算符来查找表达式（或变量）是否为真：

```java
int x = 10;
int y = 9;
System.out.println(x > y); // 返回true，因为10比9大
```

## 字符串

> String表示字符串类型，属于引用数据类型，不属于基本数据类型。

```java
String s1 = "javaEE";
String s2 = "javaEE";
```

## 变量值互换

> 注意：代码是从右向左赋值

```java
int num1 = 19;
int num2 = 89;
int temp;
temp = num1;
num1 = num2;
num2 = temp;
System.out.println(num1 + "," + num2+","+temp);
```

## 从控制台输入

```java
先导入java.util包，语法：import java.util.Scanner;

	第一步 创建从控制台输入对象
	Scanner input = new Scanner(System.in);

	第二步 提示语句
	System.out.println("请输入你的年龄");

	第三步 接受控制台的变量
	int age = input.nextInt();

	第四步 输出或使用
	System.out.println("我的年龄是:"+age);

	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的体重");
	double weight = input.nextDouble();
	System.out.println("我的体重是：" + weight);

	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的姓名");
	String name = input.next();
	System.out.println("我的名字是：" + name);

	Scanner input = new Scanner(System.in);
	System.out.println("请输入你的性别");
	char sex = input.next().charAt(0); 
	System.out.println("我的性别是：" + sex);
```
