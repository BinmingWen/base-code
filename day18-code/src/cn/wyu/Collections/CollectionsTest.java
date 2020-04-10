package cn.wyu.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * static <T> boolean addAll(Collection<? super T> c, T... elements)
 * 将所有指定元素添加到指定 collection中。
 *
 *  static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
 */
public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("=======");
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        System.out.println("=======");
        Collections.shuffle(list);
        System.out.println(list);
        
    }
}
