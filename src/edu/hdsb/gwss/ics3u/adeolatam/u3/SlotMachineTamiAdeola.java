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
public class SlotMachineTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int slotNumber1, slotNumber2, slotNumber3, coinAmount;
        
        String playAgain;

        System.out.println("Please enter y for yes or n for no if you want to play ");
        playAgain = input.next();

        System.out.println("Please enter the amount of coins you have");
        coinAmount = input.nextInt();

        while (coinAmount > 0 && playAgain.equalsIgnoreCase("y")) {
            coinAmount -= 1;
            System.out.println("You have chosen to play again.");
            slotNumber1 = (int) (Math.random() * 4) + 1;
            slotNumber2 = (int) (Math.random() * 4) + 1;
            slotNumber3 = (int) (Math.random() * 4) + 1;
            System.out.print(slotNumber1 + " ");
            System.out.print(slotNumber2 + " ");
            System.out.print(slotNumber3 + " ");

            if (slotNumber1 == slotNumber2 && slotNumber2 == slotNumber3) {
                System.out.print("GOOD job you got a ");
                switch (slotNumber1) {
                    case 1:
                        System.out.print("Triple 1s");
                        coinAmount += 4;
                        break;
                    case 2:
                        System.out.print("Triple 2s");
                        coinAmount += 6;
                        break;
                    case 3:
                        System.out.print("Triple 3s");
                        coinAmount += 8;
                        break;
                    case 4:
                        coinAmount += 10;
                        System.out.print("Triple 4s");
                        break;
                }
            
            }
            System.out.println(" Your current coin Amount is " + coinAmount);

            System.out.println(" Please enter y for yes or n for no if you want to play ");
            playAgain = input.next();

            if ("n".equals(playAgain)) {
                System.out.println("You have chosen to not play again.");
                

            }

        }
        System.out.print ("Game is over but you have " + coinAmount + " Coins.");
    }

    

    }


