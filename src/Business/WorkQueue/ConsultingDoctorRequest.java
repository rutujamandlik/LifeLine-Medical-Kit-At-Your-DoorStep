/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Customer;
import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class ConsultingDoctorRequest extends WorkRequest {
    
    private ArrayList <String> symptomsArray;
    private Customer customer;
    private Hospital hospitalName;
    private String msg;
    private String test;
    
    public ConsultingDoctorRequest(){
        symptomsArray = new ArrayList();
    }

    public ArrayList<String> getSymptomsArray() {
        return symptomsArray;
    }

    public void setSymptomsArray(ArrayList<String> symptomsArray) {
        this.symptomsArray = symptomsArray;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Hospital getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(Hospital hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
        public void addSymptoms(String symptom) {
        this.symptomsArray.add(symptom);
    }
        
    @Override
    public String toString(){
        return msg;
    }
}
