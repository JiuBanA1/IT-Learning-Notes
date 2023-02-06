## 前言
> Java中有三种主要的循环结构、while 循环、do…while 循环、for 循环。

## 一、while 循环
> while循环基本用法：
```java
while (条件表达式) {
    	// 循环语句
}
```
> 实例：计算从1到100的和：（1 + 2 + 3 + 4 + … + 100 = ?）
```java
  public static void main(String[] args) {
           int sum = 0;              	// 初始化为0
           int i = 1;
           while (i <= 100) {      	// 循环条件是a <= 100
               sum = sum + i;          	// 把a累加到b中
               i++;               	// a自身加1
           }
        System.out.println("1加到100的和是：" + sum);
        System.out.println("循环后变量i的值是：" + i);
    }
```
## 二、do…while 循环
> do…while 循环基本用法：
```java
do {
    执行循环语句
} while (条件表达式);
```
> 实例：计算从1到100的和：（1 + 2 + 3 + 4 + … + 100 = ?）
```java
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= 100);
        System.out.println("1加到100的和是：" + sum);
        System.out.println("循环后变量i的值是：" + i);
    }
```
## 三、for 循环
> for 循环基本用法：
```java
for (初始条件; 循环检测条件; 更新) {
    // 执行语句
}
```
> 实例：计算从1到100的和：（1 + 2 + 3 + 4 + … + 100 = ?）
```java
public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("1加到100的和是：" + sum);
    }
```
## 四、do-while循环、for循环、while循环的区别是什么？
> 初始化变量，for循环当中定义的初始化变量，只有自己才能用；while和do-while循环，初始化变量本来就在外面，所以外面也照样可以使用。

> 执行次数，for循环和while循环是【先判断后执行】，但是do-while循环是【先执行后判断】。

## 五、break与continue
> break 中断（结束循环）, continue 继续（结束本次循环，继续下一次循环）
```java
for (int i = 1; i <= 5; i++) {
		if (i == 3) {
			break; 			//结束循环
		}
			System.out.print(i);    //12
		}
```
```java
for (int i = 1; i <= 5; i++) {
		if (i == 3) {
			continue; 		//结束本次循环，继续下一次循环
		}
			System.out.print(i);    //1245
		}
```
