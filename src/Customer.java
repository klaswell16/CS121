import java.util.ArrayList;


public class Customer {
    private String firstName;
    private String lastName;
    private int pin;
    private ArrayList<Account> accountList = new ArrayList<>();

    public Customer(String firstName, String lastName, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(Account account){
        accountList.add(account);
    }

    public void removeAccount(Account account){
        accountList.remove(account);
    }

    public Account getAccountInfo(int accountNumber){
        for(Account account : accountList){
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    public StringBuilder getAllAccountsInfo(){
        StringBuilder sb = new StringBuilder();
        for(Account account : accountList){
            sb.append(account.toString()).append("\n");
        }
        return sb;
    }

    public String toString(){
        return "Name: "+firstName+" "+lastName+"Pin: "+ pin;
    }

    public ArrayList<Account> getAccountList(){
        return accountList;
    }

    public int getPin(){
        return pin;
    }
}
