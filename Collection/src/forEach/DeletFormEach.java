package forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description : //描述
 * @ClassName : DeletFormEach  //类名
 * @date 2020/10/28 20:17
 */
public class DeletFormEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //System.out.println(list.get(0));
       /* for (Integer i : list) {
            System.out.println(i);
            list.remove(2);
        }*/

        Iterator<Integer> iterator = list.iterator();
//        System.out.println(list);
        while (iterator.hasNext()) {

           // System.out.println(i);
            if( iterator.next()==1){
                iterator.remove();
            }
        }
        System.out.println(list);
        System.out.println("..........");
        for (Integer i : list) {
            System.out.println(i);
        }
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//
//        }

    }
}
