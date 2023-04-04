package Exam;

import java.util.Arrays;
//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.

public class Q25OtherWay {

	public static void main(String[] args) {
    int[] a= {3,1,7,6,9};
    int y=6;
    
    Arrays.sort(a);
	System.out.println("Sorted array is ");

    for(int val:a)
    	System.out.println(val);
    
    int find=Arrays.binarySearch(a, y);
    
    System.out.println("The vaue "+y+" is found at index "+find);
    
    //if the value is not found it returns random negative value
	}

}
