//Write a program to accept the height of a person in cm and convert it to feet.

package ChaitraChallenge;

import java.io.*;

public class Day10 {
	
	static double Conversion(int cm){
		double feet = 0.0328 * cm;
		System.out.println("Height in feet is : "+feet);
		return 0;
	}
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enetr the height in cm: ");
		int cm = Integer.parseInt(br.readLine());
		Conversion(cm);
	}
}
