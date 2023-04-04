//Write a program to find the Fibonacci series of n numbers using recursion : 

package ChaitraChallenge;

import java.io.*;

class Day13{  
	 static int num1=0,num2=1,num3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         num3 = num1 + num2;    
	         num1 = num2;    
	         num2 = num3;    
	         System.out.print(" "+num3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]) throws IOException{
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number : ");
		 int count= Integer.parseInt(br.readLine());    
		 System.out.print(num1+" "+num2);  
		 printFibonacci(count-2);
	}  
}  
