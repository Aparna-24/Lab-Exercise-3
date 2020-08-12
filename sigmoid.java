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
public class sigmoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 int n = 0;
    double[] data = {-1.2,.5,1.3};

    for (int i = 0; i < 3; i++) {

      double x = data[i];

      double m = sigmoid(x);

      if (m >= .5) {
        n = 1;
      } 
      else {

        n = 0;
      }
      System.out.printf("%.5f", m);
      System.out.println("   " + n);
     
    }
  }

  public static double sigmoid(double x) {

    double m = 1 / (1 + Math.exp(-x));
    return m;
  }
    }

        // TODO code application logic here
  
