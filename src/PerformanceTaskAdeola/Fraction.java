/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerformanceTaskAdeola;

/**
 *
 * @author 1adeolatam
 */
public abstract class Fraction {

    // object properties
    public int numerator;
    public int denominator;

    // object methods
    public Fraction() {
        this.numerator = 0;
        this.numerator = 0;
    }

    public Fraction(int numerator, int denominator) {
        
        this.numerator = numerator;
        this.denominator = denominator;
         }

    public double size() {
        return this.getNumerator() / this.getDenominator();
    }

    public Fraction larger(Fraction f) {
        if (this.size() > f.size()) {
            return this;
        } else {
            return f;
        }
    }

    ;

    public static Fraction larger(Fraction f, Fraction g) {
        if (f.size() >= g.size()) {
            return f;
        } else {
            return g;
        }

    }

    ;

    public Fraction times(Fraction f) {
        ProperFraction product = new ProperFraction();

        product.setNumerator(f.getNumerator() * this.getNumerator());

        product.setDenominator(f.getDenominator() * this.getDenominator());

        return product;

    }

    ;

    public static Fraction times(Fraction f, Fraction g) {
        ProperFraction product = new ProperFraction();

        product.setNumerator(f.getNumerator() * g.getNumerator());

        product.setDenominator(f.getDenominator() * g.getDenominator());

        return product;
    }

      public void reduce() {
       int value = this.numerator;
          System.out.println(value);
       for(int i = value; i >0; value--){
           if(this.denominator % i == 0 && this.numerator% i == 0){
               this.setDenominator(this.denominator/i);
               this.setNumerator(this.numerator/i);
           }  else{
               System.out.println("can't be reduced.");
           }        
       }
        
     }

    @Override
    public String toString() {

        return ("The Numerator " + this.numerator + "\nTHe denominator " + this.denominator);
    }

    public boolean equals(Fraction f) {
        return this.size() == f.size();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.numerator;
        hash = 71 * hash + this.denominator;
        return hash;
    }

    public void invert() {
        int holder;
        holder = this.numerator;
        this.numerator = this.denominator;
        this.denominator = holder;
    }

    ;

    public abstract int getNumerator();

    public abstract void setNumerator(int numerator);

    public abstract int getDenominator();

    public abstract void setDenominator(int denominator);

}
