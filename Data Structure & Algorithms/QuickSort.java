/*
 Quick sort is a popular sorting algorithm that uses a divide-and-conquer approach to sort an array. It works by selecting a "pivot" element from the array, and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then recursively sorted using the same process until the entire array is sorted.

Here are the basic steps for quick sort:

1. Choose a pivot element from the array.
2. Partition the array into two sub-arrays: elements less than the pivot, and elements greater than or equal to the pivot.
3. Recursively apply the same process to the sub-arrays until they are each of length 0 or 1.
4. Concatenate the sorted left sub-array, the pivot, and the sorted right sub-array to form the final sorted array.

The choice of pivot can greatly affect the efficiency of the quick sort algorithm, and various techniques are used to select the pivot element, such as selecting the first, last, or middle element of the array, or choosing a random element.

Quick sort has an average time complexity of O(n log n), making it a very efficient algorithm for sorting large datasets. However, it can have a worst-case time complexity of O(n^2) if the pivot element is chosen poorly, leading to inefficient partitioning. To avoid this, various optimization techniques such as choosing a median pivot or using three-way partitioning can be used.

 */
import java.util.Scanner;

public class QuickSort {
    /// Quick Sort function
    public static void sort(int arr[]) {
        quickSort(arr,0,arr.length-1);
    }

    // Quick Sort function
    public static void quickSort(int arr[],int low,int high){
        int i=low,j=high;
        int temp;
        int pivot=arr[(low+high)/2];

        // Partition

        while(i<=j){
            while(arr[i]<pivot)
            i++;
            while(arr[j]>pivot)
            j--;
            if(i<=j){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

        // Recursively sort lower half
        if(low<j)
        quickSort(arr,low,j);

        //Recursively sort upper half
        if(i<high)
        quickSort(arr,i,high);
    }

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
        sort(arr);
        System.out.print("The Elements After Sorting the Array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
