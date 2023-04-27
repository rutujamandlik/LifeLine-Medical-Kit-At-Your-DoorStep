/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Employee.Employee;

import java.util.ArrayList;

import Business.Organization.Organization;
import Business.Role.CustomerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author milindsharma
 */
public class Customer extends Organization {

    private int age;
    private Employee employee;
    private long phoneNumber;
    private String emailAddress;
    private String homeAddress;
    
    public Customer(int age, Employee employee, long phoneNumber){
        this.age = age;
        this.employee = employee;
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        return roles;
    }

    public String getEmailID() {
        return emailAddress;
    }

    public void setEmailID(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return homeAddress;
    }

    public void setAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String toString(){
        return employee.getName();
    }
    
}
