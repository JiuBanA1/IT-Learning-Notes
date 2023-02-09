package 创建包

导入外部包
控制台输入包
import java.util.Scanner;

数组排序包
import java.util.Arrays;

导入错误类型子类（如 InputMismatchException）
import java.util.InputMismatchException;

log4j2包
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

导入集合框架相关包（如 Collection 接口, ArrayList, HashSet类）
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

导入日期相关类
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

导入随机数 Random 类
import java.util.Random;

导入文件操作 File 类
import java.io.File;

导入文件流相关类（如 OutputStream 和它的子类 FileOutputStream）
import java.io.OutputStream;
import java.io.FileOutputStream;

public 公共的, class 类, JavaDemo类名
public class JavaDemo {
	程序的入口
	public 公共的, static 静态的, void 返回值为空, main 主程序, String 字符串
	public static void main(String[] args) {
		类名
		帕森卡命名法
		每个单词第一个字母大写
		包名
		package org.springframework.boot.autoconfigure.cloud
		package org.springframework.boot.util
		package org.hibernate.action
		package org.hibernate.cfg
		package com.alibaba.druid
		package com.alibaba.druid.filter
		package com.alibaba.nacos.client.config
		package com.ramostear.blog.web

		package java.beans
		package java.io
		package java.lang
		package java.net
		package java.util
		package javax.annotation
		所有字母均小写

		System 系统, out 输出, print 打印
		双引号中可以写任何内容(中文和英文)
		双引号中写什么就会输出什么
		必须是纯英文
		//单行注释
		TODO 注释更加便携我们的日常开发相关，它可以快速定位到我们注释的位置
		//TODO: 2022/01/01 单行注释
		/*块注释*/
		/**
		 * 文档注释
		 */
		ln换行 必须跟在 print 后面 例如:println
		//\n换行 必须放在双引号中
		//\t水平制表符（空格）

		System.out.println("Hello Word");
		System.out.print("张三\n");
		System.out.print("来自\t黑龙江\n");

		变量命名 驼峰命名法
		1.首字母:字母 下划线_ 美元符$
		$name 对 9name 错
		2.其余部分:字母 数字 下划线_ 美元符$
		name$ 对 name* 错
		3.不能是关键字
		4.局部变量必须赋予初始值才能使用
		5.一个作用域下变量名不能重名

		常量命名规则
		在变量命名规则之上，所有字母均大写

		char sex = '男';
		char sex = 98; ASCII码 A--65 Z--90 a--97 z--122

		String, 枚举, 类, 数组, 接口为引用数据类型, 其他为普通数据类型
		String 字符串 char 字符
		byte byteMin = -128;
		byte byteMax = 127;
		short shortMin = -32768;
		short shortMax = 32767;
		int intMin = -2147483648;
		int intMax = 2147483647;
		long longMin1 = -2147483648;
		long longMax1 = 2147483647;
		long longMin2 = -8999999999999999999L;
		long longMax2 = 8999999999999999999L;

		float 单精度浮点型 double 双精度浮点型
		double d1 = 10.9;
		double d2 = 10.9D;
		float f = 10.9F;

		boolean 布尔值 true false

		关系运算符>大于 <小于 >=大于等于 <=小于等于 ==等于 !=不等于

		boolean a = 2 > 1; true
		boolean a = 2 < 1; false

		赋值运算符 = += -= *= /= %=

		String n = "张三";
		或
		String n,
		n = "张三";
		System.out.println("我叫" + n);
		System.out.println(n + "家住北京");
		System.out.println(n + "是一个三好学生");
		System.out.println("小红爱" + n + ",死心塌地");

		int wangHao = 80;
		int zhangMeng;
		从右向左赋值
		zhangMeng = wangHao;
		System.out.println("张萌的Java成绩");
		System.out.println(zhangMeng);

		a += 5和a = a + 5不完全相同
		如果a和5数据类型一致，则相同，
		如果类型不同，则a = a + 5需要强制类型转换，a += 5会自动转换类型

		如何从控制台输入
		先导入java.util包，语法：import java.util.Scanner;

		第一步 创建从控制台输入对象
		Scanner input = new Scanner(System.in);

		第二步 提示语句
		System.out.println("请输入你的年龄");

		第三步 接受控制台的变量
		int age = input.nextInt();

		第四步 输出或使用
		System.out.println("我的年龄是:"+age);

		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的体重");
		double weight = input.nextDouble();
		System.out.println("我的体重是：" + weight);

		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name = input.next();
		System.out.println("我的名字是：" + name);

		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的性别");
		char sex = input.next().charAt(0); //输入一个字符串，然后取字符串里的第一个字符，即可存为 char 类型
		System.out.println("我的性别是：" + sex);

		算数运算符+(加) -(减) *(乘) /(除) %(余数) ++、--(迭代)
		//+ - / * % 加减乘除取余

		int a = 10;
		System.out.println(a++); //10，先取a的值显示，然后再 + 1
		System.out.println(a); //11
		int b = 10;
		System.out.println(++b); //11，先取b的值 + 1，然后再显示
		System.out.println(b); //11
		++ 或 -- 在变量前先运算 ++ 或 -- ,否则后执行

		变量值互换
		int num1 = 19;
		int num2 = 89;
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1 + "," + num2);
		89,19

		if 选择\多重选择结构
		如果 if (条件(布尔值)或 变量名.equals("判断字符串")) {
			代码块
		} 否则 else if {
			代码块
		} else if {
			代码块
		} else {
			代码块
		}

		嵌套 if 选择结构
		如果 if (条件1(布尔值)) {
			if (条件2(布尔值) {
				代码块1
			} else {
				代码块2
			}
		} 否则 else {
			代码块3
		}

		逻辑运算符
		&&(与 所有内容都为真 ,结果才是真)
		||(或 只有一个表达式为真,结果就为真)
		!(非 取反)

		&& 与 & 区别:
		对于 && 而言,如果左边的表达式为 false,则不会执行到右边的表达式,性能高
			而 &,如果左边为 false,依然会执行右边的表达式
		|| 与 | 区别:
			对于 || 而言,如果左边为 true,则不会执行到右边的表达式,性能高
			而 |,如果左边为 true,依然会执行右边的表达式

		三目/三元运算符
		条件 ? true 的结果 : false 的结果
		int i = scanner.nextInt();
		String string = i > 0 ? "true" : "false";
		System.out.println(string);
		/**0
		false*/
		/**1
		true*/

		Math 是数学类
		产生随机0~1不包括1中的任意无限不循环小数数 Math.random()
		double random = (Math.random() * 10);(随机小数点前0~9中任意无限不循环小数*10, 转为 int 即10以内不包括10的随机数)
		随机生成四位随机数
		int max = 9999;
		int min = 1000;
		int random = (int) (Math.random() * (max - min)) + min;

		Math 类中包含 E 和 PI 两个静态常量，正如它们名字所暗示的，它们的值分别等于 e（自然对数）和 π（圆周率）。
		System.out.println("E 常量的值：" + Math.E);
		System.out.println("PI 常量的值：" + Math.PI);
		/**E 常量的值：2.718281828459045
		PI 常量的值：3.141592653589793*/

		求最大值、最小值和绝对值
		方法 										说明
		static int abs(int a)						返回a的绝对值
		static long abs(long a)						返回a的绝对值
		static float abs(float a)					返回a的绝对值
		static double abs(double a)					返回a的绝对值
		static int max(int x, int y)				返回x和y中的最大值
		static double max(double x, double y)		返回x和y中的最大值
		static long max(long x, long y)				返回x和y中的最大值
		static float max(float x, float y)			返回x和y中的最大值
		static int min(int x, int y)				返回x和y中的最小值
		static long min(long x, long y)				返回x和y中的最小值
		static double min(double x, double y)		返回x和y中的最小值
		static float min(float x, float y)			返回x和y中的最小值
		示例
		System.out.println("10和20的较大值：" + Math.max(10, 20));
		System.out.println("15.6和15的较小值：" + Math.min(15.6, 15));
		System.out.println("-12的绝对值：" + Math.abs(-12));
		/**10和20的较大值：20
		15.6和15的较小值：15.0
		-12的绝对值：12*/

		求整运算
		方法									说明
		static double ceil(double a)		返回大于或等于a的最小整数
		static double floor(double a)		返回小于或等于a的最大整数
		static double rint(double a)		返回最接近a的整数值，如果有两个同样接近的整数，则结果取偶数
		static int round(float a)			将参数加上0.5后返回与参数最近的整数
		static long round(double a)			将参数加上0.5后返回与参数最近的整数，然后强制转换为长整型
		示例
		Scanner input = new Scanner(System.in);
		System.outprintln("请输入一个数字：");
		double num = input.nextDouble();
		System.out.println("大于或等于" + num + "的最小整数：" + Math.ceil(num));
		System.out.println("小于或等于" + num + "的最大整数：" + Math.floor(num));
		System.out.println("将" + num + "加上0.5之后最接近的整数：" + Math.round(num));
		System.out.println("最接近 " + num + " 的整数：" + Math.rint(num));
		/**请输入一个数字：
		99.01
		大于或等于99.01的最小整数：100.0
		小于或等于99.01的最大整数：99.0
		将99.01加上0.5 之后最接近的整数：100
		最接近99.01的整数：99.0*/

		三角函数运算
		方法											说明
		static double sin(double a)					返回角的三角正弦值，参数以孤度为单位
		static double cos(double a)					返回角的三角余弦值，参数以孤度为单位
		static double asin(double a)				返回一个值的反正弦值，参数域在[-1, 1]，值域在[-PI / 2, PI / 2]
		static double acos(double a)				返回一个值的反余弦值，参数域在[-1, 1]，值域在[0.0, PI]
		static double tan(double a)					返回角的三角正切值，参数以弧度为单位
		static double atan(double a)				返回一个值的反正切值，值域在[-PI / 2, PI / 2]
		static double toDegrees(double angrad)		将用孤度表示的角转换为近似相等的用角度表示的角
		staticdouble toRadians(double angdeg)		将用角度表示的角转换为近似相等的用弧度表示的角
		/**每个方法的参数和返回值都是 double 类型，参数以弧度代替角度来实现，其中1度等于 π / 180弧度，因此平角就是 π 弧度。*/
		示例
		System.out.println("90度的正弦值：" + Math.sin(Math.PI / 2));
		System.out.println("0度的余弦值：" + Math.cos(0));
		System.out.println("1的反正切值：" + Math.atan(1));
		System.out.println("120度的弧度值：" + Math.toRadians(120.0));
		/**在上述代码中，因为Math.sin()中的参数的单位是弧度，而90度表示的是角度，因此需要将90度转换为弧度，即Math.PI / 180 * 90，故转换后的弧度为Math.PI / 2，然后调用 Math 类中的sin()方法计算其正弦值*/
		/**90度的正弦值：1.0
		0的余弦值：1.0
		1的反正切值：0.7853981633974483
		120度的弧度值：2.0943951023931953*/

		指数运算
		指数的运算包括求方根、取对数及其求n次方的运算。
		方法											说明
		static double exp(double a)					返回e的a次幂
		static double pow(double a, double b)		返回以a为底数，以b为指数的幂值
		static double sqrt(double a)				返回a的平方根
		static double cbrt(double a)				返回a的立方根
		static double log(double a)					返回a的自然对数，即 lna 的值
		static double log10(double a)				返回以10为底a的对数
		示例
		System.out.println("4的立方值：" + Math.pow(4, 3));
		System.out.println("16的平方根：" + Math.sqrt(16));
		System.out.println("10为底2的对数：" + Math.log1O(2));
		/**4的立方值：64.0
		16的平方根：4.0
		10为底2的对数：0.3010299956639812*/

		int a = 95896;
		int geWei = a % 10;
		int shiWei = a / 10 % 10;
		int baiWei = a / 100 % 10;
		int qianWei = a / 1000 % 10;
		int wanWei = a / 10000 % 10;

		Scanner input = new Scanner(System.in);
		System.out.print("请输入名次：");
		String mC = input.next();
		if (mC.equals("第一名")) {
			System.out.println("参加麻省理工大学组织的1个月夏令营");
		} else if (mC.equals("第二名")) {
			System.out.println("奖励惠普笔记本电脑一部");
		} else if (mC.equals("第三名")) {
			System.out.println("奖励移动硬盘一个");
		} else {
			System.out.println("继续加油");
		}

		条件为等值时才可以用 switch 代替多重 if 结构
		case 后可存数据类型
		jdk1.7后支持 String,boolean
		long(长整形),short(短整形),byte(字节),int(枚举),char(字符)

		在Jdk1.5以前,switch(xx)中,xx只能是 byte,short,char,int
		从Jdk1.5开始,Java 中引入了枚举类型,xx也可以是 Enum 枚举类型
		从Jdk1.7开始,xx还可以是字符串(String),但是长整型 long double float 在目前所有的版本中都是不可以的
		必记!!(jdk1.6及以下版本不支持 String) (jdk1.7及以上支持 String)
		System.out.print("请输入名次：");
		String mC = input.next();
		switch (mC) {
		case "第一名": //情况
			System.out.println("参加麻省理工大学组织的1个月夏令营");
			break; //中断
		case "第二名":
			System.out.println("奖励惠普笔记本电脑一部");
			break;
		case "第三名":
			System.out.println("奖励移动硬盘一个");
			break;
		default: //默认
			System.out.println("继续加油");
			break;
		}

		input.hasNextInt() == true //判断输入的数据类型是否正确

		循环结构 先判断再执行 初始情况不满足循环条件时一次都不会执行
		int i = 1; //初始值
		while (i <= 100) { //条件
			System.out.println("第" + i + "遍，好好学习，天天向上"); //操作
			i++; //迭代变量
		}

		循环结构 先执行再判断 任何初始情况都至少执行一次
		int i = 1; //初始值
		do {
			System.out.println("第" + i + "遍，好好学习，天天向上"); //操作
			i++; //迭代变量
		} while (i <= 100); //条件

		实现整数反转
		int val = 12345;
		int r_digit;
		System.out.print("反转后的整数是：");
		while (val != 0) {
			r_digit = val % 10;
			System.out.print(r_digit);
			val = val / 10;
		}

		for 循环 固定次数
		for (int i = 1; i <= 100; i++) {
			System.out.println("第" + i + "次好好学习！");
		}

		break 中断, continue 继续
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break; //结束循环
			}
			System.out.print(i);//12
		}

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; //结束本次循环，继续下一次循环
			}
			System.out.print(i); //1245
		}

		数组的五种赋值方法和使用方法
		30,97,65

		int[] arr;
		int arr[];

		声明数组
		int[] arr;
		//开辟三个空间
		arr = new int[3];
		//向数组中赋值，0、1、2是下标
		arr[0] = 30;
		arr[1] = 97;
		arr[2] = 65;

		声明数组并且分配空间
		int[] arr = new int[3];
		//向数组中赋值
		arr[0] = 30;
		arr[1] = 97;
		arr[2] = 65;

		声明数组同时赋值
		int[] arr = new int[]{30, 97, 65};

		声明数组同时赋值
		int[] arr = {30, 97, 65};

		从控制台输入向数组赋值
		int[] arr = new int[3];
		System.out.println("向数组中存入三个数据：");
		//arr.length是数组的长度
		for (int i = 0; i < arr.length; i++) {//i是下标
			arr[i] = input.nextInt();
		}
		//把数组中的值输出
		for (int i = 0; i < arr.length; i++) {
			//输出数组中的值
			System.out.println(arr[i]);
		}

		求总和平均
		int i = 0;
		int zong = 0;
		int[] arr = new int[3];
		for (i = 0; i < arr.length; i++) {
			System.out.print("输入第" + (i + 1) + "位同学的成绩：");
			arr[i] = input.nextInt();
			zong = zong + arr[i];
		}
		System.out.println(i + "位同学的总分是：" + zong + "平均分是：" + zong * 1.0 / arr.length);

		求数组中最大值最小值
		int[] arr = { 90, 100, 98, 67, 45, 79 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最大值为：" + max);
		System.out.println("最小值为：" + min);

		Arrays.sort(数组名); //对数组进行升序排序

		数组升序输出
		int[] arr1 = { 90, 100, 98, 67, 45, 79 };
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		数组降序输出
		int[] arr2 = {90, 100, 98, 67, 45, 79};
		Arrays.sort(arr2);
		for (int i = arr2.length - 1; i >= 0; i--) {
			System.out.println(arr2[i]);
		}

		不调用方法进行数组排序
		int[] array = {10, 30, 17, 6, 29, 20};
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] < array[j + 1]) { //<为降序，>为升序
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int i : array) {
			System.out.print(i + "\t");
		}

		数组的基本要素
		标识符:
			数组的名称,用于区分不同的数组
		数组元素:
			向数组中存放的数据
		元素下标:
			对数组元素进行编号,从0开始,数组中每个元素都可以通过下标来访问
		元素类型:
			数组元素的数据类型

		普通变量开辟一个空间
		数组开辟一串空间

		数组中所有元素必须属于相同的数据类型

		数组与数组之间的赋值
		不报错
		int[] a = new int[3];
		int[] b = new int[] { 1, 2, 3, 4, 5 };
		a = b; //把值赋给a，空间也赋给a
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i] + " ");
		}

		报错
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i]; //逐个赋值
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		内存分配
		栈内存：方法运行时，进入的内存，局部变量都存放于这块内存当中
		堆内存：new出来的内容都会进入堆内存，并且会存在地址值
		方法区：字节码文件(.class)加载时进入的内存
		本地方法栈：调用操作系统相关资源
		寄存器：交给CPU使用
		示例
		int[] arr1 = new int[2];
		arr1[0] = 11;
		arr1[1] = 22;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		int[] arr2 = arr1; //arr2指向了arr1的地址
		arr2[0] = 33;
		arr2[1] = 44;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		/**11
		22
		33
		44
		33
		44*/

		多维数组
		int[][] array = new int[][]{{1, 2}, {3, 4}, {5, 6}};

		int[][] array = new int[3][2];
		int[] arrayA = {1, 2};
		array[0] = arrayA;
		array[1] = new int[]{3, 4};
		array[2][0] = 5;
		array[2][1] = 6;
		//for 循环遍历二维数组
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; i < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
		}
		//forEach 循环遍历二维数组
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
		}
		/**多维数组 new int[3][]，数组里的数组长度并不定死，可以根据需求而定，但如果不定义长度，无法通过数组名[下标]赋值，只能通过{值, 值, ...值}赋值*/

		Arrays 类常用方法
		int[] array1 = {10, 20, 16, 19, 5};
		int[] array2 = {10, 20, 16, 19, 5};
		//boolean equals(array1, array2)比较两个数组是否相等
		System.out.println(Arrays.equals(array1, array2));
		//String toString(array)将数组转换成字符串显示值
		System.out.println(Arrays.toString(array1));
		//void fill(array, val)将数组的所有值填充为val
		Arrays.fill(array2, 20);
		System.out.println(Arrays.toString(array2));
		//数组copyOf(array, newLength)将array复制成指定长度的新数组
		int[] array3 = Arrays.copyOf(array1, 10);
		System.out.println(Arrays.toString(array3));
		//int binarySearch(array, key)在array数组中查找指定的值，并返回其索引，但是查找之前需要数组是有序的
		//如果找不到返回（key值在数组排序后应插入的索引 + 1） * -1
		Arrays.sort(array1);
		System.out.println(Arrays.binarySearch(array1, 16));
		/**true
		[10, 20, 16, 19, 5]
		[20, 20, 20, 20, 20]
		[10, 20, 16, 19, 5, 0, 0, 0, 0, 0]
		2*/

		二重循环
		打印图形
		矩形
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*****
		*****
		*****
		*****
		*****

		三角形
		Scanner input = new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		int hs = input.nextInt();
		for (int j = 1; j <= hs; j++) {
			for (int i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		请输入直角三角形的行数:5
		*
		***
		*****
		*******
		*********

		Scanner input = new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		int hs = input.nextInt();
		for (int j = hs; j >= 1; j--) {
			for (int i = j; i >= 1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		请输入直角三角形的行数:5
		*****
		****
		***
		**
		*

		等腰三角形
		Scanner input = new Scanner(System.in);
		System.out.print("请输入直角三角形的行数：");
		int hs = input.nextInt();
		for (int j = 1; j <= hs; j++) {
			for (int g = j; g <= hs; g++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		请输入直角三角形的行数:5
		     *
		    ***
		   *****
		  *******
		 *********

		九九乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + " ");
			}
			System.out.println();
		}
		1*1=1
		1*2=2 2*2=4
		1*3=3 2*3=6 3*3=9
		1*4=4 2*4=8 3*4=12 4*4=16
		1*5=5 2*5=10 3*5=15 4*5=20 5*5=25
		1*6=6 2*6=12 3*6=18 4*6=24 5*6=30 6*6=36
		1*7=7 2*7=14 3*7=21 4*7=28 5*7=35 6*7=42 7*7=49
		1*8=8 2*8=16 3*8=24 4*8=32 5*8=40 6*8=48 7*8=56 8*8=64
		1*9=9 2*9=18 3*9=27 4*9=36 5*9=45 6*9=54 7*9=63 8*9=72 9*9=81

		break 与 continue
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j == 3) {
					break;
				}
				System.out.println("内侧循环!");
			}
			System.out.println("外侧循环!");
		}
		内侧循环!
		内侧循环!
		外侧循环!
		内侧循环!
		内侧循环!
		外侧循环!
		内侧循环!
		内侧循环!
		外侧循环!

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println("内侧循环!");
			}
			System.out.println("外侧循环!");
		}
		内侧循环!
		内侧循环!
		内侧循环!
		外侧循环!
		内侧循环!
		内侧循环!
		内侧循环!
		外侧循环!
		内侧循环!
		内侧循环!
		内侧循环!
		外侧循环!

创建包的关键字 package
package com.accp.www;

类
public class Admin {
	属性:访问修饰符 数据类型 名字:
	访问修饰符:public 公共的, private 私有的, protected 受保护的, friendly 默认的
	public String name;
	public String password;
	方法:访问修饰符 返回值类型 void 空 方法名() {}
	public void show() {
		System.out.println("姓名" + name + "，密码" + password);
	}
}

package创建包的关键字
package com.accp.www;

类
public class TestAdmin {
	主程序 主方法:系统而定 是程序的入口
	public static void main(String[] args) {
		创建对象:类名 对象名 = new 类名();
		Admin a = new Admin();
		a.name = "aAdmin1";
		a.password = "111111";
		a.show();

		Admin b = new Admin();
		b.name = "bAdmin2"
		b.password = "222222";
		b.show();
	}
}

		类和对象的关系
		类是对象的类型
		对象是类的实例

package com.accp.www;

public class Lion {
	public String color;
	public void run() {
		System.out.println("一头" + color + "的公狮子在奔跑");
		String b = play();
		System.out.println("这头狮子还在玩" + b);
	}
	//带返回值的方法
	public String play() {
		//局部变量
		String ball = "球";
		return 只能返回一个值,多个方法不能嵌套定义
		return ball;或 return "球";
	}
}

package com.accp.www;

public class TestLion {
	public static void main(String[] args) {
		Lion a = new Lion();
		a.color = "黄色";
		a.run();
		String c = a.play();
		System.out.println(c);
	}
}

两种情况
如果方法具有返回值,方法中必须使用关键字 return 返回该值,返回值类型为该返回值的类型
return 在返回一个值的情况下或者使用 void 返回值的情况下都有终止执行方法的功能

Student类的方法a()调用Student类的方法b(),直接调用
public void a() {
	b(); //调用b()
}

Student类的方法a()调用Teacher类的方法b(),先创建类对象,然后使用"."调用
public void a() {
	Teacher t = new Teacher();
	t.b(); //调用Teacher类的b()
}

全局变量与局部变量的区别
1.作用域不同,全局变量作用这个类,局部变量只是局部
2.全局变量 java 虚拟机会赋予初始值(int 0; String ""; double 0.0;),局部变量不会

String name;同 friendly String name; 默认访问修饰符权限同包访问
public String name; public 公共访问修饰符权限整个项目
protected String name; protected 受保护的具有继承关系可以访问
private String name; private 私有的

package com.accp.www;

public class ZhaZhiJi {
	//方法：访问修饰符 返回值类型 方法名(形参,形参){}
	public void ZhaZhi(String fruit, int num) { //带参方法
		String str = "正在榨" + num + "杯" + fruit + "汁";
		System.out.println(str);
	}

	//有返回值
	public String ZhaZhi(String fruit, int num, int people) {
		return people + "个人在喝" + num + "杯" + fruit + "汁";
	}
}

package com.accp.www;

public class TestZhaZhiJi {
	public static void main(String[] args) {
		ZhaZhiJi z = new ZhaZhiJi();
		//带参方法的注意事项
		//1.形参和实参个数要一致
		//2.形参和实参类型要一致
		//3.形参和实参顺序要一致
		z.ZhaZhi("苹果", 2);//实参

		//有返回值
		String str = z.ZhaZhi("苹果", 2, 1); //实参
		System.out.println(str);
	}
}

package com.accp.www;

public class Student {
	//数组做参数
	public void show(String[] arr) { //数组做参数
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

package com.accp.www;

public class TestStudent {
	public static void main(String[] args) {
		String[] arr = { "张三", "李四", "王五" };
		Student stu = new Student();
		stu.show(arr);
	}
}

package com.accp2.www;

public class Student {
	public String name;
	public int age;
	public void show() {
		System.out.println("学生姓名是" + name + "，年龄是" + age);
	}
}

package com.accp2.www;

public class ShowStudent {
	//对象做参数
	public void StudentZhi(Student stu) {
		stu.name = "张三";
		stu.age = 20;
		stu.show();
	}
}

package com.accp2.www;

public class TestStudent {
	public static void main(String[] args) {
		ShowStudent sstu = new ShowStudent();
		Student stu = new Student();
		sstu.StudentZhi(stu);
	}
}

		null 代表空

		对象数组
		Admin[] arr = new Admin[2];
		arr[0] = a1;
		arr[1] = a2;
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}

		创建字符串的两种方法
		String str1 = "I Love China";
		System.out.println("字符串的长度为" + str1.length());

		String str2 = new String("张三爱中国");
		System.out.println("字符串的长度为" + str2.length());

		==比较两个字符串的id地址
		equals()比较两个字符串的内容
		equalsIgnoreCase()忽略大小写

		toLowerCase()转换为小写
		toUpperCase()转换为大写

		concat()字符串拼接
		String sql = "80";
		String java = "90";
		String html = "86.7";
		System.out.println("******成绩单******");
		System.out.println("SQL:" + sql + "\tJava:" + java + "\tHTML:" + html);
		String str = "SQL:" + sql.concat("\tJava:" + java).concat("\tHTML:" + html);
		System.out.println(str);
		******成绩单******
		SQL:80	Java:90	HTML:86.7
		SQL:80	Java:90	HTML:86.7

		indexOf()查找第一个出现的字符，找到返回下标，未找到则返回-1
		String str = "青春无悔，无悔青春";
		System.out.println(str.indexOf("春"));
		1

		lastIndexOf()查找最后一个出现的字符，找到返回下标，未找到则返回-1
		String str = "青春无悔，无悔青春";
		System.out.println(str.lastIndexOf("春"));
		8

		substring()字符串截取
		String str = "青春无悔，无悔青春";
		System.out.println(str.substring(5));
		无悔青春

		截取区间值
		System.out.println(str.substring(5, 7));
		无悔

		contains()判断字符串是否包含另一个字符串
		String str = "青春无悔，无悔青春";
		System.out.println(str.contains("青春"));
		true

		trim()去字符串前后空格
		String str = "   I Love You   ";
		System.out.println(str.trim());
		I Love You

		split()字符串拆分
		String str = "长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		StringBuffer:String 增强版
		对字符串频繁修改(如字符串连接)时, 使用 StringBuffer 类可以大大提高程序执行效率

		StringBuffer sb=new StringBuffer("I");
		sb.append("Love");
		sb.append("you");
		System.out.println(sb);
		//把 StringBuffer 类型转换为 String 类型
		String str = sb.toString();
		//concat()是 String 下面的方法
		str = str.concat("Love").concat("you");
		System.out.println(str);
		ILoveyou
		ILoveyouLoveyou

		insert()字符串插入
		StringBuffer se = new StringBuffer("I Love You too");
		//插入逗号
		se.insert(10,",");
		System.out.println(se);
		I Love You, too

		forEach 循环输出数组元素
		int[] arr = {1, 2, 3, 4, 5, 6};
		for (int a : arr) {
			System.out.print(a + " ");
		}

		字符串分割输出
		string arr = "abcdefg";
		for (char a : arr) {
			System.out.print(a + " ");
		}

		c:
		while (true) {
			switch (scanner.next()) {
				case "1" -> {
					//情况1
				}
				case "2" -> {
					//情况2
				}
				default -> {
					break c; //给上一个 while 循环命名一个别名为c，实现可在 switch 、增强 switch 结构或其他罗技控制语句里终止命名为c的 while 循环或其他循环结构
				}
			}
		}

		构造方法
		/**每个类都默认有一个无参数的构造方法*/
		/**一旦开发人员自定义添加了构造方法，Java 将不会再给类该添加无参构造方法*/
		//先通过 new 关键字创建对象，再给属性赋值，需要使用多条语句才能完成
		AppleTree appleTree = new AppleTree();
		appleTree.brand = "金帅";
		//在创建对象的同时完成赋值操作
		[ 访问修饰符 ] /*无返回值类型*/ 构造方法名 /*与类名相同*/ ([ 参数列表 ] /*可以指定参数*/) {
			//……省略方法体的代码
		}
		public AppleTree() {
			this.brand = "金帅";
		}
		//指定了返回值类型，不是构造方法

		自定义构造方法
		public AppleTree(String brand /*可以继续添加形参*/) {
			//this 关键字是对一个对象的默认引用，这里用以区分同名成员变量
			this.brand = brand;
			//逐个赋值
		}
		//一旦自定义构造方法，系统将不再提供默认无参构造方法

		this 关键字
		/**因为 this 关键字是在对象内部指代自身的引用，所以它只能调用实例变量、实例方法和构造方法，不能调用类变量和类方法，也不能调用局部变量*/
		是对一个对象的默认引用
		调用成员变量
		public AppleTree(String brand){
			this.brand = brand; //成员变量和局部变量同名，必须使用 this
		}

		public void changeName(String name) {
			this.name = name;
			this.print();
		}

		public class Employee {
			String name;
			String sex;
			int age;
			String dept;

			public Employee(String name, String sex) {
				this.name = name;
				this.sex = sex;
			}
		}

		public Employee(String name, String sex, int age, String dept) {
			this(name, sex); //必须是构造方法中第一条语句
			this.age = age;
			this.dept = dept;
		}

		方法重载
		//有返回值类型的为方法重载，无返回值类型的为构造方法重载
		public AppleTree() {
			//省略初始化代码
		}
		public AppleTree(String brand) {
			//省略初始化代码
		}
		public AppleTree(String name, String brand, int growTime, int harvestTime, int numsOfFruits) {
			//省略初始化代码
		}
		//同一个类，方法名相同，参数列表不同，构造方法重载可提供多种实例化对象的方式
		常见错误
		class CompSalary {
			public void Pay(SE se) {
				float money = se.BasePay + se.MeritPay;
				System.out.println("程序员的薪水:" + money);
			}
			public String Pay(SE se) {
				float money = se.BasePay + se.MeritPay;
				return money.ToString();
			}
		}
		//名称以及参数列表相同的方法，仅仅是返回值类型不同，不能称之为方法重载

		封装
		public class AppleTree {
			private String name = "苹果树"; //名称
			private String brand; //品种
			private int growTime = 10; //成长期
			private int harvestTime = 2; //采摘期
			private int numsOfFruits = 100; //果实数量
			private String status = "生长期"; //生长状态
			private boolean isHarvested = false; //是否采摘
			//省略部分成员变量的getter方法
			public String getName()/*只读*/ {
				return name;
			}
			public void setName(String name)/*只写*/ {
				this.name = name;
			}
			public String getStatus() {
				return status;
			}
			public String setStatus(String Status) {
				this.status = status;
			}
			//省略类的构造方法......
			//省略print()方法......
		}

		访问修饰符
		类的访问修饰符
		修饰符/作用域			同一包中			非同一包中
		public 公共的			可以使用			可以使用
		默认修饰符			可以使用			不可以使用

		类成员的访问修饰符
		修饰符/作用域			同一类中			同一包中			子类中			外部包
		private 私有的		可以使用			不可以使用		不可以使用		不可以使用
		默认修饰符			可以使用			可以使用			不可以使用		不可以使用
		protected 受保护的	可以使用			可以使用			可以使用			不可以使用
		public 公共的			可以使用			可以使用			可以使用			可以使用

		static 关键字
		/**使用 static 修饰的属性称为静态变量或类变量，没有使用 static 修饰的属性称为实例变量*/
		public static /*可修饰类的属性、方法和代码块*/ void main(String[] args) {
			//省略代码
		}
		//用 static 修饰的属性、方法和代码块属于它所在的类，由这个类创建的所有对象可以共用同一个 static 成员
		类名.成员变量名
		类名.成员方法名();
		//可直接调用类的成员，不需再消耗资源反复创建对象

		使用 static 关键字修饰类变量, 代码块
		/**static 代码块在JVM初始化阶段执行，只会执行一次，一般情况下， 使用 static 代码块对 static 变量进行初始化*/
		/**方法里，不可以定义 static 变量，即：类变量不能是局部变量*/
		使用 static 修饰类的成员
		public class StaticExample {
			public static int i; //静态变量
			public static int j = 10; //静态变量
			public int k;//实例变量

			static { //静态块，static 代码块
				System.out.println("*******执行静态代码块*********");
				i = 20;
				System.out.println("初始化k的值为" + i);
				System.out.println("初始化j的值为" + j);
			}

			public StaticExample() {
				System.out.println("*******执行构造方法创建对象*******");
				k = 30;
				System.out.println("初始化k的值为" + k);
			}
		}

		public static void main(String[] args) {
			StaticExample se = new StaticExample();
			System.out.println("*******main()方法中修改变量值*******");
			se.k++; //引用实例变量，先创建对象，再操作
			StaticExample.j++; //引用静态变量
			//不需实例化对象，便可获取类的成员变量属性值
			System.out.println("当前的i的值为" + StaticExample.i);
			System.out.println("当前的j的值为" + StaticExample.j);
			System.out.println("当前的k的值为" + se.k);
		}
		输出结果
		/*******执行静态代码块*********
		初始化k的值为20
		初始化j的值为10
		*******执行构造方法创建对象*******
		初始化k的值为30
		*******main()方法中修改变量值*******
		当前的i的值为20
		当前的j的值为11
		当前的k的值为31*/

		使用 static, final 关键字定义常量
		public class Constants {
			public static final /*定义常量类保存作物的生长状态*/ String GROW = "生长期"; //定义类常量
			public static final String MATURE = "采摘期";
			public static final String DEAD = "已死亡";
		}
		//常量名一般由大写字母组成，声明常量时一定要赋初值
		class ApplyTree {
			// … …省略部分代码
			public AppleTree(String brand) {
				this.brand = brand;
				this.status = Constants.GROW; //引用类常量
			}
		}

		使用 static 关键字修饰类方法
		/**静态方法（又称类方法）：使用 static 关键字修饰的，方法例方法：未使用 static 关键字修饰的方法*/
		public class StaticExample {
			public static int i;
			public static int j = 10;
			public int k;

			//省略静态代码块、构造方法

			//编译出错，静态方法中不能直接访问实例变量k
			public static void staticMethod() {
				System.out.println("*******执行静态方法*******");
				k = 25; //编译出错，静态方法中不能直接访问实例变量k
				System.out.println("k的当前值为" + k);
			}
			//先创建对象，再通过对象访问其成员变量k
			public static void staticMethod() {
				System.out.println("*******执行静态方法*******");
				StaticExample se = new StaticExample();
				se.k = 25; //先创建对象，再通过对象访问其成员变量k
				System.out.println("k的值为" + se.k);
			}
		}

		public static void main(String[] args) {
			//省略其他调用代码……
			StaticExample.staticMethod(); //用类名直接调用静态方法
		}

		使用 static 修饰与非 static 修饰的类成员有哪些不同?
						static 非 private 修饰			非 static private 修饰
		属性类			属性, 类变量						实例属性, 实例变量
		方法				类方法							实例方法
		调用方式			类名.属性							对象.属性
						类名.方法()						对象.方法()
						对象.属性
						对象.方法()
		归属				类								单个对象
		//在静态方法中，不能直接访问实例变量和实例方法，在实例方法中，可以直接调用类中定义的静态变量和静态方法

		继承
		使用继承
		编写父类
		[访问修饰符] class <SuperClass> {
			//属性
			//方法
		}
		编写子类, 继承父类
		[访问修饰符] /*public 或默认修饰符*/ class <SubClass> extends /*继承关键字*/ <SuperClass> /*只能继承一个父类*/ {
			//子类特有的属性和方法
		}

		public class Crop {
			private String name; //名称
			private int growTime; //成长期
			private int harvestTime; //采摘期
			private int numsOfFruits; //果实数量
			private String status; //生长状态
			private boolean isHarvested; //果实是否已收割
			public void print(){ ... }
			public printGrowReport(int day){ ... }
			public harvest(){ ... }
			//省略getter、get()方法等其他代码……
		}
		/**提取过程中，对于公共方法中调用非公共属性的语句，需要稍作调整*/
		public class AppleTree extends Crop {
			private String brand; //专有属性：品种
			public void setBrand(String brand) {
				this.brand = brand;
			}
			public AppleTree(String brand){
				super("苹果树", 10, 2, 100); //访问父类的构造方法
				super.setStatus(Constants.GROW); //访问父类属性
				this.brand = brand;
			}
			/**重写父类的print()方法*/
			@Override //使用 Java 注解表示该方法重写了父类方法
			public void print() {
				super.print(); //调用父类的方法
				System.out.println("苹果树品种：" + this.brand);
			}
		}
		public class Corn extends Crop{
			private double harvestCost; //专有属性：收割费用
			//... …省略 public 方法
			public Corn(double harvestCost) {
				super("玉米", 5, 2, 120); //访问父类的构造方法
				super.setStatus(Constants.GROW); //访问父类属性
				this.harvestCost = harvestCost;
			}
			/**重写父类的print()方法*/
			@Override //使用 Java 注解表示该方法重写了父类方法
			public void print() {
				super.print(); //调用父类的方法
				System.out.println(super.getName() + "的收割费用：" + this.harvestCost + "元。");
			}
		}
		public class Test {
			public static void main(String[] args) {
				1.创建Crop对象并输出信息
				Crop crop = new Crop();
				crop.print();
				2.创建AppleTree对象并输出信息
				AppleTree appleTree = new AppleTree("富士");
				appleTree.print();
				3.创建Corn对象并输出信息
				Corn corn = new Corn(100.0);
				corn.print();
			}
		}
		/*****作物特性*****
		您种植了默认。
		生长期0天，采摘期0天，果实数量为0。
		*****作物特性*****
		您种植了苹果树。
		生长期10天，采摘期2天，果实数量为100。
		苹果树品种：富士
		*****作物特性*****
		您种植了玉米。
		生长期5天，采摘期2天，果实数量为120。
		玉米收割费用：100.0元*/

		不能被继承的父类成员
		private 成员
		子类与父类不在同包, 使用默认访问权限的成员
		构造方法

		Object 类
		是所有 Java 类的祖先
		所有的 Java 类都直接或间接地继承了 Object 类
		位于java.lang包中
		在定义一个类时, 如果没有使用 extends 关键字, 即没有显式地继承某个类, 那么这个类直接继承 Object 类
		常用方法
		方法							说明
		toString()					返回当前对象本身的有关信息, 返回字符串对象
		equals()					比较两个对象是否是同一个对象, 若是, 返回 true
		clone()						生成当前对象的一个副本, 并返回
		hashCode()					返回该对象的哈希代码值
		getClass()					获取当前对象所属的类信息, 返回 class 对象
		/**java.lang.String类重写了 Object 类中的equals()方法，用于比较两个字符串的值是否相等*/

		super 关键字
		使用 super 关键字
		super 代表父类对象
		super(参数); //在子类构造方法中调用且必须是第一句

		public class AppleTree extends Crop {
			//… … 省略 private 属性定义
			public AppleTree(String brand) {
				super("苹果树", 10, 2, 100); //访问直接父类的构造方法
				this.brand = brand;
			}
		}

		如果想在子类中调用父类中被重写的方法, 应该如何实现呢?
		super关键字代表对当前对象的直接父类对象的默认引用
		super可用于子类访问父类属性, 父类方法
		super.<父类属性/父类方法>;

		super.print();
		/**super 关键字必须出现在子类（子类的方法和构造方法）中，而不允许在其他位置*/
		/**使用 super 关键字可以访问父类的成员（属性、方法、构造方法）*/
		/**注意访问权限的限制，如无法通过 super 访问 private 成员*/

		使用 this / super 关键字的注意事项
		在构造方法中, 如果出现 this 或 super 关键字, 则只能是该方法的第一条语句
		在一个构造方法中, 不允许同时使用 this 和 super 关键字调用构造方法
		在类方法中, 不允许出现 this 或 super 关键字
		在实例方法中, this 和 super 语句不要求是第一条语句, 可以共存

		方法重载与方法重写
					位置			方法名			参数表				返回值				访问修饰符
		方法重载		同类			相同				不相同				无关					无关
		方法重写		子类			相同				相同					相同或是其子类			不能比父类更严格

		多级继承
		一个类可以继承自某一个类, 成为这个类的子类
		同时, 也可以在自身的基础上创建新的类, 即成为它子类的父类
		如: 新能源轿车类是轿车类的子类, 同时, 是无人驾驶轿车类的父类
		/**Java 中只支持单继承，即每个类只能有一个直接父类*/

		Object 类<--轿车类<--新能源轿车类<--无人驾驶轿车类
		/**无人驾驶轿车类的直接父类是新能源轿车类，间接父类是轿车类、Object 类*/

		继承关系中的构造方法
		类的构造方法执行场景
		创建该类的对象时, 又称类的实例化
		创建该类的子类的对象时, 又称子类的实例化
		Java 虚拟机按照先父类后子类的顺序执行一系列的构造方法
		父类属性-->父类构造方法-->子类属性-->子类构造方法

		多级继承示例
		class Car { //轿车类
			String brand; //品牌
			public Car() {
				//super();此句有无不影响结果
				System.out.println("execute Car()");
			}
			public Car(String brand) {
				this.brand = brand;
				System.out.println("execute Car(brand)");
			}
		}
		class NewEnergyCar extends Car { //新能源轿车类
			String battery; //电池
			public NewEnergyCar() {
				//super();此句有无不影响结果
				System.out.println("execute NewEnergyCar()");
			}
			public NewEnergyCar(String brand, String battery) {
				super(brand); //显示调用父类有参构造，不执行无参构造
				this.battery = battery;
				System.out.println("execute NewEnergyCar(battery)");
			}
		}
		class DriverLessCar extends NewEnergyCar { //无人驾驶轿车类
			String system; //无人驾驶系统
			public DriverLessCar() {
				//super();此句有无不影响结果
				System.out.println("execute DriverLessCar()");
			}
			public DriverLessCar(String brand, String battery, String system) {
				super(brand, battery); //显示调用父类有参构造，不执行无参构造
				this.system = system;
				System.out.println("execute DriverLessCar(system)");
			}
		}
		public static void main(String[] args) { //测试代码
			调用DriverLessCar类带参构造方法-->调用直接父类NewEnergyCar带参构造方法-->调用间接父类Car带参构造方法-->调用祖先类Object默认构造方法
			DriverLessCar driverLessCar = new DriverLessCar();
			System.out.println();
			driverLessCar = new DriverLessCar("大众", "松下电池", "Apollo");
		}
		/**execute Car()
		execute NewEnergyCar()
		execute DriverLessCar()

		execute Car(brand)
		execute DriverLessCar(system)*/

		子类继承父类时构造方法的调用规则
		如果类的构造方法中, 没有通过 super关键字显式调用父类的有参构造方法, 也没有通过 this 关键字显式调用自身的其他构造方法, 则系统会默认先调用父类的无参构造方法
		在这种情况下, 是否写"super();"语句, 效果是一样的
		如果子类的构造方法中, 通过 super 关键字显式地调用了父类的有参构造方法, 则将执行父类相应的构造方法, 而不执行父类无参构造方法
		如果子类的构造方法中, 通过 this 关键字显式地调用了自身的其他构造方法, 在相应的构造方法中遵循以上两条规则
		/**如果存在多级继承关系，则在创建一个子类对象时，以上规则会多次向更高一级父类应用，一直到执行顶级父类 Object 类的无参构造方法为止*/

		为什么使用多态?
		1.添加Crop类的子类
		class Apple extends Crop{ ... }
		class Corn extends Crop{ ... }
		class Pear extends Crop{ ... }
		class Cherry extends Crop{ ... }
		class Tomato extends Crop{ ... }
		^
		|
		2.添加重载的plant()方法
		public class Land{
			public void plant(AppleTree appleTree){ ... }
			public void plant(Corn corn){ ... }
			//省略代码……
			public void plant(Pear pear){ ... }
			public void plant(Cherry cherry){ ... }
			public void plant(Tomato tomato){ ... }
		}
		/**参数都是Crop类的子类，能否简化？*/

		如何实现多态
		实现多态的三要素
		1.继承关系的父类和子类
		2.子类重写父类方法
		3.父类的引用指向子类的对象

		多态的类型
		1.向上转型--子类到父类的转换:自动类型转换
		2.向下转型--父类到子类的转换:强制类型转换

		将一个父类的引用指向一个子类对象称为向上转型
		<父类型> <引用变量名> = new <子类型>();

		Crop crop = new AppleTree("富士"); //自动类型转换
		crop.print(); //调用AppleTree类重写的print()方法

		Land类中, 使用父类Crop作为plant()方法
		public class Land {
			private boolean idle = true; //默认为“空闲”
			//种植作物
			public void plant(Crop crop /**父类作为形参*/) {
				if (! idle) {
					System.out.println("该土地被占用，您可以选择其他土地种植"  + appleTree.getName() + "。");
				}else {
					this.idle = false;
					crop.print();
				}
			}
			//省略其他方法
		}
		public class Test {
			public static void main(String[] args) {
				//土地1种植苹果
				Land land1 = new Land();
				Crop corp1 = new AppleTree("富士");
				//同一种操作方式, 不同的操作对象
				land1.plant(corp1);
				//土地2种植玉米
				Land land2 = new Land();
				Crop corp2 = new Corn(200);
				//同一种操作方式, 不同的操作对象
				land2.plant(corp2);
				//land2上种植苹果时, 出现重复种植提示
				land2.plant(corp1);
			}
		}

		扩展种植梨树
		public class Pear extends Crop {
			private String brand; //品种
			//省略setter、getter方法

			public Pear() {} //类的无参构造方法
			public Pear(String brand) { //类的带参构造方法
				super("梨树", 12, 4, 120); //访问父类的构造方法
				this.brand = brand;
				super.setStatus(Constants.GROW);
			}
			//重写父类的printGrowReport()方法
			public void printGrowReport(int day){
				System.out.println("您种植了" + super.getName() + ",品种：" + this.brand + "。");
				super.printGrowReport(day);//调用父类printGrowReport方法
			}
		}
		/**无需修改Land类*/
		public class Test {
			public static void main(String[] args) {
				//省略种植苹果代码
				//省略种植玉米代码

				//种植梨
				Land land3 = new Land();
				Crop crop3 = new Pear("香水梨");
				land3.plant(crop3);
			}
		}
		/**通过使用继承和多态机制，扩展变得非常容易*/

		优化查看作物生长状态和收获果实
		Land类的关键代码
		public class Land {
			private boolean idle = true; //默认为“空闲”状态
			public Crop crop; //默认值 null
			//种植作物
			public void plant(Crop crop /**同一作物对象，父类类型*/){
				if (!idle) {
					System.out.println("土地被占用，目前无法种植新的作物!");
				}else {
					this.idle = false;
					//通过父类引用，调用子类方法
					crop.print();
				}
			}
			// 查看农作物生长状态
			public void checkAppleGrow(Crop crop /**同一作物对象，父类类型*/, int day) {
				if (!idle) {
					//通过父类引用，调用子类方法
					crop.printGrowReport(day);
				}else {
					System.out.println("您尚未种植任何农作物！");
				}
			}
			//收获作物
			public void harvestCrop(Crop crop /**同一作物对象，父类类型*/) {
				if (!idle) {
					//通过父类引用，调用子类方法
					crop.harvest();
				}else {
					System.out.println("您尚未种植任何农作物！");
				}
			}
		}

		测试类的关键代码
		public class Test {
			public static void main(String[] args) {
				1.定义全局变量
				//土地对象
				Land land = new Land(); //创建土地类
				//各种作物的父类对象
				Crop crop = null; //种植的作物
				2.播种苹果树
				String brand = null; //品种
				//省略键盘接收苹果树品种
				//多态运用：父类引用指向子类对象
				crop = new AppleTree(brand);
				//多态运用：父类作为方法参数
				land.plant(crop);
				3.播种玉米
				double harvestCost = 0;
				//省略键盘接收收割机费用
				//多态运用：父类引用指向子类对象
				crop = new Corn(harvestCost);
				//多态运用：父类作为方法参数
				land.plant(crop);
				4.查看作物生长状态
				//多态运用：父类作为方法参数
				land.checkAppleGrow(crop, 11);
				5.收获果实
				//多态运用：父类作为方法参数
				land.harvestCrop(crop);
				/**为了保证数据的一致性，要将父类对象定义为类的全局变量，使用父类对象作为方法形参时，通过父类引用变量，可调用子类中重写的方法*/
			}
		}

		使用父类作为方法返回值实现多态
		/**假设在土地上选择种植苹果树和梨树两种作物, 实现根据用户的选择获取指定种类树苗并进行种植的功能*/
		实现步骤
		1.Test类中, 定义getCrop(String type)方法
		2.main()方法中
			调用getCrop(String type)方法, 根据用户选择获取树苗, 并返回树苗对象
			调用plant()方法, 种植树苗
		public class Test {
			//main()方法中关键代码
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				Crop crop = getCrop(in.nextInt()); //根据选择购买树苗
				if (crop == null){
					System.out.println("成功获取树苗！");
				}
				Land land = new Land();
				land.plant(crop);
			}

			public static Crop getCrop(int type) {
				Crop crop = null;
				switch (type) {
					case 1:
						crop = new AppleTree(); //获取苹果树
						break;
					case 3:
						crop = new Pear(); //获取梨树
						break;
					default:
						System.out.println("您的输入有误！");
						break;
				}
				return crop;
			}
		}

		向下转型:父类到子类的转换
		ApplyTree类关键代码
		public class ApplyTree {
			//嫁接新品种
			public void grafting(String newBrand) {
				if (this.brand == newBrand) {
					System.out.println("同品种果树无需嫁接。");
				}else {
					this.brand = newBrand;
					System.out.println("经过嫁接，" + super.getName() + "的品种变为" + this.brand + "。");
				}
			}
		}
		Corn类关键代码
		public class Corn {
			//更换收割机
			public void reHarvester(double cost) {
				if (this.harvestCost == cost) {
					System.out.println("更换收割机后，费用不变！");
				}else {
					this.harvestCost = cost;
					System.out.println("更换收割机后，费用变为" + this.harvestCost + "。");
				}
			}
		}
		Test类关键代码
		public class Test {
			public static void main(String[] args) {
				Crop crop = new AppleTree("富士");
				crop.print();
				crop.grafting("粉红佳人"); //crop对象无法访问其子类AppleTree中定义的grafting()方法
			}
		}
		/**如何才能使父类对象访问其子类特有的属性和方法呢？*/
		1.将一个指向子类对象的父类引用赋给一个子类的引用, 即将父类类型转换为子类类型, 称为向下转型
		2.向下转型必须进行强制类型转换
		3.将父类类型转换为它的某个子类类型后, 才能调用其子类特有的属性
		<子类型> <引用变量名> = (<子类型>) <父类型的引用变量>;

		AppleTree appleTree = (AppleTree) crop;//将crop转换为AppleTree类型
		appleTree.grafting("粉红佳人");//调用苹果树的嫁接方法

		instanceof 运算符
		1.从父类到子类的向下转型, 可以实现多态, 即执行不同子类中定义的特定方法
		2.但事实上, 父类对象的引用可能指向某一个子类对象
		3.如果在向下转型时, 不是转换为真实的子类类型, 就会出现转换异常
		public class Test {
			public static void main(String[] args) {
				Crop crop = new AppleTree("富士");
				crop.print();
				//将crop对象强制转换为AppleTree类型
				AppleTree appleTree = (AppleTree) crop; //强制转换成苹果对象
				appleTree.grafting("粉红佳人"); //调用苹果树的嫁接方法
				//JVM检测到两个类型间不兼容时，引发的运行时异常 ClassCastException
				Corn corn = (Corn) crop; //强制转换成玉米对象
				corn.print();
				corn.reHarvester(100); //调用玉米的变更收割机方法
			}
		}
		/**如何通过代码避免这种异常的发生？*/

		用于判断一个对象是否属于一个类或者实现了一个接口
		对象 instanceof 类 | 接口//运行结果为 true 或 false

		public class Test {
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				Crop crop = getCrop(in.nextInt());
				crop.print();
				if (crop instanceof AppleTree) { //类型判断
					((AppleTree) crop).grafting("粉红佳人"); //调用苹果树嫁接方法
				} else if (crop instanceof Corn) { //类型判断
					((Corn) crop).reHarvester(100); //调用玉米变更收割机方法
				}
			}

			public static Crop getCrop(int type) {
				Crop crop = null;
				switch (type) {
					case 1:
						crop = new AppleTree(); //获取苹果树
						break;
					case 2:
						crop = new Corn(); //获取玉米
						break;
					default:
						System.out.println("您的输入有误！");
						break;
				}
				return crop;
			}
		}
		/**对象的类型必须与 instanceof 参数后所指定的类或接口在继承树上具有上下级关系；否则，会出现编译错误*/

		抽象类
		[访问修饰符] abstract /*被定义为抽象类，abstract 为抽象关键字*/ class <类名> {

		}
		public abstract class Crop {
			//省略代码……
		}
		/**抽象类不能被实例化*/

		[访问修饰符] abstract class 类名 {
			[访问修饰符] abstract <返回类型> <方法名>([参数列表]); //只有方法声明，无具体实现
		}
		public abstract class Crop {
			public abstract void print();
		}
		/**有抽象方法的类必然是抽象类，但抽象类中的方法并不一定都是抽象方法*/

		final 用法
		使用 final 类
		public final /*不能被继承*/ class Puppy extends Dog {
			//…
		}
		使用 final 方法
		public class Student {
			public final /*不能被重写*/ void print() {
				System.out.println("我是一个学生！");
			}
		}
		使用常量
		public class Dog {
			final /*不能被修改*/ String name = "帅帅";
			public void setName(String name) {
				this.name=name; //错误，不可再赋值
			}
		}
		final 可以用来修饰类, 方法和属性, 不能修饰构造方法
		Java 提供的很多类都是 final 类, 不能重写
		如:String 类, Math 类
		Object 类有一些 final 方法, 只能被子类继承而不能被重写
		如:getClass(), notify(), wait()
		Object 类的hashCode(), toString(), equals(Object obj)方法不是 final 方法, 可以被重写

		常见错误
		public static abstract void print(); //抽象方法只有声明无具体实现，static 方法可通过类名直接访问，但无法修饰一个没有实现的方法
		private abstract void print(); //抽象方法需在子类中重写，但 private 方法不能被子类继承，自然无法进行重写
		public final abstract void print(); //抽象方法需要在子类中重写，但 final 修饰的方法表示该方法不能被子类重写，前后是相互矛盾的
		1.abstract 和 static 不能结合使用
		2.abstract 和 private 不能结合使用
		3.abstract 和 final 不能结合使用

		接口
		/**是一个不能实例化的类型*/
		定义接口
		[访问修饰符] /*如果是 public，则在整个项目中可见如果省略，则只在该包中可见*/ interface /*定义接口的关键字*/ 接口名 {
			//接口成员
		}
		public interface Cirlcle {
			int P = 5;
			^
			|等效
			public static final int P = 5;
			int P; //错误，接口中必须指定初始值
		}
		/**接口中的变量都是全局静态常量，自动使用 public、static、final 修饰，必须在定义时指定初始值*/

		类实现接口
		class 类名 implements /*实现接口使用的关键字*/ 接口名 {
			//类成员
		}
		//实现类必须实现接口的所有方法，实现类可以实现多个接口，一个接口也可以有多个实现类
		JDK1.8版本之前, 接口中只能定义抽象方法, 自JDK1.8版本开始, 接口还允许定义静态方法和默认方法
		向后兼容
		允许开发者在已有接口里添加新的方法时不需改动已经实施该接口的所有实现类

		定义接口和实现接口示例
		定义MyInterface接口
		public interface MyInterface {
			int P = 5;

			//抽象方法
			void function1(); //接口中抽象方法，系统自动添加 public、abstract 修饰
			//默认方法
			default void function2() { //接口中默认方法，如果不能满足某个实现类的需求，可在实现类中重写
				System.out.println("这是一个默认方法");
			}
			//静态方法
			static void function3() {
				接口中静态方法
				1.不允许在接口的实现类中重写
				2.只能通过接口名称调用
				System.out.println("这是一个静态方法");
			}
		}
		定义MyClass类实现MyInterface接口
		public class MyClass implements /*实现接口*/ MyInterface {
			@Override //重写接口抽象方法
			public void function1() {
				System.out.println("实现MyInterface接口的function1()!");
			}

			public static void main(String[] args) {
				MyClass myClass = new MyClass();
				myClass.function1(); //调用实现类中重写方法
				myClass.function2(); //调用接口中默认方法
				MyInterface.function3(); //调用接口中静态方法
			}
		}

		定义复杂的接口
		接口的多继承
		[访问修饰符] interface 接口名 extends 父接口 1, 父接口 2, ...{
			//常量定义
			//方法定义
		}
		/**一个接口可以继承多个接口，但接口不能继承类*/
		类实现多个接口
		[访问修饰符] class 类名 extends 父类名 implements 接口 1, 接口 2, ...{
			//类的成员
		}
		1.一个普通类只能继承一个父类, 但能同时实现多个接口
		2. extends 关键字必须位于 implements 关键字之前
		3.类必须实现所有接口(接口 1, 接口 2...)的全部抽象方法, 否则必须定义为抽象类

		如果一个类实现了多个接口, 且这些接口具有相同的默认方法, 应该如何处理?
		interface A {
			default void print() {
				System.out.println("这是A接口的一个默认方法");
			}
		}
		interface B {
			default void print() {
				System.out.println("这是B接口的一个默认方法");
			}
		}
		class C implements A, B {
			//C类中必须定义自己的print()方法
			void print() {
				System.out.println("这是C类的print方法");
			}
		}
		public class Test {
			public static void main(String[] args) {
				C cObject = new C();
				cObject.print(); //调用C类print()方法
			}
		}

		Java 中如何进行异常处理
		Java 的异常处理是通过5个关键字来实现的:try, catch, finally, throw, throws
		捕获异常							声明异常							抛出异常
		try-->执行可能产生异常的代码			throws							throw
										^								^
										|								|
										声明方法可能要抛出的各种异常			手动抛出异常
		catch-->捕获异常
		finally-->无论是否发生异常, 代码总能执行

		常用的异常处理结构
		关键字 try, catch, finally 组成常用的异常处理结构
		try {
			//有可能出现异常的语句
		} catch (异常类型 异常对象) {
			//异常处理语句
		} finally {
			//一定会运行到的语句
		}
		try 块/*监听*/-->[catch 块/*捕获异常*/-->finally 块/*释放资源*/]//catch、finally 可选，但不能同时省略

		try-catch 块
		使用 try-catch 块捕获异常, 分为三种情况
		第一种情况:正常
		public static void main(String[] args) {
			try {
		1-->	//代码段(此处不会产生异常)
			} catch (异常类型 ex) {
				//对异常进行处理的代码段
			}
		2-->//代码段
		}
		第二种情况:出现异常
		public static void main(String[] args) {
			try {
		1-->	//代码段1
		2-->	//产生异常的代码段2
				//代码段3
		3-->} catch (异常类型 ex) {
		4-->	//对异常进行处理的代码段4
			}
		5-->//代码段5
		}
		第三种情况:异常类型不匹配
		public static void main(String[] args) {
			try {
		1-->	//代码段1
		2-->	//产生异常的代码段2
				//代码段3
		3-->} catch (异常类型 ex) {
				//对异常进行处理的代码段4
			}
			//代码段5
		}

		使用 try-catch 语句处理接受果商数为0的异常
		try {
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家果商供应" + weight / num + "公斤水果。");
					System.out.println("欢迎再来，预祝生意兴隆！");
		}catch (Exception ex) { //捕捉异常，提示出错信息
			System.err.println("出现错误：采摘量和果商数应为整数，果商数应大于零！");
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：0
		出现错误：采摘量和果商数应为整数，果商数应大于零！*/

		在 catch 块中处理异常
		加入用户自定义处理信息
		System.err.println("出现错误：采摘量和果商数应为整数，果商数应大于零！ ");

		调用方法输出异常信息
		ex.printStackTrace();

		异常对象常用的方法
		方法名							说明
		void printStackTrace()			输出异常的堆栈信息
		String getMessage()				返回异常信息描述字符串, 是printStackTrace()输出信息的一部分

		printStackTrace()的堆栈跟踪功能显示出程序运行到当前类的执行流程
		try {
			//省略代码
		} catch (Exception ex) {
			System.err.println("出现错误：采摘量和果商数应为整数，果商数应大于零！");
			ex.printStackTrace(); //输出完整异常信息
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：八家
		出现错误：采摘量和果商数应为整数，果商数应大于零！
		java.util.InputMismatchException //异常类型
			at java.util.Scanner.throwFor(Scanner.java:864)
			at java.util.Scanner.next(Scanner.java:1485)
			at java.util.Scanner.nextInt(Scanner.java:2117)
			at java.util.Scanner.nextInt(Scanner.java:2076)
			at com.javaex.em6_4.Test4.main(Test4.java:14) //在此方法中抛出了异常.出现异常的位置*/

		try-catch-finally 块
		//在 try-catch 块后加入 finally 块，是否发生异常都执行
		有异常:try 块-->catch 块-->finally 块
		无异常:try 块-->finally 块

		使用 try-catch-finally 语句处理果商数为0的异常
		try {
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家是商供应" + weight / num + "公斤水果。");
		} catch (Exception ex) {
			System.err.println("您输入的果商数有误，应为整数且大于零！");
			ex.printStackTrace();
		} finally { //无论是否出现异常，都会执行 finally 块中代码
			System.out.println("欢迎再来，预祝生意兴隆！");
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：0
		出现错误：采摘量和果商数应为整数，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at com javaex.em6_5.Test5.main(Test5.java:14)
		欢迎再来，预祝生意兴隆！*/

		在 try-catch 块后加入 finally 块
		存在 return 的 try-catch-finally 块
		public void method() {
			try {
		1-->	//代码段1
		2-->	//产生异常的代码段2
		3-->} catch (异常类型 ex) {
		4-->	//对异常进行处理的代码段3
		6-->	return;
			} finally {
		5-->	//代码段4
			}
		}

		try {
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家果商供应" + weight / num + "公斤水果。");
			return; //不影响 finally 块执行
		} catch (Exception ex) {
			System.err.println("出现错误：采摘量和果商数应为整数，果商数应大于零！");
			ex.printStackTrace();
			return; //不影响 finally 块执行
		} finally {
			System.out.println("欢迎再来，预祝生意兴隆！");
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：0
		出现错误：采摘量和果商数应为整数，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at com javaex.em6_5.Test5.main(Test5.java:14)
		欢迎再来，预祝生意兴隆！*/

		//return;在逻辑控制语句中可以有终止执行逻辑控制语句的功能

		在 try-catch 块后加入 finally 块
		不执行的唯一情况
		public void method() {
			try {
		1-->	//代码段1
		2-->	//产生异常的代码段2
		3-->} catch (异常类型 ex) {
		4-->	//对异常进行处理的代码段3
		5-->	System.exit(1);
			} finally {
				//代码段4
			}
		6-->//省略代码
		}

		使用System.exit()方法不执行 finally 块的代码
		try {
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家是商供应" + weight / num + "公斤水果。");
		} catch (Exception ex) {
			System.err.println("出现错误：采摘量和果商数应为整数，果商数应大于零！");
			ex.printStackTrace();
			System.exit(1); //finally 语句块不被执行的唯一条件，直接退出 Java 虚拟机
		} finally {
			System.out.println("欢迎再来，预祝生意兴隆！");
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：0
		出现错误：采摘量和果商数应为整数，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at com javaex.em6_5.Test5.main(Test5.java:14)*/

		多重 catch 块
		/**程序中可能存在多种异常类型，不同的异常类型有不同的处理方式*/
		try {
			//有可能出现异常的语句
		} catch (异常类型1 异常对象) {
			//异常处理语句
		} catch (异常类型2 异常对象) {
			//异常处理语句
		} finally {
			//一定会运行到的语句
		}

		引发多种类型的异常
		排列 catch 语句的顺序:先子类后父类
		发生异常时按顺序逐个匹配
		只执行第一个与异常类型匹配的 catch 语句
		public void method() {
			try {
		1-->	//代码段
		2-->	//产生异常(异常类型2)
		3-->} catch (异常类型1 ex) {
				//对异常进行处理的代码段
		4-->} catch (异常类型2 ex) {
		5-->	//对异常进行处理的代码段
			} catch (异常类型3 ex) {
				//对异常进行处理的代码段
			}
		6-->//代码段
		}

		多重异常处理示例
		使用多重 catch 块实现计算每家果商可以分到的蔬果重量
		/**从上到下的顺序检测每个 catch 语句。当匹配到某条 catch 语句后，后续其他 catch 语句块将不再执行
		Exception 为参数的 catch 语句必须放在最后的位置；否则，后面以其子类异常作为参数的 catch 语句将得不到被执行的机会*/
		try {
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家果商供应" + weight / num + "公斤水果。");
		} catch (ArithmeticException ex) { //输入0
			System.err.println("出现错误：果商数应大于零！");
			ex.printStackTrace();
		} catch (InputMismatchException ex) { //输入非整数值
			System.err.println("出现错误：果实采摘量和果商数应为整数！");
			ex.printStackTrace();
		} catch (Exception ex) { //其他类型异常
			System.err.println("其他未知错误！");
			ex.printStackTrace();
		} finally {
			System.out.println("欢迎再来，预祝生意兴隆！");
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：0
		出现错误：采摘量和果商数应为整数，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at com javaex.em6_5.Test5.main(Test5.java:14)
		欢迎再来，预祝生意兴隆！*/

		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：八家
		出现错误：果实采摘量和果商数应为整数！
		java.util.InputMismatchException
			at java.util.Scanner.throwFor(Scanner.java:864)
			at java.util.Scanner.next(Scanner.java:1485)
			at java.util.Scanner.nextInt(Scanner.java:2117)
			at java.util.Scanner.nextInt(Scanner.java:2076)
			at com.javaex.em6_4.Test4.main(Test4.java:14)
		欢迎再来，预祝生意兴隆！*/

		异常的分类
		//Throwable 类的父类
		Object{
			//Exception 和 Error 类的父类
			Throwable[
				//仅靠程序本身无法恢复的严重错误
				Error(
					VirtualMachineError 虚拟机错误
					OutOfMemoryError 内存溢出
					ThreadDeath 线程死锁
					...
				)
				//由 Java 应用程序抛出和处理的非严重错误
				Exception(
					//运行时异常，不要求程序必须做出处理
					RuntimeException:NullPointerException 空指针异常, ArrayIndexOutOfBoundsException 数组下标越界异常,ArithmeticException 算数异常, ClassCastException 类型转换异常...
					//Checked 异常，程序必须处理该类异常
					IOException IO异常
					SQLException SQL异常
					...
				)
			]
		}

		运行时异常
		/**是可以在程序中避免的异常，当程序进行时发生异常，会输出异常堆栈信息并终止程序运行，可以使用 try-catch 语句捕获*/
		常见的异常类型
		异常类型									说明
		ArithmeticException						当出现算术错误时, 抛出此异常
												如:一个整数"除以零"时, 抛出此异常
		ArrayIndexOutOfBoundsException			非法索引访问数组时抛出的异常
												如索引为负或大于等于数组长度
		ClassCastException						当试图将对象强制转换为非本对象类型的子类时, 抛出该异常
		IllegalArgumentException				表明向方法传递了一个不合法或不正确的参数
		InputMismatchException					欲得到的数据类型与实际输入的类型不匹配
		NullPointerException					当应用程序试图在需要对象的地方使用 null 时, 抛出该异常
		NumberFormatException					当试图将字符串转换成一种数值类型, 但该字符串不能转换为适当格式时, 抛出该异常
												如:把"ABC"转成数字

		Checked 异常
		/**是指运行时异常以外的异常，是用户错误或问题引起的异常，程序员无法预见，编译器会提示，如果不进行捕获，则会出现编译错误*/
		常见的异常类型:
		FileNotFoundException 异常
		SQLException 异常

		声明异常
		/**如果在一个方法体中抛出了异常, 如何通知调用者? 使用关键字 throws 声明某个方法可能抛出的各种异常*/
		public void 方法名() throws 异常类型, 异常类型 /*声明异常，多个异常用逗号隔开*/ {
			//方法体
		}
		声明异常示例
		使用关键字 throw 声明异常, 并处理异常
		方式1:调用者处理异常
		public static void main(String[] args) {
			//调用者处理异常
			try {
				calculation();
			} catch (Exception ex) {
				System.err.println("出现错误：采摘量和果商数应为整数，果商数应大于零！");
				ex.printStackTrace();
			} finally {
				System.out.println("欢迎再来，预祝生意兴隆！");
			}
		}
		public static void calculation() throws Exception /*声明方法中可以发生的所有异常*/ {
			Scanner input = new Scanner(System.in);
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家果商供应" + weight / num + "公斤水果。");
		}

		方式2:调用者继续声明异常
		/**main()方法声明的异常由 Java 虚拟机处理
		实际开发中，main()方法不建议声明异常，因为如果程序出现了错误，会导致程序中断执行*/
		public static void main(String[] args) throws Exception /*调用者继续声明异常*/ {
			calculation();
		}
		public static void calculation() throws ArithmeticException, InputMismatchException /*声明多个异常类型*/ {
			Scanner input = new Scanner(System.in);
			System.out.print("请输入果实采摘量（公斤）：");
			int weight = input.nextInt();
			System.out.print("请输入果商数（家）：");
			int num = input.nextInt();
			System.out.println("每家果商供应" + weight / num + "公斤水果。");
		}
		/**请输入果实采摘量（公斤）：3200
		请输入果商数（家）：0
		出现错误：采摘量和果商数应为整数，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at com javaex.em6_5.Test5.main(Test5.java:14)
		欢迎再来，预祝生意兴隆！*/


		抛出异常
		/**除了系统自动抛出异常外，有些问题需要程序员自行抛出异常
		根据程序逻辑自定义的异常类，在 Java 异常体系中并未提供，不能抛出
		根据业务需要自行选择异常抛出时机，或自定义异常处理逻辑*/
		throw /*创建异常类的对象通过 throw 抛出*/ new 异常名 (参数列表);
		throw new Exception();
		/**throw 抛出的只能是 Throwable 类或其子类的对象*/
		抛出异常示例
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("请录入您的年龄:");
			int age = input.nextInt();
			//调用方法，处理异常
			try {
				ThrowTest test = new ThrowTest();
				System.out.println(test.ShowTicketPrice(age));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		public String ShowTicketPrice(int age) throws Exception {
			if (age < 3 ) {
				//抛出异常
				throw new Exception("您录入的年龄有误！");
			} else if (age >= 60 || age <= 6) {
				return "您可以购买半价票25元!";
			} else {
				return "您需要购买全价票50元!";
			}
		}
		/**请录入您的年龄:2
		java.lang.Exception: 您录入的年龄有误！
			at com javaex.em6_11.Test11.ShowTickePrice(Test11.java:24)
			at com javaex.em6_11.Test11.main(Test11.java:14)*/

		自定义异常
		/**当 Java 异常体系中提供的异常类型不能满足程序的需要时，可以自定义异常类*/
		1.定义异常类, 继承 Exception 类或者 RuntimeException 类
		2.编写异常类的构造方法, 并继承父类的实现
		常见的构造方法:
		public Exception() { //构造方法1
			super();
		}
		public Exception(String message) { //构造方法2
			super(message);
		}
		public Exception(String message, Throwable cause) { //构造方法3
			super(message, cause);
		}
		public Exception(Throwable cause) { //构造方法4
			super(cause);
		}
		3.实例化自定义异常对象, 并使用 throw 关键字抛出
		自定义异常示例
		自定义异常类AgeException, 捕捉年龄在正常
		public class AgeException extends Exception { //继承 Exception 类
			public AgeException() { //异常类的构造方法
				super();
			}
			public AgeException(String message) { //异常类的构造方法
				super(message);
			}
			//省略其他构造方法……
		}
		public static void ShowTicketPrice(int age) throws  AgeException {
			if (age < 3 ) {
				throw new AgeException("您录入的年龄有误，3岁以下儿童暂不能观影!");
			} else if (age >=60 || age <=6) {
				System.out.println("您可以购买半价票25元!");
			} else {
				System.out.println("您需要购买全价票50元!");
			}
		}
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("请录入您的年龄:");
			int age = input.nextInt();
			try {
				ShowTicketPrice(age);
			} catch(AgeException ex) {
				ex.printStackTrace();
			}
		}

		日志框架log4j2
		一款非常优秀的日志框架
		1.控制日志的输出级别
		2.控制日志信息输送的目的地是控制台, 文件等
		3.控制每一条日志的输出格式

		使用log4j2记录日志
		/**需要手工创建，一般用log4j2.xml命名*/
		操作步骤
		1.编写配置文件
		文件后缀可为.xml, .json或者.jsn
		2.定义日志记录器Logger
		获取日志记录器的方式
		3.记录日志
		Logger 类可以替代System.out或者System.err, 供开发者记录日志信息
		Logger 类常用方法
		方法													描述
		public void debug (Object msg)						记录debug级别日志
		public void debug (Object msg, Throwable t)
		public void info (Object msg)						记录info级别日志
		public void info (Object msg, Throwable t)
		public void warn (Object msg)						记录warn级别日志
		public void warn (Object msg, Throwable t)
		public void error (Object msg)						记录error级别日志
		public void error (Object msg, Throwable t)
		public void fatal (Object msg)						记录fatal级别日志
		public void fatal (Object msg, Throwable t)

		日志记录器的日志级别
		低-->高
		all:最低等级, 用于打开所有日志记录
		trace:用于程序追踪输出
		debug:指出细粒度信息事件, 对高度应用程序是非常有帮助的
		info:在粗粒度级别上指明消息, 强调应用程序的运行过程
		warn:表示警告信息, 即可能会出现的潜在错误
		error:指出虽然发生错误事件, 但仍然不影响系统的继续运行
		fatal:指出将会严重的错误事件将会导致应用程序退出
		OFF:最高等级的, 用于关闭所有日志记录
		/**程序会输出高于或等于所设置级别的日志，设置的日志等级越高，输出的日志就越少*/

		使用log4j2记录日志示例
		在控制台和文件中同时记录日志信息
		信息录入以及正常执行的情况记录为debug级别日志
		发生异常的信息记录为error级别日志
		格式要求
		控制台输出内容:执行位置, 记录日志级别及输出信息
		文本日志记录内容:日期和时间(精确到秒), 执行位置, 记录日志级别及输出信息
		实现步骤
		1.编写配置文件log4j2.xml
		2.定义日志记录器Logger
		3.记录日志

		配置文件log4j2.xml里的关键节点
		<?xml version = "1.0" encoding = "UTF-8" ?><!--XML文档声明-->
		<configuration status = "OFF">
			<!--日志输出目的地集合-->
			<appenders>
				<!--日志输出到控制台的配置节点-->
				<Console name = "Console" target = "SYSTEM_OUT">
					<PatternLayout pattern = "%d{yyyy-MM-dd HH:mm:ss} [%l] %-5level - %msg%n" /><!--配置日志输出格式-->
				</Console>
				<!--日志输出到指定位置文件的配置节点-->
				<File name = "log" fileName = "log/test.log">
					<PatternLayout pattern = "%d{yyyy-MM-dd HH:mm:ss} [%l] %-5level - %msg%n" /><!--配置日志输出格式-->
				</File>
			</appenders>
			<!--logger节点集合-->
			<loggers>
				<!--指定项目的根日志-->
				<root level = "all"><!--可以输出所有级别的日志信息-->
					<!--指定日志输出的配置项-->
					<appender-ref ref = "Console"/>
					<appender-ref ref = "log"/>
					<!--appender-ref引用的值需与appenders中匹配节点的name属性一致, 而不是与节点名一致-->
				</root>
			</loggers>
		</configuration>

		记录日志的关键代码
		private static final Logger logger = LogManager.getLogger(Test.class.getName()); //获取 Logger 对象
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			try {
				System.out.print("请输入果实采摘量（公斤）：");
				int weight = input.nextInt();
				logger.debug("采摘量:" + weight); //向日志中写入Debug信息
				System.out.print("请输入果商数（家）：");
				int num = input.nextInt();
				logger.debug("果商数:" + num); //向日志中写入Debug信息
				System.out.println("每家是商供应" + weight / num + "公斤水果。");
				logger.debug("输出结果:" + String.format("%d/%d=%d", weight, num, weight / num)); //向日志中写入Debug信息
			} catch (ArithmeticException ex) {
				logger.error("输入有误，果商数应大于零！", ex);//记录日志
			} //省略多重 catch {
			} finally {
				System.out.println("欢迎再来，预祝生意兴隆！");
			}
		}
		正常时, 输出到控制台的日志信息:
		/**请输入果实采摘量（公斤）： 3200
		[Test.main(Test.java:13)] DEBUG - 采摘量:3200
		请输入果商数（家）：8
		[Test.main(Test.java:16)] DEBUG - 果商数:8
		每家果商供应400公斤水果。
		[Test.main(Test.java:18)] DEBUG 输出结果:3200/8=400
		欢迎再来，预祝生意兴隆！*/

		异常时, 输出到控制台的日志信息:
		/**请输入果实采摘量（公斤）：3200
		[Test.main(Test.java:13)] DEBUG - 采摘量:3200
		请输入果商数（家）：0
		[Test.main(Test.java:16)] DEBUG - 果商数:0
		[Test.main(Test.java:20)] ERROR - 输入有误 果商数应大于零!
		java.lang.ArithmeticException: / by zero
			at Test.main(Test.jata:17) [LogTest/:?]
		欢迎再来，预祝生意兴隆！*/

		输出到文件test.log中的日志信息:
		/**2020-11-02 19:03:50 [Test.main(Test.java:13)] DEBUG - 采摘量:3200
		2020-11-02 19:04:01 [Test.main(Test.java:16)] DEBUG - 果商数:0
		2020-11-02 19:04:01 [Test.main(Test.java:20)] ERROR - 输入有误，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at Test,main(Test,java:17) [LogTest/:?]
		2020-11-02 19:11:35 [Test.main(Test java:13)] DEBUG - 采摘量:3200
		2020-11-02 19:11:40 [Test.main(Test java:16)] DEBUG - 果商数:8
		2020-11-02 19:11:40 Test,main(Test java:18)] DEBUG - 输出结果:3200/8=400
		2020-11-02 19:16:07 [Test.main(Test.java:13)] DEBUG - 采摘量:3200
		2020-11-02 19:16:10 [Test.main(Test,java:16)) DEBUG - 果商数:0
		2020-11-02 19:16:10 [Test main(Test,java:20)] ERROR - 输入有误，果商数应大于零！
		java.lang.ArithmeticException: / by zero
			at Test.main(Testjava:17) (LogTest/:?]*/

		集合框架
		1.接口:Iterator<----/*Produces*/----Collection/*Java 集合框架的根接口*/<----/*Produces*/----Map/*Java 集合框架的根接口*/
		Collection/*Collection 接口存储一组不唯一，无序的对象*/:List/*存储一组不唯一，有序（插入顺序）的对象*/, Set/*存储一组唯一，无序的对象*/
		Map/*Map 接口存储一组键值对象，提供 key 到 value 的映射*/:HashMap, TreeMap
		2.具体类:
		List:
		ArrayList/*实现长度可变的数组，遍历元素和随机访问元素的效率比较高，在内存中分配连续的空间*/
		LinkedList/*采用双向链表存储方式，插入、删除元素时效率比较高，第一个节点与最后一个节点为head、tail，每个节点中都有两个指针*/
		Set:HashSet, TreeSet
		3.算法:
		Utilities:Collections/*提供了对集合进行排序、遍历等多种算法实现*/, Arrays

		Collection 接口
		Collection 接口是 List, Set 接口的父接口
		接口里定义的方法即可用于操作 Set 集合, 也可用于操作 List 集合
		常用方法
		方法												描述
		boolean add(Object o)							用于向集合中添加一个元素, 如果集合不允许重复且已包含了指定元素, 则返回 false
		boolean addAll(Collection c)					将集合c里所有元素添加到指定集合里, 添加成功返回 true
		void clear()									清除集合中所有元素, 将集合长度变为为0
		boolean contains(Object o)						判断集合中是否包含指定元素
		boolean containsAll(Collection c)				判断集合中是否包含集合c里所有的元素
		boolean remove(Object o)						删除集合中的指定元素o, 当集合中包含了一个或多个元素o时, 这些元素将被删除, 删除成功, 返回 true
		int size()										返回集合里元素的个数
		boolean retainAll(Collection c)					从集合中删除集合c里不包含的元素(相当于把调用该方法的集合变成该集合和集合c的交集)
														如果该操作改变了调用该方法的集合, 则返回 true
		boolean removeAll(Collection c)					从集合中删除集合c里包含的所有元素, 如果删除了一个或一个以上的元素, 则返回 true
		boolean isEmpty()								如果此集合中不包含任何元素, 则返回 true
		Object[] toArray()								该方法把集合转换成一个数组, 所有的集合元素变成对应的数组元素

		Collection 接口示例
		使用 Collection 集合实现下面功能
		存储果商采购的水果品类信息
		Collection fruitList1 = new ArrayList();
		System.out.println("********添加元素add()**********");
		fruitList1.add("香水梨"); //Java 集合中的元素全部是引用类型的对象
		fruitList1.add("苹果梨");
		fruitList1.add("皇冠梨");
		fruitList1.add(5); //向Java 集合中强制添加基本数据类型元素，会自动封装成对象
		System.out.println("第1个集合里的元素：" + fruitList1/*需要调用集合类型本身的toString()方法*/);

		获取水果品类总数
		System.out.println("********获取元素个数size()**********");
		System.out.println("第1个集合一共添加了" + fruitList1.size()+"类水果信息。");

		删除指定的品类数据
		System.out.println("********删除元素remove()**********");
		fruitList1.remove(5);
		System.out.println("第1个集合里的元素：" + fruitList1);

		判断集合中是否包含指定数据
		System.out.println("********判断集合是否包含指定元素contains()**********");
		System.out.println("第1个集合中是否包含富士苹果？" + fruitList1.contains("富士苹果"));

		输出全部水果品类信息
		Collection fruitList1 = new ArrayList();
		//省略添加元素的代码
		System.out.println("********判断集合包含关系containsAll()**********");
		Collection fruitList2 = new HashSet();
		System.out.println("第1个集合里的元素：" + fruitList1);
		System.out.println("第2个集合是否包含第1个集合？" + fruitList2.containsAll(fruitList1));
		//省略添加元素的代码
		fruitList2.add(5);
		System.out.println("第2个集合是否包含第1个集合？" + fruitList2.containsAll(fruitList1));

		清空集合
		System.out.println("********删除集合2全部元素clear()**********");
		fruitList2.clear();
		System.out.println("第2个集合里的元素：" + fruitList2);
		/********添加元素add()**********
		第1个集合里的元素：[香水梨, 苹果梨, 皇冠梨, 5]
		********获取元素个数size()**********
		第1个集合一共添加了4类水果信息。
		********删除元素remove()**********
		第1个集合里的元素：[香水梨, 苹果梨, 皇冠梨]
		********判断集合是否包含指定元素contains()**********
		第1个集合中是否包含富士苹果？false
		********判断集合包含关系containsAll()**********
		第1个集合里的元素：[香水梨, 富士苹果, 苹果梨, 金帅苹果]
		第2个集合是否包含第1个集合？false
		第2个集合是否包含第1个集合？true
		********删除集合2全部元素clear()**********
		第2个集合里的元素：[]*/
		/**集合中存储元素为 Object 类型对象，属于引用数据类型，默认调用 Object 类toString()方法执行输出操作
		本示例输出集合元素时，调用 String 类重写的toString()方法*/

		迭代器 Iterator
		方法一:
		使用 Iterator 接口遍历集合元素 //Iterator 对象也被称为迭代器
		获取 Iterator:Collection 接口的iterator()方法
		Iterator 接口定义的方法
		方法								描述
		boolean hasNext()				是否存在下一个迭代元素, 存在则返回 true
		Object next()					返回迭代的下一个元素
		void remove()					删除集合里上一次next()方法返回的元素
		方法二:
		使用 forEach 循环遍历集合元素

		使用 Iterator 对象遍历集合示例
		使用 Iterator 对象实现
		1.定义Fruit类, 描述水果对象
		2.定义测试类, 向集合中添加数据和遍历集合
		public class Fruit {
			private String brand; //水果品种
			private double price; //价格
			//省略setter/getter()方法
			public Fruit() {}
			public Fruit(String brand, double price) {
				this.brand = brand;
				this.price = price; //每斤价格
			}
			//输出信息
			public void show() {
				System.out.println(this.brand + ",每斤" + this.price + "元。");
			}
		}

		import java.util.Collection;
		import java.util.HashSet;
		import java.util.Iterator; //导入相关类

		fruitList.add(new Fruit("苹果梨", 2));
		fruitList.add(new Fruit("金帅苹果", 3));
		fruitList.add(new Fruit("香水梨", 2.5));
		fruitList.add(new Fruit("富士苹果", 3.5));
		Iterator it = fruitList.iterator();
		while (it.hasNext()) {
			Fruit fruit = (Fruit) it.next();
			fruit.show();
		}
		/**苹果梨,每斤2.0元。
		香水梨,每斤2.5元。
		金帅苹果,每斤3.0元。
		富士苹果,每斤3.5元。*/

		Iterator 的使用必依赖于 Collection 对象
		Iterator 仅用于遍历集合, 并不提供储存数据的功能
		使用 Iterator 迭代访问 Collection 集合时, 可调用 Iterator 的remove()方法删除集合元素
		Iterator it = fruitList.iterator();
		while (it.hasNext()) {
			Fruit fruit = (Fruit) it.next();
			if (fruit.brand.equals("苹果梨")) {
				it.remove();
			}else {
				fruit.show();
			}
		}
		/**使用 Iterator 对集合元素进行迭代时，是把集合元素的值传给迭代器，因此，删除迭代器中存储的值不会影响集合中保存的元素*/

		常见错误
		对 Collection 集合进行遍历操作时, 其中的元素不能被改变
		Iterator it = fruitList.iterator();
		while (it.hasNext()) {
			Fruit fruit = (Fruit) it.next();
			if (fruit.brand.equals("苹果梨")) {
				fruit.remove(); //引发 ConcurrentModificationException 异常
			}else {
				fruit.show();
			}
		}

		使用 forEach 循环遍历集合元素
		forEach 循环
		JDK1.5引入的语法结构, 也称为增强 for 循环
		可用于遍历集合和数组
		for (数据类型type 迭代变量名value : 迭代对象object) {
			//引用迭代变量value的语句
		}
		使用 forEach 循环遍历水果品类集合
		for (Object obj : fruits) {
			Fruit fruit = (Fruit) obj;
			fruit.show();
		}
		/**苹果梨,每斤2.0元。
		香水梨,每斤2.5元。
		金帅苹果,每斤3.0元。
		富士苹果,每斤3.5元。*/
		/**与 Iterator 接口类似，forEach 循环中迭代变量也不是集合元素本身，系统只是依次把集合元素的值赋给迭代变量。因此，在 forEach 循环中修改迭代变量的值也没有任何实际意义*/

		使用forEach()方法：lambda表达式
		forEach()方法是Java 8为所有集合新增的方法。该方法定义在java.lang.Iterable接口中。
		java.lang.Iterable接口是 Java 5 引入的，目的在于为实现该语句的对象提供forEach循环语句。换句话说，所有实现了该接口的对象都可以使用forEach语句进行迭代。
		该方法的原型如下
		default void forEach(Consumer<? super T> action)
		//直接打印fruitList中的对象元素
		fruitList.forEach(System.out::println);
		或
		fruitList.forEach(obj -> {
			System.out.println(obj);
		});
		/**obj可以为多个值，比如遍历 Map 集合的时候obj可以写成(k, v)，输出语句则写为System.out.println("键：" + k + ", 值：" + v)即可打印键值对*/

		Collections
		是一个包装类（工具类/帮助类）
		它包含有各种有关集合操作的静态多态方法。
		此类不能实例化，就像一个工具类，用于对集合中元素进行排序、
		搜索以及线程安全等各种操作，服务于 Java 的 Collection 框架。
		方法																	描述
		static void reverse(List list)											对指定 List 集合元素进行逆向排序
		static void shuffle(List list)											对 List 集合元素进行随机排序（shuffle 方法模拟了“洗牌”动作）
		static void sort(List list)												根据元素的自然顺序对指定 List 集合的元素按升序进行排序
		static void sort(List list, Comparator c)								根据指定 Comparator 产生的顺序对 List 集合元素进行排序
		static void swap(List list, int i, int j)								将指定 List 集合中的 i 处元素和 j 处元素进行交换
		static void rotate(List list, int distance)								当distance为正数时，将 List 集合的后distance个元素“整体”移到前面；
																				当distance为负数时，将 List 集合的前distance个元素“整体”移到后面。该方法不会改变集合的长度
		static int binarySearch(List list, Object key)							使用二分搜索法搜索指定的 List 集合，以获得指定对象在 List 集合中的索引。
																				如果要使该方法可以正常工作，则必须保证 List 中的元素已经处于有序状态
		static Object max(Collection coll)										根据元素的自然顺序，返回给定集合中的最大元素
		static Object max(Collection coll, Comparator comp)						根据 Comparator 指定的顺序，返回给定集合中的最大元素
		static Object min(Collection coll)										根据元素的自然顺序，返回给定集合中的最小元素
		static Object min(Collection coll, Comparator comp)						根据 Comparator 指定的顺序，返回给定集合中的最小元素
		static void fill(List list, Object obj)									使用指定元素obj替换指定 List 集合中的所有元素
		static int frequency(Collection c, Object o)							返回指定集合中指定元素的出现次数
		static int indexOfSubList(List source, List target)						返回子 List 对象在父 List 对象中第一次出现的位置索引；如果父 List 中没有出现这样的子 List，则返回-1
		static int lastIndexOfSubList(List source, List target)					返回子 List 对象在父 List 对象中最后一次出现的位置索引；如果父 List 中没有岀现这样的子 List，则返回-1
		static boolean replaceAll(List list, Object oldVal, Object newVal)		使用一个新值newVal替换 List 对象的所有旧值oldVal
		static void copy(List<? super T> dest, List<? extends T> src)			将src集合中的全部元素复制到dest集合中，共享索引位置

		List 接口
		继承 Collection 接口, 存储一组可重复的有序对象
		元素顺序以元素插入的次序来放置元素, 不会重新排序
		通过索引访问数组元素, 索引从0开始
		根据索引操作集合元素的方法
		方法														描述
		void add(int index, Object element)						将元素(element)插入到 List 的指定位置(index)处
		boolean addAll(int index, Collection c)					将集合c所包含的所有元素都插入 List 集合指定位置(index)处
		Object get(int index)									返回集合index索引处的元素
		int indexOf(Object o)									返回对象o在 List 集合中第一次出现的位置索引
		int lastIndexOf(Object o)								返回对象o在 List 集合中最后一次出现的位置索引
		Object remove(int index)								从集合中删除指定位置的元素
		boolean remove(Object o)								从集合中删除指定对象
		Object set(int index, Object element)					将index索引处的元素替换成element对象, 返回新元素
		List subList(int fromIndex, int toIndex)				返回从索引fromIndex(包含)到索引toIndex(不包含)处所有集合元素组成的子集合

		ArrayList 类
		关键代码
		创建集合及元素对象
		List fruits = new ArrayList();
		Fruit fruit1 = new Fruit("苹果1号", 2.5);
		Fruit fruit2 = new Fruit("苹果2号", 2.0);
		Fruit fruit3 = new Fruit("苹果3号", 3.5);
		Fruit fruit4 = new Fruit("苹果4号", 3.0);
		System.out.println("*******向集合中存储信息********");
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		showData(fruits);
		^
		|
		public static void showData(List list) {
			for (int i = 0; i < list.size(); i++) {
				Fruit fruit = (Fruit) list.get(i); //逐个获取各元素
				fruit.show();
			}
		}

		将新增水果对象插入到集合的第2个位置
		System.out.println("******将4号苹果插入到第2个位置******");
		fruits.add(1,fruit4);

		删除集合里第3个水果对象
		System.out.println("********删除第3个元素********");
		fruits.remove(2);

		将集合里第2个元素替换成新的水果对象
		System.out.println("*******将第2个元素替换成新元素********");
		fruits.set(1,new Fruit("无名苹果",1));

		将集合的第2个元素(包含)到第3个元素(不包含)截取成子集合
		System.out.println("*******截取子字符串********");
		showData(fruits.subList(1,2));

		使用 List 集合的注意事项
		可以使用索引访问 List 集合元素
		可以使用 for 循环遍历 List 集合
		List 集合中存放的都是 Object 类对象
		add(Object o)方法的参数是 Object 类对象
		在通过get(int i)方法获取元素时必须进行强制类型转换:
		Fruit fruit = (Fruit) list.get(i);
		删除集合元素的方法:
		按索引删除:fruits.remove(2);
		按对象删除:fruits.remove(fruit3);
		调用set(int index, Object o)方法改变 List 集合指定索引的元素时, 指定的索引必须是 List 集合的有效索引
		set(int index, Object o)方法不会改变 List 集合的长度

		LinkedList 类
		具有双向链表结构, 更加方便实现添加和删除操作
		除了具有 List 接口扩展的方法外, 还提供了实现链表操作的方法
		方法									描述
		void addFirst(Object o)				在链表的首部添加元素
		void addLast(Object o)				在链表的末尾添加元素
		Object getFirst()					返回链表中第一个元素
		Object getLast()					返回链表中最后一个元素
		Object removeFirst()				删除并返回链表中的第一个元素
		Object removeLast()					删除并返回链表中的最后一个元素

		实现思路及关键代码
		创建集合及元素对象
		LinkedList fruits = new LinkedList();
		Fruit fruit1 = new Fruit("苹果1号", 2.5);
		Fruit fruit2 = new Fruit("苹果2号", 2.0);
		Fruit fruit3 = new Fruit("苹果3号", 3.5);
		Fruit fruit4 = new Fruit("苹果4号", 3.0);

		向集合中添加元素
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		fruits.add(fruit4);
		System.out.println("集合中包含水果信息如下：");
		showData(fruits);
		^
		|
		public static void showData(List list) {
			for (int i = 0; i < list.size(); i++) {
				Fruit fruit = (Fruit) list.get(i);
				fruit.show();
			}
		}

		查看集合中第一条水果信息
		Fruit firstFruit = (Fruit) ((LinkedList) fruits).getFirst();
		System.out.println("集合中第一类水果：" + firstFruit.getBrand());

		查看集合中最后一条水果信息
		Fruit lastFruit = (Fruit) ((LinkedList) fruits).getLast();
		System.out.println("集合中最后一类水果：" + lastFruit.getBrand());

		删除集合中第一条和最后一条信息
		fruits.removeFirst();
		fruits.removeLast();
		System.out.println("删除部分信息后还有" + fruits.size() + "条水果信息。如下：");
		showData(fruits);
		/**集合中包含水果信息如下：
		苹果1号,每斤2.5元。
		苹果2号,每斤2.0元。
		苹果3号,每斤3.5元。
		苹果4号,每斤3.0元。
		集合中第一类水果：苹果1号
		集合中最后一类水果：苹果4号
		删除部分信息后还有2条水果信息。如下：
		苹果2号,每斤2.0元。
		苹果3号,每斤3.5元。*/

		Set 接口
		和 List 接口一样, 也是 Collection 的子接口
		集合里的多个对象之间没有明显的顺序
		不允许包含重复的元素
		与 Collection 接口基本一样, 没有提供额外的方法, 只是行为上略有不同

		HashSet 类
		是 Set 接口的典型实现
		可以实现对无序不重复数据的存储, 具有很好的存取和查找性能
		特征:
		1.不允许存储重复的元素
		2.没有索引, 没有包含索引的方法, 不能使用索引遍历
		3.无序集合, 存储元素和取出元素的顺序可能不一致
		4.执行添加操作时, 会将新添加的对象依次和集合中现有的元素进行比较
		5.通过执行集合元素的hascode()方法和equals()方法进行判断
		6.如果集合中不存在所添加的元素, 则添加成功, 否则, 添加失败
		7.不能使用索引进行遍历

		使用 HashSet 集合存储水果信息数据
		关键代码
		//创建一个 HashSet 集合和多条水果数据
		Set fruits = new HashSet();
		Fruit fruit1 = new Fruit("金帅苹果", 2.5);
		Fruit fruit2 = new Fruit("富士苹果", 2.0);
		//向集合中添加元素
		fruits.add(fruit1); //添加重复对象的操作失败
		fruits.add(fruit2);
		System.out.println("添加重复元素，是否成功：" + fruits.add(fruit1)); //添加重复对象的操作失败
		//遍历集合
		for (Object o : fruits) {
			Fruit fruit = (Fruit) o;
			fruit.show();
		}
		/**添加重复元素，是否成功：false
		富士苹果,每斤2.0元。
		金帅苹果,每斤2.5元。*/

		TreeSet
		TreeSet 要注意的事项：
		1.往 TreeSet 添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
		2.往 TreeSet 添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现 Comparable 接口，把元素的比较规则定义在compareTo(T o)方法上。
		3.如果比较元素的时候，compareTo方法返回的是0，那么该元素就被视为重复元素，不允许添加.(注意：TreeSet 与hashCode、equals方法是没有任何关系。)
		4.往 TreeSet 添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类也没有实现 Comparable 接口，那么必须要在创建 TreeSet 的时候传入一个比较器。
		5.往 TreeSet 添加元素的时候，如果元素本身不具备自然顺序的特性，而元素所属的类已经实现了 Comparable 接口，在创建 TreeSet 对象的时候也传入了比较器那么是以比较器的比较规则优先使用。
		6.TreeSet 是可以对字符串进行排序的，因为字符串已经实现了 Comparable 接口。

		字符串的比较规则：
		情况一：找到第一个不同的字符进行比较,大就是大("abf" > "abcasdfasdfa")
		情况二：如果没有不同的字符,那么哪个字符串长就是哪个("abcd" > "adc")

		如何自定义定义比较器：
		自定义一个类实现 Comparator 接口即可，把元素与元素之间的比较规则定义在compare方法内即可。
		自定义比较器的格式：
		class 类名 implements Comparator {
			public int compare(Ojb o1, Obj o2) {
			}
		}
		推荐使用：使用比较器(Comparator)。

		添加具有自然顺序的元素
		public class Demo1 {
			public static void main(String[] args) {
				TreeSet tree = new TreeSet();
				//字符串和数字类不能混放
				/*tree.add(1);
				tree.add(10);
				tree.add(7);
				tree.add(19);
				tree.add(9);*/

				tree.add('b');
				tree.add('f');
				tree.add('a');
				tree.add('c');
				System.out.println(tree);
			}
		}

		添加自定义元素
		class Emp implements Comparable<Emp> {
			int id;
			String name;
			int salary;

			public Emp(int id, String name, int salary) {
				super();
				this.id = id;
				this.name = name;
				this.salary = salary;
			}

			@Override
			public String toString() {
				return "{编号：" + this.id+" 姓名：" + this.name + " 薪水：" + this.salary + "}";
			}

			//负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。
			@Override
			public int compareTo(Emp o) {
				return this.salary - o.salary;
			}
		}

		自定义一个比较器
		class MyComparator implements Comparator<Emp> {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.id - o2.id;
			}

			/*根据第一个参数小于、等于或大于第二个参数分别返回负整数、零或正整数。
			@Override
			public int compare(Object o1, Object o2) {
				Emp e1 = (Emp) o1;
				Emp e2 = (Emp) o2;
				return e1.id - e2.id;
			}*/
		}

		public class Demo2 {
			public static void main(String[] args) {
				//创建一个比较器对象
				MyComparator comparator = new MyComparator();
				//创建 TreeSet 的时候传入比较器
				TreeSet tree = new TreeSet(comparator);
				tree.add(new Emp(110, "老陆", 100));
				tree.add(new Emp(113, "老钟", 200));
				tree.add(new Emp(220, "老汤", 300));
				tree.add(new Emp(120, "老蔡", 500));
				System.out.println("集合的元素：" + tree);
			}
		}

		TreeSet 的构造函数
		构造函数						说明
		TreeSet()					此构造函数构造空树集，将在根据其元素的自然顺序按升序排序。
		TreeSet(Collection c)		此构造函数生成树的集合，它包含的元素的集合c。
		TreeSet (Iterator comp)		此构造函数构造一个空树集，将根据给定的比较器进行排序。
		TreeSet(SortedSet ss)		此构造函数生成包含给定 SortedSet 的元素 TreeSet。

		TreeSet 的方法总结
		方法															描述
		boolean add(E e)											添加指定的元素，如果它已不存在。
		boolean addAll(Collection<? extends E> c)					在加入这一组指定的集合中添加的所有元素。
		E ceiling(E e)												返回最小的元素在这一组大于或等于给定的元素，如果没有这样的元素返回 null。
		void clear()												从这一组中移除所有元素。
		Object clone()												返回此 TreeSet 实例浅表副本。
		Comparator<? super E> comparator()							返回用于排序在这集，或空元素，如果这套使用自然排序其元素的比较。
		boolean contains(Object o)									如果此集合包含指定的元素，则返回 true。
		Iterator<E> descendingIterator()							返回迭代器中这套降序排序的元素。
		NavigableSet<E> descendingSet()								返回逆序视图中包含的元素。
		E first()													返回第一个（最低）元素。
		E floor(E e)												返回的最大元素在这一组小于或等于，如果没有这样的元素返回 null。
		SortedSet<E> headSet(E toElement)							返回其元素是严格小于toElement的部分视图。
		NavigableSet<E> headSet(E toElement, boolean inclusive)		返回一个视图的这部分设置的元素都小于（或等于，如果inclusive是真的）toElement。
		E higher(E e)												返回严格大于给定元素的最小元素，如果没有这样的元素返回 null。
		boolean isEmpty()											如果此集不包含任何元素，则返回true。
		Iterator<E> iterator()										返回迭代器中这套以升序排序的元素。
		E last()													在这套目前返回的最后一个（最高）元素。
		E lower(E e)												返回严格小于给定的元素的元素，如果没有这样的元素返回 null。
		E pollFirst()												检索和删除第一个（最低）元素，或如果此集合为空，则返回 null。
		E pollLast()												检索和删除最后一个（最高）元素，或如果此集合为空，则返回 null。
		boolean remove(Object o)									从这一组中移除指定的元素，如果它存在。
		boolean removeIf(Predicate<? super E> filter)				lambda表达式，从这一组中移除指定的元素，如果它存在。
		int size()													在这套（其基数）中返回的元素的数目。
		NavigableSet<E> subSet(E fromElement,						返回此集的部分视图的元素范围从fromElement到toElement。
			boolean fromInclusive, E toElement,
			boolean toInclusive)
		SortedSet<E> subSet(E fromElement, E toElement)				返回视图的部分的这一套的元素范围从fromElement到toElement，包头不包尾。
		SortedSet<E> tailSet(E fromElement)							返回其元素是大于或等于fromElement这套的部分视图。
		NavigableSet<E> tailSet(E fromElement, boolean inclusive)	返回其元素是大于（或等于，如果inclusive是真的）这套的部分视图fromElement。

		Map 接口
		Map 接口专门处理键值映射数据的存储
		根据键(key)实现对值(value)的操作
		Key:不要求有序, 不允许重复
		Value:不要求有序, 但允许重复
		与 Collection 接口不存在继承关系
		常用方法
		方法															描述
		Object put(Object key, Object value)						以"键-值对"的方式进行存储
		Object get(Object key)										返回指定键所对应的值, 如果不存在指定的键, 返回 null
		int size()													返回元素个数
		boolean remove(Object key)									删除指定的键映射的"键-值对"
		Set keyset()												返回键的集合
		Collection values()											返回值的集合
		boolean containsKey(Object key)								如果存在指定的键映射的"键-值对", 则返回 true
		Set entrySet()												返回"键-值对"集合
		boolean isEmpty()											若不存在"键-值对"元素, 则返回 true
		void clear()												删除该 Map 对象中的所有"键-值对"
		/**最常用的实现类是 HashMap*/

		HashMap 类
		存储成对出现的"键-值对"元素
		如:京-北京市
		一个 Map 对象由若干个"键-值对"组成
		查询指定元素效率高

		使用 HashMap 集合类实现下面功能
		建立中国省份或直辖市全称与简称对照关系表
		通过删除键实现对键值的删除
		实现思路及关键代码
		使用 HashMap 存储多组省份全称和简称的键值对
		import java.util.HashMap;
		import java.util.Map;
		//省略代码
		//使用 HashMap 存储多组键值对
		Map provinces = new HashMap();
		provinces.put("京", "北京市");
		provinces.put("沪", "上海市");
		provinces.put("闽", "福建省");
		provinces.put("湘", "湖南省");

		显示简称为"京"的省份或直辖市全称
		String province = (String) provinces.get("京"); //获取指定元素的值
		System.out.println("“京”对应的省份或直辖市:" + province);

		显示集合中元素个数
		System.out.println("共记录了" + provinces.size()/*获取元素个数*/ + "组数据。");

		两次判断 Map 中是否存在"闽"键
		System.out.println("是否记录简称为“闽”的省份或直辖市?" + provinces.containsKey("闽")); //判断是否包含指定元素
		provinces.remove("闽"); //删除指定元素
		System.out.println("是否记录简称为“闽”的省份或直辖市?" + provinces.containsKey("闽"));

		分别显示键集, 值集和键值对集
		//显示键集、值集和键值对集
		System.out.println(provinces.keySet());
		System.out.println(provinces.values());
		System.out.println(provinces);

		清空 HashMap 并判断
		provinces.clear();
		if (provinces.isEmpty()) //判断集合是否为空
		System.out.println("已清空全部数据！");
		/**“京”对应的省份或直辖市:北京市
		共记录了4组数据。
		是否记录简称为“闽”的省份或直辖市?true
		是否记录简称为“闽”的省份或直辖市?false
		[湘, 沪, 京]
		[湖南省, 上海市, 北京市]
		{湘=湖南省, 沪=上海市, 京=北京市}
		已清空全部数据！*/

		Map 的遍历
		使用 HashMap 集合类存储并输出水果信息
		/**使用 Iterator 迭代器遍历 Map 集合的步骤
		通过KeySet()方法返回键的集合为 Set 集合
		循环遍历键的集合, 获取每个键对应的值*/
		实现思路及关键代码
		创建水果对象
		import java.util.*;
		//省略代码
		Fruit fruit1 = new Fruit("香水梨", 2.5);
		Fruit fruit2 = new Fruit("苹果梨", 2.0);
		Fruit fruit3 = new Fruit("富士苹果", 3.5);
		Fruit fruit4 = new Fruit("金帅苹果", 3.0);

		创建Map集合对象并添加水果元素
		Map fruitMap = new HashMap();
		fruitMap.put(fruit1.getBrand(), fruit1);
		fruitMap.put(fruit2.getBrand(), fruit2);
		fruitMap.put(fruit3.getBrand(), fruit3);
		fruitMap.put(fruit4.getBrand(), fruit4);

		通过迭代器依次输出集合中所有水果信息
		System.out.println("所有水果数据如下：");
		Set keys = fruitMap.keySet(); //获取Set集合
		Iterator it = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next(); //获取Key
			Fruit fruit = (Fruit) fruitMap.get(key); //根据key获取对应的value
			fruit.show();
		}
		/**Set 集合中每个元素都是一个 Map.Entry 对象，进行键和值的分离，由于是 Object 类型，在获取对象之前还需要进行必要的类型转换*/

		Map.Entry 接口
		用于保存"键-值对"元素
		运用 Map.Entry 接口遍历集合
		1.通过entrySet()方法获取所有"键-值"对元素的集合
		2.遍历集合中每个元素, 进行键和值的分离
		方法										描述
		Object getKey()							取得此"键-值对"对应的key值
		Object getValue()						取得此"键-值对"相对应的value值
		int hashCode()							返回该"键-值对"的哈希码值
		Object setValue(Object value)			用指定的值替换该"键-值对"的value值

		Map.Entry 对象集合
		Set allSet = fruitMap.entrySet(); //获取键值对集合
		Iterator it = allSet.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " " + ((Fruit) me.getValue()).getPrice());
		}

		Hashtable 类
		/**与 HashMap 类具有相似的特征，也可以存储“键-值对”元素，是一个古老的 Map 接口实现类*/
		Hashtable 类和 HashMap 类之间存在的区别
		Hashtable									HashMap
		继承自 Dictionary 类							Java1.2引进的 Map interface 的一个实现
		比 HashMap 要古老								是 Hashtable 的轻量级实现
		线程安全										线程不安全
		不允许有 null 的键和值							许有 null 的键和值
		效率稍低										效率稍高
		/**实际开发中，HashMap 类使用更多*/

		类型安全
		考虑下面代码出现的问题
		List fruits = new ArrayList();
		Fruit fruit1 = new Fruit("香水梨", 2.5);
		Fruit fruit2 = new Fruit("苹果梨", 2.0);
		Fruit fruit3 = new Fruit("富士苹果", 3.5);
		Fruit fruit4 = new Fruit("金帅苹果", 3.0);
		//添加元素
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		fruits.add(fruit4);
		fruits.add("无名水果"); //能否加入一个 String 对象？
		//循环迭代
		Iterator it = fruits.iterator();
		for (int i = 0; i < fruits.size(); i++) {
			Fruit fruit = (Fruit) fruits.get(i);//遍历这个集合是否有问题？
			fruit.show();
		}
		使用集合存储数据时容易出现的问题
		(1)对象存储不易控制
		(2)类型转换容易出错
		/**是否有解决方法？使用泛型集合*/

		泛型集合
		约束录入集合的元素类型, 大大提高数据安全性
		从集合中取出数据无需进行类型转换, 让代码更加简洁, 程序更加健壮
		JDK1.5使用泛型改写了集合框架中的所有接口和类
		List<E/*形参的类型*/>
		Map<K, V/*/*形参的类型*/>

		将 List 和 ArrayList 应用泛型实现, 存储若干水果信息
		List<Fruit> fruits = new ArrayList<Fruit>();
		Fruit fruit1 = new Fruit("香水梨", 2.5);
		Fruit fruit2 = new Fruit("苹果梨", 2.0);
		Fruit fruit3 = new Fruit("富士苹果", 3.5);
		Fruit fruit4 = new Fruit("金帅苹果", 3.0);
		//添加元素
		fruits.add(fruit1);
		fruits.add(fruit2);
		fruits.add(fruit3);
		fruits.add(fruit4);
		//循环迭代
		Iterator it = fruits.iterator();
			for (int i = 0; i < fruits.size(); i++) {
			Fruit fruit = fruits.get(i);
			fruit.show();
		}
		/**香水梨,每斤2.5元。
		苹果梨,每斤2.0元。
		富士苹果,每斤3.5元。
		金帅苹果,每斤3.0元。*/

		对 Map 接口和 HashMap 集合类应用泛型, 存储若干水果信息
		//创建Map集合对象并添加水果元素
		Map<String, Fruit> fruitMap = new HashMap<String, Fruit>(); //标记键-值类型
		fruitMap.put(fruit1.getBrand(), fruit1);
		fruitMap.put(fruit2.getBrand(), fruit2);
		fruitMap.put(fruit3.getBrand(), fruit3);
		fruitMap.put(fruit4.getBrand(), fruit4);
		//通过迭代器依次输出集合中所有水果信息
		System.out.println("所有水果数据如下：");
		Set<String> keys /*标记键类型*/ = fruitMap.keySet();
		Iterator<String> it /*标记键类型*/ = keys.iterator();
		while (it.hasNext()) {
			String key = (String) it.next(); //获取key
			Fruit fruit = fruitMap.get(key); //无需类型转换
			fruit.show();
		}
		/**所有水果数据如下：
		香水梨,每斤2.5元。
		富士苹果,每斤3.5元。
		苹果梨,每斤2.0元。
		金帅苹果,每斤3.0元。*/

		Java API
		Java应用程序编程接口（Java Application Programming Interface）
		是运行库的集合
		预先定义了一些接口和类
		还特指API的说明文档，也称API帮助文档
		常用包
		包				描述
		java.lang		编写Java程序时最广泛使用的包，自动导入所有的程序中，包含了 Java 程序的基础类和接口。包装类、String 类等常用的类都包含在此包中，
						还提供了用于管理类的动态加载、外部进程创建、主机环境查询和安全策略实施等系统操作的类
		java.util		包含系统辅助类，特别是 Collection、List 和 Map 等集合类
		java.time		包含对日期时间进行处理的类，如创建日期对象，格式化日期等
		java.io			包含与输入/输出有关的类，如文件操作等类
		java.net		包含与网络有关的类，如 Socket、ServerSocket 等类
		java.sql		包含与数据库相关的类，如 Connection、Statement 等类

		枚举
		是由一组固定的常量组成的类型，JDK1.5引入
		继承自java.lang.Enum类
		作用
		访问修饰符 enum /*表示是枚举类型*/ 枚举名 {
			常量1, 常量2...; //可以定义多个常量，表示不同的枚举值，逗号作为分隔符
			//其他成员，可以定义其他成员，须置于枚举常量后
		}
		public enum Genders {
			Male, Female;
		}
		/**通常，使用枚举表示一组有限的值，实现对输入的值进行约束*/

		枚举示例
		定义7个枚举常量，代表一周中的7天，查看一周中每天日程安排
		枚举定义
		public enum Week {
			MON, TUE, WED, THU, FRI, SAT, SUN;
		}
		测试代码
		public void doWhat(Week day) {
			switch (day /*枚举类型*/) {
				//case 关键字后的常量必须是Week中定义的枚举常量
				case MON:
				case TUE:
				case WED:
				case THU:
				case FRI:
					System.out.println("工作日，努力写代码！");
					break;
				case SAT:
					System.out.println("星期六，休息！看电影！");
					break;
				case SUN:
					System.out.println("星期日，休息！打篮球！");
					break;
				default:
					System.out.println("地球上一个星期就7天。");
					break;
			}
		}
		public static void main(String[] args) {
			WeekTest t = new WeekTest();
			t.doWhat(Week.THU);
			Week sat = Week.SAT;
			t.doWhat(sat);
		}
		/**工作日，努力写代码！
		星期六，休息！看电影！*/
		/**修改main()方法中代码，调用枚举的values()方法，返回一个对象数组，即：枚举中全部内容*/
		public static void main(String[] args) {
			//省略代码……
			for (Week w : Week.values()/*可遍历枚举值*/) {
				t.doWhat(w);
			}
		}
		/**工作日，努力写代码！
		工作日，努力写代码！
		工作日，努力写代码！
		工作日，努力写代码！
		工作日，努力写代码！
		星期六，休息！看电影！
		星期日，休息！打篮球！*/

		常见错误
		public void doWhat(Week day) {
			switch (day) {
				case MON:
				case TUE:
				case WED:
				case THU:
				case Week.FRI: //编译错误
					System.out.println("工作日，努力写代码！");
					break;
				case SAT:
					System.out.println("星期六，休息！看电影！");
					break;
				case SUN:
					System.out.println("星期日，休息！打篮球！");
					break;
				default:
					System.out.println("地球上一个星期就7天。");
					break;
			}
		}

		枚举方法
		每一个枚举类型成员都是 Enum 类的对象
		可以调用 Enum 类的方法，实现枚举的遍历、比较等操作
		常用方法
		方法					描述
		T[] values()		以数组形式返回枚举类型的所有成员
		T valueOf()			将普通字符串转换为枚举实例
		int compareTo()		比较两个枚举成员在定义时的顺序,结果为负整数、零或正整数，表示当前对象小于、等于或大于指定对象
		int ordinal()		获取枚举成员的索引位置

		枚举方法示例
		使用枚举方法实现枚举的遍历和比较
		//定义枚举类型
		enum Week {
			MON, TUE, WED, THU, FRI, SAT, SUN;
		}
		public class EnumTest {
			public static void main(String[] args) {
				System.out.println("*********forEach 遍历枚举元素*********");
				//遍历枚举
				for (Week w : Week.values()) {
					System.out.println(w);
				}
				System.out.println("*********获取枚举的个数*********");
				System.out.println("一周有" + Week.values().length /*获取枚举个数*/ + "天。");
				System.out.println("*********使用索引遍历枚举元素*********");
				//用枚举索引遍历枚举元素
				for (int i = 0; i < Week.values().length; i++) {
					System.out.println("索引" + Week.values()[i].ordinal() + ",值：" + Week.values()[i] + "。");
				}
				System.out.println("*********枚举元素比较*********");
				//字符串转换为枚举，做比较
				System.out.println((Week.valueOf("MON")).equals(Week.MON));
				System.out.println(Week.FRI.compareTo(Week.TUE));
			}
		}
		/*********forEach 遍历枚举元素*********
		MON
		TUE
		WED
		THU
		FRI
		SAT
		SUN
		*********获取枚举的个数*********
		一周有7天。
		*********使用索引遍历枚举元素*********
		索引0,值：MON。
		索引1,值：TUE。
		索引2,值：WED。
		索引3,值：THU。
		索引4,值：FRI。
		索引5,值：SAT。
		索引6,值：SUN。
		*********枚举元素比较*********
		true
		3*/

		包装类
		将基本数据类型封装到一个类中，即将基本类型包装成一个类类型
		Java 为每一种基本类型都提供了一个包装类
		保存于java.lang包中
		用途
		作为和基本数据类型对应的类型，方便对象的操作
		包含每种基本数据类型的相关属性
		如最大值、最小值等，以及相关的操作方法
		包装类关系
		Objeck:Boolean、Number、Character
		Number /*抽象类*/:Byte、Short、Integer、Long、Float、Double

		包装类和基本数据类型对应表
		类型			长度		默认值			包装类
		byte		8位		0				java.lang.Byte
		short		16位		0				java.lang.Short
		int			32位		0				java.lang.Integer
		long		64位		0				java.lang.Long
		float		32位		0.0				java.lang.Float
		double		64位		0.0				java.lang.Double
		char		16位		\u0000~\uFFFF	java.lang.Character
		boolean		1位		false、true		java.lang.Boolean
		/**不同应用场景中，基本数据类型和包装类型间要进行相互转换以完成特定操作*/
		/**基本数据类型-->报装类型*/

		基本数据类型向包装类转换
		包装类的构造方法
		语法
		public Type /*表示包装类*/(type /*基本数据类型*/ value)
		public Type(String value)
		示例
		Integer intValue = new Integer(21); //使用构造方法将基本数据类型值包装为包装类对象
		//或
		Integer intValue = new Integer("21"); //使用构造方法将基本数据类型值包装为包装类对象

		基本数据类型向包装类转换示例
		使用构造方法实现基本数据类型向包装类转换
		boolean bl = true;
		//使用构造方法实现基本数据类型向包装类转换
		Boolean blObj = new Boolean(bl);
		Integer itObj = new Integer(35);
		Character chObj = new Character('男');
		System.out.println(blObj + "," + itObj + "," + chObj);
		//将字符串转换为 Boolean 对象
		Boolean bObj = new Boolean("true");
		Boolean bObj2 = new Boolean("TRue"); //不区别大小写
		Boolean bObj3 = new Boolean("hello"); //非 true 即为 false
		System.out.println(bObj + ","+bObj2 + "," + bObj3);
		/**调用包装类的valueOf()和parseXxx()方法也可实现从基本数据类型到包装类型的转换，这些方法都是静态的，可自行查阅API帮助文档学习*/
		/**true,35,男
		true,true,false*/

		常见错误
		产生编译错误
		Character chobj2 = new Character("男"); //char 类型数据不能使用Type(String value)创建 Character 类型的包装类对象
		/**运行时将出现java.lang.NumberFormatException异常*/
		/**除 Character 类外，其他包装类可将一个字符串作为参数构造它们的实例对象*/

		包装类和基本数据类型的转换
		通常使用的方法
		语法
		public type /*表示基本数据类型*/ typeValue();
		/**如：byteValue()、charValue()方法，相应的返回值则为 byte、char*/
		示例
		boolean bl = true;
		//使用构造方法实现基本数据类型向包装类转换
		Boolean blObj = new Boolean(bl);
		Integer itObj = new Integer(35);
		Character chObj = new Character('男');
		//包装类转换为基本数据类型
		boolean b1 = blObj.booleanValue();
		int i = itObj.intValue();
		char ch = chObj.charValue();
		System.out.println(b1 + "," + i + "," + ch);
		/**true,35,男*/

		装箱拆箱（JDK1.5的新特性）
		自动装箱（Autoboxing）
		把基本类型变量直接转换为对应的包装类对象，或者转换为 Object 类型对象
		自动拆箱（AutoUnboxing）
		与装箱相反，将包装类对象转换成对应的基本类型变量
		示例
		Integer inObj = 5; //装箱
		Object boolObj = true; //装箱
		System.out.println(inObj + "," + boolObj);

		int it = inObj; //拆箱
		System.out.println(it);
		if(boolObj instanceof Boolean) {
			boolean b = (Boolean) boolObj;
			//先将 Object 类对象强制转换为 Boolean 类型，再赋值给 boolean 类型变量
			System.out.println(b);
		}
		/**5,true
		5
		true*/

		日期类
		JDK1.8中，所有的日期/时间基础类都包含在java.time包中
		在绝大多数情况下，这些类能够有效地处理一些公共的需求
		常用类
		类				描述									示例
		LocalDate		表示日期（年/月/日），不包含时间			2020/11/24
		LocalTime		表示时间（时/分/秒/毫秒），不包含日期		15:32:12
		LocalDateTime	表示日期和时间（年/月/日/时/分/秒/毫秒）	2020/11/24 15:32
		/**都是不可变的对象，提供简单的日期或时间，不包含与时区相关的信息*/

		日期类的通用方法
		获取日期时间类型对象的常用方法
		方法												描述
		日期类 now()										根据当前时间创建对象，返回日期对象
		日期类 of(int year, Month month, int dayOfMonth)	根据指定日期/时间创建日期类对象
		日期类 parse(String str)							根据输入的字符串值转为日期
		Month getMonth()								获取月份，返回 Month，这是一个表示月份的枚举
		int getDayOfMonth()								返回当前日期对象的月份天数
		int getYear()									返回当前日期对象的年份
		日期类 plusDays()									在指定日期基础上添加天数、周数、月数、年数，返回日期类型对象
		日期类 plusWeeks()
		日期类 plusMonths()
		日期类 plusYears()
		示例
		LocalDate localDate = LocalDate.now(); //获取当前日期
		LocalTime localTime = LocalTime.now(); //获取当前时间

		日期格式化
		使用 DateTimeFormatter 类对日期格式化，使之按指定格式输出
		DateTimeFormatter 类位于java.time.format包
		常用方法
		方法				描述
		ofPattern()		传入格式字符串，规范化日期输出格式
		format()		将日期格式化为字符串
		示例
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日"); //指定日期格式
		//两种格式化方式
		String str1 = localDate.format(formatter); //DateTimeFormatter 类对象
		String str2 = formatter.format(localDate); //LocalDate 类对象

		日期格式化示例
		根据当前日期，计算农场下次播种时间和收割时间
		LocalDateTime today = LocalDateTime.now(); //获取当前时间
		//创建格式化器
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//将日期格式化为字符串
		String str1 = today.format(fm1);
		String str2 = today.format(fm2);
		//省略日期输出显示语句
		System.out.println("年：" + today.getYear() + "  月：" + today.getMonth() + "  日：" + today.getDayOfMonth()); //提取日期的年、月、日
		System.out.print("距离下次播种大约还有几个月？(1~12间的整数)：");
		Scanner in = new Scanner(System.in);
		LocalDateTime future = today.plusMonths(in.nextLong()); //根据间隔时间输出日期
		String str3 = future.format(fm2);
		System.out.println("下次播种时间约为：" + str3 + "。");
		System.out.print("请输入计划开始收割日期（格式：yyyy-MM-dd）：");
		LocalDate ld = LocalDate.parse(in.next()); //将字符串转为日期
		String str4 = ld.format(fm2);
		System.out.println("收割开始日期为" + str4 + ",预祝好收成！");
		/**年：2022  月：JULY  日：4
		距离下次播种大约还有几个月？(1~12间的整数)：2
		下次播种时间约为：2022-09-04。
		请输入计划开始收割日期（格式：yyyy-MM-dd）：2022-07-05
		收割开始日期为2022-07-05,预祝好收成！*/

		Random 类
		通过一个种子以任意或非系统方式生成随机数
		位于java.util包
		构造方法
		方法					描述
		Random()			创建一个随机数生成器
		Random(long seed)	使用单个 long 种子创建一个随机数生成器

		nextInt()重载方法
		方法							描述
		int nextInt();				返回下一个伪随机数，它是此随机数生成器序列中均匀分布的 int 值
		int nextInt(int n);			取自此随机数生成器序列的、在0（包括）和指定值n（不包括）之间均匀分布的 int 值
		int nextInt(int i, int n);	取自此随机数生成器序列的、在i（包括）和指定值n（不包括）之间均匀分布的 int 值
		/**使用同样的一个种子值初始化两个 Random 对象，如果用每个对象调用相同的方法，得到的随机数也是相同的。未设置种子值时，默认使用当前时间的毫秒数作为种子*/

		Random 类示例
		随机生成10个10以内大于或等于0的整数，并显示输出
		示例
		//创建一个 Random 对象，即随机数生成器
		Random rand = new Random();
		//随机生成10个随机整数，并显示
		for (int i = 0; i < 10; i++) {
			int num = rand.nextInt(10);
			System.out.println("第" + (i + 1) + "个随机数是：" + num);
		}
		/**第1个随机数是：3
		第2个随机数是：4
		第3个随机数是：0
		第4个随机数是：1
		第5个随机数是：7
		第6个随机数是：2
		第7个随机数是：8
		第8个随机数是：1
		第9个随机数是：4
		第10个随机数是：4*/

		File 类
		是java.io包下代表操作与平台无关的文件和目录的类
		实现对文件或目录的新建、删除、重命名等操作
		File file = new File(String pathname /*"c:\\test .txt"或"c:/test .txt"*/);
		/**一个 File 类的对象可以代表一个文件或目录，可获取与文件相关的信息，如名称、修改日期、文件大小等*/

		public File(String pathName /*文件路径*/)
		/**绝对路径：以根目录开头的完整路径
		相对路径：相对于当前目录文件的路径
		“.”表示当前目录
		“..”表示上级目录*/

		示例
		File file = new File("C:\\test.txt");
		/**Windows文件路径名中，分隔符可以使用正斜杠“/”，也可以使用反斜杠“\”。但必须写成“\\ ”，其中第一个“\”表示转义符*/
		/**Linux文件路径名中，分隔符只能使用正斜杠“/”*/
		/**创建 File 类对象时，必须设置文件路径，未设置路径只有文件名的情况下在本idea项目目录下创建*/

		File 类的常用方法
		方法名										描述
		boolean createNewFile()						创建新文件
		boolean delete()							删除文件或者一个空文件夹
		void deleteOnExit()							JVM退出时删除文件或者文件夹，用于删除临时文件
		boolean exists()							判断文件或文件夹是否存在
		boolean isFile()							判断是否是文件
		boolean isDirectory()						判断是否是目录
		boolean isHidden() 							是否是一个隐藏的文件或是否是隐藏的目录
  		boolean isAbsolute() 						测试此抽象路径名是否为绝对路径名
		String getName() 							获取文件或文件夹的名称，不包含上级路径
		long length()								返回文件长度，单位为字节，若文件不存在，则返回0L，如果是文件夹也返回0L。
		String getPath()							返回此对象文件名所对应的路径
		String getAbsolutePath()					返回此对象表示的文件的绝对路径名
		String getParent() 							返回此抽象路径名父目录的路径名字符串，如果此路径名没有指定父目录，则返回 null
		static File[] listRoots()					列出所有的根目录
		String[] list() 							返回目录下的文件或者目录名，包含隐藏文件
		File[] listFiles()							返回此目录下所有文件的对象（File 类实例），包含隐藏文件
		String[] list(FilenameFilter filter)		返回指定当前目录中符合过滤条件的子文件或子目录
  		File[] listFiles(FilenameFilter filter)		返回指定当前目录中符合过滤条件的子文件或子目录
		boolean mkdir() 							创建此抽象路径名称指定的目录（及只能创建一级的目录，且需要存在父目录）
  		boolean mkdirs() 							创建此抽象路径指定的目录，包括所有必须但不存在的父目录（及可以创建多级目录，无论是否存在父目录）
		boolean renameTo(File dest)					如果被重命名的文件已存在，那么renameTo()不会成功，renameTo()成功后，原文件会被删除
		long lastModified()							获取最后一次被修改的时间
		/**在实际开发中，如需完成对 File 类的更多操作，可随时查阅API帮助文档*/

		File 类应用示例
		在程序当前目录下创建非空文件test.txt，使用 File 类方法对该文件进行基本判断和操作
		import java.io.File;
		//省略类、方法的相关代码…
			File file = new File("test.txt");
			if (file.exists()) {
				if (file.isFile()) {
					System.out.println("文件名：" + file.getName() + ",文件长度：" + file.length() + "字节。");
					System.out.println("文件路径是：" + file.getPath());
					System.out.println("文件绝对路径是：" + file.getAbsolutePath());
				}
				if(file.isDirectory()) {
					System.out.println("此文件是目录");
				}
			} else {
				System.out.println("此文件不存在！");
			}
		/**文件名：test.txt,文件长度：0字节。
		文件路径是：test.txt
		文件绝对路径是：/home/ordinary/IdeaProjects/untitled/test.txt*/

		实现文件操作工具类
		import java.io.File;
		import java.io.IOException;
		public class FileUtil {
			public void createFile(File file) { //创建文件
				//如果文件存在，则先删除，再创建
				if (file.exists()) {
					file.delete();
				} else {
					try {
						file.createNewFile(); //必须处理异常，或继续向上一级声明异常；否则，将无法编译通过
						System.out.println("文件创建成功！");
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			}
			public void deleteFile(File file) { //删除文件
				if (file.exists()) {
					file.delete();
					System.out.println("文件删除成功！");
				} else {
					System.out.println("此文件不存在！");
				}
			}
			public void print(File file) { //输出文件信息
				if (file.exists()) {
					if (file.isFile()) {
						System.out.println("文件名：" + file.getName() + ",文件长度：" + file.length() + "字节。");
						System.out.println("文件路径是：" + file.getPath());
						System.out.println("文件绝对路径是：" + file.getAbsolutePath());
					}
					if (file.isDirectory()) {
						System.out.println("此文件是目录");
					}
				} else {
					System.out.println("此文件不存在！");
				}
			}
		}
		public static void main(String[] args) {
			FileUtil fileUtil = new FileUtil();
			File file = new File("/home/ordinary/test.txt");
			fileUtil.createFile(file);
			fileUtil.print(file);
			fileUtil.deleteFile(file);
		}
		/**文件创建成功！
		文件名：test.txt,文件长度：0字节。
		文件路径是：/home/ordinary/test.txt
		文件绝对路径是：/home/ordinary/test.txt
		文件删除成功！*/

		使用 File 类哪个方法可以判断一个文件是否存在？
		如何列出一个目录下的所有文件？
		File f = new File("/");
		for (File ftemp : f.listFiles()) {
			if (ftemp.isFile()) {
				System.out.println(ftemp.getName());
			}
		}
		/**0
		initrd.img.old
		vmlinuz.old
		vmlinuz
		initrd.img*/

		IO流
		File 类能够实现对文件和目录的创建、删除等基础性操作，但是无法实现对文件的读写操作。如何读写文件？
		通过流读写文件
		IO流是指一连串流动的字符，以先进先出方式发送信息的通道
		I：input，指读入操作
		O：output，指写出操作
		Java 把所有流类型都封装到java.io包中，以实现输入/输出操作

		Java 流的分类
		按流向划分：输入流和输出流
		按处理单元划分：字节流和字符流
		按流的角色划分：节点流和处理流

		按流向划分：输入流和输出流
		输入流
		只能从中读取数据，而不能写入数据的流，实现程序从数据源中读数据
		原数据源-->流-->读-->程序
		输出流
		只能向其写入数据，而不能从中读数据的流，实现程序向目标数据源中写数据
		程序-->写-->流-->目标数据源
		/**输入流主要由 InputStream 和 Reader 作为基类
		输出流则主要由 OutputStream 和 Writer 作为基类
		都是抽象类，无法直接实例化对象*/

		按处理单元划分：字节流和字符流
		字节流
		以8位字节为操作数据单元的流，可操作二进制数据
		可细分为字节输入流、字节输出流
		字符流
		以16位字符为操作数据单元的流，可操作文本数据
		可细分为字符输入流、字符输出流
		/**区别：操作的数据单元不同，使用方法几乎相同*/

		按流的角色划分：节点流和处理流
		节点流（节点流也称为包装流）
		可以直接向一个特定的存储介质（如磁盘、文件）读写数据的流
		使用节点流进行读写数据操作时，程序直接连接到数据源
		数据源<==数据==>程序
		处理流
		对已存在的流进行连接和封装，通过封装后的流实现数据读写操作的流
		使用处理流进行读写操作时，程序并不会直接连接到实际的数据源
		数据源<==数据==>程序
		/**使用处理流包装节点流，通过处理流执行输入和输出功能，让节点流与文件或磁盘等存储设置交互，可隐藏底层节点流的差异*/

		字节流
		具有输入和输出操作
		主要操作 byte 类型数据
		基类
		字节输出流类： OutputStream
		字节输入流类：InputStream

		字节输出流的基类：OutputStream
		是抽象类，必须使用该类的子类进行实例化对象
		常用方法
		方法										描述
		void close()							关闭输出流
		void flush()							刷新缓冲区
		void write(byte[] b)					将每个 byte 数组写入数据流
		void write(byte[] b,int off,int len)	将每一个指定范围的 byte 数组写入数据流
		void write(int b)						将一个字节数据写入数据流
		/**如果需要操作文件，则使用 FileOutputStream 实例化*/

		字节输出流 FileOutputStream 类
		使用 OutputStream 类的 FileOutputStream 子类向文本文件写入数据
		常用构造方法

		方法												描述
		FileOutputStream(File file)						创建向指定 File 对象写数据的文件输出流
														file：指定目标文件的对象
		FileOutputStream(String name)					创建向指定路径的文件写数据的文件输出流
														name：指定目标文件的路径字符串
		FileOutputStream(String name, boolean append)	创建一个向指定路径的文件写入数据的文件输出流
														name：指定目标文件的路径字符串
														append：表示是否在文件末尾追加数据。如果为 true，则表示可以在文件末尾追加数据

		创建文件输出流对象的常用方式
		//方式一：使用 File 对象构造对象
		File file = new File("/home/ordinary/test.txt");
		OutputStream fos = new FileOutputStream(file);
		//方式二：使用文件路径构造对象
		OutputStream fos = new FileOutputStream("/home/ordinary/test.txt");
		//方式三：使用文件路径构造对象，且可向文件末尾追加数据
		OutputStream fos = new FileOutputStream("/home/ordinary/test.txt", true);
		/**使用 FileOutputStream 类的构造方法创建对象时
		如果相应的文件不存在，就会自动新建一个文件
		如果参数file或name表示的文件路径是一个目录，则会抛出 FileNotFoundException 异常*/

		字节输出流 FileOutputStream 类应用示例
		示例
		使用字节输出流向/home/ordinary/test.txt文件中写入字符串“I Love Java!”
		步骤
		导入相关的类-->构造文件输出流 FileOutputStream 对象-->把数据写入文本文件-->关闭文件输出流对象
		1.
		import java.io.FileOutputStream;
		import java.io.OutputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		2.
		OutputStream fos = null;
		fos = new FileOutputStream("/home/ordinary/test.txt", true /*向文件中追加数据*/);
		3.
		//准备一个字符串
		String str = "I love Java!";
		//将字符串转换为 byte 数组
		byte[] words = str.getBytes();
		fos.write(words, 0, words.length);
		System.out.println("文件已写入成功！");
		4.
		if (fos != null) {
			fos.close();
		}
		/**创建输出流对象、执行写操作、关闭输出流时都可能会有 IOException 异常发生，因此，除处理 FileNotFoundException 异常外，还需处理 IOException 异常*/

		字节输入流的基类：InputStream
		从文件中读数据
		与 OutputStream 一样，也是抽象类
		常用方法
		方法									描述
		int read()							读取一个字节数据
		int read(byte[] b)					将数据读取到字节数组中
		int read(byte[] b,int off,int len)	从输入流中读取最多len长度的字节，保存到字节数组中，保存的位置从off开始
		void close()						关闭输入流
		int available()						返回输入流读取的字节数

		字节输入流 FileInputStream 类
		使用 InputStream 类的 FileInputStream 子类实现文本文件内容的读取
		常用构造方法
		方法								描述
		FileInputStream(File file)		用于创建从指定 File 对象读取数据的文件输入流
										file：指定目标文件数据源对象
		FileInputStream(String name)	用于创建从指定路径的文件读取数据的文件输入流
										name：指定目标文件数据源路径字符串

		创建文件输入流对象的常用方式
		//方式一：使用File对象构造对象
		File file = new File("/home/ordinary/test.txt");
		InputStream fis = new FileInputStream(file);
		//方式二：使用文件路径构造对象
		InputStream fis = new FileInputStream("/home/ordinary/test.txt");

		从文件读取到计算机内存中的过程
		程序<--数据（字节或字节数组）---文件
		read()方法
		每次读取一个字节（0~255的整数）
		每次读取多个字节
		示例
		while ((data = fis.read()) != -1) { //判断是否到文件尾
			System.out.print((char) /*强制数据转换*/ data);
		}
		1.按字节读取并显示数据时需进行强制类型转换
		2.使用read()读取文件中的数据时，当返回结果为-1时，即输入流已经读到末尾
		3.在创建输入流对象、读取数据、关闭流时必须进行异常处理

		使用 FileInputStream 类按单字节读取数据
		示例
		从/home/ordinary/test.txt文件以字节为单元读取数据，输出到控制台
		实现步骤
		导入相关的类-->构造文件输入流 FileInputStream 对象-->读取文本文件中数据-->关闭文件输入流对象
		1.
		import java.io.FileInputStream;
		import java.io.InputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		2.
		fis = new FileInputStream("/home/ordinary/test.txt");
		System.out.println("可读取的字节数：" + fis.available());
		3.
		int data = 0;
		//读取文件中数据
		System.out.println("文件的内容：");
		while ((data = fis.read()) != -1) {
			System.out.print((char) data + " ");
		}
		4.
		if (fos != null) {
			fos.close();
		}
		/**可读取的字节数：12
		文件的内容：
		I   L o v e   J a v a ! */

		使用 FileInputStream 类按多字节读取数据
		示例
		从/home/ordinary/test.txt文件以多字节为单元读取数据，输出到控制台
		分析
		使用read()重载方法，实现每次读取多个字节
		如：read(byte[] b)
		关键代码
		fis = new FileInputStream("/home/ordinary/test.txt");
		//执行读操作
		byte[] words = new byte[1024]; //长度是1024字节的数组
		int len = 0; //实际读取长度
		while ((len = fis.read(words)) > 0) { //读取数据，获取实际长度
			System.out.println(new String(words, 0, len /*按实际长度输出数据，避免出现多余的空白*/));
		}
		/**I Love Java!*/

		常见错误
		假设/home/ordinary/test.txt文件：
		I Love Java!
		一种新技术一旦开始流行，你要么坐上压路机，要么成为铺路石。
		fis= new FileInputStream("/home/ordinary/test.txt");
		byte[] words = new byte[21]; //长度是21字节数组，不能一次读取全部数据
		int len = 0;
		while ((len = fis.read(words)) > 0 ) {
			System.out.println(new String(words, 0, len));
		}
		/**I Love Java!
		一种
		 技术一旦开始
		 行，你要么坐
		 压路机，要么
		 为铺路石。*/
		/**文本文件保存时，采用GBK编码方式，每个中文占2个字节
		read()方法一次读取1个字节（半个中文字符）
		当数组长度不足时，可能导致中文乱码*/

		字符流
		一个字符占用内存的两个字节
		如果用字节流处理文本文件，需要将字节转换成字符，会降低程序的执行效率，怎么办？
		当输入和输出是文本文件时，尽量使用字符流
		使用 Reader 类和 Writer 类操作字符
		基类
		字符输出流类： Writer
		字符输入流类：Reader
		/**使用字符流读写文本更合适*/

		字符输出流的基类：Writer
		抽象类
		常用方法
		方法											描述
		void write(String str)						将str字符串中包含的字符输出到输出流中
		void write(String str, int off, int len)	将字符串中从off位置开始，长度为len的字符输出到输出流中
		void close()								关闭输出流
		void flush()								刷新输出流

		字符输出流 FileWriter 类
		Writer 类的子类
		以字符为数据处理单元向文本文件中写数据
		示例
		将字符串写入/home/ordinary/test.txt文件
		实现步骤
		导入相关的类-->创建 FileWriter 对象-->write()方法写入文本数据-->清空流，关闭流
		Writer fw = null;
		try {
			fw = new FileWriter("/home/ordinary/test.txt"); //创建对象
			fw.write("预测未来的最好方式就是创造未来！"); //写数据
			fw.flush(); //刷新缓冲区
			System.out.println("文件写入成功！");
		} catch (IOException ex) {
		} finally {
			//关闭流
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

		字符输入流基类：Reader
		是抽象类
		常用方法
		方法										描述
		int read()								从输入流中读取单个字符，返回所读取的字符数据
		int read(char[] c)						从输入流中最多读取c.length个字符数据，并将其存储在字符数组c中，返回实际读取的字符数
		int read(char[] c, int off, int len)	从输入流中最多读取len个字符的数据，并将其存储在字符数组c中
												存入数组c中时，并不是从数组起点开始，而是从off位置开始，返回实际读取的字符数
		字符输入流 FileReader 类
		Reader 类的子类
		示例
		从“/home/ordinary/test.txt”中读取数据，显示到控制台
		实现步骤
		导入相关的类-->创建 FileReader 对象-->循环使用read()方法，读取文件中数据-->关闭流
		1.
		import java.io.FileReader;
		import java.io.Reader;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		2.
		Reader fr = null;
		try {
			fr = new FileReader("/home/ordinary/test.txt"); //创建对象
			char[] ch = new char[1024];
			int len = 0;
			//读取数据
			while((len = fr.read(ch)) > 0) {
				System.out.println(new String(ch, 0, len));
			}
		} catch (FileNotFoundException ex) { //省略异常处理代码
		} finally {
			fr.close(); //关闭流
		}
		/**预测未来的最好方式就是创造未来！*/

		缓冲流
		如何提高读写文件数据的执行效率？
		java.io包提供了缓冲流
		Java 缓冲流自身并不具有IO功能，只是在别的流上增加缓冲，以提高程序性能
		分类
		字节缓冲流
		字符缓冲流
		BufferedWriter 类
		BufferedReader 类

		BufferedWriter 类
		是 Writer 类的子类
		带有缓冲区
		默认情况下，只有缓冲区满的时候，才会把缓冲区的数据真正写到目的地，能减少物理写数据的次数，提高输入/输出操作的执行效率
		常用的构造方法
		方法							描述
		BufferedWriter(Writer out)	创建一个缓冲字符输出流
		/**使用 FileWriter 类与 BufferedWriter 类，可提高字符流写文本文件的效率*/

		使用 BufferedWriter 写文件
		示例
		使用 BufferedWriter 类对象向文本文件/home/ordinary/test.txt中写数据
		实现步骤
		导入相关的类-->FileWriter 对象和 BufferedWriter 对象-->清空、关闭流对象
		1.
		import java.io.FileWriter;
		import java.io.BufferedWriter;
		import java.io.IOException;
		2.
		Writer fw = null;
		BufferedWriter bw = null;
		//省略 try 块
		//创建对象
		fw = new FileWriter("/home/ordinary/test.txt");
		bw = new BufferedWriter(fw);
		3.
		bw.write("亲爱的小伙伴们：");
		bw.newLine(); //插入一个换行符
		bw.write("让我们来使用缓冲流让程序加速吧！");
		bw.flush(); //刷新缓冲区
		System.out.println("文件写入成功！");
		4.
		//关闭流
		bw.close();
		fw.close();

		BufferedReader 类
		Reader 类的子类
		带有缓冲区，提高文件读取的效率
		把一批数据读到缓冲区
		从缓冲区内获取数据
		常用构造方法
		方法							描述
		BufferedReader(Reader in)	创建一个缓冲字符输入流
		readLine()方法
		按行读取文件中数据

		使用 BufferedReader 读文件
		示例
		读取文本文件/home/ordinary/test.txt中数据，并输出
		实现步骤
		导入相关的类-->构造 FileReader 对象和 BufferedReader 对象-->调用readLine()方法读取数据-->清空、关闭流对象
		1.
		import java.io.FileReader;
		import java.io.BufferedReader;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		2.
		Reader fr = null;
		BufferedReader br = null;
		//省略 try 块
		//创建对象
		fr = new FileReader("/home/ordinary/test.txt");
		br = new BufferedReader(fr);
		3.
		String line = br.readLine(); //按行读取到缓冲区
		while (line != null) {
			System.out.println(line); //从缓冲区输出
			line = br.readLine();
		}
		4.
		if(br != null)
			br.close();
		if(fr != null)
			fr.close();

		数据操作流
		对二进制文件读写操作
		分类
		DataOutputStream 类
		OutputStream 类的子类
		与 FileOutputStream 类结合使用写二进制文件
		/**使用 DataOutputStream 类写二进制文件的实现步骤与 FileOutputStream 类写文本文件相似*/
		DataInputStream 类
		InputStream 类的子类
		与 FileInputStream 类结合使用读取二进制文件
		/**使用 DataInputStream 类读取二进制文件的实现步骤与 FileInputStream 类读取文本文件相似*/

		DataOutputStream 类
		按照与平台无关的方式向流中写入基本数据类型的数据
		如 int、float、long、double 和 boolean 等
		使用writeUTF()方法能写入采用utf-8字符编码的字符串
		FileOutputStream out1 = new FileOutputStream("/home/ordinary/test.txt");
		BufferedOutputStream out2 = new BufferedOutputStream(out1);
		DataOutputStream out = new DataOutputStream(out2);
		out.writeByte(1);
		out.writeLong(2);
		out.writeChar('c');
		out.writeUTF("hello");

		DataInputStream 类
		按照与平台无关的方式从流中读取基本数据类型的数据
		如 int、float、long、double 和 boolean 等
		使用readUTF( )方法能读取采用utf-8字符编码的字符串
		FileInputStream in1 = new  FileInputStream("/home/ordinary/test.txt");
		BufferedInputStream in2 = new BufferedInputStream(in1);
		DataInputStream in = new DataInputStream(in2);
		System.out.println(in.readByte());
		System.out.println(in.readLong());
		System.out.println(in.readChar());
		System.out.println(in.readUTF());

		使用数据操作流读写二进制文件
		读取二进制文件/home/ordinary/user.class数据，写入二进制文件/home/ordinary/newuser.class中
		DataOutputStream dos = null;
		DataInputStream dis = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			//创建输入流文件
			fis = new FileInputStream("/home/ordinary/user.class");
			dis = new DataInputStream(fis);
			//创建输出流文件
			fos = new FileOutputStream("/home/ordinary/newuser.class");
			dos = new DataOutputStream(fos);
			int temp;
			while ((temp = dis.read()) != -1) { //读取文件中二进制数据
				fos.write(temp); //向文件写二进制数据
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			//省略异常处理代码
			dis.close();
			fis.close();
			fos.close();
			dos.close();
		}

		序列化与反序列化
		对象输出流（ObjectOutputStream）：实现序列化
		对象输入流（ObjectInputStream）：实现反序列化

		使用 ObjectOutputStream 类实现序列化
		序列化的对象所属类须为可序列化的类
		一个类实现java.io.Serializable接口，该类的对象是可序列化的
		public interface Serializable{} //一个标识接口
		JDK1.8类库中，有些类实现了java.io.Serializable接口
		如：String 类、包装类和日期时间类等
		示例
		创建一个Person类，并标记该类的对象是可序列化的
		import java.io.Serializable;
		public class Person implements Serializable {
			private String name;
			private int age;
			private String sex;
			public void print() {
				System.out.println("姓名：" + this.name + ",年龄：" + this.age + ",性别：" + this.sex + "。");
			}
		}

		常用方法
		方法										描述					类型
		ObjectOutputStream(OutputStream out)	创建对象输出流对象		构造方法
		final void writeObject(Object obj)		将指定对象写入流		实例方法

		如何解决序列化和反序列化的版本不一致问题？
		引入serialVersionUID常量
		serialVersionUID常量为 long 类型
		JVM在编译时自动生成serialVersionUID常量，也可显式定义
		示例
		在Person类中显式定义serialVersionUID常量
		import java.io.Serializable;
		public class Person implements Serializable {
			private static final long serialVersionUID = 1L; //序列化和反序列化时serialVersionUID常量值需一致
			private String name;
			private int age;
			private String sex;
			public void print() {
				System.out.println("姓名：" + this.name + ",年龄：" + this.age + ",性别：" + this.sex + "。");
			}
		}

		示例
		创建Person对象，将其序列化后保存在/home/ordinary/person.bat文件中
		实现步骤
		导入相关的类-->创建可序列化的类，要求实现 Serializable 接口-->创建对象输出流（ObjectOutputStream）-->输出可序列化对象-->关闭对象输出流
		1.
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.io.ObjectOutputStream;
		2.
		public class Person implements Serializable {
			private static final long serialVersionUID = 1L;
			//…
		}
		3.
		ObjectOutputStream oos = null;
		//省略异常处理代码
		oos = new ObjectOutputStream(new FileOutputStream("/home/ordinary/person.bat")); //创建对象
		4.
		Person person = new Person("杰米", 25, "男");
		oos.writeObject(person); //对象序列化，
		写入输出流
		5.
		if (oos != null) {
			//省略异常处理代码
			oos.close();
		}

		示例
		保存多个Person对象到/home/ordinary/person.bat文件中
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("/home/ordinary/person.bat"));
			Person person = new Person("杰米", 25, "男");
			Person person2 = new Person("Lisa", 30, "女");
			ArrayList<Person> list = new ArrayList<Person>();
			list.add(person);
			list.add(person2);
			oos.writeObject(list);
			System.out.println("序列化成功！");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}

		使用 ObjectInputStream 类实现反序列化
		使用对象输出流 ObjectInputStream 可以还原序列化的对象
		常用方法
		方法																描述					类型
		ObjectInputStream(InputStream in)								创建对象输入流对象		构造方法
		final Object readObject()/*返回一个 Object 类型的对象				从指定位置读取对象		实例方法
		如果确定该 Object 对象的真实类型，则可以将该对象强制转换成其真实类型*/

		示例
		读取/home/ordinary/person.bat文件中一个Person对象的数据
		实现步骤
		导入相关类-->创建一个对象输入流（ObjectInputStream）-->输出反序列化后对象信息-->关闭对象输入流
		1.
		import java.io.ObjectInputStream;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.util.ArrayList;
		2.
		ObjectInputStream ois = null;
		//省略异常处理代码
		ois = new ObjectInputStream(new FileInputStream("/home/ordinary/person.bat")); //创建对象
		3.
		Person per = (Person) ois.readObject(); //反序列化，强制类型转换
		per.print(); //输出转换反序列化后的对象信息
		4.
		if (ois != null)
			ois.close();
		/**姓名：杰米,年龄：25,性别：男。*/
		/**反序列化时，readObject()方法返回的是 Object 对象，需强制类型转换为Person对象*/

		示例
		读取文件/home/ordinary/person.bat中多个Person对象的数据
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("/home/ordinary/person.bat"));
			ArrayList<Person> list = (ArrayList<Person>) ois.readObject(); //反序列化，进行强制类型转换
			for (Person person : list) { //输出转换反序列化后的对象信息
				person.print();
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch(FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		/**姓名：杰米,年龄：25,性别：男。
		姓名：Lisa,年龄：30,性别：女。*/
		/**如果使用序列化方式向文件中写入多个对象，那么反序列化恢复对象时，也是按照写入的顺序读取
		如果一个可序列化的类有多个父类（包括直接或间接父类），则这些父类要么是可序列化的，要么有无参数的构造；否则，将会抛出异常*/

		限制序列化
		出于安全考虑，对于一些比较敏感的信息（如用户密码），应限制被序列化，如何实现？
		使用 transient 关键字修改不需要序列化的对象属性
		示例
		希望Person类对象中的年龄信息不被序列化
		import java.io.Serializable;
		public class Person implements Serializable {
			private String name;
			private transient int age; //被限制序列化
			private String sex;
			public void print() {
				System.out.println("姓名：" + this.name + ",年龄：" + this.age + ",性别：" + this.sex + "。");
			}
		}

		小结
		Java 常用IO流
		分类			字节输出流				字节输入流				字符输出流			字符输入流
		基类			OutputStream			InputStream				Writer				Reader
		文件流		FileOutputSteam			FileInputStream			FileWriter			FileReader
		缓冲流		BufferedOutputStream	BufferedInputStream		BufferedWriter		BufferedReader
		对象流		ObjectOutputStream		ObjectInputStream		-					-
		数据操作流	DataOutputStream		DataInputStream			-					-
		/**所有的基类都是抽象类，无法直接创建实例，需要借助其实现类
		所有输出流实现写数据，所有输入流实现读数据
		输入和输出是相对程序而言
		所有的文件流直接与存储介质关联，需指定物理节点*/
		1.在操作文本文件时，应使用字符流
		2.字节流可以处理二进制数据，它的功能比字符流更强大
		3.如果是二进制文本，应考虑使用字节流

		多线程
		并行执行
		通常表示同一个时刻有多条指令代码在处理器上同时运行。往往需要多个处理器支持。
		并发运行
		表示在一个处理器中，操作系统为了提高程序的运行效率，将CPU的执行时间分成多个时间片，分配给同一进程的不同线程。多个线程分享CPU时间，交替执行。

		java.lang.Thread类
		支持多线程编程
		常用方法
		方法										描述															类型
		Thread()								创建 Thread 对象												构造方法
		Thread(Runnable target)					创建 Thread 对象，target为run()方法被调用的对象					构造方法
		Thread(Runnable target, String name)	创建 Thread 对象，target为run()方法被调用的对象，name为新线程的名称	构造方法
		void run()								执行任务操作的方法												实例方法
		void start()							使该线程开始执行，JVM将调用该线程的run()方法						实例方法
		void sleep(long millis)					在指定的毫秒数内让当前正在执行的线程休眠（暂停执行）					静态方法
		Thread currentThread()					返回当前线程对象的引用											静态方法

		主线程
		Java 程序启动时，一个线程立即随之启动，通常称之为程序的主线程
		main()方法即为主线程入口
		产生其他子线程的线程
		必须最后完成执行，因为它执行各种关闭动作
		示例
		使用 Thread 类的方法获取主线程信息
		public static void main(String[] args) {
			Thread t = Thread.currentThread(); //获得主线程对象
			System.out.println("当前线程：" + t.getName());

			t.setName("MainThread"); //设置线程名
			System.out.println("当前线程：" + t.getName()); //获取线程名
		}
		/**当前线程：main
		当前线程：MainThread*/

		线程的创建和启动
		Java 中创建线程的两种方式
		继承java.lang.Thread类
		实现java.lang.Runnable接口
		使用线程的步骤
		1.定义线程-->2.创建线程对象-->3.启动线程

		继承 Thread 类创建线程
		自定义线程类继承自 Thread 类
		重写run()方法，编写线程执行体
		创建线程对象，调用start()方法启动线程
		/**Thread 类的run()方法是线程运行的起点*/
		示例
		public class MyThread extends Thread /*继承自 Thread 类*/ {
			//省略成员变量和成员方法代码......
			//重写 Thread 类中run()方法
			@Override
			public void run() { //run()方法中编写线程执行的代码
				//线程执行任务的代码
			}
		}
		class ThreadTest {
			public static void main(String[] args) {
				MyThread myThread = new MyThread();
				myThread.start();
			}
		}

		线程休眠
		让线程暂时睡眠指定时长，线程进入阻塞状态
		睡眠时间过后线程会再进入可运行状态
		语法
		public static void sleep(long millis)
		/**millis为休眠时长，以毫秒为单位
		调用sleep()方法需处理 InterruptedException 异常*/
		示例
		public class Wait {
			public static void bySec(long s) {
				for (int i = 0; i < s; i++) {
					System.out.println(i + 1 + "秒");
					try {
						Thread.sleep(1000); //线程休眠1秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		继承 Thread 类创建单线程
		示例
		星沐生态农场果树成熟了，一位果农采摘5棵苹果树，输出采摘进度，使用继承 Thread 类的方式创建线程类。
		public class WorkThread extends Thread {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "开始采摘苹果树：");
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "进度：第" + (i + 1) + "棵");
					try {
						Thread.sleep(1000); //模拟采摘一棵苹果树的时间间隔是1秒
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				//省略输出代码
			}
		}
		class ThreadTest{
			public static void main(String[] args){
				WorkThread t = new WorkThread();
				t.setName("果农A");
				t.start();
				t.start(); //重复调用会抛出异常IllegalThreadStateException
			}
		}
		/**果农A开始采摘苹果树：
		果农A进度：第1棵
		果农A进度：第2棵
		果农A进度：第3棵
		果农A进度：第4棵
		果农A进度：第5棵*/
		/**已启动的线程对象不能重复调用start()方法，否则会抛出 IllegalThreadStateException 异常
		如果调用sleep()方法控制线程休眠时间的线程，被其他线程中断，则会产生 InterruptedException 异常*/

		继承 Thread 类创建多线程
		多个线程交替执行，不是真正的“并行”
		线程每次执行时长由分配的CPU时间片长度决定
		两位果农同时进行采摘，并显示采摘进度
		class ThreadTest{
			public static void main(String[] args){
				WorkThread t1 = new WorkThread();
				t1.setName("果农A");
				WorkThread t2 = new WorkThread();
				t2.setName("果农B");
				//调用start()方法后，每个线程独立完成各自的操作，相互间没有影响，并行执行
				t1.start();
				t2.start();
			}
		}
		/**果农A开始采摘苹果树：
		果农B开始采摘苹果树：
		果农A进度：第1棵
		果农B进度：第1棵
		果农A进度：第2棵
		果农B进度：第2棵
		果农A进度：第3棵
		果农B进度：第3棵
		果农A进度：第4棵
		果农B进度：第4棵
		果农A进度：第5棵
		果农B进度：第5棵*/

		常见问题
		启动线程是否可以直接调用run()方法？
		示例
		class ThreadTest{
			public static void main(String[] args){
				WorkThread t1 = new WorkThread();
				t1.setName("果农A");
				WorkThread t2 = new WorkThread();
				t2.setName("果农B");
				t1.run(); //用run()替换start()，属于单线程执行模式
				t2.run();
			}
		}
		/**线程对象调用start()方法是启动线程，run()方法是实例方法
		在实际应用中切不要混淆*/

		实现 Runnable 接口创建线程
		Runnable 接口位于java.lang包
		只提供一个抽象方法run()的声明
		实现步骤
		1.定义MyRunnable类实现 Runnable 接口
		2.实现run()方法，编写线程执行体
		3.创建线程对象，调用start()方法启动线程
		示例
		使用实现 Runnable 接口的方式创建线程，实现多人采摘
		public class WorkThread implements Runnable /*实现 Runnable 接口*/ {
			//run()方法中编写线程执行的代码
			public void run() {
				System.out.println(Thread.currentThread().getName() + "开始采摘苹果树：");
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName() + "进度：第" + (i + 1) + "棵");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "已完成采摘任务！");
			}
		}
		public static void main(String[] args){
			//创建线程对象
			WorkThread work1 = new WorkThread();
			Thread t1 = new Thread(work1);
			WorkThread work2 = new WorkThread();
			Thread t2 = new Thread(work2);
			t1.start();
			t2.start();
		}
		/**Thread-0开始采摘苹果树：
		Thread-1开始采摘苹果树：
		Thread-0进度：第1棵
		Thread-1进度：第1棵
		Thread-0进度：第2棵
		Thread-1进度：第2棵
		Thread-0进度：第3棵
		Thread-1进度：第3棵
		Thread-1进度：第4棵
		Thread-0进度：第4棵
		Thread-1进度：第5棵
		Thread-0进度：第5棵
		Thread-1已完成采摘任务！
		Thread-0已完成采摘任务！*/

		比较两种创建线程的方式
		继承 Thread 类
		编写简单，可直接操作线程
		适用于单继承
		实现 Runnable 接口
		避免单继承局限性
		便于共享资源
		/**推荐使用实现 Runnable 接口方式创建线程*/

		线程的状态
		通常，线程的生命周期有五种状态
								阻塞解除	-->	阻塞状态	<--		阻塞事件
								^							^
								|							|
								|							|
		创建状态---start()-->就绪状态<---获得、释放CPU资源--->运行状态-->死亡状态，线程自然执行完毕、外部干涉终止线程
		处于运行状态的线程会让出CPU控制权
		线程运行完毕
		有比当前线程优先级更高的线程抢占了CPU
		线程休眠
		线程因等待某个资源而处于阻塞状态

		线程调度
		指按照特定机制为多个线程分配CPU的使用权
		每个线程执行时都具有一定的优先级
		常用的线程操作方法
		方法	 								说明
		int getPriority()					返回线程的优先级
		void setPrority(int newPriority)	更改线程的优先级
		boolean isAlive()					测试线程是否处于活动状态
		void join()							进程中的其它线程必须等待该线程终止后才能执行
		void interrupt()					中断线程
		void yield()						暂停当前正在执行的线程对象，并执行其他线程

		线程优先级
		线程优先级由1~10表示，1最低，默认优先级为5
		优先级高的线程获得CPU资源的概率较大
		使用Thread类的静态常量设置线程的优先级
		MAX_PRIORITY：值是10，表示优先级最高
		MIN_PRIORITY：值是1，表示优先级最低
		NORM_PRIORITY：值是5，表示普通优先级
		示例
		假设有3位果农采摘苹果树，每位果农采摘50棵苹果树，间隔为10毫秒，果农采摘速度有低、中、高的级别区分，输出果农的采摘进度
		public class WorkThread implements Runnable /*实现 Runnable 接口方式创建线程类*/ {
			public void run() {
				System.out.println(Thread.currentThread().getName() + "开始采摘苹果树：");
				for (int i = 0; i < 50; i++) {
					System.out.println(Thread.currentThread().getName() + "进度：第" + (i + 1) + "棵" + ",优先级：" + Thread.currentThread().getPriority()/*获得线程优先级*/);
					try {
						Thread.sleep(10);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "已完成采摘任务！");
			}
		}
		public static void main(String[] args) {
			//通过构造方法设置线程名
			Thread t1 = new Thread(new WorkThread(), "果农A");
			Thread t2 = new Thread(new WorkThread(), "果农B");
			Thread t3 = new Thread(new WorkThread(), "果农C");
			//设置线程优先级
			t1.setPriority(Thread.MAX_PRIORITY);
			t2.setPriority(Thread.NORM_PRIORITY);
			t3.setPriority(Thread.MIN_PRIORITY);
			t1.start();
			t2.start();
			t3.start();
		}
		/**尽管为线程设定了不同的优先级，但实际上并不能精确控制这些线程的执行先后顺序
		在不同的计算机或同一计算机不同时刻中运行本程序，都会得到不同的执行序列*/

		线程的强制运行
		使当前线程暂停执行，等待其他线程结束后再继续执行本线程
		语法
		join()方法的重载方法
		public final void join()
		public final void join(long mills)
		public final void join(long mills, int nanos)
		/**millis：以毫秒为单位的等待时长
		nanos：要等待的附加纳秒时长
		需处理 InterruptedException 异常*/
		示例
		农场为果商供应10车水果和商超供应15车水果，同时发货。当向散户果商供应了5箱水果后，暂停向散户果商供货，优先供应大型商超。完成紧急任务后，继续正常发货。
		public class JoinThread implements Runnable {
			public void run() {
				for (int i = 0; i < 15; i++) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "采购进度：第" + (i + 1) + "车");
				}
			}
		}
		Thread t = new Thread(new JoinThread(), "大型商超");
		t.start();
		Thread.currentThread().setName("果商");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				//InterruptedException 异常处理
				try {
					t.join(); //阻塞主线程，子线程强制执行
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			//省略线程休眠及异常处理的代码
			System.out.println(Thread.currentThread().getName() + "采购进度：第" + (i + 1) + "车");
		}
		/**果商采购进度：第1车
		果商采购进度：第2车
		果商采购进度：第3车
		果商采购进度：第4车
		果商采购进度：第5车
		大型商超采购进度：第1车
		大型商超采购进度：第2车
		大型商超采购进度：第3车
		大型商超采购进度：第4车
		大型商超采购进度：第5车
		大型商超采购进度：第6车
		大型商超采购进度：第7车
		大型商超采购进度：第8车
		大型商超采购进度：第9车
		大型商超采购进度：第10车
		大型商超采购进度：第11车
		大型商超采购进度：第12车
		大型商超采购进度：第13车
		大型商超采购进度：第14车
		大型商超采购进度：第15车
		果商采购进度：第6车
		果商采购进度：第7车
		果商采购进度：第8车
		果商采购进度：第9车
		果商采购进度：第10车*/

		线程的礼让
		暂停当前线程，允许其他具有相同优先级的线程获得运行机会
		该线程处于就绪状态，不转为阻塞状态
		yield()方法定义
		语法
		public static void yield()
		/**只是提供一种可能，但是不能保证一定会实现礼让*/
		示例
		假设有3个小朋友来农场品尝苹果，每人5块。所有苹果放在一个盘子里，每人品尝完一块后，都会把下一次品尝的机会让给其他小朋友
		public class ChildThread implements Runnable {
			public void run() {
				for (int i = 0; i < 5; i++) {
					Thread.yield(); //当前线程礼让
					System.out.println(Thread.currentThread().getName() + "品尝：第" + (i + 1) + "块");
				}
			}
		}
		class Test {
			public static void main(String[] args) {
				Thread t1 = new Thread(new ChildThread(), "Child1");
				Thread t2 = new Thread(new ChildThread(), "Child2");
				Thread t3 = new Thread(new ChildThread(), "Child3");
				t1.start();
				t2.start();
				t3.start();
			}
		}
		/**Child1品尝：第1块
		Child2品尝：第1块
		Child3品尝：第1块
		Child2品尝：第2块
		Child1品尝：第2块
		Child2品尝：第3块
		Child2品尝：第4块
		Child3品尝：第2块
		Child2品尝：第5块
		Child1品尝：第3块
		Child3品尝：第3块
		Child1品尝：第4块
		Child3品尝：第4块
		Child1品尝：第5块
		Child3品尝：第5块*/
		/**执行Thread.yield()方法后，多个线程间交替执行较为频繁，可以提高程序的并发性*/

		对比调用或取消Thread.yield();的程序运行结果
		/**Child1品尝：第1块
		Child1品尝：第2块
		Child1品尝：第3块
		Child1品尝：第4块
		Child1品尝：第5块
		Child2品尝：第1块
		Child2品尝：第2块
		Child2品尝：第3块
		Child2品尝：第4块
		Child2品尝：第5块
		Child3品尝：第1块
		Child3品尝：第2块
		Child3品尝：第3块
		Child3品尝：第4块
		Child3品尝：第5块*/

		比较sleep()方法和yield()方法
		共同点
		Thread 类的静态方法
		会使当前处于运行状态的线程放弃CPU使用权，将运行机会让给其他线程
		不同点
		sleep()方法会给其他线程运行机会，不考虑其他线程的优先级，因此较低优先级线程可能会获得运行机会
		yield()方法只会将运行机会让给相同优先级或者更高优先级的线程
		调用sleep()方法需处理 InterruptedException 异常，而调用yield()方法无此要求

		线程同步
		当两个或多个线程需要访问同一资源时，需要以某种顺序来确保该资源某一时刻只能被一个线程使用
		相当于将线程中需要一次性完成不允许中断的操作加上一把锁，以解决冲突
		使用 synchronized 关键字，为当前的线程声明一把锁
		实现方式
		同步代码块
		同步方法

		同步代码块
		使用 synchronized 关键字修饰的代码块
		语法
		synchronized (syncObject/*需同步的对象，通常为 this*/) {
			//需要同步的代码
		}
		示例
		如果一个代码块带有synchronized(obj)标记，那么当线程执行此代码块时，必须先获得obj变量所引用对象的锁
		对于任何代码块都可以任意指定上锁的对象，灵活性更高
		public void get() {
			synchronized (this/*获得当前Storage类对象的锁*/) {
				if (count > 0) {
					//省略修改数据的代码
				} else {
					//省略显示数据的代码
				}
			}
		}
		public void put() {
			synchronized (this/*获得当前Storage类对象的锁*/) {
				if (count > 0) {
					//省略修改数据的代码
				} else {
					//省略显示数据的代码
				}
			}
		}
		/**一般情况下，只有获得锁的线程可以操作共享数据
		执行完同步代码块中所有代码后，才会释放锁，使其他线程获得锁*/

		同步方法
		使用 synchronized 修饰的方法控制对类成员变量的访问
		语法
		访问修饰符 synchronized 返回类型 方法名(参数列表) {...}
		或
		synchronized 访问修饰符 返回类型 方法名(参数列表) {...}
		示例
		public synchronized void get() {
			//省略修改数据的代码
			//省略显示数据的代码
		}
		synchronized public void put() {
			//省略修改数据的代码
			//省略显示数据的代码
		}

		线程安全的类型
		如果程序所在的进程中，有多个线程同时运行，每次运行结果和单线程时运行结果是一样的，且其他变量的值也和预期相同，则当前程序是线程安全的
		查看 ArrayList 类的add()方法定义
		public boolean add(E e) {
			ensureCapacityInternal(size + 1); //集合扩容，确保能新增数据
			elementData[size++] = e; //在新增位置存放数据
			return true;
		}
		ArrayList 类的add()方法为非同步方法
		当多个线程向同一个 ArrayList 对象添加数据时，可能出现数据不一致问题
		/**ArrayList 为非线程安全的类型*/

					方法是否同步	效率比较		适合场景
		线程安全		是			低			多线程并发共享资源
		非线程安全	否			高			单线程
		/**为达到安全性和效率的平衡，可以根据实际场景选择合适的类型*/

		常见类型对比
		Hashtable && HashMap
		Hashtable
		继承关系
		实现了 Map 接口，Hashtable 继承 Dictionary 类
		线程安全，效率较低
		键和值都不允许为 null
		HashMap
		继承关系
		实现了 Map 接口，继承 AbstractMap 类
		非线程安全，效率较高
		键和值都允许为 null
		StringBuffer && StringBuilder
		前者线程安全，后者非线程安全
		在单线程环境下，StringBuilder 执行效率更高

		JDBC
		什么是JDBC
		JDBC（Java Database Conectivity）
		Java 数据库连接技术的简称，提供连接各种常用数据库的能力

		JDBC的工作原理
		JDBC API
		内容：供程序员调用的接口与类，集成在java.sql和javax.sql包中，如
			DriverManager 类
			Connection 接口
			Statement 接口
			ResultSet 接口
		DriverManager
			作用：管理各种不同的JDBC驱动
		JDBC驱动
			提供者：数据库厂商
			作用：负责连接各种不同的数据库

		Java 应用程序
			^
			|
		JDBC API

		JDBC Driver Manager
			^		^
			|		|
		JDBC驱动		JDBC驱动
			^		^
			|		|
		MySQL		Oracle

		JDBC API
		JDBC API主要功能
		与数据库建立连接、执行SQL语句、处理结果
		DriverManager： 依据数据库的不同，管理JDBC驱动
		Connection： 负责连接数据库并担任传送数据的任务
		Statement： 由 Connection 产生、负责执行SQL语句
		ResultSet： 负责保存Statement执行后的查询结果

		导入JDBC驱动JAR包
		数据库版本：MySQL5.7
		MySQL 官网下载对应的JDBC驱动JAR包
		mysql-connector-java-8.0.19.jar
		驱动类
		com.mysql.cj.jdbc.Driver

		纯 Java 驱动方式
		使用纯 Java 方式连接数据库
		由JDBC驱动直接访问数据库
		优点：完全 Java 代码，快速、跨平台
		缺点：访问不同的数据库需要下载专用的JDBC驱动
		JDBC驱动由数据库厂商提供
		Java 应用程序-->JDBC API-->JDBC驱动-->DBServer

		JDBC编程模板
		语法
		try {
			Class.forName(JDBC驱动类); //1.加载JDBC驱动
		} catch (ClassNotFoundException e) {
			//异常输出代码
		} //… …
		try {
			Connection con = DriverManager.getConnection(数据连接字符串, 数据库用户名, 密码); //2.与数据库建立连接
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select a, b, c from table1;"); //3.发送SQL语句，并得到返回结果
			while (rs.next()) { //4.处理返回结果
				int x = rs.getInt("a");
				String s = rs.getString("b");
				float f = rs.getFloat("c");
			}
			//5.释放资源
			rs.close();
			stmt.close();
			con.close();
		} //… …

		数据库连接字符串
		语法
		格式
		jdbc:数据库://ip:端口/数据库名称?连接参数=参数值
		数据库：表示JDBC连接的目标数据库
		ip: 表示JDBC所连接的目标数据库地址
		如果是本地数据库，可为localhost，即本地主机名
		端口：连接数据库的端口号
		数据库名称：是目标数据库的名称
		连接参数：连接数据库时的参数配置
		示例
		连接本地MySQL中hospital数据库
		jdbc:mysql://localhost:3306/hospital?serverTimezone=GMT-8 //我国处于东八区，时区设置为GMT-8

		使用 Connection 创建数据库连接
		常用方法
		方法													作用
		Statement createStatement()							创建一个 Statement 对象将SQL语句发送到数据库
		PreparedStatement prepareStatement(String sql)		创建一个 PreparedStatement 对象，将参数化的SQL语句发送到数据库
		boolean isClosed()									查询此 Connection 对象是否已经被关闭。如果已关闭，则返回 true，否则返回 false
		void close()										立即释放此 Connection 对象的数据库和JDBC资源


		使用JDBC连接本地的hospital数据库
		示例
		关键代码
		import java.sql.*;
		// …省略
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //1.加载JDBC驱动
		} catch (ClassNotFoundException e) {
			//省略…
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?serverTimezone=GMT-8","root", "123456"); //2.建立连接
		} catch (SQLException e) {
			// 省略…
		} finally {
			try {
				if (null != conn) {
					conn.close(); //3.关闭数据库连接
					System.out.println("数据库连接断开");
				}
			} catch (SQLException e) {
				//省略…
			}
		}

		Statement 接口
		Java 执行数据库操作的一个重要接口
		在已经建立数据库连接的基础上，向数据库发送要执行的SQL语句
		分类
		Statement 对象：执行不带参数的简单SQL语句
		PreparedStatement 对象：执行带或不带In参数的预编译SQL语句
		常用方法
		方法										作用
		ResultSet executeQuery（String sql）		可以执行SQL查询并获取 ResultSet 对象
		int executeUpdate（String sql）			可以执行插入、删除、更新的操作，返回值是执行该操作所影响的行数
		boolean execute（String sql）			可以执行任意SQL语句。如果结果为 ResultSet 对象，则返回 true， 如果其为更新计数或者不存在任何结果，则返回 false

		Java 的字符串操作
		说出 String 类和 StringBuffer 类的共同点和不同点
		String 类
		字符串常量一旦声明则不可改变
		String 类对象可以改变，但改变的是其内存地址的指向
		使用“+”作为数据的连接操作
		不适用频繁修改的字符串操作
		StringBuffer 类
		StringBuffer 类对象能够被多次修改，且不产生新的未使用对象
		使用append()方法进行数据连接
		适用于字符串修改操作
		是线程安全的，支持并发操作，适合多线程
		如果使用 StringBuffer 生成了 String 类型字符串，可以通过toString( )方法将其转换为一个 String 对象

		示例
		拼接SQL语句时，等效方法的实现代码
		String patientName = "李明";
		String gender = "男";
		String birthDate = "2010-09-03";
		//使用+拼接字符串
		String sql = "insert into patient (patientName, gender, birthDate) values ('" + patientName + "', '" + gender+"', '" + birthDate + "');"; //String 类对象的方法
		System.out.println(sql);
		//使用 StringBuffer 拼接字符串
		StringBuffer sbSql = new StringBuffer("insert into patient (patientName, gender, birthDate)" + " values ('"); //StringBuffer 类对象的方法
		sbSql.append(patientName + "', '");
		sbSql.append(gender + "', '");
		sbSql.append(birthDate + "');");
		sql = sbSql.toString();
		System.out.println(sql);
		/**SQL语句中，字符“"”和“'”是等效的，但在 Java 代码中拼接字符串时使用字符“'”会使代码更加清晰，也不容易出错，引号、逗号或括号等符号必须成对出现*/
		/**可在控制台输出拼接后的字符串，检查SQL语句是否正确*/

		使用 Statement 接口插入数据
		使用 Statement 接口执行插入数据的操作的方法
		executeUpdate()方法
		execute()方法
		如果希望得到插入成功的数据行数，可以使用executeUpdate()方法；否则，使用execute()方法
		实现步骤
		1.声明 Statement 变量
		2.创建 Statement 对象
		3.构造SQL语句
		4.执行数据插入操作
		5.关闭 Statement 对象

		示例
		使用JDBC，向hospital数据库病人表中添加一个新的病人记录
		病人姓名	性别	出生日期		联系电话		邮箱					登录密码	身份证号				地址
		张菲		女	1995-02-12	13887676500	fei.zhang@qq.com	909000	610000199502126100	北京市
		关键代码
		Statement stmt = null; //声明 Statement 对象
		stmt = conn.createStatement(); //创建 Statement 对象
		StringBuffer sbSql = new StringBuffer("insert into patient (patientName, gender, birthDate," + "phoneNum, email, password, identityNum, address) values ( '");
		sbSql.append(name + "', '");
		sbSql.append(gender + "', '");
		sbSql.append(birthDate + "', '");
		sbSql.append(phoneNum + "', '");
		sbSql.append(email + "', '");
		sbSql.append(password + "', '");
		sbSql.append(identityNum + "', '");
		sbSql.append(address + "');");
		stmt.execute(sbSql.toString()); //执行数据插入操作
		/**也可使用stmt. executeUpdate(sbSql.toString());*/
		//…
		if (null != stmt) {
			stmt.close(); //关闭 Statement 对象
		}
		/**关闭顺序是后创建的对象要先关闭释放资源*/
		/**为了避免可能出现的乱码问题，可将指定数据库连接的编码集为UTF8例如：本例中数据库连接URL修改为
		jdbc:mysql://localhost:3306/hospital?serverTimezone=GMT-8&useUnicode=true&characterEncoding=utf-8
		多个参数间使用字符&进行分隔*/

		使用 Statement 接口更新数据
		使用executeUpdate()方法或execute()方法实现更新数据的操作
		使用 Statement 接口更新数据库中的数据的步骤与插入数据类似
		实现步骤
		1.声明 Statement 变量
		2.创建 Statement 对象
		3.构造SQL语句
		4,执行数据更新操作
		5.关闭 Statement 对象
		需关注拼接的SQL字符串，以避免出错

		示例
		使用JDBC，将hospital数据库中patientID为13的病人电话更新为13627395833
		关键代码
		Statement stmt = null; //声明 Statement 对象
		int patientID = 13; //病人编号
		String phoneNum = "13627395833"; //联系电话
		//省略加载驱动代码、建立连接
		stmt = conn.createStatement(); //创建 Statement 对象
		StringBuffer sbSql = new StringBuffer("update patient "); //更新、添加、删除操作只是SQL语句不同
		sbSql.append("set phoneNum = '" + phoneNum + "' ");
		sbSql.append("where patientID = "+ patientID + ";");
		int effectRowNum = stmt.executeUpdate(sbSql.toString()); //执行数据更新操作
		System.out.println("更新数据的行数：" + effectRowNum);
		if (null != stmt) {
			tmt.close(); //关闭 Statement 对象
		}
		if (null != conn) {
			conn.close();
		}
		/**使用executeUpdate()方法执行SQL语句，返回受影响数据行数
		因为patientID是patient表的主键，具有唯一性，所以更新操作最多只会影响1行数据*/

		ResultSet 接口
		保存和处理Statement执行后所产生的查询结果
		由查询结果组成的一个二维表
		每行代表一条记录
		每列代表一个字段
		常用方法
		方法										说明
		boolean next()							将游标从当前位置向下移动一行
		void close()							关闭 ResultSet 对象
		int getInt(int colIndex)				以 int 形式获取结果集当前行指定列号值
		int getInt(String colLabel)				以 int 形式获取结果集当前行指定列名值
		float getFloat(int colIndex)			以 float 形式获取结果集当前行指定列号值
		float getFloat(String colLabel)			以 float 形式获取结果集当前行指定列名值
		String getString(int colIndex)			以 String 形式获取结果集当前行指定列号值
		String getString(String colLabel)		以 String 形式获取结果集当前行指定列名值
		/*要从中获取数据的列号或列名可作为方法的参数，根据值的类型选择对应的方法*/

		ResultSet 接口getXxx()方法
		getXxx( )方法
		获取当前行中某列的值
		要从中获取数据的列号或列名可作为方法的参数
		根据值的类型选择对应的方法
		int 类型		->	getInt()
		float 类型	->	getFloat()
		String 类型	->	getString()
		示例
		假设结果集的第一列为patientID，存储类型为int类型，能够获得该列值的两种方法
		//使用列号提取数据
		int id = rs.getInt(1);
		//使用列名提取数据
		int id = rs.getInt("patientID");
		/**列号从1开始计数，与数组下标从0开始计数不同*/
		/**采用列名来标识列可读性强，且不容易出错*/

		使用 Statement 和 ResultSet 接口查询数据
		示例
		使用JDBC从hospital数据库中查询前3个病人的编号、姓名、性别、住址信息并输出到控制台上
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //ResultSet 存在一个游标，游标所指行为当前行
		//省略代码…
		stmt = conn.createStatement();
		String sql = "select patientID, patientName, gender, address from patient limit 3;";
		rs = stmt.executeQuery(sql); //执行SQL语句，返回查询结果赋给结果集对象rs
		while(rs.next()) { //使用游标遍历结果集
			//可使用列号或列名标识列
			System.out.println(rs.getInt("patientID") + "\t" + rs.getString("patientName") + "\t" + rs.getString("gender") + "\t" + rs.getString("address"));
		}
		rs.close(); //关闭 Result 对象
		stmt.close();
		conn.close();
		/**注意关闭顺序*/

		SQL注入攻击
		通过提交一段SQL代码，执行超出用户访问权限的数据操作称为SQL注入（SQL Injection）
		SQL注入攻击是应用安全领域的一种常见攻击方式，会造成的数据库安全风险包括：刷库、拖库和撞库等
		主要是没有对用户输入数据的合法性进行判断，导致应用程序存在安全隐患

		为什么要使用 PreparedStatement 接口
		示例
		使用JDBC实现医院管理系统用户登录验证功能
		StringBuffer sbSql = new StringBuffer("select patientName from patient where ");
		sbSql.append("password = '" + password + "' ");
		sbSql.append("and identityNum = '" + identityNum + "';");
		System.out.println(sbSql.toString());
		rs = stmt.executeQuery(sbSql.toString());
		/**用户登录
		请输入身份证号：210000199903082100
		请输入密码：678901
		select patientName from patient where password = '678901' and identityNum = '210000199903082100';
		欢迎登录系统*/ //正常登录成功
		/**用户登录
		请输入身份证号：210000199903082100
		请输入密码：123456
		select patientName from patient where password = '678901' and identityNum = '210000199903082100';
		登录系统错误*/ //正常登录失败
		/**用户登录
		请输入身份证号：210000199903082100
		请输入密码：222'or'1'='1
		select patientName from patient where password = '222'or'1'='1' and identityNum = '210000199903082100';
		欢迎登录系统*/ //SQL注入

		PreparedStatement 接口
		PrepareStatement 接口继承自 Statement 接口
		常用方法
		方法										作用
		boolean execute()						执行SQL语句，可以是任何SQL语句。如果结果是 Result 对象，则返回 true。如果结果是更新计数或没有结果，则返回 false
		ResultSet executeQuery()				执行SQL查询，返回该查询生成的 ResultSet 对象
		int executeUpdate()						执行SQL语句，该语句必须是一个DML语句，比如：insert、update 或 delete 语句;或者是无返回内容的SQL语句，比如DDL语句。返回值是执行该操作所影响的行数
		void setXxx(int index, xxx x)			方法名Xxx和第二个参数的xxx均表示（如int，float，double等）基本数据类型，且两个类型需一致，参数列表中的x表示方法的形式参数。
												把指定数据类型（xxx）的值x设置给index位置的参数。根据参数类型的不同，常见方法有：
												setInt(int index, int x) 、setFloat(int index, float x)、
												setDouble(int index, double x)等
		void setObject(int index, Object x)		除基本数据类型外，参数类型也可以是 Object，可以将 Object 对象x设置给index位置的参数

		使用 PreparedStatement 接口操作数据库
		实现步骤
		1.创建 PreparedStatement 对象
			使用 Connection 接口prepareStatement(String sql)方法创建 PreparedStatement 对象
			需要提前设置该对象将要执行的SQL语句
			SQL语句可具有一个或多个输入参数
			//为每个输入参数保留一个问号（“?”）作为占位符
			PreparedStatement pstmt = conn.prepareStatement("select patientName from patient where identityNum = ? and password = ?");
		2.设置输入参数的值
			调用setXxx()方法完成参数赋值
			pstmt.setString(1, "1234");
			pstmt.setString(2, "111");
		3.执行SQL语句
			调用 PreparedStatement 接口executeQuery()、executeUpdate()或execute()方法执行SQL语句

		使用 PreparedStatement 实现登录功能
		示例
		验证用户输入的身份证号和密码
		Connection conn = null;
		PreparedStatement pstmt = null; //声明 PreparedStatement 对象
		//建立连接
		String sql = "select patientName from patient" + " where identityNum = ? and password = ?;"; //使用占位符的SQL语句
		pstmt = conn.prepareStatement(sql); //创建 PreparedStatement 对象
		//设置每个输入参数的值
		pstmt.setString(1, identityNum);
		pstmt.setString(2, password);
		rs = pstmt.executeQuery(); //执行SQL语句
		if (rs.next()) {
			System.out.println("欢迎" + rs.getString("patientName") + "登录系统！");
		} else {
			System.out.println("密码错误！");
		}
		… …
		pstmt.close();
		conn.close();

		properties 配置文件
		Java 的配置文件常为 properties 文件
		后缀为.properties
		以“键＝值”格式储存数据
		使用“＃”添加注释
		通常，为数据库访问添加的配置文件是database.properties
		driver/*键*/ = com.mysql.cj.jdbc.Driver/*值*/
		url = jdbc:mysql://localhost:3306/hospital?serverTimezone=GMT-8
		username = root
		password = 123456

		读取配置文件信息
		使用java.util包下的 Properties 类读取配置文件
		方法												描述
		String getProperty(String key)					用指定的键在此属性列表中搜索属性，通过参数key得到其所对应的值
		Object setProperty(String key, String value)	通过调用基类 Hashtable 的put()方法设置键-值对
		void load(InputStream inStream)					从输入流中读取属性列表 （键和元素对），通过对指定文件进行装载获取该文件中所有键-值对
		void clear()									清除所装载的键-值对，该方法由基类 Hashtable 提供

		示例
		使用 Properties 配置文件的方式改造医院管理系统
		import java.util.Properties; //导入包
		//… …省略导入其他包和类、方法的相关代码
		Properties params = new Properties();
		String configFile = "database.properties"; //配置文件路径
		String url = null;
		String username = null;
		String pwd= null;
		try {
			InputStream is = HospitalSystem.class.getClassLoader().getResourceAsStream(configFile); //加载配置文件到输入流中
			params.load(is); //从输入流中读取属性列表
			String driver = params.getProperty("driver"); //根据指定的键获取对应的值
			url = params.getProperty("url");
			username = params.getProperty("username");
			pwd = params.getProperty("password");
			//… …省略使用JDBC访问数据库的相关代码
		}

		实体类
		实体类（Entity）是 Java 应用程序中与数据库表对应的类
		用于存储数据，并提供对这些数据的访问
		通常，实现类是持久的，需要存储于文件或数据库中
		访问操作数据库时，以实体类的方式组织数据库中的实体及关系
		通常，在 Java 工程中创建一个名为entity的Package，用于集中保存实体类
		一个数据库表对应一个实体类

		定义实体类
		示例
		import java.io.Serializable;
		public class Patient implements Serializable { //实现java.io.Serializable接口
			private static final long serialVersionUID = -8762235641468472877L; //解决不同版本之间的序列化问题
			private String patientID; //病人编号，实体类属性
			//……省略与数据库表中其他字段对应的属性
			//无参、有参的构造方法
			public Patient() {}
			public Patient(String identityNum, String name) {
				this.identityNum = identityNum;
				this.patientName = name;
			}
			public static long getSerialVersionUID() {
				return serialVersionUID;
			}
			//每个成员变量的getter/setter方法
			public String getPatientID() {
				return patientID;
			}
			public void setPatientID(String patientID) {
				this.patientID = patientID;
			}
			//… …省略其他变量的getter()/setter()方法
		}

		使用实体类传递数据
		示例
		Patient patient = new Patient(); //创建实体类对象patient
		//… …省略控制台输入用户身份证号和密码代码 和 创建数据库连接代码
		if(rs.next()) { //将程序中数据在瞬时状态和持久状态间转换的机制为数据持久化
			patient.setPatientID(rs.getString("patientID")); //读取用户信息，加载到patient对象中
			//… …省略其他字段的setter方法
			while (!isExist) {
				String action=input.next();
				if (action.equals("1")) {
					//.....省略查询检查记录代码
				} else if (action.equals("2")) {
					//控制台输出patient对象信息
					System.out.println(patient.getPatientID() + "\t" +
					patient.getPatientName() + "\t" + patient.getGender() + "\t" +
					patient.getBirthDate() + "\t" + patient.getIdentityNum() + "\t" +
					patient.getPhoneNum() + "\t" + patient.getEmail() + "\t" + patient.getAddress());
				} else if (action.equals("0")) {
					isExist = true;
					System.out.println("再见");
				}
				//… …省略代码
			}
			//.....省略关闭数据库连接代码
		}

		实体类的特征
		实体类特征
		属性一般使用 private 修饰
		提供 public 修饰的getter/setter方法
		实体类提供无参构造方法，根据业务提供有参构造
		实现java.io.Serializable接口，支持序列化机制，可以将该对象转换成字节序列而保存在磁盘上或在网络上传输
		如果实体类实现了java.io.Serializable接口，应该定义属性serialVersionUID，解决不同版本之间的序列化问题
		为serialVersionUID赋值的方法
		手动
		使用IDEA生成
		private static final long serialVersionUID = -8762235641468472877L;
		/**一旦为一个实体类的serialVersionUID赋值，就不要再修改；否则，在反序列化之前版本的数据时，会报java.io.InvalidClassException异常*/

		回顾JDBC操作
		将程序中数据在瞬时状态和持久状态间转换的机制为数据持久化
		为什么进行JDBC封装
		示例
		//业务相关代码
		Scanner input = new Scanner(System.in);
		System.out.print("请输入登录名：");
		String name=input.next();
		System.out.print("请输入登录密码：");
		String password=input.next();
		// ……省略加载驱动
		//数据访问代码
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?serverTimezone=GMT-8", "root", "123456");
			// … …省略代码 … …
			if (rs.next()) {
				System.out.println("登录成功，欢迎您！");
			} else {
				System.out.println("登录失败，请重新输入！");
			}
			// ……省略代码
		} catch (SQLException e) {
			// ……省略代码
		} finally {}
		/**业务代码和数据访问代码耦合
		1.可读性差
		2.不利于后期修改和维护
		3.不利于代码复用*/

		实现JDBC封装
		示例
		将HospitalSystem中对病人的所有数据库操作抽象成接口
		<<接口>>
		PatientDao
		+ update(Patient patient):int
		+ getPatientByIdNumAndPwd(String identityNum, String Pwd):Patient
			^
			|
		+-------------------------------------------------------------------+
		| PatientDaoMySQLImpl                                               |
		| + update(Patient patient):int                                     |
		| + getPatientByIdNumAndPwd(String identityNum, String Pwd):Patient |
		|                                                                   |
		| PatientDaoOracleImpl                                              |
		| + update(Patient patient):int                                     |
		| + getPatientByIdNumAndPwd(String identityNum, String Pwd):Patient |
		+-------------------------------------------------------------------+
		/**接口由不同数据库的实现类分别实现*/

		PatientDao接口
		package com.javamysql.dao;
		import com.javamysql.entity.Patient;
		public interface PatientDao {
			/**
			* 更新病人信息
			* @param patient 病人
			*/
			int update(Patient patient);

			/**
			* 根据身份证号和登录密码返回病人信息
			* @param identityNum 身份证号
			* @param pwd 登录密码
			* @return 病人
			*/
			Patient getPatientByIdNumAndPwd(String identityNum, String pwd);
		}

		将通用的操作（打开、关闭连接等）封装到基类
		public class BaseDao {
			//… …
			static { //静态代码块，在类加载时执行
				init();
			}
			public static void init() { //读取配置文件
				Properties params = new Properties();
				String configFile = "database.properties";
				InputStream is = BaseDao.class.getClassLoader().getResourceAsStream(configFile);
				//… …
				params.load(is);
				driver = params.getProperty("driver");
				url = params.getProperty("url");
				user = params.getProperty("username");
				password = params.getProperty("password");
			}
			public Connection getConnection() { //获取数据库连接
				//… …
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				//… …
				return conn; //返回连接对象
			}
			public void closeAll(Connection conn, Statement stmt, ResultSet rs) { //关闭数据库连接
				//… …
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				//… …
			}
			//… …
		}

		基类BaseDao：增、删、改的通用方法
		public int exceuteUpdate(String preparedSql/*预编译的SQL语句*/, Object[] param/*参数的字符串数组*/) {
			PreparedStatement pstmt = null;
			int num = 0;
			conn = getConnection();
			try {
				pstmt = conn.prepareStatement(preparedSql);
				if (param != null) {
					for (int i = 0; i < param.length; i++) { //传入不同参数，调用执行增、删、改的通用方法
						//为预编译SQL设置参数
						pstmt.setObject(i + 1, param[i]);
					}
				}
				num = pstmt.executeUpdate(); //数据操纵影响的行数
			}
			// … …
			return num;
		}

		实现类实现接口并继承BaseDao基类
		public class PatientDaoMySQLImpl extends BaseDao implements PatientDao {
			public int update(Patient patient) {
				String preparedSQL = "update patient
				set address = ?,
				birthDate = ?,
				email = ?, " +
				"gender = ?,
				patientName = ?,
				phoneNum = ?,
				identityNum = ?,
				password = ?
				where patientID = ?;";
				List<String> params = new ArrayList<String>();
				//… …
				return exceuteUpdate(preparedSQL, params.toArray()); //返回更新后数据的记录数
			}
			public Patient getPatientByIdNumAndPwd(String identityNum, String pwd) {
				//… …
				conn = getConnection();
				pstmt = conn.prepareStatement("select * from patient where" + " identityNum = ? and password = ?;");
				//… …
				rs = pstmt.executeQuery();
				//… …
				return patient;
			}
		}
		/**此种封装JDBC的模式称为DAO模式*/
	}
}
