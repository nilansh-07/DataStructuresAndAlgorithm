import java.util.Scanner;

public class ReverseString {
    static String reverseWord(String s) {
        // Convert the String to character array
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }

        // Convert the char array back to string
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String:");

        String str = sc.next();
        sc.close();

        System.out.println("The Reversed String is:" + reverseWord(str));
    }
}