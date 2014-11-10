/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5;

/**
 *
 * @author 1adeolatam
 */
public class MartialArts {

    String Founder;
    String Name;
    int NumberOfPractitioners;
    int NumberOfLevels;
    boolean fullContact;
    char HighestLevelColor;
    
    
    public MartialArts() {
    }

    public MartialArts(String Name, int NumberOfLevels, boolean fullContact, char HighestLevelColor) {
        this.Name = Name;
        this.NumberOfLevels = NumberOfLevels;
        this.fullContact = fullContact;
        this.HighestLevelColor = HighestLevelColor;
    }

    public String getFounder() {
        return Founder;
    }

    public String getName() {
        return Name;
    }

    public int getNumberOfLevels() {
        return NumberOfLevels;
    }

    public boolean isFullContact() {
        return fullContact;
    }

    public char getHighestLevelColor() {
        return HighestLevelColor;
    }

    public int getNumberOfPractitioners() {
        return NumberOfPractitioners;
    }

    public void setNumberOfPractitioners(int NumberOfPractitioners) {
        this.NumberOfPractitioners = NumberOfPractitioners;
    }

    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
    }
    
}
