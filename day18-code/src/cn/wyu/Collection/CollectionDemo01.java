package cn.wyu.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection祖先接口
    常用方法：
    add();
    remove();
    clear();
    contains();
    size();

 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        boolean b1 = coll.add("张三");
        System.out.println(b1);
        boolean b2 = coll.add("李四");
        System.out.println(b2);


        boolean b4 = coll.add("王五");
        System.out.println(coll);
        System.out.println("========");
        boolean c1 = coll.remove("张三");
        System.out.println(c1);
        System.out.println(coll);
        System.out.println("=====");
        boolean c2 = coll.remove("赵云");
        System.out.println(c2);
        System.out.println("=======");
        System.out.println(coll.size());
        System.out.println("=======");
        System.out.println(coll.isEmpty());
        System.out.println(coll.contains("李四"));

        System.out.println("========");
        Object[] str = coll.toArray();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("========");
        coll.clear();
        System.out.println(coll);
    }
}
