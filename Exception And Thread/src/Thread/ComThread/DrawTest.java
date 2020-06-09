package Thread.ComThread;

public class DrawTest {
    public static void main(String[] args) {
        Account acct = new Account("123456", 0);
        new DrawThread("取钱者", acct, 800).start();
        new DepositThread("存款者甲",acct,800).start();
        new DepositThread("存款者乙",acct,800).start();
        new DepositThread("存款者丙",acct,800).start();
    }
}
