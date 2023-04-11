## 一、什么是 Java Scanner 类？
> Java Scanner 类是 Java 中一个用于读取用户输入的类，它可以从标准输入、文件、字符串等多种输入源中读取数据，并将数据转换为 Java 中的各种数据类型。

## 二、引用数据类型
> 我们要学的Scanner类是属于引用数据类型，先了解下引用数据类型。

#### 1、引用数据类型的定义
> 引用数据类型与定义基本数据类型变量不同，引用数据类型的变量定义及赋值有相对固定的步骤或格式：

`数据类型  变量名  =  new 数据类型();`
`Scanner input = new Scanner(System.in);`
> 每种引用数据类型都有其功能，可以调用该类型实例的功能。

`变量名.方法名();`
## 三、Scanner 类有哪些常用方法？
> 先导入java.util包，语法：import java.util.Scanner;
> 第一步 创建从控制台输入对象
> 第二步 提示语句
> 第三步 接受控制台的变量
> 第四步 输出或使用

```java
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入你的年龄");
        int age = input.nextInt();		\\从输入流中读取一个整数
        System.out.println("我的年龄是:" + age);

        System.out.println("请输入你的体重");
        double weight = input.nextDouble();	\\从输入流中读取一个双精度浮点数。
        System.out.println("我的体重是：" + weight);

        System.out.println("请输入你的姓名");
        String name = input.next();		\\从输入流中读取一个字符串。
        System.out.println("我的名字是：" + name);

        System.out.println("请输入你的性别");
        char sex = input.next().charAt(0); \\从输入流中读取一个字符
        System.out.println("我的性别是：" + sex);
    }
}
```
#### hasNext()用法
> Scanner 类的 **hasNext()** 方法用于检查输入流中是否还有数据可以读取。该方法返回一个 boolean 值，如果还有数据可以读取，则返回 true；否则返回 false。

```java
Scanner scanner = new Scanner(System.in);

while (scanner.hasNext()) {
    String line = scanner.nextLine();
    System.out.println("输入的内容是：" + line);
}
```
## 四、next() 与 nextLine() 区别
#### next():
> 1、一定要读取到有效字符后才可以结束输入。
> 2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
> 3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
> next() 不能得到带有空格的字符串。

#### nextLine()：
> 1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
> 2、可以获得空白。

## 五、使用 next 方法
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串: ");
        String str = scanner.next();		//next
        System.out.println("你输入的字符串是：" + str);
    }
}
```
## 六、使用 nextLine方法
```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一行字符串: ");
        String str = scanner.nextLine();    //nextLine
        System.out.println("你输入的字符串是：" + str);
    }
}
```
