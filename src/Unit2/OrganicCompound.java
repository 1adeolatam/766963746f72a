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

    public OrganicCompound(int numberOfCarbons, int numberOfHydrogens, int chemSpiderNumber, boolean hasDoublebonds, String compoundName, String ChemicalFormula) {
        this.numberOfCarbons = numberOfCarbons;
        this.numberOfHydrogens = numberOfHydrogens;
        this.chemicalFormula = ChemicalFormula;
        this.hasDoublebonds = hasDoublebonds;

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
        
        if (chemSpiderNumber <= 0) {
            System.out.println("ChemSPider Number is invalid");
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
       else if (this.getNumberOfHydrogens() < 0) {
            System.out.println("The number of Hydrogens is too low!");
            isValid = false;
        }
       else if (this.compoundName == null || this.compoundName.length() < 5) {
            isValid = false;
            System.out.println(" Invalid Compound Name!");
        }
       else if(this.chemicalFormula == null || chemicalFormula.length() < 2 || chemicalFormula.charAt(0) != 'C'){
            System.out.println("Please enter a valid chemical formula");
            isValid= false;
        }

       else if (this.getChemSpiderNumber() <= 0) {
            System.out.println("The ChemSpider Number is too low!");
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
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
        if (this.chemSpiderNumber != other.chemSpiderNumber) {
            return false;
        }
        return true;
    }

    public boolean getCyclyic() {
        return isCyclyic;
    }

    public void setCyclyicity(boolean isCyclyic) {
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

    public boolean returnDoublebonds() {
        return hasDoublebonds;
    }

    public void setDoublebonds(boolean hasDoublebonds) {
        this.hasDoublebonds = hasDoublebonds;
    }

    public boolean returnTriplebonds() {
        return hasTriplebonds;
    }

    public void setTriplebonds(boolean hasTriplebonds) {
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
        if (chemicalFormula == null || chemicalFormula.length() < 2 || chemicalFormula.charAt(0) != 'C') {
            System.out.println("Please enter a valid Chemical formula.");
        } else {
            this.chemicalFormula = chemicalFormula;
        }
    }

    @Override
    public String toString() {
        return "Name: " + compoundName  + "\nNumber of Carbons in the compound: " + numberOfCarbons + "\nNumber of Hydrogens in the compound: " + numberOfHydrogens + "\nChemSpider Number: " + chemSpiderNumber;
    }

}
