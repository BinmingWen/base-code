package GenericMethod;

//import java.util.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class GenericMethodTest {
        //声明一个泛型方法
        static <T> void fromArrayToCollection(T[] a, Collection<T> c){
            for (T o : a) {
                c.add(o);
            }
        }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<>();
        fromArrayToCollection(oa, co);

    }
}
