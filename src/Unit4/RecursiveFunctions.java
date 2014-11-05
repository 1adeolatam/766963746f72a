/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

/**
 *
 * @author 1adeolatam
 */
public class RecursiveFunctions {

    public static int functionwon(int x, int y) {
        if (x == y) {
            return 0;
        }

        if (x < y) {
            return -1 * functionwon(y, x);
        }

       
            return 1 + functionwon(x - 1, y);
        
    }

    public static void main(String[] args) {

        System.out.println(functionwon(5, 3));
        System.out.println(functionwon(2, 2));
        System.out.println(functionwon(1, 4));
        System.out.println(functionwon(-5, -2));
        
        
    }

}
