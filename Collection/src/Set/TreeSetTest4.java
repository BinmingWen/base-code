package Set;

import java.util.TreeSet;

public class TreeSetTest4 {
    public static void main(String[] args) {
        TreeSet<M> ts = new TreeSet<>();
        ts.add(new M(5));
        ts.add(new M(5));
        ts.add(new M(9));
        System.out.println(ts);
    }
}
