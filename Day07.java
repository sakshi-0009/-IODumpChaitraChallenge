//Write a program to check whether the input received from user is prime or not.

package ChaitraChallenge;

import java.io.*;

public class Day07 {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the Number : ");
		int n = Integer.parseInt(br.readLine());
		 
		 int count = 0;
			for(int i=1;i<=n;i++) {
				if(n%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(n+" is a Prime Number");
			} else {
				System.out.println(n+" is not a Prime Number");
			}
	}

}
