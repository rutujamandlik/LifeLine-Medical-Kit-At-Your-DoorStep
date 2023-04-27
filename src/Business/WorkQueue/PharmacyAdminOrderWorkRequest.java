/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Distribution.Distribution;
import Business.Order.Order;
import Business.Pharmacy.Pharmacy;

/**
 *
 * @author divya
 */
public class PharmacyAdminOrderWorkRequest extends WorkRequest {
    
    private Order order;
    private String msg;
    private Distribution distribution;
    private Pharmacy store;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public Pharmacy getStore() {
        return store;
    }

    public void setStore(Pharmacy store) {
        this.store = store;
    }
    
    @Override
    public String toString(){
        return this.msg;
    }
}
