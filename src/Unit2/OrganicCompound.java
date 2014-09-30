/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author 1adeolatam
 */
public class OrganicCompound {

    public static final int FUNCTIONAL_GROUP_NONE = 0;
    public static final int FUNCTIONAL_GROUP_HYDROXYL = 1;
    public static final int FUNCTIONAL_GROUP_CARBONYL = 2;
    public static final int FUNCTIONAL_GROUP_CARBOXYL = 3;
    public static final int FUNCTIONAL_GROUP_AMINO = 4;
    public static final int FUNCTIONAL_GROUP_PHOSPHATE = 5;
    public static final int FUNCTIONAL_GROUP_SULFHYDRYL = 6;

    private HydroCarbon organicgroup;
    private int numberOfCarbons;
    private int numberOfHydrogens;
    private int functionalGrouptype;
    private boolean hasDoublebonds;
    private boolean hasTriplebonds;
    public boolean isCyclyic;
    public String compoundName;
    public String chemicalFormula;
    public int chemSpiderNumber;


    public OrganicCompound() {

    }

    public OrganicCompound(int numberOfCarbons, int numberOfHydrogens, int functionalGrouptype, boolean hasDoublebonds, boolean hasTriplebonds, boolean isCyclyic, String compoundName, int chemSpiderNumber) {
        this.numberOfCarbons = numberOfCarbons;
        this.numberOfHydrogens = numberOfHydrogens;
        this.functionalGrouptype = functionalGrouptype;
        this.hasDoublebonds = hasDoublebonds;
        this.hasTriplebonds = hasTriplebonds;
        this.isCyclyic = isCyclyic;
        this.compoundName = compoundName;
        this.chemSpiderNumber = chemSpiderNumber;
    }
    
    
    public HydroCarbon getOrganicgroup() {
        return organicgroup;
    }

    public void setOrganicgroup(HydroCarbon organicgroup) {
        this.organicgroup = organicgroup;
    }

    public int getChemSpiderNumber() {
        return chemSpiderNumber;
    }

    public void setChemSpiderNumber(int chemSpiderNumber) {
        if (chemSpiderNumber < 1) {

        } else {

            this.chemSpiderNumber = chemSpiderNumber;
        }
    }

    public boolean isValid() {
        boolean isValid;

        if (this.numberOfCarbons <= 0) {
            System.out.println("The Number of Carbons is too low!");
            isValid = false;
        }
        if (this.getNumberOfHydrogens() < 0) {
            System.out.println("The number of Hydrogens is too low!");
            isValid = false;
        }
        if (this.compoundName == null || this.compoundName.length() < 5) {
            isValid = false;
            System.out.println(" Invalid Compound Name!");
        }
        if (this.getChemSpiderNumber() < 0) {
            System.out.println("The ChemSpider Number is too low!");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrganicCompound other = (OrganicCompound) obj;
        if (this.numberOfCarbons != other.numberOfCarbons) {
            return false;
        }
        if (this.numberOfHydrogens != other.numberOfHydrogens) {
            return false;
        }
        if (this.chemSpiderNumber != other.chemSpiderNumber) {
            return false;
        }
        return true;
    }

    public boolean isIsCyclyic() {
        return isCyclyic;
    }

    public void setIsCyclyic(boolean isCyclyic) {
        this.isCyclyic = isCyclyic;
    }

    public int getNumberOfCarbons() {
        return numberOfCarbons;
    }

    public void setNumberOfCarbons(int numberOfCarbons) {
        if (numberOfCarbons <= 0) {
            System.out.println("The amount of Carbons in this compound is too low");
        } else {

            this.numberOfCarbons = numberOfCarbons;

        }
    }

    public int getNumberOfHydrogens() {
        return numberOfHydrogens;
    }

    public void setNumberOfHydrogens(int numberOfHydrogens) {
        if (numberOfHydrogens < 0) {
            System.out.println("The amount of Hydrogens in this compound is too low");
        } else {
            this.numberOfHydrogens = numberOfHydrogens;

        }
    }

    public int getFunctionalGrouptype() {
        return functionalGrouptype;
    }

    public void setFunctionalGrouptype(int functionalGrouptype) {
        if (functionalGrouptype < 0) {
            System.out.println("Please enter an available valid functional group type.");
        } else {
            this.functionalGrouptype = functionalGrouptype;

        }
    }

    public boolean isHasDoublebonds() {
        return hasDoublebonds;
    }

    public void setHasDoublebonds(boolean hasDoublebonds) {
        this.hasDoublebonds = hasDoublebonds;
    }

    public boolean isHasTriplebonds() {
        return hasTriplebonds;
    }

    public void setHasTriplebonds(boolean hasTriplebonds) {
        this.hasTriplebonds = hasTriplebonds;
    }

    public String getCompoundName() {
        return compoundName;
    }

    public void setCompoundName(String compoundName) {
        if (compoundName == null || compoundName.length() < 5) {
            System.out.println("Please enter a valid name for the compound.");
        } else {
            this.compoundName = compoundName;
        }
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        if (chemicalFormula == null || chemicalFormula.length() < 2 || chemicalFormula.substring(0, 1).equalsIgnoreCase("C")) {
            System.out.println("Please enter a valid Chemical formula.");
        } else {
            this.chemicalFormula = chemicalFormula;
        }
    }

    @Override
    public String toString() {
        return "Name: " + compoundName + "\nChemicalFormula : " + chemicalFormula + "\nNumber of Carbons in the compound: " + numberOfCarbons + "\nNumber of Hydrogens in the compound" + numberOfHydrogens;
    }

}
