/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author milindsharma
 */
public class Employee {

    private String empName;
    private int empId;
    private static int count = 1;

    public Employee() {
        empId = count;
        count++;
    }

    public int getId() {
        return empId;
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    
    public String getName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
}
