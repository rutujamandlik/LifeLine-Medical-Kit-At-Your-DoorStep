/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author milindsharma
 */
public class EmployeeDirectory {

    private ArrayList<Employee> employeeArray;

    public EmployeeDirectory() {
        employeeArray = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeArray;
    }
    
    public Employee createEmployee(String empName){
        Employee employee = new Employee();
        employee.setName(empName);
        employeeArray.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee emo){
        employeeArray.remove(emo);
    }
}
