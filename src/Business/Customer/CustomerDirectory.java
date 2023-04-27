/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author milindsharma
 */
public class CustomerDirectory {

    private ArrayList<Customer> customersArray;
    
    public CustomerDirectory(){
        customersArray = new ArrayList();
    }
    
    public Customer createCustomer(int age, Employee employee, long phoneNumber){
        Customer customer = new Customer(age, employee, phoneNumber);
        customersArray.add(customer);
        return customer;
    }

    public ArrayList<Customer> getCustomers() {
        return customersArray;
    }
}
