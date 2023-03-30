// Write a program to print multiplication table of a number using for loop:

package ChaitraChallenge;

import java.io.*;
public class Day08 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the Number : ");
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=10; i++) {
			System.out.println(n+"X"+i+" = "+n*i);
		}
	}
}
