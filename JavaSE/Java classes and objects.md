## I. Camel naming method
> - Package name: consists of multiple words. Each word is lowercase: xxxyyyzzz 
> - class name and interface name: when multiple words are composed, the first letter of all words is uppercase: XxxYyyZzz 
> - variable name and method name: when multiple words are composed, the first letter is lowercase, and the second letter is uppercase: xxxYyyZzz 
> - variable name: when multiple words are composed, all the letters are uppercase, and the words are underlined: XXX_YYY_ZZZ

## II. Java annotations 
> single-line comment: "//" can only comment on one line, which is used where the comment information is small. 
> Multi-line comment: comment between "/*" and. 
> Document comment: comment multiple lines between "/** "and, used to describe its function.

## III, escape character
| **Escape character ** | **escape character ** |
| --- | --- |
| ln line breaks, followed by print  | for example, println  |
| \\n line feed, put it in double quotation marks  | system.out.print("zhang san");  |
| space, horizontal tab  | system.out.print("from China"); |

## IV. What is the basic structure of a Java program?
> Create a package: package the package name; 

> class: access modifier class name; 

> method: access modifier return value type void method name () {}

```java
package comhellowww;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); 
    }
}
```
## V. Classes in Java
Let's have a deep understanding of what classes are and look at the real world around us. We will find that there are many classes around us, such as kitten and so on. These classes all have their own template or blueprint. 
A class is a collection of related attributes and behaviors and can be regarded as a template for a class of things. 
Example: kitten. 
Attributes: name, weight, age, color. Behavior: walk, run, and scream.
## VI. Create a class
> Because it is an object-oriented language, the basic unit of a program is" **class" **, class is a keyword, defined here class the name is **HelloWorld **.

```java
public class HelloWorld { 
    // ...
}
```
## VII. Define the main methods 
> Java program **public static void main(String[] args) **the method starts.

```java
public class HelloWorld {
    public static void main(String[] args) {  
        // ...
    }
}
```
## VIII. Execute the code output statement
> System.out.println("Hello World");The output statement.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); 
    }
}
```
## VIII. Objects in Java
Let's have a deep understanding of what objects are and look at the real world around us. We will find that there are many objects around us, such as kitten and so on. These objects all have their own properties and behavior. 
An object is the concrete embodiment of a class of things. An object is an instance of a class and must have the attributes and behaviors of such things. 
Example: a kitten. 
Attributes: black, lively, and sleepy; Behavior: running and meow.
## X. Create an object
> Create object: class name object name = new class name ();

```java
public static void main(String[] args) {
    Admin a = new Admin();
    a.name = "Admin1";
    a.password = "111111";
    a.show();
}
```
> In another class, define attributes

```java
public static class Admin {
    String name;
    String password;
```
> Create method

```java
public static class Admin {
    String name;
    String password;
    public void show(){
        System.out.println("name:"+name+"\tpassword:"+password);
    }
}
```
> Results

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
## XI.the relationship between classes and objects
> A class is an abstract concept that describes a set of objects with the same attributes and behaviors. An object is an instance of a class that has the attributes and behaviors defined by the class. A class is a template of an object, while an object is an instance of a class.



