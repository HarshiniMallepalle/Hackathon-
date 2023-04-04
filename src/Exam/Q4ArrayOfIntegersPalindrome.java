package Exam;
//Given an array of integers check the Palindrome of the series.

import java.util.Arrays;

public class Q4ArrayOfIntegersPalindrome {

	public static void main(String args[]) {
		int[] b = { 5, 6, 9, 6, 6 };
		int n = b.length;
		int[] newb = new int[n];

		for (int i = 0; i < n; i++)
			newb[i] = b[i];

		System.out.println("Given array b is       : " + Arrays.toString(b));
		System.out.println("Before reverse newb is : "+Arrays.toString(newb));

		for (int k = 0; k < b.length / 2; k++) {
			int temp = newb[k];
			newb[k] = newb[newb.length - k - 1];
			newb[newb.length - k - 1] = temp;
		}

		System.out.print("Reversed array newb is : " + Arrays.toString(newb));
		System.out.println(" ");

		if (Arrays.equals(newb, b) == true) {
			System.out.println("Given Array is Palindrome");
		} else
			System.out.println("Given Array is not Palidrome");

	}

}
