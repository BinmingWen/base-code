package com.wyu.Demo01List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("张强");
        list.add("周志辉");
        list.add("赵敏");
        list.add("李强");

        //把姓张的人放到一个集合中
        List<String> zhangList = new ArrayList<>();
        for(String str:list){
            if(str.startsWith("张")){
                zhangList.add(str);
            }
        }
        //把姓张的名字大于三的放到新集合中
        List<String> newZhang = new ArrayList<>();
        for (String str : zhangList) {
            if (str.length() > 2) {
                newZhang.add(str);
            }
        }
        //遍历集合中的元素
        for (String str : newZhang) {
            System.out.println(str);
        }
    }
}
