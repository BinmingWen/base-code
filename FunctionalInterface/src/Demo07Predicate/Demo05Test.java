package Demo07Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo05Test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1, Predicate<String> pre2) {
        List<String> list = new ArrayList<>();
        for (String str : arr) {
            boolean b = pre1.and(pre2).test(str);
            if (b) {
                list.add(str);
            }
        }
        return (ArrayList<String>)list;
    }
    public static void main(String[] args) {
        //去掉两个字的名字和最小的年龄
        String[] arr = {"马化腾,46", "马云,56", "刘强东,42"};
        ArrayList<String> list = filter(arr,(String s1)->{
            //名字为三个字的
            return s1.split(",")[0].length()>2;
        },(String s2)->{
            //年龄去掉最小值
            return Integer.parseInt(s2.split(",")[1])<50;
        });
        list.forEach((String s)->{
            System.out.println(s);
        });

    }
}
