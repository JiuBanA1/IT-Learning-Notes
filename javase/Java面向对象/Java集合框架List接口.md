## List接口概念
Java集合框架中的List接口是一种有序的集合，它可以存储重复的元素。它是Collection接口的子接口，提供了一系列可以对列表进行操作的方法，如添加、插入、删除、获取元素等。List接口还可以通过索引访问元素，类似于数组。
List接口有多个实现类，其中比较常用的是ArrayList和LinkedList。ArrayList是一个基于动态数组实现的List，它可以随机访问元素，并且在末尾添加元素非常快速，但在中间插入或删除元素则需要移动其他元素，效率较低。而LinkedList是一个基于链表实现的List，它在插入和删除元素时效率比ArrayList高，但是随机访问元素则需要遍历链表，效率较低。
## List接口常用的方法
1、void add(int index, E element)：在指定索引位置插入元素。
2、boolean add(E e)：将元素添加到列表末尾。
3、boolean remove(Object o)：删除列表中第一个出现的指定元素。
4、E remove(int index)：删除指定索引位置的元素。
5、E get(int index)：获取指定索引位置的元素。
6、int size()：返回列表中元素的数量。
7、boolean contains(Object o)：判断列表中是否包含指定元素。
8、boolean isEmpty()：判断列表是否为空。
9、void clear()：清空列表中的所有元素。
10、int indexOf(Object o)：返回指定元素在列表中第一次出现的索引位置，如果列表不包含该元素，则返回-1。
## 示例
```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // 创建一个ArrayList实例
        List<String> list = new ArrayList<>();

        // 添加元素到列表
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        // 打印列表中的元素
        System.out.println("List elements: " + list);

        // 在指定位置插入元素
        list.add(2, "Peach");
        System.out.println("After inserting Peach at index 2: " + list);

        // 删除指定元素
        list.remove("Orange");
        System.out.println("After removing Orange: " + list);

        // 获取指定位置的元素
        String secondElement = list.get(1);
        System.out.println("Second element in the list is: " + secondElement);

        // 判断列表是否包含指定元素
        boolean containsBanana = list.contains("Banana");
        System.out.println("List contains Banana? " + containsBanana);

        // 返回列表中元素的数量
        int size = list.size();
        System.out.println("Size of the list is: " + size);
    }
}
```
