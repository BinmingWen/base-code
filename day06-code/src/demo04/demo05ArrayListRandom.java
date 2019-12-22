package demo04;

import java.util.ArrayList;
import java.util.Random;

//生成6个1~33的数据，并保存到集合中
public class demo05ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;
            list.add(num);

        }

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
