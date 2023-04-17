//Write a program to find first non-repeating character in a string:

package ChaitraChallenge;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Day22 {

	public static Character firstNonRepeatingChar1(String str) {
	    Map<Character, Integer> charCount = new HashMap<>();
	    
	    for (char c : str.toCharArray()) {
	        if (charCount.containsKey(c)) {
	            charCount.put(c, charCount.get(c) + 1);
	        } else {
	            charCount.put(c, 1);
	        }
	    }
	    for (char c : str.toCharArray()) {
	        if (charCount.get(c) == 1) {
	            return c;
	        }
	    }
	    return null;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String : ");
		
		String str = br.readLine();
		Character firstNonRepeating = firstNonRepeatingChar1(str);
		
		if (firstNonRepeating != null) {
		    System.out.println("The first non-repeating character in the string is: " + firstNonRepeating);
		} else {
		    System.out.println("All characters in the string are repeating.");
		}
	}
}
