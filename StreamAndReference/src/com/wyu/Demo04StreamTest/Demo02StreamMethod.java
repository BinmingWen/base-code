package com.wyu.Demo04StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo02StreamMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张翠上");
        list.add("张无忌");
        list.add("李云龙");
        list.add("马云");
        list.add("刘根");
        list.add("冯静");
        list.add("嘉义");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("马强");
        arrayList.add("刘艳云");
        arrayList.add("佳佳胡");
        arrayList.add("胡歌");
        arrayList.add("刘梦瑶");
        Stream<String> s1 = list.stream().filter((s) -> s.length() == 3).limit(3);
        Stream<String> s2 = arrayList.stream().filter((s) -> s.startsWith("张")).skip(2);
        Stream.concat(s1, s2).map(name->new Person(name)).forEach(p->System.out.println(p.getName()));
    }
}
