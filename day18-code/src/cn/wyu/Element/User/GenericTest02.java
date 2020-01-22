package cn.wyu.Element.User;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTest02 {
    public static void main(String[] args) {
        //Integer extends number extends Object
        //String Object
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Number> listTwo = new ArrayList<>();
        ArrayList<Object> listThree = new ArrayList<>();
        ArrayList<String> listFour = new ArrayList<>();

        getElement(listOne);
        getElement(listTwo);
       // getElement(listThree);
        //getElement(listFour);

        //getElement2(listOne);
        getElement2(listTwo);
        getElement2(listThree);
      //  getElement2(listFour);
    }

    //泛型下限
    private static void getElement2(Collection<? super Number> coll) {
    }

    //泛型上限
    private static void getElement(Collection<? extends Number> coll) {
    }


}
