package Demo07Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    public static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s = "abcd";
        boolean b = checkString(s,(String str)->{
            return s.length()>5;
        });
        System.out.println(b);
    }
}
