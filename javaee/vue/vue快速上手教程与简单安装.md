## vue简介
Vue.js 是一套构建用户界面的渐进式框架。
Vue 只关注视图层， 采用自底向上增量开发的设计。
Vue 的目标是通过尽可能简单的 API 实现响应的数据绑定和组合的视图组件。
## vue实例
```vue
<!DOCTYPE html>
  <html>
    <head>
    <meta charset="utf-8">
    <title>Vue 测试实例</title>
    <script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
    </head>
      <body>
      <div id="hello-vue" class="demo">
      {{ message }}
      </div>

      <script>
      const HelloVueApp = {
        data() {
          return {
            message: 'Hello Vue!!'
          }
        }
      }

      Vue.createApp(HelloVueApp).mount('#hello-vue')
    </script>
    </body>
    </html>
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684219717214-5b531474-1126-46f9-8721-c516097c11db.png#averageHue=%23c27243&clientId=u425c3e6a-f72f-4&from=paste&height=800&id=u565d2c62&originHeight=1200&originWidth=1920&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=166084&status=done&style=none&taskId=u4c75ceae-9a27-409d-91a4-e68142b19ba&title=&width=1280)
## 通过 CDN 使用 Vue
你可以借助 script 标签直接通过 CDN 来使用 Vue：
这里我们使用了 [unpkg](https://unpkg.com/)，但你也可以使用任何提供 npm 包服务的 CDN，例如 jsdelivr 或 cdnjs。
```vue
<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
```
 [jsdelivr](https://www.jsdelivr.com/package/npm/vue)：
```vue
<script src="https://cdn.jsdelivr.net/npm/vue@3.3.2/dist/vue.global.min.js"></script>
```
[cdnjs](https://cdnjs.com/libraries/vue)：
```vue
<script src="https://cdnjs.cloudflare.com/ajax/libs/vue/3.3.2/vue.cjs.js" integrity="sha512-Om0T2d9tl4H2ShSsEkWjJeQOlXGJg4OZvXKZw075refp2RNZ1avQDbqd6WhwGbWhqpcn2oPmExCEa/lSLzZaJw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
```
通过 CDN 使用 Vue 时，不涉及“构建步骤”。这使得设置更加简单，并且可以用于增强静态的 HTML 或与后端框架集成。但是，你将无法使用单文件组件 (SFC) 语法。
## NPM 方法
### 介绍
npm：是随同NodeJS一起安装的包管理工具，能解决NodeJS代码部署上的很多问题。比如常用的有：
1）允许用户从NPM服务器下载别人编写的第三方包到本地使用。
2）允许用户从NPM服务器下载并安装别人编写的命令行程序到本地使用。
3）允许用户将自己编写的包或命令行程序上传到NPM服务器供别人使用。
### 下载
先从nodejs.org中下载nodejs：[https://nodejs.org/en](https://nodejs.org/en) （推荐给绝大部分用户使用的）双击安装，一直Next；
![屏幕截图 2023-05-16 151923.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684221605381-7063c05b-4d5d-4e93-b8b7-f9f619471654.png#averageHue=%23cecdcd&clientId=u425c3e6a-f72f-4&from=paste&height=731&id=u170e8635&originHeight=1097&originWidth=1918&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=151645&status=done&style=none&taskId=ub77b47a5-9863-4593-a61b-4d967976e10&title=&width=1278.6666666666667)
### 使用
查看npm当前版本
```
npm -v
```
如果不是最新版本，运行指令
```
npm install -g npm
```
如果想更新到指定版本，运行指令
```
npm -g install npm@6.8.0
```
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684224373449-dcbaf024-763c-4fa9-a560-42ef3e2c0ad9.png#averageHue=%23121212&clientId=u425c3e6a-f72f-4&from=paste&height=636&id=udc2e9ae7&originHeight=954&originWidth=1711&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=73050&status=done&style=none&taskId=u94727350-644d-4323-9eb2-14a53763b59&title=&width=1140.6666666666667)
最新稳定版 
```
npm init vue@latest
```
这一指令将会安装并执行 create-vue，它是 Vue 官方的项目脚手架工具。
Project name：需要进行一些配置，项目名输入vue-test，其他默认回车即可
如果不确定是否要开启某个功能，你可以直接按下回车键选择 No。
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684226940930-d2ef94b8-13b4-4fce-b2a9-e0add4bc40b5.png#averageHue=%23121212&clientId=u425c3e6a-f72f-4&from=paste&height=800&id=u4359d9fc&originHeight=1200&originWidth=1210&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=99154&status=done&style=none&taskId=u618f9dd8-cbc1-4063-a9f7-dbb94731da5&title=&width=806.6666666666666)
在项目被创建后，通过以下步骤安装依赖并启动开发服务器：
```
cd vue-test 
npm install 
npm run dev   
```
然后打开： [http://localhost:5173/](http://localhost:5173/)
![image.png](https://cdn.nlark.com/yuque/0/2023/png/33625181/1684227138019-1006ec4e-fadf-4152-b415-61a2e4d52bd5.png#averageHue=%23fefefe&clientId=u425c3e6a-f72f-4&from=paste&height=692&id=u2782a4be&originHeight=1038&originWidth=1909&originalType=binary&ratio=1.5&rotation=0&showTitle=false&size=154871&status=done&style=none&taskId=u0b1a8384-cd07-4585-8f90-31c483b905c&title=&width=1272.6666666666667)
