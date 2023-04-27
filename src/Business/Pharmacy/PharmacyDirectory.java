/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class PharmacyDirectory {

    private ArrayList<Pharmacy> pharmacyStoresArray;

    public PharmacyDirectory() {
        this.pharmacyStoresArray = new ArrayList();
    }

    public Pharmacy createPharmacyStore(String name) {

        for (Pharmacy store : pharmacyStoresArray) {
            if (store.getPharmacyStoreName().equals(name)) {
                return null;
            }
        }
        
        Pharmacy store = new Pharmacy(name);
        this.pharmacyStoresArray.add(store);
        return store;
    }
    
    public void deletePharmacyStore(Pharmacy pharmacy){
        pharmacyStoresArray.remove(pharmacy);
    }

    public ArrayList<Pharmacy> getPharmacyStoresArray() {
        return pharmacyStoresArray;
    }

    public void setPharmacyStoresArray(ArrayList<Pharmacy> pharmacyStoresArray) {
        this.pharmacyStoresArray = pharmacyStoresArray;
    }
}
