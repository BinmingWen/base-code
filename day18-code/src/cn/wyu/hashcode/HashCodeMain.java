package cn.wyu.hashcode;

public class HashCodeMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.hashCode());
        Person p2 = new Person();
        System.out.println(p2.hashCode());
        System.out.println("======");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("========");
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
