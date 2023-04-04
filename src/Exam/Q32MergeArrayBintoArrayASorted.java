package Exam;
import java.util.Scanner;
import java.util.TreeSet;

//Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B.
//     Write a method to merge B into A in sorted order.   

public class Q32MergeArrayBintoArrayASorted {

	public static void main(String[] args) {
		
		//Integer n[]=new Integer[] {5,8,3,71,1};
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter the size for array A:");
		
		TreeSet<Integer> A = new TreeSet<Integer>();
		int n=scan.nextInt(); 
		System.out.println("Enter the values for array A :");
		 for(int i=0;i<n;i++) 
		 { 
		  A.add(scan.nextInt()); 
		 } 
		System.out.println("A---------------------------------------");
		// System.out.println(A);

		  for (Object val : A) {
			  System.out.println(val); 
			  }
		 
		System.out.println("Enter the size for array B:");

		TreeSet<Integer> B = new TreeSet<Integer>();
		int num=scan.nextInt(); 
		System.out.println("Enter the values for array B :");
		 for(int i=0;i<num;i++) 
		 { 
		  B.add(scan.nextInt()); 
		 } 
		 
		System.out.println("B-------------------------------------------");
		// System.out.println(B);
		for (Object val : B) {
			System.out.println(val);
		}

		A.addAll(B);
		System.out.println("B added to A---------------------------------");
		// System.out.println(A);

		for (Object val : A) {
			System.out.println(val);
		}
		scan.close();
	}

}
