package demo01;

public class UnsignedTest {
    public static void main(String[] args) {

        byte a = -3;
        //将byte-3转化为无符号的整型
        System.out.println("byte类型的-3无符号整型数：" + Byte.toUnsignedInt(a));
        //把一个字符串转化成16进制的整型数字
        int val = Integer.parseUnsignedInt("ab",16);
        System.out.println(val);
        //将两个整数转化成无符号的整数后，相除
        System.out.println(Integer.divideUnsigned(4, 4));
        //将两个数转化成无符号后相除求余数。
        System.out.println(Integer.remainderUnsigned(-6,5));
    }


}
