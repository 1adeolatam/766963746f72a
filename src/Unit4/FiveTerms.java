/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

/**
 *
 * @author 1adeolatam
 */
public class FiveTerms {

    //Sequence 1
    public static int termFinder(int n) {

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

        for (int i = 1; i < 10; i++) {

            System.out.println(termFinder(i));
        }

        for (int i = 1; i < 6; i++) {
            System.out.printf("\n%1$.2f", secondSequence(i));

        }

    }

}
