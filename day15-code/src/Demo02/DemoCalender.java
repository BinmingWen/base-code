package Demo02;

import java.util.Calendar;
import java.util.Date;
/*
Calender类
1.获取年、月、日  get()
2.增加或减小年、月、日  add()
3.获取Date类对象   getTime();
 */
public class DemoCalender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
       /* System.out.println(c);
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.MONTH));*/
        /*c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DATE, 5);
        c.add(Calendar.MONTH, 5);
        c.add(Calendar.DATE, -5);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));*/

        //获取Date类
        Date date = c.getTime();
        System.out.println(date);
    }
}
