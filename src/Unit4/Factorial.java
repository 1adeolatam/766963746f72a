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
public class Factorial {

    /**
     * @param args the command line arguments
     */
    
    
    public static long factiorial(int n){
        if(n <= 1){
           return 1; 
        }
       
        
        return n*factiorial(n-1);
    }
    
    
    
    public static void main(String[] args) {

        System.out.println(factiorial(20)); 
         
        
    
}
}