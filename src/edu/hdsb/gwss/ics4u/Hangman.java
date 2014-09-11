/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

/**
 *
 * @author 1adeolatam
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String[][] words = new String[6][6];
        words[0][0] = "World Capitals";
        words[0][1] = "Ottawa";
        words[0][2] = "Rome";
        words[0][3] = "Moscow";
        words[0][4] = "Abidjan";
        words[0][5] = "Seoul";
        
        words[1][0] = "Physicists";
        words[1][1] = "Curie";
        words[1][2] = "Bohr";
        words[1][3] = "Tesla";
        words[1][4] = "Oppenheimer";
        words[1][5] = "Newton";
        
        
        words[2][0] = "Programming Languages";
        words[2][1] = "Java";
        words[2][2] = "C++";
        words[2][3] = "Python";
        words[2][4] = "Fortran";
        words[2][5] = "Basic";
        
        words[3][0] = "eSports Organizations";
        words[3][1] = "Samsung";
        words[3][2] = "Counter Logic Gaming";
        words[3][3] = "Ninjas in Pyjamas";
        words[3][4] = "Cj Entus";
        words[3][5] = "";
        
        
    }
    
}
