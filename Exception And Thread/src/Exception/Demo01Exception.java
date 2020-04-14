package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) throws ParseException {
        int[] arr = new int[3];
        //int[] arr= null;
        int e = getElement(arr, 3);
        System.out.println(e);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd");
        Date d = sf.parse("2008年8月8日");
        //System.out.println(d);

        System.out.println("后续代码");
    }

    public static int getElement(int[] arr, int index) {
        //空指针异常
        if (arr == null) {
            throw new NullPointerException("传递的数组时空的指针");
        }
        //数组长度越界
        if (index < 0 || arr.length - 1 < index) {
            throw new ArrayIndexOutOfBoundsException("传递长度超出数组范围");
        }
        return arr[index];
    }
}
