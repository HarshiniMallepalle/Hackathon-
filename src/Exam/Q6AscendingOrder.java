package Exam;
//Q6.WJP to perform ascending order Selection  sort

import java.util.Scanner;

public class Q6AscendingOrder {

	public static void main(String[] args) {
		
		   Scanner s = new Scanner(System.in);
		   System.out.println("Enter the size of Array :");
		   int n=s.nextInt();
		   int array[]=new int[n]; 
		   System.out.println("Enter the values : ");
		   for(int i=0; i<n; i++) {
				  array[i]= s.nextInt();
			   }
		//int array[]= {9,5,3,4,5,9,6,3};
		sortAscending(array);
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

	}


