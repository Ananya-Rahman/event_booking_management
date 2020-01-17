
package event_management_project;


public class ForeignCustomer extends Customer implements ICustomerHelper{
    
    public ForeignCustomer(String customer_id, String customer_name, String customer_mobileNumber, String customer_email, String type, String password) {
        super(customer_id, customer_name, customer_mobileNumber, customer_email, type, password);
    }

    @Override
    public double getDiscount() {
         return 20;
    }

    @Override
    public String getExtraFacilites() {
            return "All chair will be sofa";
    }
    
    
    
   
}
