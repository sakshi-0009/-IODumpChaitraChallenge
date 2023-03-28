// Convert given temperature from farhrnight to celcius

package ChaitraChallenge;

import java.util.Scanner;

public class Day06 {

	public static void main(String arg[])	
	{
	    double a,c;
        Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter  Fahrenheit temperature");
        a=sc.nextDouble(); 
	    System.out.println("Celsius temperature is = "+celsius(a));		  	  	     
	} 
	static double celsius(double f)
	{	
	return  (f-32)*5/9;
	}
}
