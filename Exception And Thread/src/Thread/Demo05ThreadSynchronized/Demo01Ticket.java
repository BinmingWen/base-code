package Thread.Demo05ThreadSynchronized;

public class Demo01Ticket {
    public static void main(String[] args) {
        RunnableImple rt = new RunnableImple();
        new Thread(rt).start();
        new Thread(rt).start();
        new Thread(rt).start();
    }
}
