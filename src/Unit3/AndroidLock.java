/*
 * Android PIN Lock
 *  - three digit lock code
 *  
 * Version: 0.3; NOT THE FINAL VERSION
 */
package Unit3;

/**
 */
public class AndroidLock extends Lock {

    // CLASS CONSTANTS
    public String LOCK_MANUFACTURER = "ANDROID";
    public int MIN_COMBO_VALUE = 0;
    public int MAX_COMBO_VALUE = 9;
    public int NUMBER_OF_DIGITS = 3;

    // CLASS VARIABLES
    private static int numberOfLocksCreated;

    // OBJECT VARIABLE
    private boolean digit01Revealed;
    private boolean digit02Revealed;
    private boolean digit03Revealed;

    private int invalidAttempts;
    private int digit01;
    private int digit02;
    private int digit03;

    /*
     * Android Lock
     *      - 3 digit combo (0-9)
     *      - you can reset code, only when lock is open
     *      - default combo values are random
     *      - serial number is DISTINCT for all instances
     */

    public AndroidLock() {

        this(
                (int) (Math.random() * 10),
                (int) (Math.random() * 10),
                (int) (Math.random() * 10)
        );

    }

    /*
     * Android Lock
     *      - 3 digit combo (0-9)
     *      - you can reset code, only when lock
     *      - if the code is not set, combo values are -1
     *      - serial number is DISTINCT for all instances
     */
    public AndroidLock(int digit01, int digit02, int digit03) {
        SERIAL_NUMBER++;
        System.out.println("CREATED: " + LOCK_MANUFACTURER + " Lock");
        this.open = true;

        this.serialNumber = Lock.SERIAL_NUMBER;
        this.invalidAttempts = 0;
        this.digit01Revealed = false;
        this.digit02Revealed = false;
        this.digit03Revealed = false;
        this.setCombo(digit01, digit02, digit03);
        System.out.println("\tYour Combo: " + this.getCombo() + " | SN: " + this.serialNumber);

    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    /*
     * Setting Combo:
     *      - must be valid values (0-9)
     *      - can only set the combo when the lock is OPEN
     *      - can only be set if the lock is configurable
     */
    private void setCombo(int digit01, int digit02, int digit03) {
        if ((this.MIN_COMBO_VALUE <= digit01 && digit01 <= this.MAX_COMBO_VALUE) && (this.MIN_COMBO_VALUE <= digit02 && digit02 <= this.MAX_COMBO_VALUE) && (this.MIN_COMBO_VALUE <= digit03 && digit03 <= this.MAX_COMBO_VALUE)) {
            this.digit01 = digit01;
            this.digit02 = digit02;
            this.digit03 = digit03;

            System.out.println("\tYour Combo: " + this.getCombo() + " | SN: " + this.serialNumber);
        } else {
            System.out.println("PLEASE ENTER A COMBINATION NUMBER BETWEEN 1 and 9");
        }

    }

    /*
     * Digit 01; only revealed ONCE.
     *      -1 returned if revealed.
     */
    public int getDigit01() {
        int digit = -1;
        if (this.digit01Revealed) {
            System.out.println("ERROR: Digit 01 Revealed to the client. ");
        } else {
            this.digit01Revealed = true;
            digit = this.digit01;
        }
        return digit;
    }

    /*
     * Digit 01; only revealed ONCE.
     *      -1 returned if revealed.
     */
    public int getDigit02() {
        int digit = -1;
        if (this.digit02Revealed) {
            System.out.println("ERROR: Digit 02 Revealed to the client. ");
        } else {
            this.digit02Revealed = true;
            digit = this.digit02;
        }
        return digit;
    }

    /*
     * Digit 03; only revealed ONCE.
     *      -1 returned if revealed.
     */
    public int getDigit03() {
        int digit = -1;
        if (this.digit03Revealed) {
            System.out.println("ERROR: Digit 03 Revealed to the client. ");
        } else {
            this.digit03Revealed = true;
            digit = this.digit03;
        }
        return digit;
    }

    /*
     * Getting Combo:
     *      - nobody should see the combo; except when the lock is created.
     */
    @Override
  public String getCombo() {
            if(this.getcombocount  <= 2){
       this.getcombocount++;
        return this.digit01 + "-" + this.digit02 + "-" + this.digit03;
        }
        else{
            return "YOu have gotten this lock's combo too many times.";
        
    }
    }

  

    /*
     * Lock
     */
    /*
     * Unlock; 
     *      - unlock with correct combination
     *      - AFTER three invalid unlocking attempts; lock will not open
     */
    
    @Override
    public void unlock(){
        System.out.println("Please enter the guessed numbers into the correct method.");
                
    }
    
    public boolean unlock(int digit01, int digit02, int digit03) {
        if ((digit01 == this.digit01) && (digit02 == this.digit02) && (digit03 == this.digit03)) {
            this.open = true;
            System.out.println("your Android lock is opened");
            return true;
        } else {
            this.invalidAttempts++;
            return false;
        }

    }

    /**
     * The method returns the number of locks created.
     *
     * @return the number of locks created.
     */
    public static int getNumberOfLocksCreated() {
        return numberOfLocksCreated;
    }

    @Override
    public String toString() {
        return "Lock Type" + this.LOCK_MANUFACTURER + "\n SerialNumber : " + this.serialNumber;
    }

}
