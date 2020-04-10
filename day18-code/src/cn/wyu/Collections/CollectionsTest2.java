package cn.wyu.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest2 {
    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>();
        list01.add(10);
        list01.add(28);
        list01.add(4);
        System.out.println(list01);
        Collections.sort(list01);
        System.out.println("=======");
        System.out.println(list01);
        System.out.println("=======");
        List<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("f");
        list02.add("c");
        Collections.sort(list02);
        System.out.println(list02);

        System.out.println("=========");
        List<Person> list04 = new ArrayList<>();
        list04.add(new Person("李白", 33));
        list04.add(new Person("韩信", 22));
        list04.add(new Person("关羽",43));
        /*System.out.println(list04);
        Collections.sort(list04);
        System.out.println(list04);*/
        System.out.println(list04);
        Collections.sort(list04, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("========");
        System.out.println(list04);
        System.out.println("======");
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("b赵云", 22);
        Student s2 = new Student("a马玉", 22);
        Student s3 = new Student("剥夺了基于", 10);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result =o1.getAge()-o2.getAge();
                if (result == 0) {
                    return o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);
    }
}
