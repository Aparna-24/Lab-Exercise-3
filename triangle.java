/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2;

/**
 *
 * @author aparna
 */
public class triangle {
  
  public static int Valid(double a, double b, double c) {

        if (a + b + c == 180 && a != 0 && b != 0 && c != 0) 
            return 0; 
        else
            return 1; 
    } 
  
    // Driver function 
    public static void main(String args[]) 
    { 
  
        double a = 7.0, b = 10.0, c = 5.0; 
      
        // function calling and print output 
                 if ((Valid (a, b, c)) == 1) 
                       System.out.println("Valid"); 
                else
                    System.out.print("Invalid"); 
          
    } 
} 
  
// This article }is contributed by 'Akansh Gupta' 
