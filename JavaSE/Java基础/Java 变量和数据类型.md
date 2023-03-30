## 一、什么是变量？
> 变量是一种存储值的容器，它可以在程序的不同部分之间共享；变量可以存储数字、字符串、布尔值或其他类型的数据。

## 二、变量
> [数据类型] [变量名] = [初始值]；例如：`int a = 1; `

> 定义了一个整型int类型的变量，名称为a初始值为1，不写初始值默认是0。

```java
public class Text{
    public static void main(String[] args) {
        int a=1; 				
        System.out.println(a); 
    }
}
```
> 变量的重要特点是可以重新赋值

> 例如：对变量a，先赋值1，再赋值2

```java
public class Text {
    public static void main(String[] args) {
        int a = 1; 				
        System.out.println(a); 	
        a = 2; 					
        System.out.println(a); 
    }
}
```
> 变量不但可以重新赋值，还可以赋值给其他变量。

> 定义int类型变量n，并赋予初始值a

```java
public class Text {
    public static void main(String[] args) {
        int a = 1; 				
        System.out.println(a); 	
        a = 2; 					
        System.out.println(a); 	
        int n=a;			    
        System.out.println(n); 
    } 
}
```
#### 变量值互换
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
## 三、基本数据类型
#### 1、八种基本数据类型
| **基本数据类型** | **默认值** | **大小（字节）** | **取值范围** | **示例** |
| --- | --- | --- | --- | --- |
| byte（位） | 0 | 1 | -2^7—2^7-1 | byte a=10; |
| boolean（布尔值） | false | 1 | true/false | boolean b=true; |
| char（字符） | '\\u0000' | 2 | 0—2^16-1 | char c='c' |
| short（短整数） | 0 | 2 | -2^15—2^15-1 | short d=10; |
| int（整数） | 0 | 4 | -2^31—2^31-1 | int e=10; |
| long（长整数） | 0 | 8 | -2^63—2^63-1 | long f=10L; |
| float（单精度） | 0.0f | 4 | -2^31—2^31-1 | float g=10.0F; |
| double（双精度） | 0.0d | 8 | -2^63—2^63-1 | double h=10.0; |

#### 2、布尔值
> 布尔类型使用boolean关键字声明，并且只能是true或false：

```java
boolean isJavaFun = true;
boolean isFishTasty = false;
System.out.println(isJavaFun);    
System.out.println(isFishTasty);   
```
> 可以使用比较运算符，例如，大于（> ）运算符来查找表达式（或变量）是否为真：

```java
int x = 10;
int y = 9;
System.out.println(x > y); 
```
#### 3、字符串
> String表示字符串类型，属于引用数据类型，不属于基本数据类型。

```java
String s1 = "javaEE";
String s2 = "javaEE";
```
