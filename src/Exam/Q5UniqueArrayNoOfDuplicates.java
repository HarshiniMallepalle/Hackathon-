package Exam;

//Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
public class Q5UniqueArrayNoOfDuplicates {

	public static void main(String[] args) {
		
			int counter[] = new int[256];  
			
			int[] arrint= {5,2,6,4,2,35,2,6,67,35};
			int len =arrint.length;
			// loop through the arrint and count frequency of every number and store it in counter array  
			for ( int i = 0; i < len; i++)   
			{  
			counter[(int) arrint[i]]++;  
			}  
			//print Frequency of Numbers  
			for (int j = 0; j < 256; j++)   
			{  
			if (counter[j] != 0)   
			{  
				if (counter[j] == 1)   

			//prints frequency of Numbers     
			System.out.println("Unique no.: "+(int)j+ " --> " + counter[j]); 
				if (counter[j] != 0 && counter[j] !=1)   
					System.out.println("Duplicate no.: "+(int) j + " --> " + counter[j]); 
			}  
		}	
	}
}
