/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Products;

import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class ProductDirectory {
    
    private ArrayList<Product> productsArray;
    
    public ProductDirectory(){
        productsArray = new ArrayList();
    }

    public ArrayList<Product> getProducts() {
        return productsArray;
    }

    public void setProducts(ArrayList<Product> productsArray) {
        this.productsArray = productsArray;
    }
    
    public Product newProduct(String productName, double price, int quantity){
        Product product = new Product(productName, price, quantity);
        productsArray.add(product);
        return product;
    }
    
    public void removeProduct(Product product){
        productsArray.remove(product);
    }
    
}
