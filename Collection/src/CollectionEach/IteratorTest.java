package CollectionEach;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Predicate;

public class IteratorTest {
    public static int callAll(Collection books, Predicate p) {
        int total = 0;
        for (Object obj : books) {
            if(p.test(obj)){
                total++;
            }
        }
        return total;
    }
    public static void main(String[] args) {

        Collection books = new HashSet();
        books.add("轻量级java EE企业应用实战");
        books.add("疯狂的java讲义");
        books.add("疯狂的Android讲义");
        System.out.println(callAll(books, ele -> ((String) ele).contains("疯狂")));
        System.out.println(callAll(books, ele -> ((String) ele).contains("java")));
        System.out.println(callAll(books,ele->((String)ele).length()>10));
        /*books.forEach(obj-> System.out.println("迭代集合元素："+obj));
        System.out.println("集合迭代器");
        Iterator it = books.iterator();
        while (it.hasNext()) {
            String book = (String) it.next();
            System.out.println(book);
            if (book.equals("疯狂的java讲义")) {
                //it.remove();
                //books.remove(book);

            }
            book = "则是字符串";

        }
        System.out.println(books);
        System.out.println("========");
        for (Object obj : books) {
            String book = (String) obj;
            System.out.println(book);
        }*/
    }
}
