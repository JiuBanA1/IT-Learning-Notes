## ![html.jpg](https://cdn.nlark.com/yuque/0/2023/jpeg/33625181/1679014766968-16e2a0b0-f6bb-4eed-89c3-cfe07d3496f2.jpeg#averageHue=%23f3810e&clientId=u99a3f97a-00c5-4&from=paste&height=480&id=u64893cfa&name=html.jpg&originHeight=720&originWidth=1280&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=68221&status=done&style=none&taskId=u36676089-9341-4687-8484-04e4bc73094&title=&width=853.3333333333334)
## 一、表单语法
```html
<form  method="post" action="result.html">
<p>  名字：<input name="name" type="text" >  </p>
<p>  密码：<input name="pass" type="password" >  </p>
<p>
<input type="submit" name="Button" value="提交"/>
<input type="reset" name="Reset" value="重填“/> 
</p>
</form>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161031684-c62e47a4-6be0-4a3a-90de-4808d597d6c0.png#averageHue=%23e3e9e2&clientId=uc57c63cd-efcf-4&from=paste&height=320&id=uaf8dd6e2&name=image.png&originHeight=480&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1598657&status=done&style=none&taskId=u91ff787a-3433-45f3-bf2a-8843b7735cf&title=&width=554)
## 二、表单元素格式
```html
<input  type="text"  name="fname" value="text"/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161033061-47d569e7-28c2-4be5-a7e6-b3645ebb5ad5.png#averageHue=%23ccc4b0&clientId=uc57c63cd-efcf-4&from=paste&height=89&id=u025db808&name=image.png&originHeight=133&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=443015&status=done&style=none&taskId=u43649bf4-f8a4-4534-9b13-4d1203c9bf8&title=&width=554)

## 三、文本框
```html
<input  type="text"  name="userName" value="用户名" size="30" maxlength="20" />
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161045339-9636e87d-c787-440c-8adc-7da1e7be9bac.png#averageHue=%23c0b296&clientId=uc57c63cd-efcf-4&from=paste&height=282&id=u9c22f9df&name=image.png&originHeight=423&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1408826&status=done&style=none&taskId=u31d42ee9-4b64-4394-94da-17197504719&title=&width=554)

## 四、密码框
```html
<input  type="password "  name="pass"  size="20" />
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161049714-f3b21101-e102-476a-b420-134fd1373053.png#averageHue=%23aa9680&clientId=uc57c63cd-efcf-4&from=paste&height=138&id=u7751f7ae&name=image.png&originHeight=207&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=688632&status=done&style=none&taskId=u14c2bb1b-4fa2-42ac-a887-865ee687e2e&title=&width=553.3333333333334)
## 五、单选按钮
```html
<input name="gen" type="radio" value="男"  checked  />男
<input name="gen" type="radio" value="女" />女
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161060525-2fbba5ba-d937-462e-a23a-702644f19afb.png#averageHue=%23d9d8c8&clientId=uc57c63cd-efcf-4&from=paste&height=193&id=uc3b768a4&name=image.png&originHeight=290&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=965888&status=done&style=none&taskId=u3f6634f6-1768-4660-a035-c037d0c96d0&title=&width=554)
## 六、复选框
```html
<input type="checkbox" name="interest" value="sports"/>运动
<input type="checkbox" name="interest" value="talk" checked />聊天
<input type="checkbox" name="interest" value="play"/>玩游戏
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161081692-e887a8cb-3831-4b08-85f2-76a4a082e69b.png#averageHue=%23dcdfd2&clientId=uc57c63cd-efcf-4&from=paste&height=229&id=u92cd5a21&name=image.png&originHeight=344&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1144351&status=done&style=none&taskId=u26a45ed2-90c5-4eb7-a551-ad3a9cecbd1&title=&width=553.3333333333334)
## 七、列表框
```html
<select name="列表名称" size="行数">
<option value="选项的值" selected="selected">…</option >
<option value="选项的值">…</option >
</select>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161091759-b533791e-6671-4770-82d0-1264d65b3237.png#averageHue=%23dde3de&clientId=uc57c63cd-efcf-4&from=paste&height=235&id=u8c293317&name=image.png&originHeight=352&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1172368&status=done&style=none&taskId=u7f6d99de-c9c7-451a-8092-6d45573ed50&title=&width=554)

## 八、按钮
```html
<input  type="reset" name="butReset" value="reset按钮">
<input  type="submit" name="butSubmit" value="submit按钮">
<input  type="button" name="butButton" value="button按钮"/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161109408-652c060f-06e8-4c0d-9ca9-76c68fdbc4a1.png#averageHue=%23d3d5c7&clientId=uc57c63cd-efcf-4&from=paste&height=259&id=ufc38fece&name=image.png&originHeight=389&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1295588&status=done&style=none&taskId=ua1973efc-38cd-4970-9aeb-56ac2f73e49&title=&width=554)
## 九、多行文本域
```html
<textarea  name="showText"  cols="x"  rows="y">文本内容 </textarea  >
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161101277-ed4f6071-a6a8-473a-b34e-0fe6daede478.png#averageHue=%23b9ab94&clientId=uc57c63cd-efcf-4&from=paste&height=145&id=u1dbdd8f6&name=image.png&originHeight=218&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=726100&status=done&style=none&taskId=u58196dda-5fca-4f50-b9b0-6b41ba14311&title=&width=554)
## 十、文件域
```html
<form action="" method="post" enctype="multipart/form-data">
<p><input type="file" name="files" />
<input type="submit" name="upload" value="上传" /></p>
</form>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161118941-218f6891-7293-42b8-91c5-dc01b8b362df.png#averageHue=%23dfe6da&clientId=uc57c63cd-efcf-4&from=paste&height=243&id=ua3f8e357&name=image.png&originHeight=365&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1214198&status=done&style=none&taskId=uf5a1cccf-5363-477c-8eb9-6ac4070d8fe&title=&width=553.3333333333334)
## 十一、网址
```html
<p>请输入你的网址:<input type="url"  name="userUrl"/></p>
<input type="submit"/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161116509-89141f0e-67cc-49b7-b156-bea31dc42746.png#averageHue=%23d7dacd&clientId=uc57c63cd-efcf-4&from=paste&height=161&id=u988578e5&name=image.png&originHeight=241&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=801734&status=done&style=none&taskId=u6a82fdfa-b24f-4955-9c96-fa3901ea3a3&title=&width=553.3333333333334)
## 十二、数字
```html
<p>请输入数字:<input type="number"  name="num" min="0" max="100" step="10"/></p>
<input type="submit"/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161132928-5c14197b-1ae8-4c59-a538-f34fefade437.png#averageHue=%23e0e5da&clientId=uc57c63cd-efcf-4&from=paste&height=229&id=u2fda5977&name=image.png&originHeight=343&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1142402&status=done&style=none&taskId=u0b41e007-c485-4633-90a6-69366d80d67&title=&width=554)
## 十三、滑块
```html
<p>请输入数字:<input type="range"  name="range1" min="0" max="10" step="2"/></p>
<input type="submit"/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161140642-77fca73e-7b7f-43b7-80b3-7f1cf1afb2e4.png#averageHue=%23dae0d3&clientId=uc57c63cd-efcf-4&from=paste&height=231&id=u0ccc2182&name=image.png&originHeight=347&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1154326&status=done&style=none&taskId=u07b15ae2-fc98-45ae-b245-35f448b41b5&title=&width=553.3333333333334)

## 十四、隐藏域
```html
<input type="hidden" value="666" name="userid">
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161141783-c6265b68-09da-458d-b3a6-637e9ad1296c.png#averageHue=%23fcfbfb&clientId=uc57c63cd-efcf-4&from=paste&height=179&id=uc1f0ba86&name=image.png&originHeight=269&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=894876&status=done&style=none&taskId=ue3a5405e-2b2c-4819-8953-50f96a626f4&title=&width=553.3333333333334)
## 十五、只读和禁用
```html
<input name="name" type="text" value="张三"  readonly>
<input type="submit "  disabled   value="保存" >
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161148698-152b4c09-39f8-4547-96dc-91cc0e5e1925.png#averageHue=%23b6a88e&clientId=uc57c63cd-efcf-4&from=paste&height=215&id=u9cd42ee6&name=image.png&originHeight=322&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=1071171&status=done&style=none&taskId=ubd306863-af8d-4f95-8b81-09422340804&title=&width=553.3333333333334)

## 十六、表单初级验证的方法
### 表单验证的好处？
> 减轻服务器的压力，保证数据的可行性和安全性

### 1、Placeholder
```html
<input type="search" name="sousuo"  placeholder="请输入要搜索的关键字"/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161146806-03c3a9e2-55e2-4ffb-aafc-20b8f763f710.png#averageHue=%23a38f76&clientId=uc57c63cd-efcf-4&from=paste&height=127&id=uf177b0b1&name=image.png&originHeight=191&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=635419&status=done&style=none&taskId=u1985ac17-b335-4abf-b803-4f5d6d3710e&title=&width=553.3333333333334)

### 2、Required
```html
<input type="text" name="username"  required/>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161151712-9fb01f21-3381-4320-ad72-13bf4892482b.png#averageHue=%23a0826a&clientId=uc57c63cd-efcf-4&from=paste&height=137&id=udcd45864&name=image.png&originHeight=206&originWidth=831&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=686135&status=done&style=none&taskId=u62b5fe0c-842d-4a2d-97a1-2e811622ed1&title=&width=554)
### 3、Pattern
```html
<input type="text" name="tel"  required pattern="^1[358]\d{9}" />
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1677161156904-4c6c8804-63b3-49f6-8198-b4f7fd80466f.png#averageHue=%23b2846e&clientId=uc57c63cd-efcf-4&from=paste&height=161&id=u302c7605&name=image.png&originHeight=242&originWidth=830&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=805067&status=done&style=none&taskId=u1f53fb03-ee63-4982-8130-184c84c84ce&title=&width=553.3333333333334)

