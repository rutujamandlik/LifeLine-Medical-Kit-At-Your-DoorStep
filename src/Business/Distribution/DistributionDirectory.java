/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Distribution;

import java.util.ArrayList;

/**
 *
 * @author divya
 */
public class DistributionDirectory {

    private ArrayList<Distribution> distributionsArray;

    public DistributionDirectory() {
        distributionsArray = new ArrayList();
    }

    public Distribution createDistributionUnit(String name) {
        for (Distribution distributionArray : distributionsArray) {
            if (distributionArray.getDistributorName().equals(name)) {
                return null;
            }
        }
        Distribution distribution = new Distribution(name);
        this.distributionsArray.add(distribution);
        return distribution;
    }

    public void deleteDistributionsUnit(Distribution dist) {
        distributionsArray.remove(dist);
    }

    public ArrayList<Distribution> getDistributionsArray() {
        return distributionsArray;
    }

}
