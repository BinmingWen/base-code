package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("疯狂java讲义");
        books.add("轻量级java EE企业应用实战");
        System.out.println(books);
        books.remove("疯狂的java讲义");
        books.add("疯狂java讲义");
        System.out.println(books);
    }
}
