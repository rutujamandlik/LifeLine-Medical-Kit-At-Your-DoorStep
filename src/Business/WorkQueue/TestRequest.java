/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Hospital.Hospital;
import Business.Products.Product;

/**
 *
 * @author divya
 */
public class TestRequest extends WorkRequest {
    
    private String msgs;
    private String remark;
    private Customer customer;
    private Product product;
    private Hospital hospitalName;
    private String testResult;

    public String getMsgs() {
        return msgs;
    }

    public void setMsgs(String msgs) {
        this.msgs = msgs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Hospital getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(Hospital hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    @Override
    public String toString(){
        return this.msgs;
    }
}
