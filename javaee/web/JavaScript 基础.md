## 为什么要学JavaScript?
> 表单验证－减轻服务器端压力

## 什么是JavaScript 
> 是一种基于对象和事件驱动的、并具有安全性能的脚本语言

### 特点：
> 向HTML页面中添加交互行为 脚本语言，语法和Java类似 解释性语言，边执行边解释 

### 组成：
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677457992756-6447474a-b876-40ec-8fda-ac7727365bd4.png#averageHue=%23f8f6f0&clientId=uebb16f2e-2726-4&from=paste&id=u6c224871&originHeight=385&originWidth=903&originalType=url&ratio=1.5&rotation=0&showTitle=false&size=21847&status=done&style=none&taskId=u4e6f3e2a-a60d-4c57-b654-64aebf88ed8&title=)
## JavaScript的基本结构
### 基本结构
```html
<script type="text/javascript" > //指定文本使用的语言类别
  //  JavaScript 语句;
</script >
```
### 内部引用
```html
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>JavaScript的基本结构</title>
</head>
<body>
	<script type="text/javascript"> document.write("你好，JavaScript");
    //向页面输可以包含HTML标签的内容

	</script>
</body>
</html>
```
> <script></script>可以包含在文档中的任何地方，只要保证这些代码在被使用前已读取并加载到内存

### 外部引用
```html
<!DOCTYPE html>
<html>
  <head>
    <title>My HTML Page</title>
    <script src="path/to/myScript.js">//外部引用 </script>
    
  </head>
  <body>
    
  </body>
</html>
```
> 使用<script>标签将JavaScript文件链接到HTML页面中，src属性指定了JavaScript文件的路径，可以是相对路径或绝对路径。

## console对象进行输出
1、console.log()：输出信息到控制台，常用于调试和测试。
```javascript
console.log("Hello World"); // 输出 "Hello World" 
```
2、console.error()：输出错误信息到控制台，常用于捕获和调试错误。 
```javascript
console.error("Something went wrong!"); // 输出错误信息 
```
3、 console.warn()：输出警告信息到控制台，常用于提醒和警示。
```css
console.warn("This action cannot be undone!"); // 输出警告信息 
```
## JavaScript核心语法 
### 1、变量声明
> 在JavaScript中，您可以使用关键字 var、let 或 const 来声明变量。其中，var 关键字是旧的声明方式，而 let 和 const 是 ES6 中引入的新声明方式。

```javascript
var a = 1; 
let b = 2; 
const c = 3; 
```
### 2、数据类型 
> JavaScript中的数据类型有七种：字符串（String）、数字（Number）、布尔（Boolean）、null、undefined、对象（Object）和 Symbol。

```javascript
var name = "John";
var age = 25;
var isStudent = true;
var person = {
  name: "John",
  age: 25
};
var car = null;
var test;
```
### 3、运算符 
> JavaScript中的运算符包括算术运算符、比较运算符、逻辑运算符等。其中，算术运算符用于执行算术操作，比较运算符用于比较两个值，逻辑运算符用于组合和比较布尔值。

```javascript
var x = 5;
var y = 3;
var z = x + y; // 算术运算符
var isGreater = x > y; // 比较运算符
var isTrue = x > 3 && y < 5; // 逻辑运算符
```
### 4、条件语句 
> 条件语句用于根据条件执行不同的代码块。JavaScript中的条件语句有 if 语句、else if 语句和 switch 语句。

```javascript
var x = 10;
if (x > 5) {
  console.log("x is greater than 5");
} else {
  console.log("x is less than or equal to 5");
}

var color = "blue";
switch (color) {
  case "red":
    console.log("color is red");
    break;
  case "blue":
    console.log("color is blue");
    break;
  default:
    console.log("color is not red or blue");
}
```
### 5、循环语句 
> 循环语句用于多次执行相同的代码块。JavaScript中的循环语句有 for 循环、while 循环和 do...while 循环。

```javascript
for (var i = 0; i < 5; i++) {
  console.log(i);
}

var j = 0;
while (j < 5) {
  console.log(j);
  j++;
}

var k = 0;
do {
  console.log(k);
  k++;
} while (k < 5);

```
### 6、数组 
> 数组是一种存储多个值的数据结构，JavaScript中的数组可以存储不同类型的数据，其语法如下：

```javascript
var arrayName = [item1, item2, ...];
```
```javascript
var fruits = ["apple", "banana", "orange"];
console.log(fruits[0]); // 输出 "apple"

```
### 7、对象 
> 对象是一种数据结构，用于存储键值对，其中键是字符串，值可以是任何数据类型。对象可以通过点号或方括号访问其属性，其语法如下：

```javascript
var objectName = {
  property1: value1,
  property2: value2,
  ...
};
```
```javascript
var person = {
  name: "John",
  age: 25,
  isStudent: true
};

console.log(person.name); // 输出 "John"
console.log(person["age"]); // 输出 25

```
## JavaScript有两种注释方式
> 在JavaScript中，注释是一种用于添加说明和描述的文本，它不会被JavaScript解释器执行，也不会影响程序的运行。

### 单行注释
> 单行注释以 // 开始，直到行末结束。例如：

```javascript
// 这是一条单行注释 
```
### 多行注释
> 多行注释以 /* 开始，以 */ 结束。例如：

```javascript
/* 这是一条多行注释 可以跨越多行 */ 
```
