package com.wyu.Demo03StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo02Stream_count {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Stream<Integer> stream = list.stream();

        System.out.println(stream.count());
    }
}
