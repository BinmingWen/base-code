package cn.wyu.Lambda;

public class LambdaTest {
    public static void main(String[] args) {
        LambdaQs l = new LambdaQs();
        //使用Lambda表达式替代匿名内部类
       // l.eat(()-> System.out.println("苹果的味道不错！"));
        l.eat(new Eatable() {
            @Override
            public void taste() {
                System.out.println("苹果的味道不错");
            }
        });
        //
        /*l.drive(weather -> {
            System.out.println("今天天气是：" + weather);
            System.out.println("直升飞机平稳");
        });*/
        l.drive(new Flyable() {
            @Override
            public void fly(String weather) {
                System.out.println("今天天气是：" + weather);
                System.out.println("直升飞机平稳");
            }
        });
       // l.test((a,b)-> a+b);
        l.test(new Addable() {
            @Override
            public int add(int a, int b) {
                int result = a+b;
                return result;
            }
        });
    }
}
