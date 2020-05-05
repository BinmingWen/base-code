package Demo04Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Demo04Comparator {
    public static Comparator<String> getComparable() {
        /*//使用匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };
        */
        //lambda表达式
        return ( o1,  o2)-> o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] strs = {"a", "abc", "ccccc"};
        System.out.println( Arrays.toString(strs));
        Arrays.sort(strs, getComparable());
        System.out.println(Arrays.toString(strs));
    }

}
