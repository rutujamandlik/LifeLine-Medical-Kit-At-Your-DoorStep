/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Warehouse;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class WarehouseDirectory {

    private ArrayList<Warehouse> warehouseArray;

    public WarehouseDirectory() {
        this.warehouseArray = new ArrayList();
    }

    public Warehouse createWarehouse(String name) {

        for (Warehouse warehouse : warehouseArray) {
            if (warehouse.getWareHouseName().equals(name)) {
                return null;
            }
        }

        Warehouse warehouse = new Warehouse(name);
        this.warehouseArray.add(warehouse);
        return warehouse;
    }

    public ArrayList<Warehouse> getWarehouseDirectoryArray() {
        return warehouseArray;
    }

    public void deleteWarehouse(Warehouse warehouse) {
        warehouseArray.remove(warehouse);
    }
}
