package lab2;

public class Bank7 implements MethodsBank7{
    private int balance;

    public Bank7(){
    }

    public void setBalance(int balance) {
        this.balance = 0;
    }

    public void GetBalance() {
        System.out.println("Your balance is " + balance);
    }

    public void Transaction() {
    }

    public static Bank7 CreateBank() {
        return new Bank7();

    }
}
