/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

import java.util.Scanner;

/**
 * Name: Tami Adeola Version: 1.0 Date: Tuesday, September 16, 2014 Purpose: The
 * purpose of this program is to perform certain functions with matrices
 *
 * @author 1adeolatam
 */
public class TheMatrix {

    /**
     * @param args the command line arguments
     */
    public static int[][] generateMatrix() {
        //get user input for matrix size
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.println("Please enter row and col size of the array.");
        row = input.nextInt();
        col = input.nextInt();
        int[][] matrix = new int[row][col];

        //creates random matrix to users size
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

                // Displays the inputed matrix transposed [j][i] instead of [i][j]
                System.out.format("%-4d", matrix[j][i]);
            }
            System.out.print("]");
            System.out.println("");
        }

    }

    public static void multiplyMatrixByConstant() {
        //gets constant and matrix dimensions
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.println("Please enter row and col size of the array.");
        row = input.nextInt();
        col = input.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println("Please enter the constant:");
        int constant = input.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                // doesnt change the actual matrix just displays it multiplied
                System.out.format("%-4d", constant * matrix[i][j]);
            }
            System.out.print("]");
            System.out.println("");
        }

    }

    public static int[][] multiplyMatrix() {
        Scanner input = new Scanner(System.in);
        int row, col;
// gets dimensions for both matrices
        System.out.println("Please enter row and col size of the first matrix.");
        row = input.nextInt();
        col = input.nextInt();
        int[][] matrix1 = new int[row][col];
        System.out.println("Please enter row and col size of the second matrix.");
        int row2 = input.nextInt();
        int col2 = input.nextInt();
        int[][] matrix2 = new int[row2][col2];
        int[][] newMatrix = new int[row][col2];

        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random() * 10);
            }
        }
        if (col != row2) {
            newMatrix = null;
            System.out.println("Product not defined");
        } else {
            int sum = 0;
            for (int i = 0; i < row; i++) {

                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col; k++) {
                        // sums up the multiplication of the corresponding points in the 2 matrices and puts it into the new Matrix
                        newMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }

            }
// Displays Matrix 1, Matrix 2 and their Product
            for (int i = 0; i < matrix1.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < matrix1[i].length; j++) {

                    System.out.format("%-4d", matrix1[i][j]);
                }
                System.out.print("]");
                System.out.println("");
            }
            System.out.println("");
            for (int i = 0; i < matrix2.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < matrix2[i].length; j++) {

                    System.out.format("%-4d", matrix2[i][j]);
                }
                System.out.print("]");
                System.out.println("");
            }
            System.out.println("");
            for (int i = 0; i < newMatrix.length; i++) {
                System.out.print("[ ");
                for (int j = 0; j < newMatrix[i].length; j++) {

                    System.out.format("%-4d", newMatrix[i][j]);
                }
                System.out.print("]");
                System.out.println("");
            }

        }
        return newMatrix;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Menu to access the matrix program features
        System.out.println("1: The Random Matrix");
        System.out.println("2: The Transpose Matrix");
        System.out.println("3: Multiplying Matrix by Constant");
        System.out.println("4: Multiplying Two Matrices");
        System.out.println("Please enter which matrix function you would like to use.");
        int userinput = input.nextInt();

        switch (userinput) {
            case 1:
                generateMatrix();
                break;
            case 2:
                trasnposeMatrix(generateMatrix());
                break;
            case 3:
                multiplyMatrixByConstant();
                break;
            case 4:
                multiplyMatrix();
                break;
            default:
                System.out.println("Please enter valid number");
                break;
        }

    }

}
