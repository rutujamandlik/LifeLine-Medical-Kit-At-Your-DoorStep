/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FDA;

import java.util.ArrayList;

/**
 *
 * @author rutuja
 */
public class FDADirectory {
    
    private ArrayList<FDA> fdaArray;
    
    public FDADirectory(){
        this.fdaArray = new ArrayList();
    }
    
    public FDA createFDA(String name){
        
        for (FDA fda:fdaArray){
            if(fda.getFDAName().equals(name)){
                return null;
            }
        }
        
        FDA fda = new FDA(name);
        this.fdaArray.add(fda);
        return fda;
    }
    
    public void deleteFDA(String name){
        for (FDA fda:fdaArray){
            if(fda.getFDAName().equals(name)){
                fdaArray.remove(fda);
                break;
            }
        }
    }

    public ArrayList<FDA> getFDA() {
        return fdaArray;
    }
    
}
