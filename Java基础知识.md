## ![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/a4f3e4bfe812455082af2ee6c9dfcbb3~tplv-k3u1fbpfcp-zoom-1.image)

## Hello World

> public 访问修饰符 static 关键字 void 返回类型 String 类 args字符串数组

```
public class HelloWorld {
    /* 第一个Java程序
     * 它将输出字符串 Hello World
     */
    public static void main(String[] args) {
        System.out.println("Hello World"); // 输出 Hello World
    }
}
```

## 基础概念

> -   类：类是一个模板或蓝图，用来描述类的对象行为与状态。
> -   对象：对象具有状态和行为，它的状态有：颜色、名字；行为有：动、看、吃东西等，对象是类的实例。
> -   方法：方法就是行为，一个类可以有很多方法，逻辑运算、数据修改以及所有动作都是在方法中完成的。
> -   实例变量：每个对象都有变量，对象的状态由这些实例变量的值来决定。

## 驼峰命名法

> -   包名：多单词组成所有字每都小写：xxxyyyzzz
> -   类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
> -   变量名、方法名：多单词组成时，第一个首字母小写，第二个首字母后大写：xxxYyyZzz
> -   变量名：多单词组成时，所有字母都大写，单词之间用下划线连接：XXX_YYY_ZZZ

## Java注释

> 单行注释：“//”只能注释一行内容，用在注释信息内容少的地方。
> 
> 多行注释：“/*”和“*/”之间，注释多行内容。
> 
> 文档注释：“/**”和“*/”之间，注释多行内容，用来描述其作用。

## 注意事项

> -   **大小写**：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
> -   **源文件名**：源文件名必须和类名相同，当保存文件的时候应该使用类名作为文件名保存，文件名的后缀为 **.java**。
