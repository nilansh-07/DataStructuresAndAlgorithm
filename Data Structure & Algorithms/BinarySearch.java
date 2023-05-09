/*
 
Binary search is a popular algorithmic technique used for searching a sorted array or list of elements efficiently. It works by repeatedly dividing the search interval in half, based on a comparison with a target value, until the target value is found or the search interval is empty. 

To implement binary search, the following steps are typically followed:
1. Choose the middle element of the array or list as the pivot.
2. Compare the target value with the pivot element. If the target is smaller, then search in the left half of the array; if it is larger, then search in the right half.
3. Repeat the above step until the target is found or the search interval is empty.

The time complexity of binary search is O(log n), where n is the number of elements in the array or list. This is much faster than linear search which has a time complexity of O(n) in the worst case. However, binary search requires the array or list to be sorted beforehand.

 */



import java.util.Scanner;

class BinarySearch {
    public static void bSearch(int arr[], int first, int last, int val) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < val) {
                first = mid + 1;
            } else if (arr[mid] == val) {
                System.out.println("Element is " + val + " and found at index:" + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not Found!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int last = arr.length;

        System.out.print("Enter the value which you want to Search:");
        int val = sc.nextInt();

        bSearch(arr, 0, last, val);

    }
}
