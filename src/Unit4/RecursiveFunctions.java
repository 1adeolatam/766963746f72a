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

    public static int functiontwo(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return functiontwo(m - 1, 1);
        } 
            return functiontwo(m - 1, functiontwo(m, n - 1));
        

    }

    public static void main(String[] args) {

        System.out.println(functionwon(5, 3));
        System.out.println(functionwon(2, 2));
        System.out.println(functionwon(1, 4));
        System.out.println(functionwon(-5, -2));

        System.out.println("ACKERMAN");
        System.out.println(functiontwo(1, 1));
        System.out.println(functiontwo(2, 1));
        System.out.println(functiontwo(5, 5));

    }

}
