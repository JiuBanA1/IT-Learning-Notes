## Shell 流程控制
使用Shell编程时，流程控制是非常重要的，它允许你根据条件执行不同的命令或者控制程序的执行流程。Shell支持一些基本的流程控制结构，包括条件语句和循环语句。
### 1、条件语句
**if语句**
```python
if [ 条件 ]; then
    # 如果条件为真执行的命令
elif [ 其他条件 ]; then
    # 如果其他条件为真执行的命令
else
    # 如果所有条件都不为真执行的命令
fi
```
示例：
```python
#!/bin/bash
read -p "请输入一个数字: " num

if [ $num -eq 0 ]; then
    echo "输入的数字是零"
elif [ $num -gt 0 ]; then
    echo "输入的数字是正数"
else
    echo "输入的数字是负数"
fi
```
### 2、循环语句
**for循环**
```python
for 变量 in 列表; do
    # 循环体内的命令
done
```
示例：
```python
#!/bin/bash
for fruit in apple banana cherry; do
    echo "水果: $fruit"
done
```
**while循环**
```python
while [ 条件 ]; do
    # 循环体内的命令
done
```
示例：
```python
#!/bin/bash
count=1

while [ $count -le 5 ]; do
    echo "这是第 $count 次循环"
    ((count++))
done
```
**until循环**
```python
until [ 条件 ]; do
    # 循环体内的命令
done
```
示例：
```python
#!/bin/bash
count=1

until [ $count -gt 5 ]; do
    echo "这是第 $count 次循环"
    ((count++))
done
```
## Shell 函数
当你在Shell脚本中需要多次执行相同的代码块时，你可以使用函数来封装这些代码，以便更容易地管理和重用它们。在Shell中，你可以使用**function**关键字或**()**来定义函数。
```python
#!/bin/bash

# 定义一个简单的函数
my_function() {
  echo "这是一个自定义的Shell函数"
}

# 调用函数
my_function
```
1、**#!/bin/bash** 表示这是一个Bash脚本。
2、**my_function()** 定义了一个名为**my_function**的函数。在函数名称后面的括号内可以包含参数，但在这个示例中，我们没有使用任何参数。
3、在函数体内，我们使用**echo**命令来打印一条消息。
4、最后，我们在脚本的主体部分调用了**my_function**函数。这会执行函数体内的代码，从而打印出相应的消息。
```python
#!/bin/bash

# 定义一个带参数的函数
greet() {
  local name="$1"
  echo "Hello, $name!"
}

# 调用函数，并传递参数
greet "Alice"
greet "Bob"
```
在这个示例中，**greet**函数接受一个参数**name**，并在消息中使用它。我们使用**greet**函数两次，每次传递不同的名字作为参数。
## Shell 输入/输出重定向
这些示例展示了如何使用不同的输入/输出重定向操作符来处理命令的输入和输出。你可以根据具体的需求，将这些示例中的操作符和命令组合起来使用。
1、标准输出重定向 (**>**) 示例：
```
# 将ls命令的输出写入到file.txt文件中
ls > file.txt
```
2、追加输出重定向 (**>>**) 示例：
```
# 将echo的输出追加到file.txt文件的末尾
echo "Hello, World!" >> file.txt
```
3、标准输入重定向 (**<**) 示例：
```
# 从input.txt文件中读取内容，并使用sort命令排序
sort < input.txt
```
4、管道 (**|**) 示例：
```
# 使用ls命令列出当前目录的文件，并将结果传递给grep命令以搜索包含"example"的行
ls | grep "example"
```
5、标准错误重定向 (**2>**) 示例：
```
# 运行一个不存在的命令，将错误信息保存到error.log文件中
non_existent_command 2> error.log
```
6、同时重定向标准输出和标准错误 (**&>** 或 **2>&1**) 示例：
```
# 将命令的输出和错误信息都写入到output.log文件中
some_command &> output.log
```
## Shell 文件包含
在Shell脚本中，你可以使用文件包含来将一个脚本分解成多个文件，以提高可维护性和代码复用。通常，你可以使用**source**命令或**.**（点号）操作符来包含其他Shell脚本文件。
### 文件包含的示例
**脚本1.sh:**
```
#!/bin/bash

# 这是脚本1.sh的内容
echo "这是脚本1.sh"
```
**脚本2.sh:**
```
#!/bin/bash

# 这是脚本2.sh的内容
echo "这是脚本2.sh"
```
现在，你可以创建一个主脚本，将这两个文件包含进来。
**主脚本.sh:**
```
#!/bin/bash

# 包含脚本1.sh
source 脚本1.sh

# 或者使用 . 操作符
# . 脚本1.sh

# 包含脚本2.sh
source 脚本2.sh

# 主脚本的内容
echo "这是主脚本"

# 运行脚本1.sh和脚本2.sh中的命令
```
这样，你可以将一些通用的功能放在单独的脚本文件中，然后在需要的地方包含它们，以提高代码的模块化和可重用性。确保包含的脚本文件具有可执行权限，以便Shell可以执行它们。
