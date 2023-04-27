/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> enterpriseListArray;

    public ArrayList<Enterprise> getEnterpriseListArray() {
        return enterpriseListArray;
    }

    public void setEnterpriseListArray(ArrayList<Enterprise> enterpriseListArray) {
        this.enterpriseListArray = enterpriseListArray;
    }
     
    public EnterpriseDirectory() {
        enterpriseListArray=new ArrayList<Enterprise>();
    }
    
     //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type) {
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital) {
            enterprise=new HospitalEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Manufacturing) {
            enterprise = new ManufacturingEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Distribution) {
            enterprise = new DistributionEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.FDA) {
            enterprise = new FDAEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Pharmacy) {
            enterprise = new PharmacyEnterprise(name);
            enterpriseListArray.add(enterprise);
        }
        return enterprise;
    }
}
