package Thread.SynchronizedClock;

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
        //余额大于所取钱的数量
        //使用同步代码块，来实现线程同步
        synchronized(account){
            if (account.getBalance() > drawAmount) {
                System.out.println(getName() + "取钱成功！吐出钞票：" + drawAmount);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改金额
                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("余额为："+account.getBalance());
            }
            else{
                System.out.println(getName()+"取钱失败！余额不足！");
            }
        }
    }
}
