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
public class NumbersOfWordsTamiAdeola {

    /**
     * @param value
     * @return
     */
    public static int teenValue;
    public static int tensValue;
    public static int unitsValue;
    public static int hundredsValue;
    public static String teensWord, unitsWord, tensWord, hundredsWord;

    public static String teens(int teenValue) {
        switch (teenValue) {
            case 11:
                NumbersOfWordsTamiAdeola.teensWord = "ELEVEN";
                break;
            case 12:
                NumbersOfWordsTamiAdeola.teensWord = "TWELVE";
                break;
            case 13:
                NumbersOfWordsTamiAdeola.teensWord = "THIRTEEN";
                break;
            case 14:
                NumbersOfWordsTamiAdeola.teensWord = "FOURTEEN";
                break;
            case 15:
                NumbersOfWordsTamiAdeola.teensWord = "FIFTEEN";
                break;
            case 16:
                NumbersOfWordsTamiAdeola.teensWord = "SIXTEEN";
                break;
            case 17:
                NumbersOfWordsTamiAdeola.teensWord = "SEVENTEEN";
                break;
            case 18:
                NumbersOfWordsTamiAdeola.teensWord = "EIGHTEEN";
                break;
            case 19:
                NumbersOfWordsTamiAdeola.teensWord = "NINETEEN";
                break;

        }
        return NumbersOfWordsTamiAdeola.teensWord;
    }

    public static String hundreds(int hundredsValue) {
        switch (hundredsValue) {
            case 0:
                NumbersOfWordsTamiAdeola.hundredsWord = "";
                break;
            case 1:
                NumbersOfWordsTamiAdeola.hundredsWord = "ONE HUNDRED ";
                break;
            case 2:
                NumbersOfWordsTamiAdeola.hundredsWord = "TWO HUNDRED ";
                break;
            case 3:
                NumbersOfWordsTamiAdeola.hundredsWord = "THREE HUNDRED ";
                break;
            case 4:
                NumbersOfWordsTamiAdeola.hundredsWord = "FOUR HUNDRED ";
                break;
            case 5:
                NumbersOfWordsTamiAdeola.hundredsWord = "FIVE HUNDRED ";
                break;
            case 6:
                NumbersOfWordsTamiAdeola.hundredsWord = "SIX HUNDRED ";
                break;
            case 7:
                NumbersOfWordsTamiAdeola.hundredsWord = "SEVEN HUNDRED ";
                break;
            case 8:
                NumbersOfWordsTamiAdeola.hundredsWord = "EIGHT HUNDRED ";
                break;
            case 9:
                NumbersOfWordsTamiAdeola.hundredsWord = "NINE HUNDRED ";
                break;
        }

        return NumbersOfWordsTamiAdeola.hundredsWord;
    }

    public static String tens(int tensValue) {

        switch (tensValue) {

            case 1:
                NumbersOfWordsTamiAdeola.tensWord = "TEN";
                break;
            case 2:
                NumbersOfWordsTamiAdeola.tensWord = "TWENTY ";
                break;
            case 3:
                NumbersOfWordsTamiAdeola.tensWord = "THIRTY ";
                break;
            case 4:
                NumbersOfWordsTamiAdeola.tensWord = "FORTY ";
                break;
            case 5:
                NumbersOfWordsTamiAdeola.tensWord = "FIFTY ";
                break;
            case 6:
                NumbersOfWordsTamiAdeola.tensWord = "SIXTY ";
                break;
            case 7:
                NumbersOfWordsTamiAdeola.tensWord = "SEVENTY ";
                break;
            case 8:
                NumbersOfWordsTamiAdeola.tensWord = "EIGHTY ";
                break;
            case 9:
                NumbersOfWordsTamiAdeola.tensWord = "NINETY ";
                break;

        }

        return NumbersOfWordsTamiAdeola.tensWord;

    }

    public static String units(int unitsValue) {

        switch (unitsValue) {
            case 1:
                NumbersOfWordsTamiAdeola.unitsWord = "ONE";
                break;
            case 2:
                NumbersOfWordsTamiAdeola.unitsWord = "TWO";
                break;
            case 3:
                NumbersOfWordsTamiAdeola.unitsWord = "THREE";
                break;
            case 4:
                NumbersOfWordsTamiAdeola.unitsWord = "FOUR";
                break;
            case 5:
                NumbersOfWordsTamiAdeola.unitsWord = "FIVE";
                break;
            case 6:
                NumbersOfWordsTamiAdeola.unitsWord = "SIX";
                break;
            case 7:
                NumbersOfWordsTamiAdeola.unitsWord = "SEVEN";
                break;
            case 8:
                NumbersOfWordsTamiAdeola.unitsWord = "EIGHT";
                break;
            case 9:
                NumbersOfWordsTamiAdeola.unitsWord = "NINE";
                break;
        }

        return NumbersOfWordsTamiAdeola.unitsWord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number ");
        int numberEntered = input.nextInt();
        NumbersOfWordsTamiAdeola.tensValue = (numberEntered % 100) / 10;

        NumbersOfWordsTamiAdeola.teenValue = (numberEntered % 100);
        NumbersOfWordsTamiAdeola.unitsValue = (numberEntered % 10);

        NumbersOfWordsTamiAdeola.hundredsValue = (numberEntered / 100);

        if (numberEntered > 0 && numberEntered <= 10) {
            units(numberEntered);
            System.out.print(NumbersOfWordsTamiAdeola.unitsWord);
        } else if (numberEntered > 10 && numberEntered <= 19) {
            teens(numberEntered);
            System.out.println(NumbersOfWordsTamiAdeola.teensWord);
        } else if (numberEntered >= 20 && numberEntered <= 999) {
            hundreds(NumbersOfWordsTamiAdeola.hundredsValue);
            tens(NumbersOfWordsTamiAdeola.tensValue);
            teens(NumbersOfWordsTamiAdeola.teenValue);
            units(NumbersOfWordsTamiAdeola.unitsValue);
            if (numberEntered % 100 > 10 && numberEntered % 100 <= 19) {
                System.out.println(NumbersOfWordsTamiAdeola.hundredsWord + NumbersOfWordsTamiAdeola.teensWord);

            } else {

                System.out.println(NumbersOfWordsTamiAdeola.hundredsWord + NumbersOfWordsTamiAdeola.tensWord + NumbersOfWordsTamiAdeola.unitsWord);

            }
        }

    }

}
