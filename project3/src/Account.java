public class Account {
    private double balance;
    private int accountNumber;
    private static int numberOfAccounts = 1000;

    public Account(double initialDeposit){
        this.balance = initialDeposit;
        this.accountNumber = ++numberOfAccounts;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited: $"+amount);
        System.out.println("Current Balance: $"+balance);
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Amount deposited: "+amount);
            System.out.println("Updated balance: "+balance);
        }
    }
    @Override
    public String toString(){
        return String.format("Account Number: %d\nBalance: $%.2f\n",accountNumber,balance);
    }
}
