/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import Business.Customer.Customer;
import Business.Distribution.Distribution;

/**
 *
 * @author rutuja
 */
public class Product {
    
    private String productName;
    private double price;
    private int quantity;
    private Distribution distribution;
    private Customer customer;
    private String status;
    
    public Product(String productName, double price, int quantity){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }
    
    @Override
    public String toString(){
        return productName;
    }
    
}
