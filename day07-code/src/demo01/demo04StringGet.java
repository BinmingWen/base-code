package demo01;

public class demo04StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "ssjfljflasaf".length();
        System.out.println(length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);
        System.out.println("==========");

        String original = "HelloworldHelloword";
        int index = original.indexOf("llo");
        System.out.println(index);

    }
}
