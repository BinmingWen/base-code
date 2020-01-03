package demo02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(int money, String name) {
        super(money, name);
    }

    public Member() {
    }

    public void receive(ArrayList<Integer> list) {
        //从红包中，随机拿到一个红包。
        int index = new Random().nextInt(list.size());
        int data = list.remove(index);
        super.setMoney(data+super.getMoney());

    }
}
