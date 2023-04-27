/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Distribution.Distribution;
import Business.Distribution.DistributionDirectory;
import Business.FDA.FDA;
import Business.FDA.FDADirectory;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacy.PharmacyDirectory;
import Business.Warehouse.Warehouse;
import Business.Warehouse.WarehouseDirectory;

/**
 *
 * @author divya
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private HospitalDirectory hospitalDirectory;
    private WarehouseDirectory warehouseDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private DistributionDirectory distributionDirectory;
    private FDADirectory fdaDirectory;

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        hospitalDirectory = new HospitalDirectory();
        warehouseDirectory = new WarehouseDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        distributionDirectory = new DistributionDirectory();
        fdaDirectory = new FDADirectory();
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public FDADirectory getFdaDirectory() {
        return fdaDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Hospital("Hospital"),
        Manufacturing("Manufacturing Unit"),
        Distribution("Distribution Unit"),
        FDA("FDA"),
        Pharmacy("Pharmacy");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public Hospital createHospital(String name){
        return hospitalDirectory.createHospital(name);
    }

    public Distribution createDustributionUnit(String name) {
        return distributionDirectory.createDistributionUnit(name);
    }

    public FDA createFDAUnit(String name) {
        return this.fdaDirectory.createFDA(name);
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public WarehouseDirectory getWarehouseDirectory() {
        return warehouseDirectory;
    }

    public void setWarehouseDirectory(WarehouseDirectory warehouseDirectory) {
        this.warehouseDirectory = warehouseDirectory;
    }

    public PharmacyDirectory getStoreDirectory() {
        return pharmacyDirectory;
    }

    public void setStoreDirectory(PharmacyDirectory pharmacyDirectory) {
        this.pharmacyDirectory = pharmacyDirectory;
    }

    public DistributionDirectory getDistributionDirectory() {
        return distributionDirectory;
    }

    public void setDistributionDirectory(DistributionDirectory distributionDirectory) {
        this.distributionDirectory = distributionDirectory;
    }

    public FDADirectory getFdas() {
        return fdaDirectory;
    }

    public void setFdas(FDADirectory fdaDirectory) {
        this.fdaDirectory = fdaDirectory;
    }

    public Warehouse createWarehouse(String name) {
        return warehouseDirectory.createWarehouse(name);
    }

    public Pharmacy createPharmacyStore(String name) {
        return pharmacyDirectory.createPharmacyStore(name);
    }
}