/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class TamiArrayUtil {

    public static int findSum(int[] value) {
        Scanner input = new Scanner(System.in);

        int sum;
        int[] array = new int[18];
        int total = 0;
        System.out.println("Please enter the elements of the array.");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Hole " + (i + 1) + "  ");
            array[i] = input.nextInt();
            total = total + array[i];
        }
        sum = total;
        return sum;
    }

    public static void displayArray(int[] data) {

        for (int row = 0; row < data.length; row++) {
            System.out.print(data[row] + ",");
        }
        System.out.println();
    }

    public static void displayArray(int[][] data) {

        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + ",");
            }
            System.out.println();

        }
    }

    public static int findMax(int[][] data) {
        int maxValue = Integer.MIN_VALUE;
        int rowMaxValue;
        for (int i = 0; i < data.length; i++) {
            rowMaxValue = findMax(data[i]);
            if (rowMaxValue > maxValue) {
                maxValue = rowMaxValue;
            }
        }
        return maxValue;
    }

    public static int findMax(int[] data) {
        int maxValue = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > maxValue) {
                maxValue = data[i];
            }

        }
        return maxValue;

    }

    public static int findMin(int[][] data) {
        int minValue = Integer.MIN_VALUE;
        int rowMinValue;
        for (int i = 0; i < data.length; i++) {
            rowMinValue = findMin(data[i]);
            if (rowMinValue < minValue) {
                minValue = rowMinValue;
            }
        }
        return minValue;
    }

    public static int findMin(int[] data) {
        int minValue = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < minValue) {
                minValue = data[i];
            }

        }
        return minValue;

    }

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

    public static void swap(String[] data, int i, int j) {
        String temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

    public static void swap(float[] data, int i, int j) {
        float temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

    public static void swap(double[] data, int i, int j) {
        double temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

    public static int linearSearch(int[] data, int value) {
        int location = -1;

        for (int i = 0; i < data.length; i++) {
            if (value == data[i]) {
                location = i;
                i = data.length;
            }
        }

        return location;
    }

    public static int binarySearch(int[] data, int value) {
        int location = -1;
        boolean found = false;
        while (found = false) {
            int leftBarrier = 0;
            int rightBarrier = data.length - 1;
            int midIndex = (rightBarrier + leftBarrier) / 2;
            if (value == data[midIndex]) {
                location = midIndex;
                found = true;
            } else if (value < data[midIndex]) {
                rightBarrier = midIndex - 1;
            } else {
                leftBarrier = midIndex + 1;
            }
        }
        return location;
    }

    public static void BubbleSort(int[] data) {

        for (int pass = 0; pass < data.length; pass++) {
            for (int i = 0; i < data.length - pass - 1; i++) {

                if (data[i] > data[i + 1]) {

                    TamiArrayUtil.swap(data, i, i + 1);

                }
            }

        }

    }

    public static void main(String[] args) {

        // findSum()
    }
}
