package com.wyu.Demo03StreamMethod;

import java.util.stream.Stream;

public class Demo01Stream_map {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("1", "2", "3");
        Stream<Integer> s2 = s1.map((String s) -> {
            return Integer.parseInt(s);
        });
        s2.forEach((Integer i)->{
            System.out.println(i);
        });

    }
}
