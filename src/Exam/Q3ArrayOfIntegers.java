package Exam;

import java.util.Scanner;

//Given an array of integers, sort the integer values.(BubbleSort)
public class Q3ArrayOfIntegers {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in);
		   System.out.println("Enter the size of Array :");
		   int n=s.nextInt();
		   int array[]=new int[n]; 
		   System.out.println("Enter the values : ");
		   for(int i=0; i<n; i++) {
				  array[i]= s.nextInt();
			   }
     //  int[] array= {5,6,89,2,6,78,5,88};
       sortAscending(array);
       sortDescending(array);
       s.close();
     }

	static void sortAscending(int[] arr) {
		int n = arr.length;// get the array size
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sort in Ascending order : ");
		for (int i = 0; i < n; i++) {
		System.out.println(arr[i]);
		}
	}

	static void sortDescending(int[] darr) {
		int n = darr.length;// get the array size
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (darr[j - 1] > darr[j]) {
					temp = darr[j - 1];
					darr[j - 1] = darr[j];
					darr[j] = temp;
				}
			}
		}
		System.out.println("Sort in Descending order : ");
		for (int i = n - 1; i >= 0; i--) {
		System.out.println(darr[i]);
		}
	}
}