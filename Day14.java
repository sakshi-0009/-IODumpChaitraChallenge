// Write a program to taking A and B as a user input, print the value of A^B using for loop:

package ChaitraChallenge;

import java.io.*;

public class Day14 { 
	static int power(int base, int exponent){  
	int power = 1;  
	for (int i = 1; i <= exponent; i++) {
		power = power * base;  
		}
	return power;
	}  
	public static void main(String args[]) throws IOException{  
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the base: ");  
	int base = Integer.parseInt(br.readLine());  
	System.out.print("Enter the exponent: ");  
	int exponent=Integer.parseInt(br.readLine());  
	int Power=power(base, exponent);  
	System.out.println(base +" to the power " +exponent + " is: "+Power);  
	}  
}  
