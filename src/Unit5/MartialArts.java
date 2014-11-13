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

    private static int RECORD_SIZE = 58;
    private static int NAME_SIZE = 20;
    private static int FOUNDER_SIZE = 20;

    String Founder;
    String Name;
    int NumberOfPractitioners;
    int NumberOfLevels;
    boolean fullContact;
    char HighestLevelColor;

    public MartialArts() {
        setName(null);
        setHighestLevelColor('z');
        setFounder(null);
        setFullContact(false);

    }

    public MartialArts(String Name, int NumberOfLevels, boolean fullContact, char HighestLevelColor, String Founder) {
            setName(Name);
        setHighestLevelColor(HighestLevelColor);
        setFounder(Founder);
        setFullContact(fullContact);
        
    }

    public void setFounder(String Founder) {
        if (Founder != null) {
            StringBuilder temp = new StringBuilder(Founder.trim());
            temp.setLength(FOUNDER_SIZE);

            this.Founder = temp.toString();
        } else {

            this.Founder = "     TBD            ";

        }

    }

    public void setName(String Name) {
        if (Name != null) {
            StringBuilder temp = new StringBuilder(Name.trim());
            temp.setLength(NAME_SIZE);

            this.Name = temp.toString();
        } else {

            this.Name = "     TBD            ";

        }
    }

    public void setNumberOfLevels(int NumberOfLevels) {
        this.NumberOfLevels = NumberOfLevels;
    }

    public void setFullContact(boolean fullContact) {
        this.fullContact = fullContact;
    }

    public void setHighestLevelColor(char HighestLevelColor) {
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
