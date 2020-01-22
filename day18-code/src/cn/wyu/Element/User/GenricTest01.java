package cn.wyu.Element.User;

import java.util.ArrayList;
import java.util.Iterator;

public class GenricTest01 {
    public static void main(String[] args) {
        //ArrayList<?> list = new ArrayList<>();
        //list.add("abc");
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello world");
        list.add("abc");
        printList(list);
    }

    private static void printList(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
//            System.out.println(it.next());
        }
    }
}
