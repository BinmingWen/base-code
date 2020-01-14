package Demo03;

public class IntegerMainTest {
    public static void main(String[] args) {
        //自动装箱，基本类型->包装类类型
        //构造方法
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        //静态方法
        Integer in3 = Integer.valueOf(2);
        System.out.println(in3);

        Integer in4 = Integer.valueOf("22");
        System.out.println(in4);

        //拆箱
        int v = in1.intValue();
        System.out.println(v);
    }
}
