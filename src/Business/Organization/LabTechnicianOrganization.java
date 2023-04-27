/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.LabTechnicianRole;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class LabTechnicianOrganization extends Organization {
    
    private String orgType;
    
    public LabTechnicianOrganization(String orgType){
        super(Organization.Type.LabTechnician.getValue());
        this.orgType = orgType;
        
    }

    public String getOrganizationType() {
        return orgType;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new LabTechnicianRole());
        return rolesArray;
    }
}
