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
public class MixedFraction extends Fraction {

    public int coefficient;

    MixedFraction() {
        super();
        this.coefficient = 0;
    }

    public int getCoefficient() {
        return this.coefficient;
    }

    public void setCoefficient(int coefficient) {
        if (coefficient > 0) {
            this.coefficient = coefficient;
        } else {
            System.out.println("invalid coefficient has to be greater than 0");
        }

    }

    public MixedFraction(int coefficient, int numerator, int denominator) {
        super(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
        this.coefficient = coefficient;
    }

    @Override
    public void reduce() {
        this.toImproperFraction();

    }

    public ImproperFraction toImproperFraction() {
        ImproperFraction newfrac = new ImproperFraction();

        newfrac.setNumerator(getDenominator() * getCoefficient() + getNumerator());
        newfrac.setDenominator(getDenominator());

        return newfrac;

    }

    @Override
    public double size() {
        return toImproperFraction().size();
    }

    @Override
    public void invert() {
        toImproperFraction().invert();

    }

    @Override
    public String toString() {
        return ("The Numerator " + this.numerator + "\nTHe denominator " + this.denominator + "\nThe coefficient" + this.coefficient);
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
    public void setDenominator(int denominator) {
        if (denominator > 0 && denominator > this.numerator) {
            this.denominator = denominator;
        } else {
            System.out.println("Invalid denominator");
        }

    }

    @Override
    public int getNumerator() {
        return this.numerator;
    }

    @Override
    public int getDenominator() {

        return this.denominator;
    }

}
