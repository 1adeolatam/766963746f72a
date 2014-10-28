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
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    
     
    public static int fibonacci (int term){
        int i,y = 1;
        if(term <2 ){
           return 1; 
        }
       
        
        return fibonacci(term-1)+fibonacci(term-2);
    }
    
    
    
    public static void main(String[] args) {
        
        System.out.println(fibonacci(100));
        
    }
    
}
