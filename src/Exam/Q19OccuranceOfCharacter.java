package Exam;
//Q19. WJP to display number of occurrence of all character
import java.util.Scanner;
public class Q19OccuranceOfCharacter {  

  	public static void main(String args[])  { 
		
	Scanner scanner = new Scanner(System.in);  
	System.out.print("Please enter a string: ");  
	String str = scanner.nextLine();  
	int len = str.length();  
	int counter[] = new int[256];  

	// loop through the string and count frequency of 
	//every character and store it in counter array  
	for ( int i = 0; i < len; i++)   
	{  
	counter[str.charAt(i)]++;  
	}  
	//print Frequency of characters  
	for (int i = 0; i < 256; i++)   
	{  
	if (counter[i] != 0)   
	{  
	//prints frequency of characters      
	System.out.println((char) i + " --> " + counter[i]);  
	}  
	} 
	scanner.close();
	}  
  	
}
