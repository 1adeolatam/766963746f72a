/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

/**
 *  * Name: Tami Adeola 
 * Version: 1.0 
 * Date: Monday, November 10th, 2014 
 * Purpose: 
 *
 * @author 1adeolatam
 */
public class RascalsTriangle {

    //Assumes that the first rows index is 1 not 0
    public static int term(int row, int col) {
        if (row == 1 || col == 1 || row == col) {
            return 1;
        }
        
        return term(row - 1, col - 1) + term(row - 1, col);

    }

    public static void pascalsTriangle(int row) {

        for (int r = 1; r < row; r++) {
            for (int c = 1; c < r; c++) {
                System.out.print(term(r, c) + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        //System.out.println(term(4,2));
        pascalsTriangle(7);
    }

}
