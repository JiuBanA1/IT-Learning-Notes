## 一、什么是Java中的String类？
> String类是Java中表示字符串的类。它是不可变的，一旦创建了一个字符串对象，就无法修改它。

## 二、String类和StringBuilder类有什么区别？
> String类和StringBuilder类的最主要区别在于可变性。String类是不可变的，一旦创建了一个字符串对象，就无法修改它。而StringBuilder类是可变的，可以在缓冲区中修改字符串，而不必创建新的对象。

> 另一个区别在于性能。由于String类是不可变的，对字符串进行操作时需要创建新的字符串对象，这可能会导致性能问题。StringBuilder类是可变的，可以避免这种问题，因此它的性能比String类更好。

## 三、String类和StringBuffer类有什么区别？
> String类和StringBuffer类的最主要区别在于可变性。String类是不可变的，一旦创建了一个字符串对象，就无法修改它。而StringBuffer类是可变的，可以在缓冲区中修改字符串，而不必创建新的对象。

> 另一个区别在于线程安全性。StringBuffer是线程安全的，因为它的所有公共方法都是同步的，而String类和StringBuilder类是非线程安全的，因为它们的方法没有同步。

## 四、String类有哪些常用的方法？
#### 1、String类有许多常用的方法，包括：
> charAt(int index)：返回指定索引处的字符。
> length()：返回字符串的长度。
> substring(int beginIndex, int endIndex)：返回一个新字符串，它是原字符串的一个子串。
> indexOf(String str)：返回指定子字符串在此字符串中第一次出现的索引。
> equals(Object obj)：将此字符串与指定对象进行比较。
> toUpperCase()：将字符串转换为大写字母。
> toLowerCase()：将字符串转换为小写字母。
> trim()：返回字符串的副本，忽略前导空白和尾部空白。

#### 2、如何将一个整数转换为字符串？
可以使用Integer类的toString()方法将一个整数转换为字符串
例如：
```java
int i = 123;
String s = Integer.toString(i);
```
#### 3、如何将一个字符串转换为整数？
可以使用Integer类的parseInt()方法将一个字符串转换为整数
例如：
```java
String s = "123";
int i = Integer.parseInt(s);
```
