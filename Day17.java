//Write a program to check whether s is a substring of a str or not:

package ChaitraChallenge;

import java.util.Scanner;

public class Day17 {
    public static boolean isSubstring(String string, String s) {
        if (s.length() > string.length()) {
            return false;
        }
        if (string.substring(0, s.length()).equals(s)) {
            return true;
        }
        return isSubstring(string.substring(1), s);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String string = input.nextLine();
        System.out.print("Enter the substring to search: ");
        String s = input.nextLine();
        input.close();
        
        if (isSubstring(string, s)) {
            System.out.println(s + " is a substring of " + string);
        } else {
            System.out.println(s + " is not a substring of " + string);
        }
    }
}
