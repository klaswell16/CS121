import java.util.ArrayList;


public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }
    public Customer getCustomerInfo(int pin){
        Customer foundCustomer = null;
        for(Customer customer : customers){
            if(customer.getPin() == pin){
                foundCustomer = customer;
            }
        }
        return foundCustomer;
    }
    public String getAllCustomerInfo(){
        StringBuilder sb = new StringBuilder();
        for(Customer customer : customers){
            sb.append(customer.toString()).append("\n");
        }
        return sb.toString();
    }

}
