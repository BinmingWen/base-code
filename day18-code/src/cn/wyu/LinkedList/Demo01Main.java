package cn.wyu.LinkedList;

import java.util.LinkedList;

public class Demo01Main {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();
        link.addFirst("a");
        link.add("b");
        link.addFirst("c");
       link.addLast("d");

        System.out.println(link);
        System.out.println("======");
        String f = link.getFirst();
        System.out.println(f);
        String last = link.getLast();
        System.out.println(last);
        System.out.println("======");
        String s = link.removeFirst();
        System.out.println(s);
        System.out.println(link);
        System.out.println("======");
        String s1 = link.removeLast();
        System.out.println(s1);
        System.out.println(link);
        System.out.println("=====");
        link.push("www");
        System.out.println(link);
        String peek = link.peek();
        System.out.println(peek);
        System.out.println(link
        System.out.println("=======");
        String remove = link.remove();
        System.out.println(remove);
        System.out.println(link);
        System.out.println("====="););
    }
}
