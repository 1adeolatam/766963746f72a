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
public class MasterULock extends Lock {

    // CLASS CONSTANTS
    public String LOCK_MANUFACTURER = "MasterU";
    public int MIN_COMBO_VALUE = 0;
    public int MAX_COMBO_VALUE = 9;
    public int NUMBER_OF_DIGITS = 4;

    private int digit01;
    private int digit02;
    private int digit03;
    private int digit04;

    public MasterULock(int digit01, int digit02, int digit03, int digit04) {
        SERIAL_NUMBER++;
        System.out.println("CREATED: " + LOCK_MANUFACTURER + " Lock");
        this.open = true;

        this.serialNumber = SERIAL_NUMBER;

        this.setCombo(digit01, digit02, digit03, digit04);
        System.out.println("\tYour Combo: " + this.getCombo() + " | SN: " + this.serialNumber);

    }

    public MasterULock() {

        this(
                (int) (Math.random() * 10),
                (int) (Math.random() * 10),
                (int) (Math.random() * 10),
                (int) (Math.random() * 10)
        );

    }

    public int getDigit01() {
        if (open) {
            return digit01;
        } else {
            return 0;
        }
    }

    public int getDigit02() {
        if (open) {
            return digit02;
        } else {
            return 0;
        }
    }

    public int getDigit03() {
        if (open) {
            return digit03;
        } else {
            return 0;
        }
    }

    public int getDigit04() {
        return digit04;
    }

    @Override
    public String getCombo() {
        if (this.getcombocount <= 2) {
            this.getcombocount++;
            return this.digit01 + "-" + this.digit02 + "-" + this.digit03 + "-" + this.digit04;
        } else {
            return "YOu have gotten this lock's combo too many times.";

        }
    }

    private void setCombo(int digit01, int digit02, int digit03, int digit04) {
        if ((this.MIN_COMBO_VALUE <= digit01 && digit01 <= this.MAX_COMBO_VALUE) && (this.MIN_COMBO_VALUE <= digit02 && digit02 <= this.MAX_COMBO_VALUE) && (MIN_COMBO_VALUE <= digit03 && digit03 <= MAX_COMBO_VALUE) && (this.MIN_COMBO_VALUE <= digit04 && digit04 <= this.MAX_COMBO_VALUE)) {
            this.digit01 = digit01;
            this.digit02 = digit02;
            this.digit03 = digit03;
            this.digit04 = digit04;

            System.out.println("\tYour Combo: " + this.getCombo() + " | SN: " + this.serialNumber);
        } else {
            System.out.println("PLEASE ENTER A COMBINATION NUMBER BETWEEN 1 and 9");
        }

    }

    @Override
    public void unlock() {
        System.out.println("Please enter the guessed numbers into the correct method.");

    }

    public boolean unlock(int digit01, int digit02, int digit03, int digit04) {
        if ((digit01 == this.digit01) && (digit02 == this.digit02) && (digit03 == this.digit03) && (digit04 == this.digit04)) {
            this.open = true;
            System.out.println("your masterulock is opened");
            return true;
        } else {
            System.out.println("WRong or invalid combination");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Lock Type" + this.LOCK_MANUFACTURER + "\n SerialNumber : " + this.serialNumber;
    }
}
