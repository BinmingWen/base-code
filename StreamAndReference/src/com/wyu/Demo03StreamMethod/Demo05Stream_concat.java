package com.wyu.Demo03StreamMethod;

import java.util.stream.Stream;

public class Demo05Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("李白", "韩信", "赵云");
        //Stream<String> limit = Stream.of("都是刺客");
        Stream<String> limit = stream.skip(2);
        Stream<String> concat = Stream.concat(stream, limit);
        concat.forEach((s)->{
            System.out.println(s);
        });
    }
}
