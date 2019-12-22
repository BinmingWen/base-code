package demo04;

import java.util.ArrayList;

public class demo07ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张平");
        list.add("张三");
        list.add("张翠华");
        System.out.println(list);

        PrintArrayList(list);
    }

    private static void PrintArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
           if(i==(list.size()-1)){
               System.out.println(list.get(i)+"}");
           }
           else {
               System.out.print(list.get(i) + "@");
           }

        }
    }
}
