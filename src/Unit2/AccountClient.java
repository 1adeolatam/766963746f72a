/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.ArrayList;

/**
 *
 * @author 1adeolatam
 */
public class AccountClient {

    /**
     * @param args the command line arguments
     */
    
    private String firstName = "";
    private String lastName = "";
    private int sinNumber ;
    private ArrayList<Account> accounts;

    public Account getAccount(int accountNumber, int branchNuber) {
       Account account = null;
        boolean found = false;
        for(int i = 0; i < accounts.size(); i++){
            account = this.accounts.get(i);
            if(account.getAccountNumber()== accountNumber && account.getBranchNumber()== branchNuber){
            found = true;
            i = accounts.size();
            }
        }
        
        
        if (found = true){
            return account;
        }
        else return null;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }
    
    
    
    
    public AccountClient(int sinNumber) {
        this.sinNumber = sinNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(int sinNumber) {
        this.sinNumber = sinNumber;
    }

    @Override
    public String toString() {
        return "AccountClient{" + "firstName=" + firstName + ", lastName=" + lastName + ", sinNumber=" + sinNumber + '}';
    }

   

    
     public static void main(String[] args) {
    
         Account hiimfeeding = new Account();
         //hiimfeeding.getAccountType(ACCOUNT_TYPE_MONEY_MARKET);
         //himfeeding.
}
   
    
}
