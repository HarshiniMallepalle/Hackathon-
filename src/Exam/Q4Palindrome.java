package Exam;
//Given an array of integers check the Palindrome of the series.
import java.util.Scanner;
public class Q4Palindrome {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the no. of Values :");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values.");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		palindrome(arr);
		s.close();
	}
		//int[] arr = {454,696,454,323,569,828};
		//n=arr.length;
	
	static void palindrome(int[] array) {
	int sum,temp,r;
	int n=array.length;
		for(int i=0; i<n;i++) {
			System.out.println(array[i]);
			sum=0;
			temp=array[i];
		while(array[i]>0) {
			r=array[i]%10;
			sum=(sum*10)+r;
			array[i]=array[i]/10;
		}
		if(temp==sum) {
			System.out.println(" Given no. is Palindrome  ");
		}else {
			System.out.println("Given no. is not Palindrome ");

		}
		}
	
	
}
		

}

