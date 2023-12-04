
package lab2;

import java.util.Scanner;

public class lab2question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f,c;
        System.out.println("Enter the temperature in degree Farenheit");
        f = sc.nextDouble();
        
        c = (f-32/1.8);
        
        System.out.printf("%.2f" ,c);
        
       
               
        
        
    }
    
}
