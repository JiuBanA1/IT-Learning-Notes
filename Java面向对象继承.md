## 继承的概念
继承是面向对象编程中的一个概念，它允许一个类（称为子类或派生类）继承另一个类（称为父类或基类）的属性和方法。子类在继承父类的同时也可以添加自己的属性和方法，从而实现代码的复用和扩展。继承是面向对象编程的三大特征之一，其他两个分别是封装和多态。
## 继承的作用
1.提高代码的复用性：通过继承，子类可以直接使用父类的属性和方法，不需要重复定义。
2.便于代码的扩展：通过在子类中添加新的属性和方法，实现了代码的扩展。
3.提高代码的可维护性：将公共的属性和方法放在父类中，可以减少重复的代码，从而方便代码维护和升级。
## 继承关键字
### extends关键字
在 Java 中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类。
### implements关键字
使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口（接口跟接口之间采用逗号分隔）。
### super 与 this 关键字
super关键字：对父类成员的访问；this关键字：调用自己的方法。
## 继承类型
```java
//extends 单继承
public class A{......}
public class B extends A{......}

//extends 多重继承
public class A{......}
public class B extends A{......}
public class C extends B{......}

//extends 不同类继承同一个类
public class B extends  A{......}
public class C extends A{......}

//implements 多继承
public interface A {......}
public interface B {......} 
public class C implements A,B {......}
```
## 类的继承格式
在 Java 中通过 extends 关键字可以申明一个类是从另外一个类继承而来的，一般形式如下：
```java
class 父类 {
}
 
class 子类 extends 父类 {
}
```
实例
```java
// 父类 Animal
class Animal{
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }
}

// 子类 Dog 继承自 Animal
class Dog extends Animal {
    public void bark() {
        System.out.println(name + "正在叫");
    }
}

public class Test {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.setName("旺财"); // 设置狗的名字为旺财
        dog.eat(); // 继承自父类 Animal，输出：旺财正在吃
        dog.bark(); // 子类添加的方法，输出：旺财正在叫
    }
}

```
