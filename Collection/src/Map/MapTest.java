package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("疯狂java讲义", 109);
        map.put("疯狂ios讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级的java ee企业应用实战", 99);
        System.out.println(map.put("疯狂ios讲义",88));
        System.out.println(map);
        System.out.println(map.containsKey("疯狂ios讲义"));
        System.out.println(map.containsValue(10));
        for (Object key : map.keySet()) {
            System.out.println(map.get(key));
            System.out.println(key+"->"+map.get(key));
        }
        map.remove("疯狂ios讲义");
        System.out.println(map.size());
    }
}
