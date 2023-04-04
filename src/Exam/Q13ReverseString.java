package Exam;

import java.util.Scanner;

//Q13. Given a string print the reverse of the string.(Input:  Java Code Output: edoC avaJ)

public class Q13ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String.");
    	String a=sc.nextLine();
		int n = a.length();
		
        for(int i=(n-1);i>=0;i--) {
     	System.out.print(a.charAt(i));
        }
        sc.close();
	}

}
