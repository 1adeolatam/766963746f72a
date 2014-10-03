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

    public ArrayList<OrganicCompound> compounds = new ArrayList<>();
    public int numberOfCompounds = 0;

    public void add(OrganicCompound compound) {

        if (compound == (null)) {
            System.out.println("The compound is invalid");
            System.out.println("NULL OBJECT NO!");
        } else if (compound.isValid() == true) {
            if (compounds.isEmpty()) {
                this.compounds.add(compound);
                this.numberOfCompounds++;
            } else if (exists(compound) == true) {
                System.out.println("This compound has already been inputed.");
            } else {
                this.compounds.add(compound);
                this.numberOfCompounds++;
            }

        } else {
            System.out.println("The compound is invalid");
        }

    }

    public void remove(OrganicCompound compound) {
        if (compound == null || !compound.isValid()) {

            System.out.println("The Compound being passed is not valid, or does not exist in the array list.");
        } else if (compound.isValid()) {
            if (exists(compound)) {
                this.compounds.remove(compound);
                System.out.println(compound.compoundName + " has been removed");
            }
        }
    }

    public OrganicCompound get(int chemspiderID) {
        OrganicCompound oc = null;
        

        if (chemspiderID <= 0) {
            System.out.println("The chemSpiderID entered is invalid");
            oc = null;

        } else if (chemspiderID > 0) {

            for (OrganicCompound compound : this.compounds) {
                if (chemspiderID == compound.getChemSpiderNumber()) {
                    oc = compound;

                }

            }
        } else {
            System.out.println("The compound does not exist in this organic group.");
        }
        return oc;

    }

    public boolean exists(OrganicCompound compound) {
        boolean exists = false;
        for (OrganicCompound i : this.compounds) {
            if (compound.equals(i)) {
                exists = true;
            }
        }

        return exists;
    }

}
