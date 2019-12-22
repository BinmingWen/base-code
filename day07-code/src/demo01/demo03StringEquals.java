package demo01;

public class demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println("Hello".equals(str1));
        System.out.println(str2.equals("Hello"));

        String str4 = null;
        System.out.println("abc".equals(str4));
       // System.out.println(str4.equals("abc"));

        //忽略大小写，equalsIgnoreCase()
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equalsIgnoreCase(strB));
    }
}
