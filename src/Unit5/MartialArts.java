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

    protected static int RECORD_SIZE = 51;
    private static int NAME_SIZE = 20;
    private static int FOUNDER_SIZE = 20;

    String founder;
    String name;
    int numberOfpractitioners;
    int numberOflevels;
    boolean fullContact;
    char highestLevelcolor;

    public MartialArts() {
        setname(null);
        sethighestLevelcolor('z');
        setfounder(null);
        setFullContact(false);

    }

    public MartialArts(String founder, String name, int numberOfpractitioners, int numberOflevels, boolean fullContact, char highestLevelcolor) {
        this.founder = founder;
        this.name = name;
        this.numberOfpractitioners = numberOfpractitioners;
        this.numberOflevels = numberOflevels;
        this.fullContact = fullContact;
        this.highestLevelcolor = highestLevelcolor;
    }

 

    public void setfounder(String founder) {
        if (founder != null) {
            StringBuilder temp = new StringBuilder(founder.trim());
            temp.setLength(FOUNDER_SIZE);

            this.founder = temp.toString();
        } else {

            this.founder = "     TBD            ";

        }

    }

    public void setname(String name) {
        if (name != null) {
            StringBuilder temp = new StringBuilder(name.trim());
            temp.setLength(NAME_SIZE);

            this.name = temp.toString();
        } else {

            this.name = "     TBD            ";

        }
    }

    public void setnumberOflevels(int numberOflevels) {
        this.numberOflevels = numberOflevels;
    }

    public void setFullContact(boolean fullContact) {
        this.fullContact = fullContact;
    }

    public void sethighestLevelcolor(char highestLevelcolor) {
        this.highestLevelcolor = highestLevelcolor;
    }

    public String getfounder() {
        return founder;
    }

    public String getname() {
        return name;
    }

    public int getnumberOflevels() {
        return numberOflevels;
    }

    public boolean isFullContact() {
        return fullContact;
    }

    public char gethighestLevelcolor() {
        return highestLevelcolor;
    }

    public int getnumberOfpractitioners() {
        return numberOfpractitioners;
    }

    public void setnumberOfpractitioners(int numberOfpractitioners) {
        this.numberOfpractitioners = numberOfpractitioners;
    }

    public static void main(String[] args) {

    }

}
