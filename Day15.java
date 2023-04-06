// Write a program to check whether the given number is palindrome or not:

package ChaitraChallenge;

import java.io.*;

public class Day15 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number: ");
		int n = Integer.parseInt(br.readLine());
		int reverse = 0;
		 int temp = n;
		 while(n != 0) {
			 int rem = n%10;
			 reverse = reverse*10+rem;
			 n = n/10;
		 }
		 if(reverse==temp) {
			 System.out.println(temp+" is a Palindrome");
		 } else {
			 System.out.println(temp+" is not a Palindrome");
		 }
	}
}
