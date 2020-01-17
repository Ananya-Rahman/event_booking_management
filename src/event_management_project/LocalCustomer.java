


package event_management_project;


public class LocalCustomer extends Customer implements ICustomerHelper {
  
    public LocalCustomer(String customer_id, String customer_name, String customer_mobileNumber, String customer_email, String type, String password) {
        super(customer_id, customer_name, customer_mobileNumber, customer_email, type, password);
    }

    @Override
    public double getDiscount() {
        return 10;
    }

    @Override
    String getExtraFacilites() {
        
        return "All chair is sofa and free tea survive";
    }
  
    
    
}
