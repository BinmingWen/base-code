package demo01;

public class Student {
    private String name;
    private int age;
    static String room;
    private static int id;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Student.id = id;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        id++;
    }

    public Student() {
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
