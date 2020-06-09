package Thread.SynchronizedLock;

public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("123456", 1000);
        new DrawThread("老瓦", acct, 800).start();
        new DrawThread("老洪", acct, 900).start();

    }
}
