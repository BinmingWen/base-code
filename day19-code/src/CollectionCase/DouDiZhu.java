package CollectionCase;

import java.util.ArrayList;
import java.util.Collections;

/*
  斗地主综合案例
  1.准备牌
  2.洗牌
  3.看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //定义一个集合用于存储所有的扑克牌
        ArrayList<String> poker = new ArrayList();
        //定义两个数组，一个存储牌的花色，另一个存储牌的序号
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //把大王、小王存储在集合中
        poker.add("大王");
        poker.add("小王");
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }
        //System.out.println(poker);

        /*
          2.洗牌
          使用Collections工具类中的shuffle进行元素置换
         */
        Collections.shuffle(poker);
        //System.out.println(poker);
        /*
        3.发牌
        依次给三个玩家发牌，当牌的数量大于51，即可设置为底牌，以供玩家强。
         */
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            //i>=51，把剩余的牌数放到diPai集合中
            if (i >= 51) {
                diPai.add(p);
                //发给第一个玩家
            } else if (i % 3 == 0) {
                player01.add(p);
                //发给第二个玩家
            } else if (i % 3 == 1) {
                player02.add(p);
                //发给第三个玩家
            } else if (i % 3 == 2) {
                player03.add(p);
            }
        }
        /*
          看牌
         */
        System.out.println("刘德华："+player01);
        System.out.println("周润发："+player02);
        System.out.println("周星驰："+player03);
        System.out.println("底牌："+diPai);
    }
}
