
package event_management_project;


public class Admin {
    
    private String admin_id;
    private String admin_name;
    private String admin_email;
    private String admin_phoneNumber;
    private double admin_salary;
    private String adminType;
    private String password;

    public Admin(String admin_id, String admin_name, String admin_email, String admin_phoneNumber, String adminType, String password) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_email = admin_email;
        this.admin_phoneNumber = admin_phoneNumber;
        this.adminType = adminType;
        this.password = password;
    }

    public Admin(String admin_id, String admin_name, String admin_email, String admin_phoneNumber, String password) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_email = admin_email;
        this.admin_phoneNumber = admin_phoneNumber;
        this.password = password;
    }

    public String getAdmin_id() {
        return admin_id;
    }

   
    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_phoneNumber() {
        return admin_phoneNumber;
    }

    public void setAdmin_phoneNumber(String admin_phoneNumber) {
        this.admin_phoneNumber = admin_phoneNumber;
    }

    public double getAdmin_salary() {
        return admin_salary;
    }

    public void setAdmin_salary(double admin_salary) {
        this.admin_salary = admin_salary;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
   

}
