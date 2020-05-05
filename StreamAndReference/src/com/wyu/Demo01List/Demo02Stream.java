package com.wyu.Demo01List;

import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("张强");
        list.add("周志辉");
        list.add("赵敏");
        list.add("李强");

        list.stream().filter(name->name.startsWith("张"))
                .filter(s->s.length()>2)
                .forEach(s-> System.out.println(s));
    }
}
