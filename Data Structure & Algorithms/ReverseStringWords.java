/*
Program to Reverse the words of a String.
Time Complexity: O(|S|)
Auxiliary Space: O(|S|)
 */

import java.util.Scanner;
public class ReverseStringWords {
    public static String reverseWords(String str) {

        // The split("\\.") method uses a regular expression, and \\. is used to escape
        // the dot.
        String[] words = str.split("\\.");

        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }
        // This line joins the reversed words back together into a single string using
        // dots as separators and returns the result.
        return String.join(".", words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("Enter any String with dots: ");
        str = sc.next();
        sc.close();

        System.out.println("The Reversed Words are: " + reverseWords(str));
    }
}
