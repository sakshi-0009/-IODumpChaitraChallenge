// Write a program that takes two matrices as input and returns the product of the matrices

package ChaitraChallenge;

import java.util.Scanner;

public class Day27 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter the number of rows in the first matrix: ");
	    int rows1 = sc.nextInt();
	    System.out.print("Enter the number of columns in the first matrix: ");
	    int cols1 = sc.nextInt();

	    System.out.print("Enter the number of rows in the second matrix: ");
	    int rows2 = sc.nextInt();
	    System.out.print("Enter the number of columns in the second matrix: ");
	    int cols2 = sc.nextInt();

	    if (cols1 != rows2) {
	        System.out.println("Matrix multiplication is not possible!");
	        return;
	    }
	    int[][] matrix1 = new int[rows1][cols1];
	    int[][] matrix2 = new int[rows2][cols2];
	    int[][] result = new int[rows1][cols2];

	    System.out.println("Enter the values for the first matrix:");
	    for (int i = 0; i < rows1; i++) {
	        for (int j = 0; j < cols1; j++) {
	            matrix1[i][j] = sc.nextInt();
	        }
	    }
	    System.out.println("Enter the values for the second matrix:");
	    for (int i = 0; i < rows2; i++) {
	        for (int j = 0; j < cols2; j++) {
	            matrix2[i][j] = sc.nextInt();
	        }
	    }
	    for (int i = 0; i < rows1; i++) {
	        for (int j = 0; j < cols2; j++) {
	             for (int k = 0; k < cols1; k++) {
	                result[i][j] += matrix1[i][k] * matrix2[k][j];
	            }
	        }
	    }
	    System.out.println("Result:");
	    for (int i = 0; i < rows1; i++) {
	        for (int j = 0; j < cols2; j++) {
	            System.out.print(result[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}
