package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("疯狂java讲义", null);
        map.put("疯狂ios讲义", 20);
        map.put("疯狂Ajax讲义", 79);
        map.replace("疯狂XML讲义", 66);
        System.out.println(map);
        map.merge("疯狂java讲义", 10, (oldVal, param) -> (Integer) oldVal + (Integer) param);
        System.out.println(map);
        map.computeIfAbsent("java",(key)->((String)key).length());
        System.out.println(map);
        map.computeIfPresent("java",(key,value)->(Integer)value*(Integer)value);
        System.out.println(map);
        map.forEach((key,value)-> System.out.println(key+"->"+value));
    }
}
