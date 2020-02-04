package cn.wyu.HashSet;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美",18);
        Person p2 = new Person("小美",18);
        Person p3 = new Person("小美",18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(set);
    }
}
