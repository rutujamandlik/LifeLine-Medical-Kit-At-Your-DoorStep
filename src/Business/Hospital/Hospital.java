/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class Hospital extends Organization {

    private String hospitalName;
    private String hospitalAddress;

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public Hospital(String hospitalName) {
        super();
        this.hospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return this.hospitalName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
