// Write a program to find the largest and smallest of given 5 numbers.

package ChaitraChallenge;

import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 5 numbers : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println(a+" is greater number.");
		} else if(b>a && b>c && b>d && b>e) {
			System.out.println(b+" is greater number.");
		} else if(c>a && c>b && c>d && c>e) {
			System.out.println(c+" is greater number.");
		} else if(d>a && d>b && d>c && d>e) {
			System.out.println(d+" is greater number.");
		} else if(e>a && e>c && e>c && e>d) {
			System.out.println(e+" is greater number.");
		} else {
			System.out.println("Two Numbers are equal!");
		}
	}
}
