/*
 * Program to find the Third Largest element in array.
 * 
 * Time Complexity:O(n) where n is the number of elements
 * Space Complexity:O(1), which is constant space.

Explanation:

1.The algorithm iterates through the array once, examining each element exactly once.
2.During each iteration, there are constant-time operations (comparisons and updates) for each element.
3.The size of these variables does not depend on the size of the input array; they remain the same regardless of the number of elements in the array.

*/

import java.util.Scanner;

public class ThirdLargestElement {
    public static int thirdLargest(int[] arr, int size) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        if (size < 3) {
            return -1;
        } else {
            for (int i = 0; i < size; i++) {
                if (arr[i] > firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = firstLargest;
                    firstLargest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                    thirdLargest = secondLargest;
                    secondLargest = arr[i];
                } else if (arr[i] > thirdLargest && arr[i] != firstLargest && arr[i] != secondLargest) {
                    thirdLargest = arr[i];
                }
            }
        }
        if (thirdLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are equal.");
            return -1;
        }

        return thirdLargest;
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
        if (thirdLargest(arr, size) != -1) {
            System.out.println("The third largest element is: " + thirdLargest(arr, size));
        }
    }
}
