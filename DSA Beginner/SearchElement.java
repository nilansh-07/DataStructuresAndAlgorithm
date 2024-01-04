/*
 * Program to search a element in the array.
 */

import java.util.Scanner;

public class SearchElement {

    public static int search(int[] arr, int size, int x) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        if (size < 1) {
            System.out.println("Please enter a valid size:");
            return;
        }
        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be search:");
        int x = sc.nextInt();
        sc.close();

        int result = search(arr, size, x);

        if (result == -1) {
            System.out.println("Element isn't present in the array.");
        } else {
            System.out.println("Element is present at the index: " + result);
        }
    }
}
