/*
 Selection sort is a simple sorting algorithm that sorts an array by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning. It works by dividing the array into two parts: sorted and unsorted. The sorted part is initially empty, and the unsorted part contains the entire array.

Here are the basic steps for selection sort:

1. Find the minimum element in the unsorted part of the array.
2. Swap the minimum element with the first element of the unsorted part.
3. Expand the sorted part to include the first element of the unsorted part.
4. Repeat steps 1-3 until the entire array is sorted.

Selection sort has a time complexity of O(n^2), which is not as efficient as other sorting algorithms like quick sort and merge sort. However, it has the advantage of being simple to implement and requires only a small amount of additional memory. It can be useful in situations where the input size is small or the data is nearly sorted.

 */
import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of Array:");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}