## Collection接口概念
Java集合框架是Java编程中的一个非常重要的部分，提供了一组用于处理数据集合的接口和类。其中Collection接口是Java集合框架的基础接口之一，定义了一些基本的集合操作，包括添加元素、删除元素、遍历集合等。在这里，我将为您详细介绍Java集合框架中的Collection接口。
Collection接口是Java集合框架中的基础接口，定义了一些基本的集合操作，包括添加元素、删除元素、遍历集合等。在Java中，Collection接口是一个顶层接口，它有两个主要的子接口：List和Set。其中，List是一个有序的集合，可以包含重复的元素；而Set是一个不重复的集合，元素是无序的。
## Collection接口的常用方法
1、add(Object obj)：向集合中添加一个元素obj；
2、addAll(Collection c)：将集合c中的所有元素添加到该集合中；
3、remove(Object obj)：从集合中移除一个元素obj；
4、removeAll(Collection c)：移除集合c中的所有元素；
5、retainAll(Collection c)：仅保留集合c中的元素，其他元素将被移除；
6、clear()：清空集合中的所有元素；
7、contains(Object obj)：判断集合中是否包含元素obj；
8、containsAll(Collection c)：判断集合中是否包含集合c中的所有元素；
9、isEmpty()：判断集合是否为空；
10、size()：获取集合中元素的个数；
11、toArray()：将集合转换为数组。
除了上述方法外，Collection接口还有一些其他方法，如iterator()方法可以返回一个迭代器，用于遍历集合中的元素；forEach()方法可以对集合中的每个元素执行指定的操作等。
总之，Java集合框架提供了一组用于处理数据集合的接口和类，Collection接口是其基础接口之一。使用Java集合框架，可以更加方便地处理各种数据集合，提高编程效率和代码质量。
## 示例
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        
        // 向集合中添加元素
        collection.add("apple");
        collection.add("banana");
        collection.add("cherry");
        
        // 遍历集合中的元素
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        
        // 判断集合中是否包含指定元素
        boolean contains = collection.contains("banana");
        System.out.println("集合中是否包含banana：" + contains);
        
        // 从集合中移除指定元素
        collection.remove("cherry");
        
        // 清空集合中的所有元素
        collection.clear();
        
        // 判断集合是否为空
        boolean isEmpty = collection.isEmpty();
        System.out.println("集合是否为空：" + isEmpty);
    }
}

```
