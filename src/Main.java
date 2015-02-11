/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int young = input.nextInt();
        int mid = input.nextInt();

        int diff = mid - young;
        System.out.println( mid + diff);
    }
}
