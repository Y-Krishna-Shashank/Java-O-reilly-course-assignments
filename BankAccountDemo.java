public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount johnsBankAccount = new BankAccount("John Baugh", 10000);
        System.out.println(johnsBankAccount.getOwner());
        System.out.println(johnsBankAccount.getBalance());

        johnsBankAccount.deposit(1000);

        johnsBankAccount.withdraw(1200);


    }
}
