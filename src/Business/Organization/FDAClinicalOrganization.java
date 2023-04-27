/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FDAAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class FDAClinicalOrganization extends Organization {
    
    private String orgType;
    
    public FDAClinicalOrganization(String orgType){
        super(Organization.Type.FDAClinicalApproval.getValue());
        this.orgType = orgType;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new FDAAdminRole());
        return rolesArray;
    }
}
