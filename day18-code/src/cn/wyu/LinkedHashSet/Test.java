package cn.wyu.LinkedHashSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("it");
        linkedHashSet.add("www");
        linkedHashSet.add("你好");
        System.out.println(linkedHashSet);
    }
}
