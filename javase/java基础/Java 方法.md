## 一、什么是方法呢？
> 1. Java方法是语句的集合，它们在一起执行一个功能。
> 2. 方法是解决一类问题的步骤的有序组合。
> 3. 方法包含于类或对象中。
> 4. 方法在程序中被创建，在其他地方被引用。

## 二、方法的优点
> 1. 使程序变得更简短而清晰。
> 2. 有利于程序维护。
> 3. 可以提高程序开发的效率。
> 4. 提高了代码的重用性。

## 三、带返回值方法定义
语法：
```java
修饰符 返回值类型 方法名(参数类型 参数名){
    return 数据;
}
```
示例：
```java
public String play() {
	String ball = "球";
	return ball;
    //或 return "球";
}

```
> 注意事项：方法定义时return后面的返回值与方法定义上的数据类型要匹配，否者程序将报错！

## 四、带返回值方法调用
语法：
```java
数据类型 变量名 = 方法名(参数)
```
示例：
```java
public void run() {
		String aOne = play();
		System.out.println("这头狮子还在玩" + aOne);
}
```
> 注意事项：方法的返回值通常会使用变量接收，否则该返回值将意义！

## 五、结果示例
```java
public class Lion {
    public String play() {
        String ball = "球";
        return ball;
        //或 return "球";
    }

    public void run() {
        String aOne = play();
        System.out.println("狮子在玩" + aOne);
    }
}

class LionOne {
    public static void main(String[] args) {
        Lion bOne = new Lion();
        bOne.run();
    }
}
```
