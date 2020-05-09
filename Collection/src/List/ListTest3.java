package List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ListTest3 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Ios讲义"));
        books.add(new String("疯狂Android讲义"));
        System.out.println(books);
        books.sort((o1, o2) -> ((String) o1).length() - ((String) o2).length());
        System.out.println(books);
        books.replaceAll(ele -> ((String) ele).length());
        System.out.println(books);
        System.out.println("----------");
        //添加ListIterator接口
        ListIterator lit = books.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("------");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }

}
