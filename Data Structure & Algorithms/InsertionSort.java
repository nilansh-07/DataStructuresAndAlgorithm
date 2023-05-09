/*

Insertion sort is a simple sorting algorithm that builds the final sorted list one element at a time by inserting each new element into its proper place within the already sorted portion of the list. It works similarly to sorting a hand of playing cards.

To implement insertion sort, the following steps are typically followed:
1. Start with the second element in the list and compare it with the first element.
2. If the second element is smaller than the first element, swap them.
3. Move to the third element and compare it with the second element, then the first element.
4. If the third element is smaller than any of the previous elements, insert it into its proper place by shifting the larger elements one position to the right.
5. Repeat the above steps for all remaining elements in the list.

The time complexity of insertion sort is O(n^2), where n is the number of elements in the list. However, insertion sort has a best-case time complexity of O(n) when the list is already sorted or nearly sorted. Insertion sort is useful for small lists or as a building block for more complex sorting algorithms.

 */
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] >= key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("The Sorted Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
