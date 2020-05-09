package List;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args) {
        List fixedList = Arrays.asList("疯狂Java讲义","疯狂Ios讲义");
        System.out.println(fixedList.getClass());
        fixedList.forEach(System.out::print);
        fixedList.add("疯狂Android讲义");
        fixedList.remove("疯狂Java讲义");
    }
}
