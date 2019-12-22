package demo04;

import java.util.ArrayList;

public class demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        boolean sucess = list.add("马玉：");
        System.out.println("添加动作是否成功："+sucess);

        list.add("张三");
        list.add("李四");
        list.add("老王");
        System.out.println(list);   //[马玉：, 张三, 李四, 老王]

        String name = list.get(2);
        System.out.println("2号位置的人是谁："+name);

        String who = list.remove(2);
        System.out.println("被删除的人是谁："+who);

        int size = list.size();
        System.out.println("长度为："+size);

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }


    }
}
