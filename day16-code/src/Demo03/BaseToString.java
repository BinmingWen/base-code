package Demo03;

/*
基本类型与字符串类型的转换：
   基本类型->字符串(String)
     1.基本类型值+""
     2.通过静态方法toString来实现
     3.String类的静态方法valueOf()
   字符串->基本类型
     通过基本类型.parsexxx(字符串);


 */
public class BaseToString {
    public static void main(String[] args) {
        //基本类型转化为String类型
        int in1 = 100;
        String s1 = in1 + "";
        System.out.println(s1);

        String s2 = Integer.toString(in1);
        System.out.println(s2);

        String s3 = String.valueOf(in1);
        System.out.println(s3);
    }
}
