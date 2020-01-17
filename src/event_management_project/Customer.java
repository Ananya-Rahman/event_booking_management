
package event_management_project;



public abstract class Customer {
    
    private String  customer_id;
    private String customer_name;
    private String customer_mobileNumber;
    private String customer_email;
    private String type;
    private String password;

    public Customer(String customer_id, String customer_name, String customer_mobileNumber, String customer_email, String type, String password) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_mobileNumber = customer_mobileNumber;
        this.customer_email = customer_email;
        this.type = type;
        this.password = password;
    }

    
    public String getCustomer_id() {
        return customer_id;
    }
    public String getType() {
        return type;
    }
    
    abstract String getExtraFacilites();

    public void setType(String type) {
        this.type = type;
    }

  
    
    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_mobileNumber() {
        return customer_mobileNumber;
    }

    public void setCustomer_mobileNumber(String customer_mobileNumber) {
        this.customer_mobileNumber = customer_mobileNumber;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
    
    public  void BookingEventList(){
        System.out.print("Check booking list is available");
      
    }
    
   public void PayAmount() {
       System.out.print("Bill paid");
     
   }
   public void RegisterCustomer(){
       System.out.print("Customer register list");
       
   }
   
    public void nonRegister(){
        System.out.println("Non customer register List");
       
    }
   
}
