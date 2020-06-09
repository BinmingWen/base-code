package Thread.Synchronized;

//模拟用户取钱
public class DrawThread extends Thread {
    private Account account;
    private double drawAmount;

    public DrawThread(String name, Account account, double drawAmount) {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }
    @Override
    public void run() {
        account.draw(drawAmount);
    }
}
