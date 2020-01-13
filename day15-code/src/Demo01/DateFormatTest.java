package Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    public static void main(String[] args) {
        /*//把日期->文本
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String s = sdf.format(date);
        System.out.println(s);*/
        //文本->日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        try {
            Date date = sdf.parse("2020年01月10日 16时22分09秒");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
