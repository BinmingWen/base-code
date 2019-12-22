package demo02;

public class demo01Extends {
    public static void main(String[] args) {
        System.out.println("父类");
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println(fu.num);

        System.out.println("=======");
        System.out.println("子类");
        Zi zi = new Zi();
        System.out.println(zi.num);
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
    }
}
