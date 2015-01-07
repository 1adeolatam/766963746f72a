/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1adeolatam
 */
public class CPU {
    
    public int NumberofCores;
    public int ID;
    public String Name;

    public CPU() {
    }

    public CPU(int NumberofCores, int ID, String Name) {
        this.NumberofCores = NumberofCores;
        this.ID = ID;
        this.Name = Name;
    }

    public int getNumberofCores() {
        return NumberofCores;
    }

    public void setNumberofCores(int NumberofCores) {
        this.NumberofCores = NumberofCores;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
    
    
   

    
    
    
    
    
}
