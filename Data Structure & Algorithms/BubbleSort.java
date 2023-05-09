/*
 
Bubble sort is a simple sorting algorithm that repeatedly steps through a list of elements, compares adjacent elements and swaps them if they are in the wrong order. It is called "bubble" sort because smaller elements gradually "bubble" to the top of the list.

To implement bubble sort, the following steps are typically followed:
1. Start with the first element in the list and compare it with the next element.
2. If the first element is larger than the next element, swap them.
3. Move to the next pair of adjacent elements and repeat step 2.
4. Continue the process until no more swaps are needed.

The time complexity of bubble sort is O(n^2), where n is the number of elements in the list. This makes bubble sort less efficient than other sorting algorithms such as quicksort and mergesort. However, bubble sort is simple to understand and implement, making it useful for small lists or as a teaching tool for basic sorting algorithms.

 */
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.print("Enter the Size of Array:");
        size = sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the Elements into the Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("The Sorted Array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
