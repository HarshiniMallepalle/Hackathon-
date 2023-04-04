package Exam;
//Q28. WJP to find factorial of a number using recursion

import java.util.Scanner;
public class Q28FactorialRecursive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		long factorial=fact(num);
		System.out.println("Factorial of "+num +" is : "+factorial);
		sc.close();
	}
		public static long fact(int n) {
			
			if (n>=1) {
				return n*fact(n-1);
			}
			else {
				return 1;
			}
				
	}


}
