// Write a Program to find the area of a triangle, rectangle, and square.

package ChaitraChallenge;

import java.util.Scanner;

public class Day03 {

	public static void main(String[] args) {
		
		int a,b,c;
		double area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Area of Triangle-------");
		System.out.println("Enter three sides of triangle : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		area = ((0.25)*(Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))));
		System.out.println("Area of Triangle is : "+area);
		System.out.println("*********************************");

		
		System.out.println("---------Area of Rectangle-------");
		System.out.println("Enter Two sides of rectangle : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		area = (a*b);
		System.out.println("Area of Rectangle is : "+area);
		System.out.println("*********************************");
		
		System.out.println("----------Area of Square--------");
		System.out.println("Enter side of square : ");
		a = sc.nextInt();
		
		area = (a*a);
		System.out.println("Area of Square is : "+area);
	}
}
