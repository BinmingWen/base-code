package demo01;

public class InnerClassMain {
    public static void main(String[] args) {
        //间接调用内部类
        Body body = new Body();
        body.methodBody();
        System.out.println("==========");
        //直接调用内部类
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
