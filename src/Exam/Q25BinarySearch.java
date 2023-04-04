package Exam;

//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
public class Q25BinarySearch {

	public int binarySearch(int arr[], int x) {

		int low = 0, hi = arr.length - 1;
		while (low <= hi) {
			int m = (low + hi) / 2;//Binary search method formula but hi should be length-1;
			// Check if x is present at mid
			if (arr[m] == x)
				return m;
			// If x greater, ignore left half
			if (arr[m] < x)
				low = m + 1;//Binary search method formula

			// If x is smaller, ignore right half
			else
				hi = m - 1;//Binary search method formula
		}
                  // IF WHILE conditions fails it reach here.
		return -1;// if we reach here, then element was not present
	}

	public static void main(String args[]) {
		Q25BinarySearch ob = new Q25BinarySearch();
		int arr[] = { 2, 3,5,10,40};
		int x = 10;
		int result = ob.binarySearch(arr, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
