/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

/**
 *
 * @author 1adeolatam
 */
public class SelectionSortingTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Selection Sorting

        int maxIndex;
        int[] data = new int[10];
        int swap = 0, comparison = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 1000) + 1;
        }

        TamiArrayUtil.displayArray(data);

        for (int pass = 0; pass < data.length; pass++) {

            maxIndex = 0;
            for (int i = 1; i < data.length - pass; i++) {
                comparison++;
                
                if (data[i] > data[maxIndex]) {
                    maxIndex = i;
                    
                }

            }
            TamiArrayUtil.swap(data, maxIndex, data.length - 1 - pass);
            swap++;
            TamiArrayUtil.displayArray(data);

        }

        System.out.println(swap + " swaps were made and " + comparison + " comparisons where made");
    }
}
