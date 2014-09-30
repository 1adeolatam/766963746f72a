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


    OrganicCompound oc = new OrganicCompound();
    oc.setNumberOfCarbons(3);
    
    
    OrganicCompound ethane = new OrganicCompound();
    ethane.setCompoundName("Ethane");
    ethane.setNumberOfCarbons(2);
    ethane.setNumberOfHydrogens(6);
    ethane.setChemSpiderNumber(34);
    
      HydroCarbon alkane = new HydroCarbon();
      
      
      ethane.setOrganicgroup(alkane);
      
      
      alkane.compounds.add(ethane);
      
    
    
    
}
}