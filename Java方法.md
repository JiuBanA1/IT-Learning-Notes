# Java 方法

在前面几个章节中我们经常使用到 **System.out.println()** ，那么它是什么呢？

-   println() 是一个方法。
-   System 是系统类。
-   out 是标准输出对象。

这句话的用法是调用系统类 System 中的标准输出对象 out 中的方法 println()。

### 那么什么是方法呢？

Java方法是语句的集合，它们在一起执行一个功能。

-   方法是解决一类问题的步骤的有序组合
-   方法包含于类或对象中
-   方法在程序中被创建，在其他地方被引用

### 方法的优点

-   1. 使程序变得更简短而清晰。
-   2. 有利于程序维护。
-   3. 可以提高程序开发的效率。
-   4. 提高了代码的重用性。

### 方法的命名规则

-   1.方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头写，不使用连接符。例如：addPerson。
-   2.下划线可能出现在 JUnit 测试方法名称中用以分隔名称的逻辑组件。一个典型的模式是：test<MethodUnderTest>_<state>，例如 testPop_emptyStack。

* * *

## 方法的定义

一般情况下，定义一个方法包含以下语法：

修饰符 返回值类型 方法名(参数类型 参数名){ ... 方法体 ... return 返回值; }

方法包含一个方法头和一个方法体。下面是一个方法的所有部分：

-   **修饰符：** 修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。
-   **返回值类型 ：** 方法可能会返回值。returnValueType 是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType 是关键字**void**。
-   **方法名：** 是方法的实际名称。方法名和参数表共同构成方法签名。
-   **参数类型：** 参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。
-   **方法体：** 方法体包含具体的语句，定义该方法的功能。

![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/b2bbcfff54fb4a7093ccffeb7d51d6e1~tplv-k3u1fbpfcp-zoom-1.image)

如：

public static int age(int birthday){...}

参数可以有多个：

static float interest(float principal, int year){...}

**注意：**  在一些其它语言中方法指过程和函数。一个返回非void类型返回值的方法称为函数；一个返回void类型返回值的方法叫做过程。

### 实例

下面的方法包含 2 个参数 num1 和 num2，它返回这两个参数的最大值。

/** 返回两个整型变量数据的较大值 */ public static int max(int num1, int num2) { int result; if (num1 > num2) result = num1; else result = num2; return result; }

更简略的写法（三元运算符）：

public static int max(int num1, int num2) { return num1 > num2 ? num1 : num2; }

* * *

## 方法调用

Java 支持两种调用方法的方式，根据方法是否返回值来选择。

当程序调用一个方法时，程序的控制权交给了被调用的方法。当被调用方法的返回语句执行或者到达方法体闭括号时候交还控制权给程序。

当方法返回一个值的时候，方法调用通常被当做一个值。例如：

int larger = max(30, 40);

如果方法返回值是void，方法调用一定是一条语句。例如，方法println返回void。下面的调用是个语句：

System.out.println("欢迎访问菜鸟教程！");

### 实例

下面的例子演示了如何定义一个方法，以及如何调用它：

## TestMax.java 文件代码：

public class TestMax { /** 主方法 */ public static void main(String[] args) { int i = 5; int j = 2; int k = max(i, j); System.out.println( i + " 和 " + j + " 比较，最大值是：" + k); } /** 返回两个整数变量较大的值 */ public static int max(int num1, int num2) { int result; if (num1 > num2) result = num1; else result = num2; return result; } }

以上实例编译运行结果如下：

```
5 和 2 比较，最大值是：5
```

这个程序包含 main 方法和 max 方法。main 方法是被 JVM 调用的，除此之外，main 方法和其它方法没什么区别。

main 方法的头部是不变的，如例子所示，带修饰符 public 和 static,返回 void 类型值，方法名字是 main,此外带个一个 String[] 类型参数。String[] 表明参数是字符串数组。

* * *

## void 关键字

本节说明如何声明和调用一个 void 方法。

下面的例子声明了一个名为 printGrade 的方法，并且调用它来打印给定的分数。

### 示例

## TestVoidMethod.java 文件代码：

public class TestVoidMethod { public static void main(String[] args) { printGrade(78.5); } public static void printGrade(double score) { if (score >= 90.0) { System.out.println('A'); } else if (score >= 80.0) { System.out.println('B'); } else if (score >= 70.0) { System.out.println('C'); } else if (score >= 60.0) { System.out.println('D'); } else { System.out.println('F'); } } }

以上实例编译运行结果如下：

```
C
```
