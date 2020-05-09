package Collections;

import java.util.*;

public class SychronizedTest {
    public static void main(String[] args) {
        //把集合设置为安全线程
        Collection c = Collections.synchronizedCollection(new ArrayList<>());
        List list = Collections.synchronizedList(new ArrayList<>());
        Set<Object> objects = Collections.synchronizedSet(new HashSet<>());
        Map m = Collections.synchronizedMap(new HashMap<>());
    }
}
