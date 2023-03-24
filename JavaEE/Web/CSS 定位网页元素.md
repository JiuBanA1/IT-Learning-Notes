![微信图片_20230317085826.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679014832115-e4fcdfad-84a6-49dc-827f-0f45c2a14f67.jpeg#averageHue=%233e3d3b&clientId=u23254789-ee74-4&from=paste&height=455&id=u32819aba&name=%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20230317085826.jpg&originHeight=683&originWidth=1171&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=43233&status=done&style=none&taskId=uf81ec885-e120-485a-a5ec-d769237646a&title=&width=780.6666666666666)
## 前言
> 当我们在设计网页时，经常需要对网页中的元素进行定位，以便它们出现在我们想要的位置。在 CSS 中，我们可以使用不同的定位属性来定位元素。

## 一、position: static
> 这是元素的默认定位属性，也就是元素在文档流中的位置。如果你没有指定元素的定位属性，那么元素就是 static 定位。

## 二、position: relative
> 这个属性相对于元素的默认位置进行定位。你可以使用 top、bottom、left 和 right 属性来调整元素的位置。

```css
div {
  position: relative;
  top: 20px;
  left: 10px;
}
```
## 三、position: absolute
> 这个属性将元素从文档流中删除，并相对于其最近的已定位祖先元素进行定位。如果没有已定位的祖先元素，则相对于文档的 body 元素进行定位。你可以使用 top、bottom、left 和 right 属性来调整元素的位置。

```css
div {
  position: absolute;
  top: 20px;
  left: 10px;
}
```
## 四、position: fixed
> 这个属性将元素固定在视口的某个位置，不随页面滚动而移动。你可以使用 top、bottom、left 和 right 属性来调整元素的位置。

```css
div {
  position: fixed;
  top: 20px;
  left: 10px;
}
```
## 五、position: sticky
> 这个属性将元素固定在容器的顶部或底部，直到它滚动到视口的顶部或底部。你可以使用 top、bottom、left 和 right 属性来调整元素的位置。

```css
div {
  position: sticky;
  top: 20px;
  left: 10px;
}
```
