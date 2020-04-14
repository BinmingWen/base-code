package Exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionCatch {
    public static void main(String[] args) {
        //1.多个异常分别处理
        /*try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.add(0, 1);
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
*/

        //2.多个异常一次捕获，多次处理
        /*
        注意事项：
            多个catch异常处理，要子类在前面父类在后面。
         */
       /* try{
            int[] arr = {1, 2, 3};
            //            //System.out.println(arr[3]);
            List<Integer> list = new ArrayList<>();
            list.add(0, 1);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }*/
        //3.多个异常一次捕获，一次处理
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            List<Integer> list = new ArrayList<>();
            list.add(0, 1);
           // System.out.println(list.get(3));
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
