package cn.wyu.CollectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("李白", 69);
        Person p2 = new Person("周瑜", 33);
        list.add(p1);
        list.add(p2);
        System.out.println(list);
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o1.getAge();
            }
        });
        System.out.println("========");
        System.out.println(list);
    }
}
