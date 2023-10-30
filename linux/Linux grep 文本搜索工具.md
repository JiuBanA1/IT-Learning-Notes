## 前言
**grep** 是一个常用的文本搜索工具，通常用于在文本文件中查找特定模式或字符串。它的名字是 "global regular expression print" 的缩写。可以帮助你在文本文件中查找特定的内容，无论是简单的字符串还是复杂的正则表达式模式。
## 基本用法
```
grep pattern filename
```
**pattern**：要搜索的正则表达式模式或字符串。
**filename**：要在其上执行搜索的文件名。
### 示例
```
grep "apple" example.txt
```
## 常用选项
### -i：忽略大小写
```
grep -i pattern filename
```
搜索包含特定字符串 "pattern" 的行，不区分大小写：
```
grep -i "pattern" filename.txt
```
### -r：递归搜索目录中的文件
```
grep -r pattern directory
```
递归搜索目录中的文件：
```
grep -r "pattern" directory/
```
### -n：显示匹配行的行号
```
grep -n pattern filename
```
显示匹配行的行号：
```
grep -n "pattern" filename.txt
```
### -v：显示不匹配的行
```
grep -v pattern filename
```
显示不匹配的行：
```
grep -v "pattern" filename.txt
```
### -l：只显示包含匹配文本的文件名，而不显示匹配行
```
grep -l pattern filename
```
显示只包含匹配文本的文件名，而不显示匹配行：
```
grep -l "pattern" directory/*
```
### -E：使用扩展的正则表达式语法
```
grep -E pattern filename
```
**"pattern1|pattern2"**：这是一个正则表达式模式，其中 **|** 是一个正则表达式操作符，表示逻辑或的意思。
```
grep -E "pattern1|pattern2" filename.txt
```
## 正则表达式语法
**.**：匹配任何单个字符（除了换行符）。例如，**a.b** 可以匹配 "axb"、"aab"、"a1b" 等。
*****：匹配前一个字符或子表达式零次或多次。例如，**a*b** 可以匹配 "b"、"ab"、"aab"、"aaab" 等。
**+**：匹配前一个字符或子表达式一次或多次。例如，**a+b** 可以匹配 "ab"、"aab"、"aaab" 等。
**?**：匹配前一个字符或子表达式零次或一次。例如，**colou?r** 可以匹配 "color" 和 "colour"。
**[]**：字符类，用于匹配方括号内的任何一个字符。例如，**[aeiou]** 匹配任何一个元音字母。
**[^]**：否定字符类，用于匹配除了方括号内字符之外的任何字符。例如，**[^0-9]** 匹配任何非数字字符。
**()**：捕获组，用于捕获一个子表达式中的匹配文本，以便后续引用。例如，**(abc)+** 匹配 "abc"、"abcabc"、"abcabcabc" 等。
**^**：匹配字符串的开头（或行的开头，如果使用多行模式）。例如，**^abc** 匹配以 "abc" 开头的行。
**$**：匹配字符串的结尾（或行的结尾，如果使用多行模式）。例如，**xyz$** 匹配以 "xyz" 结尾的行。
## 常见的文本模式
匹配单词：
匹配单词 "apple"：grep "apple" file.txt
匹配以 "apple" 开头的单词：grep "^apple" file.txt
匹配以 "apple" 结尾的单词：grep "apple$" file.txt
匹配包含 "apple" 的单词：grep "apple" file.txt
忽略大小写匹配 "apple"：grep -i "apple" file.txt
匹配什么或什么 grep -E "pattern1|pattern2" filename.txt

匹配数字：
匹配整数：grep "[0-9]+" file.txt
匹配浮点数：grep "[0-9]+\.[0-9]+" file.txt

匹配日期：
匹配日期格式 "YYYY-MM-DD"：grep "[0-9]{4}-[0-9]{2}-[0-9]{2}" file.txt

匹配IP地址：
匹配IPv4地址：grep "\b\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}\b" file.txt

匹配URL：
匹配常见URL：grep "https?://[^\s]+" file.txt

匹配空白行：
匹配空白行：grep "^\s*$" file.txt

匹配引号内的文本：
匹配双引号内的文本：grep "\"[^\"]*\"" file.txt
匹配单引号内的文本：grep "'[^']*'" file.txt
