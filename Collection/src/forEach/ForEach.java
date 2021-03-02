package forEach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 温明彬
 * @company cn.wyu
 * @Description :
 * HashMap 遍历从大的方向来说，可分为以下 4 类：
 *
 * 1迭代器（Iterator）方式遍历；
 * 2.For Each 方式遍历；
 * 3.Lambda 表达式遍历（JDK 1.8+）;
 * 4.Streams API 遍历（JDK 1.8+）。
 * @ClassName : ForEach  //类名
 * @date 2020/10/28 19:49
 */
public class ForEach {
    public static void main(String[] args) {


        HashMap<Integer,String> map = new HashMap();
        map.put(1, "java基础");
        map.put(2, "javaweb开发");
        map.put(3, "java ssm集成框架开发");
        map.put(4, "spring boot开发");
        map.put(5, "spring cloud开发");

        //迭代器方式遍历
        System.out.println("迭代器方式遍历EntrySet");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }
        //迭代器方式遍历
        System.out.println("--------------");
        Iterator<Integer> iterator2 = map.keySet().iterator();
        while (iterator2.hasNext()){
            Integer i = iterator2.next();
            System.out.print(i+" ");
            System.out.println(map.get(i));
        }
        //forEach
        System.out.println("----------------");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("---------------");
        for (Integer key : map.keySet()) {
            System.out.print(key);
            System.out.println(map.get(key));
        }
        System.out.println("-------------");

        //lambda表达式遍历
        map.forEach((key,value)->{
            System.out.print(key);
            System.out.println(value);
        });
        System.out.println("----------");

        //SteamAPI单线程遍历
        map.entrySet().stream().forEach(entry->{
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println("-----------");
        //SteamAPI多线程遍历
        map.entrySet().parallelStream().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }

}
