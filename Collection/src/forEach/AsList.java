package forEach;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : AsList  //类名
 * @date 2020/10/28 20:37
 */
public class AsList {
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        List<int[]> list = Arrays.asList(array);
        for (int[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }

         list.forEach(o-> System.out.println(Arrays.toString(o)));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
