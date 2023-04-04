package Exam;
//Q22. WJP to convert int to string

import java.util.Scanner;

public class Q22ConvertsIntToString {

	public static void main(String[] args) {
	
						
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer ");
    	 int n = sc.nextInt();
    	 
		System.out.println("Before converting : "+(n+10));//As n is integer 10 is added
		
		//converting to String
		String s=String.valueOf(n);
		System.out.println("After converting : "+(s+10));
		
        sc.close();

	}

}
