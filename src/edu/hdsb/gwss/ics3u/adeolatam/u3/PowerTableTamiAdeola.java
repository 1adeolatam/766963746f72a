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
public class PowerTableTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] table[] ;
        table = new int[16][16];

        for (int i = 0; i < 16; i++) {

            table[i][0] = i + 1;
            System.out.print("Row" + i + " : ");
            for (int k=1; k<15; k++){
                table[i][k] = table[i][k -1]*(i+1);
                System.out.print(table[i][k] + " ");
            }
            System.out.println();
        }

    }

}
