package demo01;
//包装类
public class PrimitiveString {
    public static void main(String[] args) {
        //把String转化成int
        String str = "123";
        int a = Integer.valueOf(str);
        System.out.println(a);

        //把float转化成String
        float f = 2.3f;
        String str2 = String.valueOf(f);
        System.out.println(str2);

        //把String转化成float
        float f2 = Float.parseFloat(str2);
        System.out.println(f2);

        //把一个double转化成String
        String str3 = String.valueOf(2.3);
        System.out.println(str3);

        double d = Double.parseDouble(str3);
        System.out.println(d);

        //把一个boolean转化成String
        String booleanStr = String.valueOf(true);
        System.out.println(booleanStr);
    }
}
