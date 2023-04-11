//Write a program to implement an algorithm to find the nth fibonacci number : 

package ChaitraChallenge;

import java.util.Scanner;

public class Day20 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter the value of n: ");
	    int n = scanner.nextInt();
	    int fibo1 = 0, fibo2 = 1, fibo3 = 0;
	    for (int i = 2; i <= n; i++) {
	        fibo3 = fibo1 + fibo2;
	        fibo1 = fibo2;
	        fibo2 = fibo3;
	    }
	    System.out.println("The " + n + "th Fibonacci number is " + fibo3);
	}
}
