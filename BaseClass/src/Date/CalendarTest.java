package Date;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        //System.out.println(c.getTime());
        c.set(2003, 10, 23, 12, 32, 23);
        System.out.println(c.getTime());
        c.add(Calendar.YEAR,-1);
        System.out.println(c.getTime());
        c.roll(Calendar.MONTH,-8);
        System.out.println(c.getTime());
        System.out.println("======");
        Calendar c2 = Calendar.getInstance();
        String dateFormatter = "2008年08月08日 星期日  ";
    }
}
