package Sample1.proj;

/* Author: ADEBAYO Johnson
Date: 10/06/2019 
Location of exercise:  Example in Exercise 5
Purpose: For calculating raise to power e.g. 2 ^ 4 = 16
*/

import java.util.Scanner;
public class Square{
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter value:");
       int num1 = input.nextInt();

       System.out.println("Enter power:");
       int num2 = input.nextInt();

       int root = 1;
       
       for (int counter=1; counter<=num2; counter++){
           root = root * (num1);     
       }
       System.out.println(num1 + "^" + num2 + "=" + root );
   }    
}