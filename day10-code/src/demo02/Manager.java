package demo02;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }
    public Manager(String name,int money){
        super(money,name);
    }
    //群主发红包
    public ArrayList<Integer> send(int totalMoney, int count){
        //设置集合，用户保存群主发红包的数额
        ArrayList<Integer> list = new ArrayList<>();
        //先判断群主的余额是否够用
        if(totalMoney>super.getMoney()) {
            System.out.println("余额不足");
            return list;
        }
        //余额够用,则扣钱
        super.setMoney(super.getMoney()-totalMoney);
        //把红包拆成多小份
        int avg = totalMoney/count;
        int mod = totalMoney%count;      //余额零头,放到最后一个红包里面

        for (int i = 0; i <count-1; i++) {
            list.add(avg);

        }
        list.add(mod);

        return list;
    }
}
