/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1adeolatam
 */
public class PracticeParsingSummative {

    /**
     * @param args the command line arguments
     */
    static int[] integers = new int[4];
    static String[] Strings = new String[3];
    static double[] doubles = new double[3];

    public static void main(String[] args) throws Exception {

        File file = new File("summative.txt");
        Scanner input = new Scanner(file);
        StringTokenizer st;

        String lineEntered = input.nextLine();
        System.out.println( "LINE 1: " + lineEntered );
        st = new StringTokenizer(lineEntered, " ");
        int i = 0;
        while (st.hasMoreTokens()) {
            integers[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int q = 0;
        while (q < integers.length) {
            System.out.print(integers[q] + " ");
            q++;
        }

        System.out.println();

        if (input.hasNext()) {
            lineEntered = input.nextLine();

            st = new StringTokenizer(lineEntered, " ");
            i = 0;
            while (st.hasMoreTokens()) {
                Strings[i] = st.nextToken();
                i++;
            }
        }
        int r = 0;
        while (r < Strings.length) {
            System.out.print(Strings[r] + " ");
            r++;
        }
        System.out.println();

        if (input.hasNext()) {
            lineEntered = input.nextLine();
            st = new StringTokenizer(lineEntered, " ");
            i = 0;
            while (st.hasMoreTokens()) {
                doubles[i] = Float.parseFloat(st.nextToken());
                i++;
            }
        }
        int t = 0;
        while (t < doubles.length) {
            System.out.print(doubles[t] + " ");
            t++;
        }
        for (int pass = 0; pass < integers.length; pass++) {
            for (int b = 0; b < integers.length - pass - 1; b++) {

                TamiArrayUtil.swap(integers, b, b + 1);
            }
        }

        for (int pass = 0; pass < Strings.length; pass++) {
            for (int b = 0; b < Strings.length - pass - 1; b++) {
                TamiArrayUtil.swap(Strings, b, b + 1);
            }
        }

        for (int pass = 0; pass < doubles.length; pass++) {
            for (int b = 0; b < doubles.length - pass - 1; b++) {
                TamiArrayUtil.swap(doubles, b, b + 1);
            }
        }

        file = new File("summative.txt");
        PrintWriter output = new PrintWriter(file);
        for(int u = 0; u < integers.length; u++){
            output.write(integers[u]);
        }
        for(int u = 0; u < Strings.length; u++){
            output.write(Strings[u]);
        }
        for(int u = 0; u < doubles.length; u++){
            output.write((int) doubles[u]);
        }
    }

}
