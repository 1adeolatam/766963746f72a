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
public class Investment {

    public static double Investment(double rate, int years, int numberOfcompounds, double principal) {
        double A;
        A = principal * (Math.pow(1 + (rate / numberOfcompounds), (numberOfcompounds * years)));

        if (A >= (principal * 2)) {
            System.out.println(years +" years");
            return years;
        }else{

        years++;
        return Investment(rate, years, numberOfcompounds, principal);
    }}

    public  static void main(String[] args) {

        Investment(0.06,0,1,10);
    }

}
