package CollectionEach;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionEachMain {
    public static void main(String[] args) {
        //创建集合
        Collection books = new HashSet<>();
        books.add("李白");
        books.add("韩信");
        books.add("典韦");
        books.forEach(obj-> System.out.println("迭代元素集合: "+obj));
        Iterator iterator = books.iterator();
        iterator.forEachRemaining(obj-> System.out.println(obj));
    }
}
