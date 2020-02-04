package cn.wyu.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        //System.out.println("==========");
        //迭代器
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("==========");
        //增强for循坏
        for (Integer a : set) {
            System.out.println(a);
        }
    }
}
