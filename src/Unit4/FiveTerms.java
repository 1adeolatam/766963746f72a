/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

/**
 * Name: Tami Adeola 
 * Version: 1.0 
 * Date: Monday, November 10th, 2014 
 * Purpose: The evaluation of terms given specific recursive functions
 * @author 1adeolatam
 */
public class FiveTerms {

    //Sequence 1
    public static int termFinder(int n) {

        //fulfilling requirements of function
        if (n == 2) {
            return 3;
        }

        if (n == 1) {
            return 1;
        }

        return termFinder(n - 1) + termFinder(n - 2);

    }

    //Sequence 2
    public static double secondSequence(int n) {
        if (n == 1) {
            return 2;
        }

        return Math.sqrt(3 * secondSequence(n - 1) + 4);

    }

    public static void main(String[] args) {
// displays terms of the arithmetic
        for (int i = 1; i < 5; i++) {

            System.out.println(termFinder(i));
        }

        for (int i = 1; i < 6; i++) {
            System.out.printf("\n%1$.2f", secondSequence(i));

        }

    }

}
