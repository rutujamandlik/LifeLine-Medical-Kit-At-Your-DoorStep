/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Warehouse;

import Business.Order.Order;
import Business.Organization.Organization;
import Business.Products.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class Warehouse extends Organization {

    private String warehouseName;
    private ProductDirectory productDirectory;
    private ArrayList<Order> ordersArray;

    public String getWareHouseName() {
        return warehouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.warehouseName = wareHouseName;
    }

    public Warehouse(String wareHouseName) {
        super();
        this.warehouseName = wareHouseName;
        this.productDirectory = new ProductDirectory();
        this.ordersArray = new ArrayList();
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void addOrder(Order order){
        this.ordersArray.add(order);
    }
    
    public ArrayList<Order> getOrders() {
        return ordersArray;
    }
    
    @Override
    public String toString() {
        return this.warehouseName;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
