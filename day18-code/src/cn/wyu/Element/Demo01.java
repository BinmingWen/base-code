package cn.wyu.Element;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        //使用泛型
        /*
        在编译期间检查问题所在的地方，而不是在运行时候检查。
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
       // list.add(22);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
            System.out.println(str.length());
        }

        //不使用泛型
        /*
        在运行期间检查出问题所在的地方。
         */
        /*ArrayList list = new ArrayList();
        list.add("abc");
        list.add(123);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);

            String s = (String)obj;
            System.out.println(s.length());
        }*/
    }
}
