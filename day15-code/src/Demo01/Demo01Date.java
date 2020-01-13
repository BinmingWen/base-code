package Demo01;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
