public class BankAccount {
    private double balance;
    private String accountHolder;

    public BankAccount(double initialBalance, String name) {
        this.accountHolder = name;
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be greater than 0");
            this.balance = 0;
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }


    public void getDetails() {
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: " + this.balance);
    }
}
