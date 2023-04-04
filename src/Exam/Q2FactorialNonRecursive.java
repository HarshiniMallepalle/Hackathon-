package Exam;

import java.util.Scanner;

//write a program to find factorial (Non Recursive)

public class Q2FactorialNonRecursive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.");
		int a = s.nextInt();
		long f = factorial(a);
		System.out.println("Factorial!" + " : " + f);
		s.close();
	}

	static long factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
