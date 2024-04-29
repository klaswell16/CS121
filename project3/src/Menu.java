
import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);
    Bank bank = new Bank();

    public void displayMenu(){
        while(true) {
            System.out.printf("******** MENU ********\n");
            System.out.printf("Please make a selection:\n" +
                    "1) Access Account\n" +
                    "2) Open a New Account\n" +
                    "3) Close All Accounts\n" +
                    "4) Exit\n" +
                    ">>");
            int input = Integer.parseInt(scnr.nextLine());
            if (input == 1) {
                accessAccount();
            } else if (input == 2) {
                newAccount();
            } else if (input == 3) {
                closeAllAccounts();
            } else if (input == 4) {
                System.out.println("Thank you for using BSU Banking App\nGoodbye. Exiting...");
                return;
            } else {
                System.out.println("Invalid number");
            }
        }
    }
    private void accessAccount(){
        System.out.println("Input PIN: ");
        int userPin = Integer.parseInt(scnr.nextLine());

        Customer customer = bank.getCustomerInfo(userPin);
        if(customer == null){
            System.out.println("PIN is not valid");
            return;
        }
        System.out.println("Accounts: ");
        customer.getAccountList();

        System.out.println(customer.getAllAccountsInfo());

        System.out.println("Enter in account number: ");
        int userAccountNum = Integer.parseInt(scnr.nextLine());
        Account account = customer.getAccountInfo(userAccountNum);
        if(account == null){
            System.out.println("Invalid account number");
            return;
        }
        System.out.printf("Please make a selection: \n" +
                "1) Make a deposit\n" +
                "2) Make a withdrawal\n" +
                "3) See account balance\n" +
                "4) Close account\n" +
                "5) Exit\n" +
                ">>");
        int AccountMenuInput = Integer.parseInt(scnr.nextLine());
        if(AccountMenuInput == 1){
            System.out.println("Enter in deposit amount: ");
            double depositAmount = Double.parseDouble(scnr.nextLine());
            account.deposit(depositAmount);

        }else if(AccountMenuInput == 2){
            System.out.println("Enter in amount you want to withdraw: ");
            double withdrawAmount = Double.parseDouble(scnr.nextLine());
            account.withdraw(withdrawAmount);

        }else if(AccountMenuInput == 3){
            System.out.println(account.getBalance());
        }else if(AccountMenuInput == 4) {
            customer.removeAccount(account);
        } else if(AccountMenuInput == 5){
            return;
        }else{
            System.out.println("Invalid number");
        }
    }
    private void newAccount(){
        System.out.println("Are you a new customer?(yes/no): ");
        String userInput = scnr.nextLine().toLowerCase();
        Customer customer = null;
        if(userInput.equals("yes")){
           customer = createNewCustomer();


        }else if(userInput.equals("no")){
            System.out.println("Enter in PIN: ");
            int userAccountPin = Integer.parseInt(scnr.nextLine());
            customer = bank.getCustomerInfo(userAccountPin);
            if(customer == null){
                return;
            }

        }
        System.out.println("Enter deposit amount for new account: ");
        double userInitialDeposit = Double.parseDouble(scnr.nextLine());
        Account account = new Account(userInitialDeposit);
        customer.addAccount(account);
        System.out.println("New Account Opened: "+account.getAccountNumber());
    }
    private Customer createNewCustomer(){
        System.out.println("Enter in first name: ");
        String firstName = scnr.nextLine();
        System.out.println("Enter in Last name: ");
        String lastName = scnr.nextLine();
        System.out.println("Enter in PIN: ");
        int pin = Integer.parseInt(scnr.nextLine());
        Customer customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(customer);
        return customer;
    }
    private void closeAllAccounts(){
        System.out.println("Enter in PIN: ");
        int userPin = Integer.parseInt(scnr.nextLine());
        Customer customer = bank.getCustomerInfo(userPin);
        if(customer == null){
            System.out.println("PIN incorrect");
            return;
        }
        bank.removeCustomer(customer);
        System.out.println("Customer has been removed from bank registry");

    }


}
