/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ManufacturingAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class ManufacturingAdminOrganization extends Organization {
    
    private String orgType;
    
    public ManufacturingAdminOrganization(String organizationType){
        super(Organization.Type.ManufacturingAdmin.getValue());
        this.orgType = orgType;
    }

    public String getOrganizationType() {
        return orgType;
    }    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new ManufacturingAdminRole());
        return rolesArray;
    }
}
