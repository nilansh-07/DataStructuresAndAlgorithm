/*
 * Program to find the Second largest element in the array.
 * 
 * Time Complexity:O(n) where n is the number of elements
 * Space Complexity:O(1), which is constant space.

Explanation:

1.The algorithm iterates through the array once, examining each element exactly once.
2.During each iteration, there are constant-time operations (comparisons and updates) for each element.
3.The size of these variables does not depend on the size of the input array; they remain the same regardless of the number of elements in the array.
 */

import java.util.Scanner;

public class SecondLargestElement {
    public static int secondLargest(int[] arr, int size) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (size < 2) {
            System.out.println("Enter a valid size (Size should be at least 2).");
            return -1;
        } else {
            for (int i = 0; i < size; i++) {
                if (arr[i] > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are equal.");
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements in the Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int result = secondLargest(arr, size);
        if (result != -1) {
            System.out.println("The Second Largest element is: " + result);
        }
    }
}
