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
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.format("%-4s  %5s %8s\n", "Rock", "Paper", "Scissors");
        System.out.print("Players decide hand signals to represent rock, paper and scissors\n\n ");
        System.out.format("%-10s","Players make a throw at the same time\n\n");
        System.out.println("The hand signals are then thrown and compatred\n to the rules of the game");
        System.out.println("\t Rock dulls scissors. <Rock Wins>");
        System.out.println("\t Scissors cuts paper. <Scissors Wins>");
        System.out.println("\t Paper wraps rock. <Paper Wins>");
    }

}
