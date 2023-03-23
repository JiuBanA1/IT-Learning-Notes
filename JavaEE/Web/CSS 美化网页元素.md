![微信图片_20230317085826.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679014818522-c4b50bcd-aa56-4ba6-9477-22e7993e3907.jpeg#averageHue=%233e3d3b&clientId=uadc283ff-4a15-4&from=paste&height=455&id=ud1920358&name=%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20230317085826.jpg&originHeight=683&originWidth=1171&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=43233&status=done&style=none&taskId=ueb109195-9e43-4916-91d6-c8b1195e930&title=&width=780.6666666666666)
## 一、为什么使用CSS
> 有效的传递页面信息，使用CSS美化过的页面文本，使页面漂亮、美观，吸引用户，可以很好的突出页面的主题内容，使用户第一眼可以看到页面主要内容，具有良好的用户体验。

## 二、字体样式
| **属性名** | **含义** | **举例** |
| --- | --- | --- |
| **font-family** | **设置字体类型** | **font-family:"隶书";** |
| **font-size** | **设置字体大小** | **font-size:12px;** |
| **font-style** | **设置字体风格** | **font-style:italic;** |
| **font-weight** | **设置字体的粗细** | **font-weight:bold;** |
| **font** | **在一个声明中设置所有字体属性** | **font:italic bold 36px "宋体";** |

> **font属性：**字体属性的顺序：字体风格→字体粗细→字体大小→字体类型

## 三、文本样式
| **属性** | **含义** | **举例** |
| --- | --- | --- |
| **color** | **设置文本颜色** | **color:#00C;** |
| **text-align** | **设置元素水平对齐方式** | **text-align:right;** |
| **text-indent** | **设置首行文本的缩进** | **text-indent:20px;** |
| **line-height** | **设置文本的行高** | **line-height:25px;** |
| **text-decoration** | **设置文本的装饰** | **text-decoration:underline;** |

### color属性
**RGB**
> 十六进制方法表示颜色：前两位表示红色分量，中间两位表示绿色分量，最后两位表示蓝色分量
> rgb(r,g,b) : 正整数的取值为0～255

**RGBA**
> 在RGB基础上增加了控制alpha透明度的参数，其中这个透明通道值为0～1

## 四、排版文本段落
| **值** | **说明** |
| --- | --- |
| **left** | **把文本排列到左边。默认值：由浏览器决定** |
| **right** | **把文本排列到右边** |
| **center** | **把文本排列到中间** |
| **justify** | **实现两端对齐文本效果** |

## 五、文本修饰和垂直对齐
### 1、文本装饰
> text-decoration属性

### 2、垂直对齐方式
> vertical-align属性：middle、top、bottom

| **值** | **说明** |
| --- | --- |
| **none** | **默认值，定义的标准文本** |
| **underline** | **设置文本的下划线** |
| **overline** | **设置文本的上划线** |
| **line-through** | **设置文本的删除线** |

## 六、文本阴影
> text-shadow : color  x-offset  y-offset  blur-radius;

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677203543139-4a0f2420-53d7-41cf-9a6d-e89a6c9e3403.png#averageHue=%23f0efe5&clientId=uf574655f-b31c-4&from=paste&height=249&id=uddf78568&name=image.png&originHeight=276&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=918152&status=done&style=none&taskId=uc9a27a27-77e5-4f8b-b61e-e3a474b47ba&title=&width=748.3333740234375)
## 七、超链接伪类
### 1、语法
> 标签名:伪类名{声明;}

### 2、示例
```css
a:hover {
	color:#B46210;
	text-decoration:underline;
}
```
### 3、访问时，蓝色；访问后，紫色；
> 设置伪类的顺序：a:link->a:visited->a:hover->a:active

| **伪类名称** | **含义** | **示例** |
| --- | --- | --- |
| **a:link** | **未单击访问时超链接样式** | **a:link{color:#9ef5f9;}** |
| **a:visited** | **单击访问后超链接样式** | **a:visited {color:#333;}** |
| **a:hover** | **鼠标悬浮其上的超链接样式** | **a:hover{color:#ff7300;}** |
| **a:active** | **鼠标单击未释放的超链接样式** | **a:active {color:#999;}** |

## 八、列表样式
| **值** | **说明** | **语法示例** |
| --- | --- | --- |
| **none** | **无标记符号** | **list-style-type:none;** |
| **disc** | **实心圆，默认类型** | **list-style-type:disc;** |
| **circle** | **空心圆** | **list-style-type:circle;** |
| **square** | **实心正方形** | **list-style-type:square;** |
| **decimal** | **数字** | **list-style-type:decimal** |

**去除列表前面的小黑点**
```css
li {
	list-style:none;
}
```
## 九、网页背景
### 1、背景颜色：background-color
### 2、背景图像：background-image属性
> background-image:url(图片路径);

### 3、背景重复方式
> background-repeat属性
> repeat：沿水平和垂直两个方向平铺
> no-repeat：不平铺，即只显示一次
> repeat-x：只沿水平方向平铺
> repeat-y：只沿垂直方向平铺

## 十、渐变
> linear-gradient ( position,  color1,  color2,…)

![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677203544221-fa8eb0e9-a266-40ca-bc7c-75cce33e4992.png#averageHue=%23c3b29d&clientId=uf574655f-b31c-4&from=paste&height=146&id=ucd5bc922&name=image.png&originHeight=219&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=729425&status=done&style=none&taskId=u1e4c7929-12ea-4aba-9ffa-3d3b2ee509d&title=&width=554)
