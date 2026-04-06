public class Main2 {
    public static void main(String[] args) {
        

        BankAccount b1 = new BankAccount(1000, "Noor Fatima");
        BankAccount b2 = new BankAccount(2000, "Hira");

        b2.deposit(500);
        b2.withdraw(200);

        b2.getDetails();


        b1.deposit(500);
        b1.withdraw(200);
        b1.getDetails();
    }
}
