// Write a Program to find volume of sphere and cylinder.

package ChaitraChallenge;

import java.util.Scanner;

public class Day04 {

	public static void main(String[] args) {
		
		int radius;
		int height;  
		double Volume;
	    double pie=3.14285714286;  
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Volume of Sphere-------");
		System.out.println("Enter radius of Sphere : ");
		radius = sc.nextInt();
		
		Volume=(4.0/3.0)*pie*(radius*radius*radius);  
		System.out.println("Volume of the Sphere is : "+Volume);
		System.out.println("*********************************");
		
		System.out.println("---------Volume of Cylinder-------");
		System.out.println("Enter radius and height of Cylinder : ");
		radius = sc.nextInt();
		height = sc.nextInt();
		
		Volume=pie*(radius*radius)*height;  
		System.out.println("Volume of the cylinder is : "+Volume);  
	}
}
