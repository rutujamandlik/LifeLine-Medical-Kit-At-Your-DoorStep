


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class LabAdminOrganization extends Organization {
    
    private String orgType;
    
    public LabAdminOrganization(String orgType){
        super(Organization.Type.LabAdmin.getValue());
        this.orgType = orgType;
        
    }
    public String getOrganizationType(){
        return orgType; 
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new LabAdminRole());
        return rolesArray;
    }
}
