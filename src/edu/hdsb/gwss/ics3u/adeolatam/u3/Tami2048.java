/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class Tami2048 extends Console {

    /**
     * @param args the command line arguments
     */
    int score = 0;
    int[][] value;
    boolean canMove = false;
    Console c;

    public Tami2048() {
        value = new int[4][4];

    }

    public static void main(String[] args) {

        Tami2048 game = new Tami2048();

        game.randomNumber();
        game.randomNumber();

        game.displayArray1();
        game.println("Your score is " + game.score);

    }

    public void keyPressed(KeyEvent e) {

        int keyPressed = e.getKeyCode();
        clear();
        switch (keyPressed) {
            case KeyEvent.VK_UP:
                collapseUp(value);
                randomNumber();
                displayArray1();
                println("Your score is " + score);
                if (canMove = false) {
                    System.out.println("Game OVER");
                }
                break;
            case KeyEvent.VK_DOWN:

                collapseDown(value);
                randomNumber();
                displayArray1();
                println("Your score is " + score);
                if (canMove = false) {
                    System.out.println("Game OVER");
                }
                break;
            case KeyEvent.VK_LEFT:

                collapseLeft(value);
                randomNumber();
                displayArray1();
                println("Your score is " + score);
                if (canMove = false) {
                    System.out.println("Game OVER");
                }
                break;
            case KeyEvent.VK_RIGHT:
                collapseRight(value);
                randomNumber();
                displayArray1();
                println("Your score is " + score);
                if (canMove = false) {
                    System.out.println("Game OVER");
                }
                break;
        }

    }

    public void displayArray1() {
        for (int j = 0; j < value.length; j++) {
            for (int i = 0; i < value[j].length; i++) {
                print(value[j][i] + " ");
            }
            println();
        }
    }

    public void shiftLeft(int[][] value) {
        for (int j = 0; j < value.length; j++) {
            for (int pass = 0; pass < value[j].length - 1; pass++) {
                for (int i = 1; i < value[j].length; i++) {
                    if (value[j][i - 1] == 0) {
                        int tmp;
                        tmp = value[j][i];
                        value[j][i] = value[j][i - 1];
                        value[j][i - 1] = tmp;

                    }
                }
            }
        }

    }

    public void shiftRight(int[][] value) {
        for (int j = 0; j < value.length; j++) {
            for (int pass = 0; pass < value[j].length - 1; pass++) {
                for (int i = 0; i < value[j].length - 1; i++) {
                    if (value[j][i + 1] == 0) {
                        int tmp;
                        tmp = value[j][i];
                        value[j][i] = value[j][i + 1];
                        value[j][i + 1] = tmp;

                    }
                }
            }
        }

    }

    public void shiftUp(int[][] value) {

        for (int j = 1; j < value.length; j++) {
            for (int pass = 0; pass < value[j].length - 1; pass++) {
                for (int i = 0; i < value[j].length; i++) {
                    if (value[j - 1][i] == 0) {
                        int tmp;
                        tmp = value[j][i];
                        value[j][i] = value[j - 1][i];
                        value[j - 1][i] = tmp;

                    }

                }
            }
        }

    }

    public void shiftDown(int[][] value) {
        for (int j = 2; j > -1; j--) {
            for (int pass = 0; pass < value[j].length; pass++) {
                for (int i = 0; i < value[j].length; i++) {
                    if (value[j + 1][i] == 0) {
                        int tmp;
                        tmp = value[j][i];
                        value[j][i] = value[j + 1][i];
                        value[j + 1][i] = tmp;
                        {

                        }
                    }
                }

            }

        }
    }

    public void collapseLeft(int[][] value) {
        for (int j = 0; j < value.length; j++) {
            for (int i = 1; i < value[j].length; i++) {
                if (value[j][i - 1] == value[j][i]) {
                    value[j][i - 1] = value[j][i] * 2;
                    value[j][i] = 0;
                    score = score + value[j][i - 1];
                    shiftLeft(value);
                }
            }
        }
        shiftLeft(value);
    }

    public void collapseUp(int[][] value) {
        for (int col = 0; col < value.length; col++) {
            for (int i = 1; i < value.length; i++) {
                if (value[i - 1][col] == value[i][col]) {
                    value[i - 1][col] = value[i][col] * 2;
                    value[i][col] = 0;
                    score = score + value[col][i - 1];

                }
            }
        }
        shiftUp(value);
    }

    public void collapseDown(int[][] value) {

        for (int j = 0; j < value.length; j++) {
            for (int i = 1; i < value.length - 1; i++) {
                if (value[i + 1][j] == value[i][j]) {
                    value[i + 1][j] = value[i][j] * 2;
                    value[i][j] = 0;
                    score = score + value[i + 1][j];

                }
            }
        }
        shiftDown(value);
    }

    public void collapseRight(int[][] value) {
        for (int j = 0; j < value.length; j++) {
            for (int i = 0; i < value[j].length - 1; i++) {
                if (value[j][i + 1] == value[j][i]) {
                    value[j][i + 1] = value[j][i] * 2;
                    value[j][i] = 0;
                    score = score + value[j][i + 1];
                    shiftRight(value);
                }
            }
        }
        shiftRight(value);
    }

    public void randomNumber() {
        //6 : 1 chance of 2 and 4
        int k = (int) (Math.random() * 4);
        int i = (int) (Math.random() * 4);
        int randomN;

        if (value[k][i] == 0) {
            randomN = (int) (Math.random() * 7);
            if (randomN == 0) {
                value[k][i] = 4;
            } else {
                value[k][i] = 2;
            }

        }

    }

    public boolean canMove(int[][] value) {

        for (int j = 0; j < value.length; j++) {
            for (int i = 0; i < value[j].length - 1; i++) {
                if (value[j][i - 1] == value[j][i]) {
                    canMove = true;
                }
                if (value[i - 1][j] == value[i][j]) {
                    canMove = true;
                }
                if (value[i + 1][j] == value[i][j]) {
                    canMove = true;
                }
                if (value[j][i + 1] == value[j][i]) {
                    canMove = true;
                } else {
                    canMove = false;
                }
            }
        }
        for (int j = 0; j < value.length; j++) {
            for (int i = 0; i < value[j].length - 1; i++) {
                if (value[j][i] == 0) {
                    canMove = true;

                }
            }
        }
        return canMove;

    }
}
