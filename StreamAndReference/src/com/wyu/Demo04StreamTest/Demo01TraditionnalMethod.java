package com.wyu.Demo04StreamTest;

import java.util.ArrayList;
import java.util.List;

public class Demo01TraditionnalMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张翠上");
        list.add("张无忌");
        list.add("李云龙");
        list.add("马云");
        list.add("刘根");
        list.add("冯静");
        list.add("嘉义");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("马强");
        arrayList.add("刘艳云");
        arrayList.add("佳佳胡");
        arrayList.add("胡歌");
        arrayList.add("刘梦瑶");
        //第一支队伍中取名字为3个字的成员
        List<String> list01 = new ArrayList<>();
        List<String> list02 = new ArrayList<>();
        List<String> list03 = new ArrayList<>();
        List<String> list04 = new ArrayList<>();
        List<String> list05 = new ArrayList<>();
        for (String str : list) {
            if (str.length() == 3) {
                list01.add(str);
            }
        }
        //从筛选集合中，取前三个
        for (int i = 0; i < 3; i++) {
            list02.add(list01.get(i));
        }
        //第二支队伍中把姓张的存储在一个集合中
        for (String str : arrayList) {
            if (str.startsWith("张")) {
                list03.add(str);
            }
        }
        //从list03中去掉前2个人
        for (int i = 2; i < list03.size(); i++) {
            list04.add(list03.get(i));
        }
        //把所得到的第一二队的集合放在一个新的集合中。
        list05.addAll(list02);
        list05.addAll(list04);
        //把最后的集合生产Person对象，并放到一个集合中
        List<Person> listPer = new ArrayList<>();
        for (String str : list05) {
            listPer.add(new Person(str));
        }
        //遍历Person对象集合
        for (Person p : listPer) {
            System.out.println(p.getName());
        }
    }
}
