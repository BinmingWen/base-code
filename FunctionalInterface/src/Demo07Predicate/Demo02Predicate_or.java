package Demo07Predicate;

import java.util.function.Predicate;

public class Demo02Predicate_or {
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.test(s) || pre2.test(s);
        //return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "abcdfg";
        boolean b = checkString(s,(String s1)->{
            return s1.length()>5;
        },(String s2)->{
            return s2.contains("a");
        });
        System.out.println(b);

    }
}
