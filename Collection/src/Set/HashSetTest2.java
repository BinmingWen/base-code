package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(5));
        hs.add(new R(-3));
        hs.add(new R(9));
        hs.add(new R(-2));
        System.out.println(hs);
       /* Iterator iterator = hs.iterator();
        R first = (R) iterator.next();
        first.setCount(-3);
        System.out.println(hs);
        System.out.println(hs.remove(new R(-3)));
        System.out.println(hs);*/
        Iterator iterator = hs.iterator();
        R first = (R) iterator.next();
        first.setCount(20);

    }
}
