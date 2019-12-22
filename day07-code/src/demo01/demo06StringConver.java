package demo01;

public class demo06StringConver {
    public static void main(String[] args) {
        //转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("============");

        //转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);

        }
        System.out.println("============");

        //字符串替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str2);

        System.out.println("============");
        String lang = "你会玩吗，去你妹，去你妹！！！！";
        String replace = lang.replace("去你妹", "***");
        System.out.println(replace);
    }
}
