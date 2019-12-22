package demo01;


public class personTest {
    public static void main(String[] args) {
        Person p = new Person();
        //p.age = 100;
        p.setAge(1000);
        System.out.println("年龄为："+p.getAge());
        System.out.println("======");
        p.setAge(30);
        System.out.println("年龄为："+p.getAge());
        p.setName("李刚");
        System.out.println("姓名为："+p.getName());

    }
}
