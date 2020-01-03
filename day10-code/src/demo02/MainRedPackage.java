package demo02;

import java.util.ArrayList;

public class MainRedPackage {
    public static void main(String[] args) {
        //群主发红包
        Manager manager = new Manager("马玉",100);
        ArrayList<Integer> list = manager.send(80,3);

        //普通成员
        Member member1 = new Member(0,"大宝");
        Member member2 = new Member(0,"中宝");
        Member member3 = new Member(0,"小宝");

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("============");


        //成员收红包
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);

        manager.show();
        member1.show();
        member2.show();
        member3.show();
        System.out.println("============");
    }
}
