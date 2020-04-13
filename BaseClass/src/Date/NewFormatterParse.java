package Date;

import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewFormatterParse {
    public static void main(String[] args) {
        String str1 = "2020年04月12日 01时03分03秒";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        LocalDateTime dt1 = LocalDateTime.parse(str1, df);
        LocalDate localDate = LocalDate.parse(str1, df);
       // System.out.println(localDate.toString());
        System.out.println(df.format(localDate));
        System.out.println(dt1);
        //System.out.println(df.format());
        System.out.println("=======");
        LocalDateTime ld = LocalDateTime.now();
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println(df2.format(ld));
        System.out.println("========");
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("2020年04月12日 01时03分03秒");
        System.out.println(sd.format(date));
        //String str2 = "2020$$$四月$$$13 20小时";
       /// DateTimeFormatter df2 = DateTimeFormatter.ofPattern("yyyy$$$MMM$$$dd HH小时");
       // LocalDateTime dt2 = LocalDateTime.parse(str2, df2);
      //  System.out.println(dt2);
    }
}
