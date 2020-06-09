package Thread.SynchroniedMethod;

/*
  账户：
     1.账户编号，
     2.账户余额

 */
public class Account {
    private String accountNo;
    private double balance;

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
