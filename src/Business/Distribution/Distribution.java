/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distribution;

import Business.Order.Order;
import Business.Organization.Organization;
import Business.Products.ProductDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class Distribution extends Organization {

    private String distributorName;
    private ProductDirectory productDirectory;
    private ArrayList<Order> ordersArray;

    public Distribution(String name) {
        super();
        this.distributorName = name;
        this.productDirectory = new ProductDirectory();
        this.ordersArray = new ArrayList();
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public ArrayList<Order> getOrders() {
        return ordersArray;
    }

    public void addOrder(Order order) {
        this.ordersArray.add(order);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public String toString() {
        return this.distributorName;
    }

}
