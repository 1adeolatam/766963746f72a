/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class CoinClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Coin> packOfcoins = new ArrayList();

        for (int i = 0; i < 5; i++) {
            Coin coin = new Coin();
            coin.setIdNumber(i);

            packOfcoins.add(coin);
            System.out.println(packOfcoins.get(i).getIdNumber());
        }

    }

}
