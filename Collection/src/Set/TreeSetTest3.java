package Set;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class TreeSetTest3 {
    public static void main(String[] args) {
        R r = new R(1);
        R r2 = new R(1);
        System.out.println(r==r2);    //false
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r.equals(r2));

       /* TreeSet ts = new TreeSet();
        ts.add(new R(5));
        ts.add(new R(-3));
        ts.add(new R(9));
        ts.add(new R(-2));
        System.out.println(ts);
        R r = (R) ts.first();
        r.setCount(20);
        R last = (R) ts.last();
        last.setCount(-2);
        System.out.println(ts);
        System.out.println(ts.remove(new R(-2)));
        System.out.println(ts);
        System.out.println(ts.remove(new R(5)));*/
    }
}
