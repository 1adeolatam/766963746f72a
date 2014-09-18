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
public class Coins {
 
   private String name;    
   private int value;
   private boolean queenCrown;
   private double diameter;
   private double mass;
   private String symbol;
   private int idNumber;
   private int cointype;
   private boolean rusted;
   
    public Coins(){
    
}

    public Coins(int value, int idNumber, int cointype) {
        this.value = value;
        this.idNumber = idNumber;
        this.cointype = cointype;
    }

    public boolean isRusted() {
        return rusted;
    }

    public void setRusted(boolean rusted) {
        this.rusted = rusted;
    }
    
    
    
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getCointype() {
        return cointype;
    }

    public void setCointype(int cointype) {
        this.cointype = cointype;
    }
   
   
  
   

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setQueenCrown(boolean queenCrown) {
        this.queenCrown = queenCrown;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public boolean isQueenCrown() {
        return queenCrown;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "Coins{" + "idNumber=" + idNumber + ", cointype=" + cointype + ", rusted=" + rusted + '}';
    }
    
    
    
    
    
    
}
