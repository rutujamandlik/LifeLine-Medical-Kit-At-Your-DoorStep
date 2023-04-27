/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestListArray;
    private ArrayList<WorkRequest> workRequestListArray2;
    private ArrayList<WorkRequest> workRequestListArray3;

    public WorkQueue() {
        workRequestListArray = new ArrayList();
        workRequestListArray2 = new ArrayList();
        workRequestListArray3 = new ArrayList();
    }
    
    public ArrayList<WorkRequest> getWorkRequestListArray() {
        return workRequestListArray;
    }

    public ArrayList<WorkRequest> getWorkRequestListArray2() {
        return workRequestListArray2;
    }

    public ArrayList<WorkRequest> getWorkRequestListArray3() {
        return workRequestListArray3;
    }
    
}
