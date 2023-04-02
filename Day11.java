// Write a Program to find length of String without using Inbuilt Function :

package ChaitraChallenge;

import java.io.*;
public class Day11 {
   public static void main(String args[]) throws Exception {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String : ");
	String S = br.readLine();
	int i = 0;
	for(char C: S.toCharArray()) {
	    i++;
	}
	System.out.println("Length of the given string ::"+i);
   }
}
