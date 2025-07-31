public class BankAccount {
    private String owner;
    protected double balance;

    public void setBalance(double bal) { balance = bal; }

    public BankAccount(String o, double b) {
        owner = o;
        balance = b;
    }

    public String toString() { return owner + "," + balance; }

    public double deposit(double amt) {
        balance = balance + amt;
        return balance;
    }

    public double withdraw(double amt) {
        balance = balance - amt;
        return balance;
    }
}
