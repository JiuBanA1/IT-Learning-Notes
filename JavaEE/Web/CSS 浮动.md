![微信图片_20230317085826.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679014824145-c1faacd4-2ae0-4a04-accd-4da4d6702556.jpeg#averageHue=%233e3d3b&clientId=ucdf67bb2-dd3c-4&from=paste&height=455&id=u74b870b0&name=%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20230317085826.jpg&originHeight=683&originWidth=1171&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=43233&status=done&style=none&taskId=uf3627856-7ab6-4abc-9169-0eca6b3fb28&title=&width=780.6666666666666)
## 前言：
> CSS浮动是一种布局技术，它允许元素浮动到其父元素的左侧或右侧，从而腾出空间给其他元素。

## 一、设置浮动属性
> 使用CSS **float**属性将元素设置为浮动。例如，如果您希望一个元素向左浮动，可以使用以下代码：

```java
float: left;
```
> 如果您希望元素向右浮动，可以使用以下代码：

```java
float: right;
```
## 二、确定浮动元素的宽度
> 在浮动元素的宽度上，有两种不同的方式可以设置宽度：

- 直接设置元素的宽度，例如 **width: 200px;**
- 使用 **auto** 值，这将使元素自动根据其内容宽度调整其宽度。
## 三、清除浮动
> 浮动元素可能会影响布局，并使其他元素的位置出现问题。要解决这个问题，可以使用“清除浮动”技术，即在浮动元素的下方添加一个 **clear** 属性的元素。

例如，可以在浮动元素的下方添加以下代码：
```java
<div style="clear:both;"></div>
```
这将在浮动元素下方添加一个透明的div元素，它将清除浮动，确保后面的元素不受浮动元素的影响。
## 总结：
> CSS浮动是一种强大的布局技术，它可以使元素脱离文档流，并向左或向右浮动。要使用浮动，需要设置元素的 **float** 属性，并清除浮动以确保布局不受影响。

