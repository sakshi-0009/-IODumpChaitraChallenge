// Implement a function that takes a list of strings as input and returns a new list that contains all the strings with the first letter capitalized.

package ChaitraChallenge;

import java.util.*;

public class Day28 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
	    String str = sc.nextLine();

	    char[] charArray = str.toCharArray();
	    boolean foundSpace = true;

	    for(int i = 0; i < charArray.length; i++) {

	      if(Character.isLetter(charArray[i])) {

	        if(foundSpace) {

	          charArray[i] = Character.toUpperCase(charArray[i]);
	          foundSpace = false;
	        }
	      }
	      else {
	        foundSpace = true;
	      }
	    }
	    str = String.valueOf(charArray);
	    System.out.println("String: " + str);
	  }
}
