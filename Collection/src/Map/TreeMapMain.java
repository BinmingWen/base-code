package Map;

import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<R, B> treeMap = new TreeMap<>();
        treeMap.put(new R(10),new B(20));
        treeMap.put(new R(10),new B(22));
        treeMap.put(new R(20),new B(28));
        treeMap.put(new R(50),new B(112));
        treeMap.put(new R(22),new B(82));
        treeMap.forEach((k,v)-> System.out.println("key: "+k+" value: "+v));
        System.out.println("-------");
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.higherEntry(new R(29)));
        System.out.println(treeMap.lowerEntry(new R(0)));
        System.out.println(treeMap.subMap(new R(-1),new R(60)));
    }
}
