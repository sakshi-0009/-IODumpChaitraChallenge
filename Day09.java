// Write a program to find the factorial of a given number :

package ChaitraChallenge;

import java.io.*;
public class Day09 {

	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the Number : ");
		int N = Integer.parseInt(br.readLine());
		
		int multi = 1;
		for(int i=1; i<=N; i++) {
			multi = multi*i;
		}
		System.out.println(multi);
	}
}
