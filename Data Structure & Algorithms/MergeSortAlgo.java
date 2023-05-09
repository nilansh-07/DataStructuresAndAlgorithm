/* 
 
Merge sort is a popular sorting algorithm that uses a divide-and-conquer approach to sort a list of elements. It works by recursively dividing the list into halves until the sub-lists contain only one element. Then, it merges the sub-lists back together in a sorted order until the entire list is sorted.

To implement merge sort, the following steps are typically followed:
1. Divide the unsorted list into two halves.
2. Recursively sort each half using merge sort.
3. Merge the sorted halves back together into a single sorted list. This is done by comparing the first elements of each half and selecting the smaller element to add to the new list, and repeating this process until all elements have been added.

The time complexity of merge sort is O(n log n), where n is the number of elements in the list. This makes merge sort faster than other sorting algorithms such as bubble sort and insertion sort, especially for large lists. Merge sort is also a stable sorting algorithm, meaning that it preserves the relative order of equal elements in the sorted list.

One potential disadvantage of merge sort is that it requires additional memory to store the sub-lists during the sorting process. However, this can be mitigated by using an in-place merge sort or by using external sorting techniques for large data sets.

*/
class MergeSortAlgo
{
	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int [n1];
		int R[] = new int [n2];

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int arr[], int l, int r)
	{
		if (l < r)
		{
			// Find the middle point
			int m = (l+r)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr , m+1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	/* Driver method */
	public static void main(String args[])
	{
		int arr[] = {12, 11, 13, 5, 6, 7};

		System.out.println("The given Array is:");
		printArray(arr);

		MergeSortAlgo ob = new MergeSortAlgo();
		ob.sort(arr, 0, arr.length-1);

		System.out.println("The Sorted array is:");
		printArray(arr);
	}
}

