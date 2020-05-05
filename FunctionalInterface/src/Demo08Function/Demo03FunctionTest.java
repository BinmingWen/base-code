package Demo08Function;

import java.util.function.Function;

/*
  1.截取字符串的数字部分
    Function<String,String>
  2.把数字部分转化成Integer
    Function<String,Integer>
  3.把得到的数字累加100
    Function<Integer,Integer>
 */
public class Demo03FunctionTest {
    public static void chang(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
       /* String str = fun1.apply(s);
        Integer i = fun2.apply(str);
        Integer j = fun3.apply(i);*/
       Integer j = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(j);
    }

    public static void main(String[] args) {
        String str = "赵丽颖,20";
        chang(str,(String s)->{
            return s.split(",")[1];
        },(String s)->{
            return Integer.parseInt(s);
        },(Integer i)->{
            return i+100;
        });
    }
}
