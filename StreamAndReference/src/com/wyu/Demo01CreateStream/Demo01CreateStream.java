package com.wyu.Demo01CreateStream;

import java.util.*;
import java.util.stream.Stream;

public class Demo01CreateStream {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("马云");
        coll.add("马化腾");
        Stream<String> s1 = coll.stream();

        Set<String> set = new HashSet<>();
        Stream<String> s2 = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> setMap = map.keySet();
        Stream<String> s3 = setMap.stream();
        Collection<String> values = map.values();
        Stream<String> s4 = values.stream();

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> s5 = entries.stream();

        Stream<Integer> s6 = Stream.of(1, 3, 4, 5);

        Integer[] arr = {1, 3, 3, 4};
        Stream<Integer> s7 = Stream.of(arr);
        String[] str = null;
        Stream<String> s8 = Stream.of(str);

    }
}
