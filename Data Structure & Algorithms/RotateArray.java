/*
 Program to Rotate the array from a given point
 Time Complexity: O(N)
 Auxiliary Space: O(1)
 */

import java.util.Scanner;
public class RotateArray {
    // Time complexity of reversing the array is O(n).
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArray(int[] arr, int size, int d) {
        d = d % size;

        // Reversing the first d elements
        reverse(arr, 0, d - 1);

        // Reversing the remaining element
        reverse(arr, d, size - 1);

        // Reversing the entire array
        reverse(arr, 0, size - 1);

        System.out.print("Printing the Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the Elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the 'D' element:");
        int d = sc.nextInt();

        // Method calling
        rotateArray(arr, size, d);
    }
}
