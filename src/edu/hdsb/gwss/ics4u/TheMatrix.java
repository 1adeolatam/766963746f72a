/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class TheMatrix {

    /**
     * @param args the command line arguments
     */
    public static int[][] generateMatrix(int rowsize, int colsize) {
        int[][] matrix = new int[rowsize][colsize];

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.format("%-4d", matrix[i][j]);
            }
            System.out.print("]");
            System.out.println("");
        }
        return matrix;
    }

    public static void trasnposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.format("%-4d", matrix[j][i]);
            }
            System.out.print("]");
            System.out.println("");
        }

    }
    public static void multiplyMatrixByConstant(int[][] matrix, int constant){
    
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.format("%-4d", constant * matrix[i][j]);
            }
            System.out.print("]");
            System.out.println("");
        }
    
    }
    
    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2){
        
        
        
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col,constant;
        System.out.println("Please enter row and col size of the array.");
        row = input.nextInt();
        col = input.nextInt();

        System.out.println("Please enter constant");
        constant = input.nextInt();
        
        System.out.println("Please enter the dimensions of both matrices below");
      
        generateMatrix(row,col);
        int row2 = input.nextInt();
        int col2= input.nextInt();
        multiplyMatrix(generateMatrix(row,col),generateMatrix(row2,col2));
        
        
    
    }

}
