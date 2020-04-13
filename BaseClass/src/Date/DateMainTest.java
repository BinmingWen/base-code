package Date;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMainTest {
    public static void main(String[] args) {
        long mi = System.currentTimeMillis();
        Date date = new Date(mi);
        System.out.println(date);
        Calendar cal = Calendar.getInstance();
        cal.set(2018, 8, 8, 8, 8, 8);
        cal.add(Calendar.MONTH,1);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println("========");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
        System.out.println(sf.format(date));
    }
}
