//Write a program to reverse the digit of given number :

package ChaitraChallenge;

import java.io.*;

public class Day12 {

	public static void main(String[] args)throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int n = Integer.parseInt(br.readLine());
		int reverse=0;
		
		while(n!=0) {
			int rem = n%10;
			reverse = reverse*10+rem;
			n = n/10;
		}
		
		System.out.println("The Reverse of the entered number is : "+reverse);
	}
}
