//Write a program to print the sum of first n numbers.

package ChaitraChallenge;

import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for( int i=1 ; i<=n ; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of first "+n+" numbers is : "+sum);
	}
}
