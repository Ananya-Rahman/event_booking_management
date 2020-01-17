
package event_management_project;

import java.util.ArrayList;


public class CustomerList {
    
    public ArrayList<Customer> customerList;
    
    public CustomerList(){
        customerList = new ArrayList<>();
    }
    
    public void add(Customer c){
        customerList.add(c);
    }
    
    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }
    
    public boolean checkCustomer(String id, String password){
        boolean check = false;
        
        for(Customer c : customerList){
            if(c.getCustomer_id().equals(id) && c.getPassword().equals(password)){
                check = true;
            }
        }
        return check;
    }
 }
