package Demo02StringBuilder;

public class StringToStringBuilder {
    public static void main(String[] args) {
        //String->StringBuilder 通过构造方法来实现，String转化成StringBuilder
        String str = "hello";
        System.out.println("Str:" + str);
        StringBuilder bu = new StringBuilder(str);
        bu.append("world");
        System.out.println("bu:" + bu);

        //StringBuilder->String 通过toString方法来实现，StringBuilder转换成String
        String s = bu.toString();
        System.out.println("s:"+s);
    }
}
