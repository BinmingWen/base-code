package Thread.SynchronizedLock;

import java.util.concurrent.locks.ReentrantLock;

/*
  账户：
     1.账户编号，
     2.账户余额

 */
public class Account {
    //定义锁对象
    private final ReentrantLock lock = new ReentrantLock();
    private String accountNo;
    private double balance;

    public synchronized void draw(double drawAmount){
        //余额大于所取钱的数量
        lock.lock();
        try{
            if (balance > drawAmount) {
                System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //修改金额
                balance = balance - drawAmount;
                System.out.println("余额为："+balance);
            }
            else{
                System.out.println(Thread.currentThread().getName()+"取钱失败！余额不足！");
            }
        }finally {
            lock.unlock();
        }
    }
    public Account() {
    }
    public int hashCode(){
        return accountNo.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return account.getAccountNo().equals(accountNo);
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
