public class BankAccount {
    private String owner;
    private int balance;
    BankAccount(String owner)
    {
        this.owner=owner;
        this.balance=0;
    }

    BankAccount(String owner, int balance) {
        if(balance>0)
        this.balance=balance;
        this.owner=owner;
    }

    public void deposit(int amount) {
        if(amount>0)
        {
            this.balance+=amount;
            System.out.println("Deposit: " + amount);
            System.out.println("Owner: "+this.owner);
            System.out.println("Balance: "+this.balance);
        }
        else
            System.out.println("Invalid amount");
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            if(this.balance-amount>=0) {
                balance-=amount;
                System.out.println("Owner: "+this.owner);
                System.out.println(amount + " has been withdrawn successfully");
                System.out.println("Remaining balance: "+this.balance);
            }
            else{
                System.out.println("Insufficient funds");
            }
        }
        else
            System.out.println("Invalid amount");
    }

    public String getOwner() {
        return this.owner;
    }
    public int getBalance(){
        return this.balance;
    }
}
