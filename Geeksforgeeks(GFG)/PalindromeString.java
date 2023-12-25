/*
Program to check whether the Entered string is Palindrome or Not.
Time Complexity: O(Length of S)
Auxiliary Space: O(1)
*/

import java.util.Scanner;

public class PalindromeString {
    public static int isPalindrome(String str) {
        // Initialize two pointers
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Check the character at index '0' equals to at index length-1.
            // If it's not then return 0
            if (str.charAt(start) != str.charAt(end)) {
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("Enter any String: ");
        str = sc.next();
        sc.close();

        int result = isPalindrome(str);

        if (result == 1) {
            System.out.println("The Entered String is a Palindrome String.");
        } else {
            System.out.println("The Entered isn't a Palindrome String.");
        }
    }
}
