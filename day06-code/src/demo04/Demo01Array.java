package demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] person = new Person[3];

        Person one = new Person(62,"马玉");
        Person two = new Person(28,"张三");
        Person three = new Person(23,"李四");

        person[0] = one;
        person[1] = two;
        person[2] = three;
        System.out.println(person[0]);
        System.out.println(person[1]);
        System.out.println(person[2]);
    }
}
