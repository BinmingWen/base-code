package demo01;

public class demo05Substring {
    public static void main(String[] args) {
        String str1 = "Helloworld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("============");

        String str3 = str1.substring(0,2);
        System.out.println(str3);
        System.out.println("=========");

        String str4 = "hello";
        System.out.println(str4);
        str4 = "java";
        System.out.println(str4);
    }
}
