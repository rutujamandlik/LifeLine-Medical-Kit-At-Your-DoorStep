/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FDA.FDA;
import Business.Products.Product;
import Business.Warehouse.Warehouse;

/**
 *
 * @author divya
 */
public class FDAApprovalRequest extends WorkRequest {

    private String msg;
    private String status;
    private Product product;
    private FDA fda;
    private Warehouse warehouse;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public FDA getFda() {
        return fda;
    }

    public void setFda(FDA fda) {
        this.fda = fda;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return this.msg;
    }
}
