/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class HospitalDirectory {

    private ArrayList<Hospital> hospitalsArray;

    public HospitalDirectory() {
        this.hospitalsArray = new ArrayList();
    }

    public Hospital createHospital(String name) {

        for (Hospital hospitalArray : hospitalsArray) {
            if (hospitalArray.getHospitalName().equals(name)) {
                return null;
            }
        }

        Hospital hospital = new Hospital(name);
        this.hospitalsArray.add(hospital);
        return hospital;
    }

    public void deleteHospital(String name) {
        for (Hospital hospitalArray : hospitalsArray) {
            if (hospitalArray.getHospitalName().equals(name)) {
                hospitalsArray.remove(hospitalArray);
                break;
            }
        }
    }

    public ArrayList<Hospital> getHospitalsArray() {
        return hospitalsArray;
    }

    public void setHospitalsArray(ArrayList<Hospital> hospitalsArray) {
        this.hospitalsArray = hospitalsArray;
    }

}
