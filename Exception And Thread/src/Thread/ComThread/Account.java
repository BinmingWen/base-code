package Thread.ComThread;

/*
  账户：
     1.账户编号，
     2.账户余额

 */
public class Account {
    private String accountNo;
    private double balance;
    //标识账户中是否已有存款的旗标
    private boolean flag = false;

    public synchronized void draw(double drawAmount){
        try {
            //账户中没有人存钱，则取钱方法阻塞。
            if (!flag) {
                wait();
            }
            else{
                //执行取钱操作。
                System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);

                //修改金额
                balance = balance - drawAmount;
                System.out.println("余额为："+balance);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(double depositAmount) {
        try {
            //账户中没有人存钱，则取钱方法阻塞。
            if (flag) {
                wait();
            }
            else{
                //执行取钱操作。
                System.out.println(Thread.currentThread().getName() + "存款：" + depositAmount);

                //修改金额
                balance = balance + depositAmount;
                System.out.println("余额为："+balance);
                flag = true;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
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
