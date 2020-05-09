package Map;

import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHashTest {
    public static void main(String[] args) {
        LinkedHashMap ht = new LinkedHashMap();
        ht.put(new A(0), "疯狂的java讲义");
        ht.put(new A(1), "疯狂的c++讲义");
        ht.put(new A(2), "疯狂的ios讲义");
        ht.put(new A(4), new B(2));
        System.out.println(ht);
        ht.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
    }
}
