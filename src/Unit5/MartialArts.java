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
    protected static int NAME_SIZE = 20;
    protected static int FOUNDER_SIZE = 20;

    long fileRecordID;
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
        fileRecordID = -1;

    }

    public MartialArts(String founder, String name, int numberOfpractitioners, int numberOflevels, boolean fullContact, char highestLevelcolor) {
        fileRecordID = -1;
        this.founder = founder;
        this.name = name;
        this.numberOfpractitioners = numberOfpractitioners;
        this.numberOflevels = numberOflevels;
        this.fullContact = fullContact;
        this.highestLevelcolor = highestLevelcolor;
    }

    public long getFileRecordID() {
        return fileRecordID;
    }

    public void setFileRecordID(long fileRecordID) {
        this.fileRecordID = fileRecordID;
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

    @Override
    public String toString() {
        return "MartialArts{" + "fileRecordID=" + fileRecordID + ", founder=" + founder + ", name=" + name + ", numberOfpractitioners=" + numberOfpractitioners + ", numberOflevels=" + numberOflevels + ", fullContact=" + fullContact + ", highestLevelcolor=" + highestLevelcolor + '}';
    }

  
    

}
