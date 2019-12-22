package demo01;

public class demo01String {
    public static void main(String[] args) {
        //空参构造
        String str1 = new String();
        System.out.println("第一个字符串："+str1);

        //根据字符数组，创建字符串
        char []byteChar = {'A','B','C'};
        String str2 = new String(byteChar);
        System.out.println("第二个字符串："+str2);

        //根据字节数组，创建字符串
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串："+str3);
        //直接创建
        String str4 = "Hello";
        System.out.println("第四个字符串："+str4);

    }
}
