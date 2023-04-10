// Write a program to sort the elements in the list/array in ascending order.

package ChaitraChallenge;

import java.util.Arrays;

public class Day18 {
    public static void main(String[] args) {
        int[] arr = {28, 25, 90, 12, 56, 62};
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(sortedArr);
        
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }
}