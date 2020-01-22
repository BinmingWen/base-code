package cn.wyu.Element;

public class Demo01Genric {
    public static void main(String[] args) {
        GenricClass<Integer> gen = new GenricClass<>();
        gen.setE(22);
        System.out.println(gen.getE());
        System.out.println("======");

        GenricClass ge = new GenricClass();
        ge.setE(222);
        System.out.println(ge.getE());
        System.out.println("=======");
        GenricClass<String> genric = new GenricClass<>();
        genric.setE("abc");
        System.out.println(genric.getE());
    }
}
