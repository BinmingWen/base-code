package demo04;

import java.util.ArrayList;
import java.util.Random;

/**
 * 创建一个大集合，里面保存随机的20个整数，然后筛选偶数保存在小集合里面。
 */
public class demo08ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;
            bigList.add(num);

        }
        ArrayList<Integer> samllList =getSamllList(bigList);
        System.out.println("集合偶数个数为："+samllList.size());
        for (int i = 0; i < samllList.size(); i++) {
            System.out.println(samllList.get(i));
            
        }
    }
    public static ArrayList<Integer> getSamllList(ArrayList<Integer> list){
        ArrayList<Integer> samllList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if(num %2==0) {
                samllList.add(num);
            }
        }
        return samllList;
    }
}
