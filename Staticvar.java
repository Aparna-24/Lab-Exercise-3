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
public class Staticvar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1=new Student(111,"preetha");
        Student s2=new Student(222,"riya");
 
        s1.display();
        s2.display();
    }
    
}
class Student{  
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   Student(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+" "+name+" "+college);}  
}  

