/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ApprovingDoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class ApprovingDoctorOrganization extends Organization {
    
    private String orgType;
    
    public ApprovingDoctorOrganization(String name){
        super(Organization.Type.ApprovingDoctor.getValue());
        this.orgType = orgType;
    }

    public String getOrganizationType() {
        return orgType;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new ApprovingDoctorRole());
        return rolesArray;
    }
}
