/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.ArrayList;

/**
 *
 * @author Tami
 */
public class HydroCarbon {

    public ArrayList<OrganicCompound> compounds;

    public void add(OrganicCompound compound) {

        if (compound.isValid()) {

            if (compound == get(compound.chemSpiderNumber)) {
                System.out.println("This compound has already been inputed.");
            } else {
                this.compounds.add(compound);
            }

        }
    }

    public void remove(OrganicCompound compound) {
        if (compound != null && compound.isValid()) {
            this.compounds.remove(compound);          

        } else {
            System.out.println("The Compound being passed is not valid, or does not exist in the array list.");
        }
    }

    public OrganicCompound get(int chemspiderID) {
        OrganicCompound oc = null;

        if (chemspiderID < 0) {
            System.out.println("The chemSpiderID entered is invalid");
            return null;
        } else {
            for (OrganicCompound i : this.compounds) {
                if (chemspiderID == i.getChemSpiderNumber()) {
                    oc = i;

                }

            }
            return oc;
        }
    }
}
