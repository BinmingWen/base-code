package Demo08Function;

import java.util.function.Function;

public class Demo02Function_and {
    public static void chang(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        /*Integer i = fun1.apply(s);
        String str = fun2.apply(i);*/
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s = "123";
        //调用chang方法，先把s转化为Integer 然后加10，再转化为String
        chang(s,(String str)->{
            return Integer.parseInt(str)+10;
        },(Integer i)->{
            return String.valueOf(i);
        });
    }
}
