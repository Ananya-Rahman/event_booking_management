
package event_management_project;

import java.util.ArrayList;


public class AdminMaintain {
    
    public ArrayList<Admin> adminList ;
    
    public AdminMaintain(){
        adminList = new ArrayList<>();
    }
    
    public void addAdmin(Admin a){
        adminList.add(a);
    }
    
    public ArrayList<Admin> getAdminList(){
        return adminList;
    }
    
    public boolean checkPassword(String id , String password){
        boolean check = false;
        
        for(Admin admin : adminList){
            if(admin.getAdmin_id().equals(id) && admin.getPassword().equals(password)){
                check = true;
                break;
            }
        }
        return check;
    }
}
