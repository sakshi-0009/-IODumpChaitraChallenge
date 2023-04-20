//Implement a function that takes a string as a input and returns the minimum number of insertions required to make the string a palindrome:

package ChaitraChallenge;

import java.util.*;

public class Day26 {
	static int findMinInsertions(char str[], int l,int h){
		if (l > h) return Integer.MAX_VALUE;
		if (l == h) return 0;
		if (l == h - 1) return (str[l] == str[h])? 0 : 1;

		return (str[l] == str[h])?
			findMinInsertions(str, l + 1, h - 1):
			(Integer.min(findMinInsertions(str, l, h - 1),
			findMinInsertions(str, l + 1, h)) + 1);
	}

	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String : ");
		String str= sc.next();
		System.out.println(findMinInsertions(str.toCharArray(),0, str.length()-1));
	}
}
