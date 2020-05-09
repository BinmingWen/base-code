package Map;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableTest {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new A(0), "疯狂的java讲义");
        ht.put(new A(1), "疯狂的c++讲义");
        ht.put(new A(2), "疯狂的ios讲义");
        ht.put(new A(4), new B(2));
        System.out.println(ht);
        System.out.println(ht.containsValue("测试字符"));
        System.out.println(ht.containsKey(new A(0)));
        //修改key的值，带来的后果有哪些
        Iterator iterator = ht.keySet().iterator();
        A next = (A) iterator.next();
        next.count = 10;
        System.out.println(ht.remove(new A(0)));
        System.out.println(ht.get(new A(0)));
        System.out.println(ht.get(new A(1)));
    }
}
