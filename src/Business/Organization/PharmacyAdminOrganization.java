/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.PharmacyAdminRole;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class PharmacyAdminOrganization extends Organization {
    
    private String orgType;
    
    public PharmacyAdminOrganization(String orgType){
        super(Organization.Type.PharmacyAdmin.getValue());
        this.orgType = orgType;
    }

    public String getOrganizationType() {
        return orgType;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new PharmacyAdminRole());
        return rolesArray;
    }
}
