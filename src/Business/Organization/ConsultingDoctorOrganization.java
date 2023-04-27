/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ConsultingDoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class ConsultingDoctorOrganization extends Organization {
    
    private String orgType;
    
    public ConsultingDoctorOrganization(String orgType){
        super(Organization.Type.ConsultingDoctor.getValue());
    }

    public String getOrganizationType() {
        return orgType;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> rolesArray = new ArrayList<>();
        rolesArray.add(new ConsultingDoctorRole());
        return rolesArray;
    }
}
