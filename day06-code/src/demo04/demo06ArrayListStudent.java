package demo04;

import java.util.ArrayList;

public class demo06ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list =  new ArrayList<>();

        list.add(new Student(22,"洪七公"));
        list.add(new Student(23,"欧阳锋"));
        list.add(new Student(53,"黄药师"));
        list.add(new Student(33,"段智庆"));

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名："+stu.getName()+" 年龄："+stu.getAge());

        }
    }
}
