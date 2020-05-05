package Demo08Function;

import java.util.function.Function;

public class Demo01Function {
    public static void chang(String s, Function<String,Integer> fun){
        Integer i = fun.apply(s);
        System.out.println(i);
    }

    public static void main(String[] args) {
        String s = "123";
        chang(s,(String str)->{
            return Integer.parseInt(str);
        });

    }
}
