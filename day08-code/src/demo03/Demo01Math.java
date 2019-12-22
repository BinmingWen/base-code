package demo03;

public class Demo01Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));

        System.out.println("==========");
        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));

        System.out.println("==========");
        //向下取整，抹零
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));
        System.out.println(Math.floor(31.0));

        System.out.println("==========");
        //四舍五入
        System.out.println(Math.round(0.25));
        System.out.println(Math.round(2.9));
        System.out.println(Math.round(3.0));

    }
}
