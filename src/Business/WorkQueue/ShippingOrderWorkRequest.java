/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Distribution.Distribution;
import Business.Order.Order;
import Business.Warehouse.Warehouse;

/**
 *
 * @author divya
 */
public class ShippingOrderWorkRequest extends WorkRequest {

    private Order orders;
    private Warehouse warehouse;
    private String msg;
    private Distribution distribution;

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
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

    @Override
    public String toString() {
        return this.msg;
    }
}
