package Exam;
//Q26. WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10	 
// array2[4] =  3, 5,7,8		After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10

import java.util.Scanner;
import java.util.TreeSet;

public class Q26MergeArrays {

	public static void main(String[] args) {
		
				Scanner scan=new Scanner(System.in); 
				System.out.println("Enter the size for array1 as 10:");
				
				TreeSet<Integer> array1 = new TreeSet<Integer>();
				int n=scan.nextInt(); 
				System.out.println("Enter the values for array1 :");
				 for(int i=0;i<6;i++) //small trick to take only 6 inputs but size is 10 as per requirment.
				 { 
				  array1.add(scan.nextInt()); 
				 } 
				System.out.println("Array1---------------------------------------");
				// System.out.println(array1);

				  for (Object val : array1) {
					  System.out.println(val); 
					  }
				 
				System.out.println("Enter the size for array2 as 4:");

				TreeSet<Integer> array2 = new TreeSet<Integer>();
				int num=scan.nextInt(); 
				System.out.println("Enter the values for array2 :");
				 for(int i=0;i<num;i++) 
				 { 
				  array2.add(scan.nextInt()); 
				 } 
				 
				System.out.println("Array2-------------------------------------------");
				// System.out.println(array2);
				for (Object val : array2) {
					System.out.println(val);
				}

				array1.addAll(array2);
				System.out.println("Array2 added to Array1---------------------------------");
				// System.out.println(A);

				for (Object val : array1) {
					System.out.println(val);
				}
				scan.close();
			}

  }
