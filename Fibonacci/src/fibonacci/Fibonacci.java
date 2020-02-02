/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author lucanthony
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int k, a, b;
        
        a = 1; 
        b = 1; 
        k = 0; 
        System.out.println("1  1");
        
        while(k <= 89) {
        k = a + b; 
        System.out.println(k + " ");
        a = b;
        b = k;
        
        }
    }
    
}
