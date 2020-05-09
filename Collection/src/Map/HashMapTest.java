package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap();
        hashMap.put(1, "小明");
        hashMap.put(2, "小红");
        hashMap.put(3, "小白");
        //使用Entry遍历Map集合
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        entries.forEach(m -> System.out.println("key" + m.getKey() + " value" + m.getValue()));
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }
        //使用forEach遍历Map集合
        hashMap.forEach((k,v)-> System.out.println(k+v));
        //获取key的值
        Set<Integer> set = hashMap.keySet();
        set.forEach(k-> System.out.println(k));
        //获取value
        Collection<String> values = hashMap.values();
        values.forEach(v-> System.out.println(v));
        //删除对象
        String remove = hashMap.remove(1);
        System.out.println(remove);
        System.out.println(hashMap);
        for (Integer i : set) {
            System.out.println(hashMap.get(i));
        }
    }
}
