//Take a character and print whether the character is uppercase or lowercase or number or special character:

package ChaitraChallenge;

import java.io.*;

public class Day19 {

		public static void Test(char ch){
			if (Character.isUpperCase(ch)) {
				System.out.println(ch + " is an upperCase character");
			}else if (Character.isLowerCase(ch)) {
				System.out.println(ch + " is a lowerCase character");
			}else if (Character.isDigit(ch)) {
				System.out.println(ch + " is a digit");
			}else {
				System.out.println(ch + " is a special character");
			}
		}

		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the character : ");
			char ch = (char)br.read();
			Test(ch);
	}
}
