## 一、什么是盒子模型
> css盒子模型又称为框模型，盒子的最内部是元素的实际内容即元素内容，紧挨着元素框外部的是内边距，其次是边框，然后最外层是外边距，这几部分共同组成了盒子模型。

## 二、边框border-color
| **属性** | **说明** | **示例** |
| --- | --- | --- |
| **border-top-color ** | **上边框颜色** | **border-top-color:#369; ** |
| **border-right-color** | **右边框颜色** | **border-right-color:#369; ** |
| **border-bottom-color** | **下边框颜色** | **border-bottom-color:#fae45b; ** |
| **border-left-color** | **左边框颜色** | **border-left-color:#efcd56; ** |
| 

**border-coor** | **四个边框为同一颜色** | **border-color:#eeff34;** |
|  | **上、下边框颜色：#369**
**左、右边框颜色：#000** | **border-color:#369 #000;** |
|  | **上边框颜色：#369**
**左、右边框颜色：#000**
**下边框颜色：#f00** | **border-color:#369 #000 #f00;** |
|  | **上、右、下、左边框颜色：**
**#369、#000、#f00、#00f** | **border-color:#369 #000 #f00 #00f;** |

## 三、边框粗细border-width
```css
border-top-width:5px; 
border-right-width:10px; 
border-bottom-width:8px; 
border-left-width:22px; 
border-width:5px ; 
border-width:20px 2px;
border-width:5px 1px 6px;
border-width:1px 3px 5px 2px;
```
## 四、边框样式border-style
```css
border-top-style:solid; 
border-right-style:solid; 
border-bottom-style:solid; 
border-left-style:solid; 
border-style:solid ; 
border-style:solid dotted;
border-style:solid dotted dashed;
border-style:solid dotted dashed double;
```
## 五、外边距margin
```css
margin-top: 1 px
margin-right : 2 px
margin-bottom : 2 px
margin-left : 1 px
margin :3px 5px 7px 4px;
margin :3px 5px;
margin :3px 5px 7px;
margin :8px;
```
## 六、内边距padding
```css
padding-left:10px; 
padding-right: 5px; 
padding-top: 20px; 
padding-bottom:8px; 
padding:20px 5px 8px 10px ; 
padding:10px 5px; 
padding:30px 8px 10px ; 
padding:10px;
```
## 七、圆角边框
> 四个属性值按顺时针排列

> border-radius: 20px  10px  50px  30px;

## 八、圆形
> 利用border-radius属性制作圆形的两个要点，元素的宽度和高度必须相同，圆角的半径为元素宽度的一半，或者直接设置圆角半径值为50%。

```css
div{
width: 100px;
height: 100px;
border: 4px solid red;
border-radius: 50%;
}
```
## 九、盒子阴影
> box-shadow:inset  x-offset  y-offset  blur-radius  color;

