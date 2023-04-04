package Exam;

import java.util.Scanner;
import java.util.TreeSet;

//Q27. WJP to perform ascending order Quick sort

public class Q27QuickSortAscending {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the size :");
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		int n=scan.nextInt(); 
		System.out.println("Enter the values :");
		 for(int i=0;i<n;i++)
		 { 
		  ts.add(scan.nextInt()); 
		 } 
		 
			System.out.println("Prints in ascending order.");
		  for (Integer val : ts) 
			  System.out.println(val); 
	     scan.close();	  
	}

}
