/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> orgList;

    public OrganizationDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return orgList;
    }
    
    public Organization createOrganization(String name, Type ty) {
        
        Organization org = null;
        if (ty.getValue().equals(Type.ApprovingDoctor.getValue())) {
            org = new ApprovingDoctorOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.ConsultingDoctor.getValue())) {
            org = new ConsultingDoctorOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.FDAClinicalApproval.getValue())) {
            org = new FDAClinicalOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.CustomerDelivery.getValue())) {
            org = new CustomerDeliveryOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.LabAdmin.getValue())) {
            org = new LabAdminOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.Manager.getValue())) {
            org = new ManagerOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.ManufacturingAdmin.getValue())) {
            org = new ManufacturingAdminOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.PharmacyDelivery.getValue())) {
            org = new PharmacyDeliveryOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.ShippingPartner.getValue())) {
            org = new ShippingOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.PharmacyAdmin.getValue())) {
            org = new PharmacyAdminOrganization(name);
            orgList.add(org);
        }
        else if (ty.getValue().equals(Type.LabTechnician.getValue())) {
            org = new LabTechnicianOrganization(name);
            orgList.add(org);
        }
        return org;
    }
    
}
