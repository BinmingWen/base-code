package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        Collection books = new ArrayList<>();
        books.add(new String("轻量级Java EE企业应用实战"));
        books.add(new String("疯狂Java讲义"));
        books.add(new String("疯狂Ios讲义"));
        System.out.println(books);
        //books.add(1, new String("疯狂Android讲义"));
        /*for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }*/
        System.out.println("---------");
        System.out.println(books.remove(2));
        System.out.println(books);
        //System.out.println(books.indexOf(new String("疯狂Ios讲义")));
       // System.out.println(books.set(1, new String("疯狂Java讲义")));
        System.out.println(books);
       // System.out.println(books.subList(2,3));
        System.out.println("-------");
        //Collection的用法
        Collection c = new ArrayList();
        c.add(6);
        c.add("至尊宝");
        System.out.println(c.size());
        System.out.println(c.contains("孙悟空"));
        System.out.println(c.containsAll(books));
        System.out.println(c.removeAll(books));
        System.out.println(c);
        System.out.println(books);
        System.out.println(c.retainAll(books));
        books.forEach(obj-> System.out.println("迭代集合元素："+obj));
        //获取books的迭代器
        Iterator it = books.iterator();
        it.forEachRemaining(obj-> System.out.println(obj));
        /*while (it.hasNext()) {
            String str = (String)it.next();
            System.out.println(str);
            if (str.equals("疯狂Java讲义")) {
                //it.remove();
                books.remove(str);
            }
            str = "李白";
        }*/
        //System.out.println(books);
    }
}
