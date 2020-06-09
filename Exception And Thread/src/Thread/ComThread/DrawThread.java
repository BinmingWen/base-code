package Thread.ComThread;

//import Thread.SynchroniedMethod.Account;

public class DrawThread extends Thread {
    //模拟用户账号
    private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.draw(drawAmount);
        }
    }
}
