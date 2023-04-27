/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class Pharmacy extends Organization {

    private String pharmacyStoreName;

    public Pharmacy(String storeName) {
        super();
        this.pharmacyStoreName = storeName;
    }

    public String getPharmacyStoreName() {
        return pharmacyStoreName;
    }

    public void setPharmacyStoreName(String pharmacyStoreName) {
        this.pharmacyStoreName = pharmacyStoreName;
    }
    
//    public String getStoreName() {
//        return pharmacyStoreName;
//    }
//
//    public void setStoreName(String storeName) {
//        this.pharmacyStoreName = storeName;
//    }

    public String toString(){
        return this.pharmacyStoreName;
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
