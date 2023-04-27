/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.ManagerRole;
import Business.Role.Role;

/**
 *
 * @author rutuja
 */
public class ManagerOrganization extends Organization {
    
    private String orgType;
    
    public ManagerOrganization(String orgType){
        super(Organization.Type.Manager.getValue());
        this.orgType = orgType;        
    }

    public String getOrganizationType() {
        return orgType;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new ManagerRole());
        return rolesArray;
    }
}
