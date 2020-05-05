package com.wyu.Demo03StreamMethod;

import java.util.stream.Stream;

public class Demo03Stream_limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("李白", "韩信", "赵云");
        Stream<String> limit = stream.limit(2);
        limit.forEach((s)->{
            System.out.println(s);
        });
    }
}
