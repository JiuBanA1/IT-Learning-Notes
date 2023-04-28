## 一、什么是CSS
> 对字体、颜色、边距、高度、宽度、背景图片、网页定位等设定

## 二、CSS发展史
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677165759623-4d79001a-56c6-428f-92a0-b5893cd5af35.png#averageHue=%23f9f9f9&clientId=u655d758e-fa06-4&from=paste&height=472&id=ub5337ee7&originHeight=498&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1658608&status=done&style=none&taskId=u0656619c-abfc-4fc4-b8f4-446e7712cbf&title=&width=788)
## 三、CSS基本语法结构
### 1、语法
> 选择器{ 声明1;
>       声明2;
>             …  }

### 2、例如
```css
h1 {
  font-size:12px;
  color:#F00;
}
```
## 四、style标签
> style标签的作用是**用来说明所要定义的样式**

```css
<style type="text/css">
h1 {
	font-size:12px;
	color:#F00;
}
</style>
```
## 五、HTML中引入CSS样式
### 1、行内样式
> <h1 style="color:red;">style属性的应用</h1>
> <p style="font-size:14px; color:green;">直接在HTML标签中设置的样式</p>

### 2、内部样式表
> CSS代码写在<head>的<style>标签中

```css
<style>
h1{color: green; }
</style>
```
> 优点：方便在同页面中修改样式
> 缺点：不利于在多页面间共享复用代码及维护，对内容与样式的分离也不够彻底

### 3、外部样式表
> CSS代码保存在扩展名为.css的样式表中
> HTML文件引用扩展名为.css的样式表，有两种方式

**链接式：**
```css
<head>
……
<link href="style.css" rel="stylesheet" type="text/css" />
……
</head>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677165774691-e2ef7ccf-6469-494a-aeac-0abf6b52bbe1.png#averageHue=%23e7eee9&clientId=u655d758e-fa06-4&from=paste&height=131&id=u73365dae&originHeight=197&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=656157&status=done&style=none&taskId=ua3e5092f-13e8-4010-ab75-9b185acf7b6&title=&width=554)
**导入式：**
```css
<head>
……
<style type="text/css">
<!--@import url("style.css");-->
</style>
</head>
```
> CSS样式优先级：行内样式>内部样式表>外部样式表，就近原则

## 六、CSS基本选择器
### 1、标签选择器
> HTML标签作为标签选择器的名称：<h1>…<h6>、<p>、<img/>

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677165786572-c5ea5986-ec90-4b61-9e2b-001b3a2d436f.png#averageHue=%23fbfbfa&clientId=u655d758e-fa06-4&from=paste&height=201&id=u1003e1d7&originHeight=301&originWidth=682&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=822838&status=done&style=none&taskId=u83204a50-dd38-4507-b5a6-2438f2771d4&title=&width=454.6666666666667)
### 2、类选择器
> <标签名 class= "类名称">标签内容</标签名>

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677165793689-203abb9b-9e60-4980-8325-bcfb68823cdb.png#averageHue=%23a69480&clientId=u655d758e-fa06-4&from=paste&height=210&id=u370bfe15&originHeight=315&originWidth=633&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=799268&status=done&style=none&taskId=u81d64f9b-a98e-4dbe-b593-b3515d30725&title=&width=422)
### 3、ID选择器
`#id { font-size:16px;}`
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677165801880-0838216f-1f80-4919-8144-24632875c8a2.png#averageHue=%23dbc3a3&clientId=u655d758e-fa06-4&from=paste&height=219&id=ud2e9d577&originHeight=329&originWidth=624&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=822922&status=done&style=none&taskId=uce3f50ad-2966-40c6-a3af-d2ff3497a96&title=&width=416)
### 4、特点
> 标签选择器直接应用于HTML标签，类选择器可在页面中多次使用，ID选择器在同一个页面中只能使用一次

### 5、基本选择器的优先级
> ID选择器>类选择器>标签选择器

## 七、CSS的高级选择器
### 1、层次选择器
| **选择器** | **类   型** | **功能描述** |
| --- | --- | --- |
| **E F** | **后代选择器** | **选择匹配的F元素，且匹配的F元素被包含在匹配的E元素内** |
| **E>F** | **子选择器** | **选择匹配的F元素，且匹配的F元素是匹配的E元素的子元素** |
| **E+F** | **相邻兄弟选择器** | **选择匹配的F元素，且匹配的F元素紧位于匹配的E元素后面** |
| **E~F** | **通用兄弟选择器** | **选择匹配的F元素，且位于匹配的E元素后的所有匹配的F元素** |

> 后代选择器: body p{  background: red;  }
> 子选择器: body>p{  background: pink;  }
> 通用兄弟选择器:.active~p{  background: yellow;  }
> 相邻兄弟选择器: .active+p {  background: green;  }

### 2、结构伪类选择器
| **选择器** | **功能描述** |
| --- | --- |
| **E:first-child** | **作为父元素的第一个子元素的元素E** |
| **E:last-child** | **作为父元素的最后一个子元素的元素E** |
| **E F:nth-child(n)** | **选择父级元素E的第n个子元素F，（n可以是1、2、3），关键字为even、odd** |
| **E:first-of-type** | **选择父元素内具有指定类型的第一个E元素** |
| **E:last-of-type** | **选择父元素内具有指定类型的最后一个E元素** |
| **E F:nth-of-type(n)** | **选择父元素内具有指定类型的第n个F元素** |

> ul li:first-child{ background: red;}
> ul li:last-child{ background: green;}
> p:nth-child(1){ background: yellow;}
> p:nth-of-type(2){ background: blue;}

### 3、属性选择器
| **属性选择器** | **功能描述** |
| --- | --- |
| **E[attr]** | **选择匹配具有属性attr的E元素** |
| **E[attr=val]** | **选择匹配具有属性attr的E元素,并且属性值为val（其中val区分大小写）** |
| **E[attr^=val]** | **选择匹配元素E，且E元素定义了属性attr，其属性值是以val开头的任意字符串** |
| **E[attr$=val]** | **选择匹配元素E，且E元素定义了属性attr，其属性值是以val结尾的任意字符串** |
| **E[attr*=val]** | **选择匹配元素E，且E元素定义了属性attr，其属性值包含了“val”，换句话说，字符串val与属性值中的任意位置相匹配** |

> E[attr]属性选择器：a[id] { background: yellow; }
> E[attr=val]属性选择器：a[id=first] { background: red; }
> E[attr*=val]属性选择器：a[class*=links] { background: red; }
> E[attr^=val]属性选择器：a[href^=http] { background: red; }
> E[attr$=val]属性选择器：a[href$=png] { background: red; }



