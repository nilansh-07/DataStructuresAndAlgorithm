/*

Linear search, also known as sequential search, is a simple algorithm for finding a target value within a list or array of elements. It checks each element in the list sequentially until the target value is found or the end of the list is reached.

To implement linear search, the following steps are typically followed:
1. Start at the beginning of the list.
2. Check each element in the list sequentially until the target value is found or the end of the list is reached.
3. If the target value is found, return its index in the list. Otherwise, return a value indicating that the target value is not in the list.

The time complexity of linear search is O(n), where n is the number of elements in the list. This means that the time required to perform a linear search increases linearly with the size of the list. Linear search is a useful algorithm for small lists or when the elements are not sorted in any particular order. However, for larger lists, more efficient search algorithms such as binary search may be more appropriate.

 */

import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the Size of Array:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you have to find:");
        int ele = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                System.out.println("The Element is present at index: " + i);
                return;
            }
            else{
                System.out.println("Element isn't present in the array");
                return;
            }
            
        }
    }
}