![html.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679014756678-c7b0a048-7f3f-42f4-8dc0-b17ac15cff40.jpeg#averageHue=%23f3810e&clientId=u4acc80a7-800e-4&from=paste&height=480&id=u43714ca2&name=html.jpg&originHeight=720&originWidth=1280&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=68221&status=done&style=none&taskId=uf2677ebd-40f6-404a-94bc-94d3e74d2fd&title=&width=853.3333333333334)
## 一、什么是列表
> 列表就是信息资源的一种展示形式，它可以使信息结构化和条理化，并以列表的样式显示出来，以便浏览者能更快捷地获得相应的信息。

## 二、无序列表
```html
<ul><!--声明无序列表-->
    <li>新建标签页1</li>
    <li>新建标签页2</li>
    <li>新建标签页3</li>
    <li>新建标签页4</li>
    <!--声明列表项-->
</ul>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677159854390-03f53303-25ce-435a-92f1-e93850d15376.png#averageHue=%23f7f7f6&clientId=u156472b2-fe4b-4&from=paste&height=230&id=udf05912e&name=image.png&originHeight=345&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1147672&status=done&style=none&taskId=u3ba31ba2-5825-4eaf-a50b-627bcc3e0d5&title=&width=553.3333333333334)
## 三、无序列表的特性
> 没有顺序，每个<li>标签独占一行（块元素）；默认<li>标签项前面有个实心小圆点；
> 一般用于无序类型的列表，如导航、侧边栏新闻、有规律的图文组合模块等。

## 四、有序列表
```html
<ol><!--声明无序列表-->
    <li>新建标签页1</li>
    <li>新建标签页2</li>
    <li>新建标签页3</li>
    <li>新建标签页4</li>
</ol><!--声明列
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677159949528-3c488278-27b9-49fa-8c5e-f3dcb7a5933e.png#averageHue=%23f7f7f7&clientId=u156472b2-fe4b-4&from=paste&height=218&id=u534639c8&name=image.png&originHeight=327&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1089108&status=done&style=none&taskId=u63d52ef6-84b0-41c3-ba59-cc1513734ec&title=&width=554)
## 五、有序列表的特性
> 有顺序，每个<li>标签独占一行（块元素）；默认<li>标签项前面有顺序标记；一般用于排序类型的列表，如试卷、问卷选项等。

## 六、定义列表
```html
<dl><!--声明定义列表-->
    <dt>水果</dt><!--声明列表项-->
    <dd>苹果</dd>
    <dd>桃子</dd>
    <dd>李子</dd>
    <!--声明列表项-->
</dl>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677160018469-a03a9fcb-41d3-4b36-b424-1ce31d52611a.png#averageHue=%23f6f5f5&clientId=u156472b2-fe4b-4&from=paste&height=175&id=uf643feae&name=image.png&originHeight=263&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=874914&status=done&style=none&taskId=uef91f823-1067-48d3-9a17-63ece733991&title=&width=553.3333333333334)
## 七、定义列表的特性
> 没有顺序，每个<dt>标签、<dd>标签独占一行（块元素）；默认没有标记；一般用于一个标题下有一个或多个列表项的情况

## 八、列表对比
| **类型** | **说明** | **项目符号** |
| --- | --- | --- |
| **无序列表** | **以<ul>标签来实现**
**以<li>标签表示列表项** | **无序列表中的每项都是平级的，没有级别之分，并且列表中的内容一般都是相对简单的标题性质的网页内容** |
| **有序列表** | **以<ol>标签来实现**
**以<li>标签表示列表项** | **有序列表ol-li一般用于显示带有顺序编号的特定场合** |
| **定义类表** | **以<dl>标签来实现**
**以<dt>标签定义列表项**
**以<dd>标签定义内容** | **定义列表一般适用于带有标题和标题解释性内容的场合** |

## 九、如何实现在网页上播放视频和音频？
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677160342146-41310a41-8c52-4fd5-8d0a-2f3c1c524c03.png#averageHue=%23eff1e7&clientId=u156472b2-fe4b-4&from=paste&height=159&id=u8b1de93d&name=image.png&originHeight=238&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=791754&status=done&style=none&taskId=u1f68af59-aa50-499d-b8b8-945d6b0078b&title=&width=553.3333333333334)
### 1、视频元素：video
```html
<video src="视频路径"  controls></video>
```
### 2、自动播放属性：autoplay
```html
<video autoplay>
<source src="video/video.webm" type="video/webm"/>
<source src="video/video.mp4" type="video/mp4"/>
</video>
```
### 1、音频元素：audio
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677160353271-ccbd3e9b-5783-453f-990a-5c2f100947a7.png#averageHue=%23f1f3ea&clientId=u156472b2-fe4b-4&from=paste&height=135&id=u6206924d&name=image.png&originHeight=203&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=676148&status=done&style=none&taskId=u439817ff-cdfc-4802-bdfd-f2afc9623cb&title=&width=554)
```html
<audio src="音频路径" controls></video>
```
### 2、自动播放属性：autoplay
```html
<audio controls>
<source src="music/music.mp3" type="audio/mpeg"/>
</audio>
```

