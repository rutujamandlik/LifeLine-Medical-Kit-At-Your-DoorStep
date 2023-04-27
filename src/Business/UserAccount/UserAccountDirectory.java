/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class UserAccountDirectory {
 
    private ArrayList<UserAccount> userAccountArray;
    
    public UserAccountDirectory() {
        userAccountArray = new ArrayList();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountArray;
    }
    
    public UserAccount authenticateUser(String username, String password){
        System.out.println("fvfvfvfvfv" + userAccountArray.size());
        for (UserAccount userAccount : userAccountArray)
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return userAccount;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountArray.add(userAccount);
        return userAccount;
    }
    
        public void removeUser(UserAccount userAccount){
        if(userAccount==null){
            return;
        }
        userAccountArray.remove(userAccount);
    }
        
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccountArray){
            if (userAccount.getUsername().equals(username))
                return false;
        }
        return true;
    }  

}
