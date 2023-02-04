## Java程序它的基本结构是什么？

> 我们先剖析一个完整的Java程序，看看它的基本结构是什么：

```java
public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    }
}
```

## 创建类
> 
> 因为是面向对象的语言，一个程序的基本单位就是“**class 类”** ，class是关键字，这里定义的class名字就是**HelloWorld**。
> 
> 类名：多单词组成时，所有单词的首字母大写：XxxYyyZzz。

```java
public class HelloWorld { // 类名是 HelloWorld
    // ...
}
```

## 定义main方法

> Java 程序由 **public static void main(String[] args)** 方法开始执行。

```java
public class HelloWorld {
    public static void main(String[] args) {  // main方法
        // ...
    }
}
```

## 执行代码输出语句

> System.out.println("Hello World"); 输出语句。

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    }
}
```

## Java中的类


让我们深入了解什么是类，看看周围真实的世界，会发现身边有很多类，例如小猫等等，这些类都有自己的模板或蓝图。

类是相关属性和行为的集合，可以看成是一类事物的模板。

举例：小猫。

属性：名字、体重、年龄、颜色。 行为：走、跑、叫。


## Java中的对象


让我们深入了解什么是对象，看看周围真实的世界，会发现身边有很多对象，例如小猫等等，这些对象都有自己的属性和行为。

对象是一类事物的具体体现，对象是类的一个实例，必然具备该类事物的属性和行为。

举例：一只小猫。

属性：黑、活泼、爱睡觉； 行为：蹦跶的跑、喵喵叫。


## 类与对象的关系

类是对一类事物的描述，是抽象的；对象是一类事物的实例，是具体的；类是对象的模板，对象是类的实体。
