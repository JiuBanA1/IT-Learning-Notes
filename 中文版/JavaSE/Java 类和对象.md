## 一、驼峰命名法
> - 包名：多单词组成所有字每都小写：xxxyyyzzz
> - 类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
> - 变量名、方法名：多单词组成时，第一个首字母小写，第二个首字母后大写：xxxYyyZzz
> - 变量名：多单词组成时，所有字母都大写，单词之间用下划线连接：XXX_YYY_ZZZ

## 二、Java注释
> 单行注释：“//”只能注释一行内容，用在注释信息内容少的地方。
> 多行注释：“/*”和“*/”之间，注释多行内容。
> 文档注释：“/**”和“*/”之间，注释多行内容，用来描述其作用。

## 三、转义符
| **转义符** | **转义符** |
| --- | --- |
| ln 换行，跟在 print 后 | 例如：println |
| \\n 换行，放在双引号中 | System.out.print("张三\\n"); |
| \\t 空格，水平制表符 | System.out.print("来自\\t中国\\n"); |

## 四、Java程序它的基本结构是什么？
> 创建包：package 包名；

> 类：访问修饰符 class 类名；

> 方法：访问修饰符 返回值类型 void 空 方法名() {}

```java
package comhellowww;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); 
    }
}
```
## 五、Java中的类
让我们深入了解什么是类，看看周围真实的世界，会发现身边有很多类，例如小猫等等，这些类都有自己的模板或蓝图。
类是相关属性和行为的集合，可以看成是一类事物的模板。
举例：小猫。
属性：名字、体重、年龄、颜色。 行为：走、跑、叫。
## 六、创建类
> 因为是面向对象的语言，一个程序的基本单位就是“**class 类”**，class是关键字，这里定义的class名字就是**HelloWorld**。

```java
public class HelloWorld { 
    // ...
}
```
## 七、定义main方法
> Java 程序由 **public static void main(String[] args)** 方法开始执行。

```java
public class HelloWorld {
    public static void main(String[] args) {  
        // ...
    }
}
```
## 八、执行代码输出语句
> System.out.println("Hello World"); 输出语句。

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); 
    }
}
```
## 九、Java中的对象
让我们深入了解什么是对象，看看周围真实的世界，会发现身边有很多对象，例如小猫等等，这些对象都有自己的属性和行为。
对象是一类事物的具体体现，对象是类的一个实例，必然具备该类事物的属性和行为。
举例：一只小猫。
属性：黑、活泼、爱睡觉； 行为：蹦跶的跑、喵喵叫。
## 十、创建对象
> 创建对象：类名 对象名 = new 类名();

```java
public static void main(String[] args) {
    Admin a = new Admin();
    a.name = "Admin1";
    a.password = "111111";
    a.show();
}
```
> 在另一个类中，定义属性

```java
public static class Admin {
    String name;
    String password;
```
> 创建方法

```java
public static class Admin {
    String name;
    String password;
    public void show(){
        System.out.println("name:"+name+"\tpassword:"+password);
    }
}
```
> 结果

```java
package comAdminwww;

public class TestAdmin {
    
    public static void main(String[] args) {
        Admin a = new Admin();
        a.name = "Admin1";
        a.password = "111111";
        a.show();
    }
    
public static class Admin {
        String name;
        String password;
        public void show(){
            System.out.println("name:"+name+"\tpassword:"+password);
        }
    }
}
```
## 十一、类与对象的关系
> 类是一种抽象概念，它描述了一组具有相同属性和行为的对象的集合；对象是类的实例，它们具有类定义的属性和行为；类是对象的模板，而对象是类的实例。



