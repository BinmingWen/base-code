package Collections;

import java.util.*;

public class UnmodifiableTest {
    public static void main(String[] args) {
        List<Object> list = Collections.emptyList();
        Set<String> unmodifiableSet = Collections.singleton("疯狂Java讲义");
        Map scores = new HashMap<>();
        scores.put("语文", 30);
        scores.put("Java", 88);
        Map map = Collections.unmodifiableMap(scores);
        map.put("英语", 99);
    }
}
