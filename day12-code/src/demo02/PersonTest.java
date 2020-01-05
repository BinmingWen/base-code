package demo02;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("孙悟空", "123");
        Person p2 = new Person("孙悟空", "123");
        System.out.println(p1==p2);
        System.out.println("======");
        /*Integer a = new Integer(2);
        Integer b = new Integer(2);
        System.out.println(a.equals(b));*/
    }
}
