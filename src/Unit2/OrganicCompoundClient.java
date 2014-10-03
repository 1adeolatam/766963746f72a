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
public class OrganicCompoundClient {

    public static void main(String[] args) {

        HydroCarbon alkane = new HydroCarbon();
        HydroCarbon Ester = new HydroCarbon();
        HydroCarbon Insane = new HydroCarbon();
        
        // Perfect case all data is valid and works and entered
        OrganicCompound ethane = new OrganicCompound();
        ethane.setCompoundName("Ethane");
        ethane.setNumberOfCarbons(2);
        ethane.setNumberOfHydrogens(6);
        ethane.setChemSpiderNumber(55);
        ethane.setChemicalFormula("C2H6");
        ethane.setFunctionalGrouptype(OrganicCompound.FUNCTIONAL_GROUP_HYDROXYL);
        ethane.setCyclyicity(true);
        ethane.setDoublebonds(false);
        ethane.setTriplebonds(false);

        System.out.println(ethane.toString());
        ethane.setOrganicgroup(alkane);
        //PreCondition: 0 compounds in alkane's array list
        System.out.println(alkane.numberOfCompounds);
        alkane.add(ethane);
        //PostCondition: +1 compounds in alkane's array list
        System.out.println(alkane.numberOfCompounds);

        //ADDING THE SAME OBJECT/ Duplicate
        System.out.println(alkane.numberOfCompounds);

        //PreCondition: 1 compounds in alkane's arraylist
        System.out.println("The number of compounds before adding a duplicate");
        alkane.add(ethane);
        //PostCondition: 1, no new entry is made into the arraylist
        System.out.println("The number of compounds after adding a duplicate");
        System.out.println(alkane.numberOfCompounds);

        System.out.println("Test 2 ");

        OrganicCompound methene = new OrganicCompound(62, 35, 200, true, "Methene", "C4H53");
        OrganicCompound octane = new OrganicCompound(8, 5, 12, false, "Octance", "Cghgh68");
        OrganicCompound rocktane = null;
       

        System.out.println(Ester.numberOfCompounds);
        Ester.add(methene);
        //Adding invalid object PreCond: 1
        System.out.println(Ester.numberOfCompounds);
        Ester.add(octane);
        // Adding invalid obj Post: 1
        System.out.println(Ester.numberOfCompounds);

        //Adding null obj Pre:1
        Ester.add(rocktane);
        System.out.println(Ester.numberOfCompounds);
        // Adding null obj Post: 1
        System.out.println(Ester.numberOfCompounds);
        
        //removing null obj
        Ester.remove(rocktane);
        //Error message succesfully displayed
        
        //removing valid obj
        // removing valid obj Pre: 1
          System.out.println(Ester.numberOfCompounds);
        Ester.remove(methene);
         // removing valid obj Post: 1
          System.out.println(Ester.numberOfCompounds);
          Ester.add(methene);
        //getting valid objecy
        System.out.println(Ester.get(12)); 
        //prints to string of said valid object
     
        
        
        
        //getting non existent objects
        System.out.println(Ester.get(9001));
        //Successfully displays null
        
        
        
         Insane.get(0);
        //Successfully displays invalid chem id because the object doesnt exist
        
        
    }
}
