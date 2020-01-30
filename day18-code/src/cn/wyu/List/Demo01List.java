package cn.wyu.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //boolean add(E e)
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //重写toString方法
        System.out.println(list);
        //使用迭代器 Iterator<E> iterator()
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        //增强for循坏
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("========");
        // E remove(int index)
        String rs = list.remove(0);
        System.out.println(rs);
        System.out.println("=====");
        // E get(int index) 返回列表中指定位置的元素。
        System.out.println(list.get(0));
        System.out.println("=====");
        // E set(int index, E element)用指定元素替换列表中指定位置的元素（可选操作）。
        String sa = list.set(0, "aaa");
        System.out.println(sa);
        System.out.println(list);
    }
}
