/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

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
            isValid = false;
        }
        if (this.getNumberOfHydrogens() < 0) {
            isValid = false;
        }
        if (this.compoundName == null || this.compoundName.length() < 5) {
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
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

        } else {

            this.numberOfCarbons = numberOfCarbons;

        }
    }

    public int getNumberOfHydrogens() {
        return numberOfHydrogens;
    }

    public void setNumberOfHydrogens(int numberOfHydrogens) {

        this.numberOfHydrogens = numberOfHydrogens;
    }

    public int getFunctionalGrouptype() {
        return functionalGrouptype;
    }

    public void setFunctionalGrouptype(int functionalGrouptype) {
        if (functionalGrouptype < 0) {

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

        } else {
            this.compoundName = compoundName;
        }
    }

    public String getChemicalFormula() {
        return chemicalFormula;
    }

    public void setChemicalFormula(String chemicalFormula) {
        if (chemicalFormula == null || chemicalFormula.length() < 2 || chemicalFormula.charAt(0) != 'C') {

        } else {
            this.chemicalFormula = chemicalFormula;
        }
    }

}
