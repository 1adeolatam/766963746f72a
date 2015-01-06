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
public class ProperFraction extends Fraction {

    public int numerator;
    public int denominator;

    public ProperFraction() {

    }

    public ProperFraction(int numerator, int denominator) {
        super(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public int getNumerator() {
        return this.numerator;
    }

    @Override
    public void setNumerator(int numerator) {

        if (numerator < this.denominator) {
            this.numerator = numerator;
        } else {
            System.out.println("The numerator you are entering is too large, to be a proper fraction");
        }

    }

    @Override
    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator > 0 && denominator > this.numerator) {
            this.denominator = denominator;
        } else {
            System.out.println("Invalid denominator");
        }
    }

    @Override
    public String toString() {
        return "ProperFraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }
    
    

}
