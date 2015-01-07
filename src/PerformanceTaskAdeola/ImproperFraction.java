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
public class ImproperFraction extends Fraction {

    public int numerator;
    public int denominator;

    public ImproperFraction() {
    }

    public ImproperFraction(int numerator, int denominator) {
        super(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public MixedFraction toMixedFraction() {
        MixedFraction newfrac = new MixedFraction();

        newfrac.setDenominator(getDenominator());
        newfrac.setCoefficient(getNumerator() / getDenominator());
        newfrac.setNumerator(getNumerator() % getDenominator());
        return newfrac;

    }

    @Override
    public void setNumerator(int numerator) {
        if (Math.abs(numerator) > getDenominator()) {
            this.numerator = numerator;
        }
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator > getNumerator()) {
            this.denominator = denominator;
        }
    }



    @Override
    public String toString() {
        return "ImproperFraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
    }

}
