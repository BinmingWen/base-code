package cn.wyu.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        Iterator<String> iterator = coll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("======");

    }

}
