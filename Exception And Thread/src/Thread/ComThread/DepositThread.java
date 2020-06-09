package Thread.ComThread;

//import Thread.SynchroniedMethod.Account;

public class DepositThread extends Thread {
    //模拟用户账号
    private Account account;
    private double depositAmount;

    public DepositThread(String name, Account account, double depositAmount) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.deposit(depositAmount);
        }
    }
}
