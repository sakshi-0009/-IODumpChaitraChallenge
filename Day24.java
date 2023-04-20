//Write a program that takes a list of integers as input and returns a new list that contains only one element that appears more than once in the original list:

package ChaitraChallenge;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Day24 {

	static void printRepeating(int arr[], int n){
		Map<Integer, Integer> map
			= new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			try {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			catch (Exception e) {
				map.put(arr[i], 1);
			}
		}
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.print(e.getKey() + " ");
			}
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Array Size : ");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];
		
		System.out.println("Enter the values: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int n = arr.length;
		printRepeating(arr, n);
	}
}
