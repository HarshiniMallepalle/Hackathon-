package Exam;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

//Q26. WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10	 
//array2[4] =  3, 5,7,8		After merge :  array1[10] = 1,2,3,4,5,6,7,8,9,10
public class Q26 {

	public static void main(String[] args) {
		int[] array1 = {1,2,4,6,9,10};	
		int[] array2 = {3, 5,7,8};
		int n=array1.length;
		ArrayList<Integer> list =new ArrayList<Integer>();
          for(int i=0;i<n;i++) {
        	  list.add(i,array1[i]);
          }
        	  int m=array2.length;
        	  for(int j=0;j<m;j++) {
        		  list.add(n,array2[j]);
        		  n++;
        	  }
        	  
          Collections.sort(list);
          for(Integer val:list) {  //for each should be object type only
        	  System.out.print(" ");
        	  System.out.print(val);
          }System.out.println();
          
          for(int k=0;k<list.size();k++)
        	  System.out.print(list.get(k));
        	  
	}

}
