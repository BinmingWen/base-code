package demo01;
//自动装箱和拆箱注意的问题，int的值不能超过128
public class BoxValue {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 2;
        System.out.println(a==b);

        Integer biga = 128;
        Integer bigb = 128;
        System.out.println(biga==bigb);

        System.out.println(Boolean.compare(true,false));
        System.out.println(Boolean.compare(true,true));
        System.out.println(Boolean.compare(false,false));
    }
}
