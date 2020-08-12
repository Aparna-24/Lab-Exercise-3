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
public class nonstaticvar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();

        // TODO code application logic here
    }
    
}
class Counter{  
int count=4;//will get memory each time when the instance is created  
  
Counter()
{  
count++;//incrementing value  
System.out.println(count);  
} 
}
  

