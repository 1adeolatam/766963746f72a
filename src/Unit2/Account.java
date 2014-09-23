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
public class Account {

    public Account() {
    }

    private int accountNumber;
    private int accountType;
    private int branchNumber;
    private String accountName;
    private double currentBalance;
    private boolean active;
    private int pinNumber;

    public Account(int accountNumber, int accountType, int branchNumber, String accountName, boolean active) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchNumber = branchNumber;
        this.accountName = accountName;
        this.active = active;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isPaymentDue() {
        return active;
    }

    public void setPaymentDue(boolean active) {
        this.active = active;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(int branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double deposit(double currentBalance, double deposit, int pinEntered) {

       
        if (active = true) {
            if(checkPin(pinEntered)== true){
            currentBalance = deposit + currentBalance;
        }
        }
        return currentBalance;
    }

    public double withdraw(double currentBalance, double withdrawalAmount, int pinEntered) {
       
        
        
        if (active = true) {
            if(checkPin(pinEntered)== true){
            if (withdrawalAmount <= currentBalance) {
                currentBalance = currentBalance - withdrawalAmount;
            }
        }
        }
        return currentBalance;
    }

    private boolean checkPin(int pinEntered) {
        boolean correct = false;
        if (active = true) {

            if (pinEntered == pinNumber) {
                correct = true;
            }
        }
        return correct;
    }

    public void trasnfer(int pinEntered){
        
    }
    
}
