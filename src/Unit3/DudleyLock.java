/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

/**
 *
 * @author 1adeolatam
 */
public class DudleyLock extends Lock {

    // CLASS CONSTANTS

    public String LOCK_MANUFACTURER = "Duddely";
    public int MIN_COMBO_VALUE = 0;
    public int MAX_COMBO_VALUE = 59;
    public int NUMBER_OF_DIGITS = 3;

    private final int digit01 = (int) (Math.random() * 60);
    private final int digit02 = (int) (Math.random() * 60);
    private final int digit03 = (int) (Math.random() * 60);

    public DudleyLock() {
        SERIAL_NUMBER++;
        this.serialNumber = Lock.SERIAL_NUMBER;

    }

    public int getDigit01() {
        return digit01;
    }

    public int getDigit02() {
        return digit02;
    }

    public int getDigit03() {
        return digit03;
    }

    
   @Override
    public void unlock(){
        System.out.println("Please enter the guessed numbers into the correct method.");
                
    }
    
    public void unlock(int digit01, int digit02, int digit03) {
        if ((digit01 == this.digit01) && (digit02 == this.digit02) && (digit03 == this.digit03)) {
            this.open = true;

        }

    }

    @Override
    public String toString() {
        return "Lock Type" + this.LOCK_MANUFACTURER + "\n SerialNumber : " + this.serialNumber;
    }

    @Override
    public String getCombo() {
        if (this.getcombocount  >= 1) {
            this.getcombocount++;
            return this.digit01 + "-" + this.digit02 + "-" + this.digit03;
        } else {
            return "YOu have gotten this lock's combo too many times.";

        }
    }

}
