package lab2;

/* 
 * Chapter No. 1    Excercise No. 1.1
 * File Name: Lab2.java
 * @author: Eric Schenck
 * Date: August 27, 2012
 * 
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;




public class Lab2 {
    
    public static final double CANDYBARS = 10.00;
    public static final double GUMBALLS = 3.00;
            
    
    public static void main(String[] args)
    {
        
       System.out.println("Hello!");
       System.out.println("Please enter the amount of tickets you have won...");
       
       DecimalFormat df1 = new DecimalFormat("0.00");
       Scanner keyboard = new Scanner(System.in);
       
       
       double n1, n2, n3, n4;
       
       
       
       n1 = keyboard.nextInt();
       n2 = n1 / CANDYBARS;
       n3 = n2 % GUMBALLS;
       
       df1.format(n2);
       df1.format(n3);
       
       
       
       
       
       if (n3 < 0.29){n3 = 0.00;}
       
       
       if (n3 > 0.30){ 
           if (n3 < 0.59){n3 = 1.0;
       }
            }
        
       if (n3 > 0.60){
           if (n3 < 0.89){n3 = 2.0;
       }
            }
        
       if (n3 > 0.90){ 
           if (n3 < 0.99){n3 = 3.0;
       }
            }
       
       
       
       System.out.println("You can get " + df1.format(n2) + " CandyBar(s)");
       System.out.println("Plus you can get " + df1.format(n3) + " Gumball(s)");
        
        
   
    
    
    }
}
