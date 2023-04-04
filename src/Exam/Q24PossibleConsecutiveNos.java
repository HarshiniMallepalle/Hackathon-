package Exam;
//Q24. Write a program which inputs a positive natural number N and prints the possible consecutive number combinations,
//which when added give N.    	INPUT:  N = 9  	OUTPUT:  4 + 5  		 2 + 3+ 4

import java.io.*;
import java.util.Scanner;
public class Q24PossibleConsecutiveNos {

	 public static void main(String args[])throws IOException{
        
//	            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//	            System.out.print("Enter a number : "); //inputting the number
//	            int n=Integer.parseInt(br.readLine());
	            
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number : ");
		 int n=s.nextInt();
	            
	            int sum=0,j=0;
	            for(int i=1;i<n;i++)
	            {
	                sum=i;
	                j=i+1;
	
	                while(sum<n)
	                {
	                    sum=sum+j;
	                    j++;
	                }

	                    if(sum==n)
	                    {
	                        for(int k=i;k<j;k++)
	                        {
	                            if(k==i)
	                                System.out.print(k);
	                            else
	                                System.out.print(" + "+k);
	                        }
	                     System.out.println();
	                    }//if sum !=n it goes back to for loop
	            }
	 s.close();       
	 }
	    
}

	 



