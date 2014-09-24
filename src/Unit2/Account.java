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

    public static final int ACCOUNT_TYPE_SAVINGS = 0;
    public static final int ACCOUNT_TYPE_CHECKING = 1;
    public static final int ACCOUNT_TYPE_CD = 2;
    public static final int ACCOUNT_TYPE_MONEY_MARKET = 3;
    public static final int ACCOUNT_TYPE_IRA= 4;
    
    private static final String[] ACCOUNT_TYPE_NAMES = {
        "Savings","Checking","Certificate of Deposit","Money Market","IRA"
    };
    
    
   private AccountClient accountOwner; 
    private int accountNumber;
       private int branchNumber;
    private String accountName;
    private double currentBalance;
    private boolean active;
    private int pinNumber;
    private int accountType;

    public Account(int accountNumber, int accountType, int branchNumber, String accountName, boolean active, AccountClient owner) {
        this.accountNumber = accountNumber;
        this.accountOwner = owner;
        this.branchNumber = branchNumber;
        this.accountName = accountName;
        this.active = active;
    }

    public AccountClient getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(AccountClient accountOwner) {
        this.accountOwner = accountOwner;
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
    
    public String getAccountTypeName(int accounttype){
        return ACCOUNT_TYPE_NAMES[accounttype];
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

    @Override
    public String toString() {
        return "Account{" + "accountOwner=" + accountOwner + ", accountNumber=" + accountNumber + ", branchNumber=" + branchNumber + ", currentBalance=" + currentBalance + ", active=" + active + ", accountType=" + accountType + '}';
    }
 
    
    
}
