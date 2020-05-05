package Demo04ObjectRefSuper;

public class Man extends Human{
    public void sayHello(){
        System.out.println("Hello 我是Man");
    }
    public void method(Greetable g) {
        g.greet();
    }
    public void show() {
        /*method(()->{
            Human human = new Human();
            human.sayHello();
        });*/
        /*method(()->{
            super.sayHello();
        });*/
        method(super::sayHello);
    }
}
