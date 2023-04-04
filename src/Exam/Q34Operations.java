package Exam;
//Q34. Write a method to implement *, - , / operations. You should use only the + operator

import java.util.Scanner;
public class Q34Operations {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value for multiplication :");
//		int m1 = s.nextInt();
//		System.out.println("Enter the value for multiplication:");
//		int m2 = s.nextInt();
//		System.out.println("Enter the value  for subtraction :");
//		int s1 = s.nextInt();
//		System.out.println("Enter the value for subtraction :");
//		int s2 = s.nextInt();
		System.out.println("Enter the value for division :");
		int d1 = s.nextInt();
		System.out.println("Enter the value for division :");
		int d2 = s.nextInt();
//		int x = multiply(m1, m2);
//		System.out.println("Multiplication of two nos. is :" + x);
//		int y = substract(s1, s2);
//		System.out.println("Sub of two nos. is : " + y);
		int z = divide(d1, d2);
		System.out.println("Division of two nos. is : " + z);
		s.close();
	}
	public static int multiply(int a, int b) {
		int multiplier = (a < b ? a : b);// The syntax of the Java ternary operator is as follows:
											// (condition) ? (return if true) : (return if false);
		int multiplicant = (multiplier == a ? b : a);
		int result = 0;
		for (int i = 0; i < multiplier; i = i + 1) {
			result = result + multiplicant;
		}
		return result;
	}

	public static int substract(int a, int b) {
		return a + (~b + 1);// bitwise complement of N equals -(N+1) i.e ~N = -(N+1)
	}

	public static int divide(int a, int b) {
		if (a == b)
			return 1;
		int result = 1;
		int mul = b;
		while ( a>= b) {
			mul = mul + b;
			result = result + 1;
		}
		return result;
	}
}
