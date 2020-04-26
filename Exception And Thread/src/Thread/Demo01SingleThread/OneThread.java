package Thread.Demo01SingleThread;

public class OneThread {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        p1.run();
        Person p2 = new Person("小强");
        p2.run();
    }
}
