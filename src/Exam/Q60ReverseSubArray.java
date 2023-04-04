package Exam;
//Q 60. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be  based on var k. 
//Array = [3,2,4,7,0,3,1,5,8, 4]  k=3       OutPut = [4,2,3,3,0,7,8,5,1,4]

public class Q60ReverseSubArray {
  
		    // reverse every sub-array formed by consecutive k elements
		    static void reverse(int arr[], int n, int k)
		    {
		        for (int i = 0; i < n; i += k)//see increment is not i++ but i+k;
		        {
		            int left = i;
		           int right = Math.min(i + k - 1, n - 1);//min(int a, int b) returns smaller of a & b
		              int temp;
		            
		            // reverse the sub-array [left, right]
		            while (left < right)
		            {
		                temp=arr[left];
		                arr[left]=arr[right];
		                arr[right]=temp;
		                left+=1;
		                right-=1;
		            }
		        }
		    }
		     
		    public static void main(String[] args){
		    		         
		        int array[] = {3, 2, 4, 7, 0, 3, 1, 5, 8,4};
		        int k1 = 3;
		     
		        int n1 = array.length;
		     
		        reverse(array, n1, k1);
		     
	        	System.out.println("Reverse of every 3 nos. Sub Array.");
		        for (int i = 0; i < n1; i++)
		            System.out.print(array[i]+ " ");
		    }
	}
