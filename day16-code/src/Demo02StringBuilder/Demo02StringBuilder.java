package Demo02StringBuilder;

/*
StringBuilder的使用,可以构造任何类型的字符串，好强大啊
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu = new StringBuilder();
        /*StringBuilder bu2 = bu.append("abc");
        System.out.println(bu);
        System.out.println(bu2);
        System.out.println(bu == bu2);*/
        /*bu.append("abc");
        bu.append(1);
        bu.append(3.3);
        bu.append("中国");
        System.out.println(bu);*/
        //链式编程
        bu.append("abc").append(1).append(3.3).append("中国");
        System.out.println(bu);
    }
}
