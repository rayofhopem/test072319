package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo_Max_of_Kelements {
	
	
	static void maximumSum(int sizeOfArray, int arr[]){
		
		for (int i =0; i < sizeOfArray-1; i++)
		{
			int window_sum =0;
			int max_sum = window_sum;
			if(i==0)
			{
				window_sum = arr[i]+ arr[i+1];
				max_sum = window_sum;
				//System.out.println("window_sum is" +  window_sum );
				//System.out.println("max_sum is" +  max_sum );
			}
			else if (i>0)
			{
				
				max_sum = window_sum;
				window_sum = arr[i]+ arr[i+1]- arr[i-1];
				
				max_sum = Math.max(window_sum, max_sum);
				
				
			}
			
			System.out.print(max_sum);
			
			
		}
		 
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
int testcases = Integer.parseInt(br.readLine());

while (testcases-->0)
{
	int sizeOfArray = Integer.parseInt(br.readLine());
	int[] arr = new int[sizeOfArray];
	
	String line  = br.readLine();
	String[] elements = line.trim().split("\\s+");
	for (int index=0; index<sizeOfArray; index++)
	{
		arr[index] = Integer.parseInt(elements[index]);
	}
	
	Demo_Max_of_Kelements obj = new Demo_Max_of_Kelements();
	obj.maximumSum(sizeOfArray, arr);
	System.out.println();
}
	
	}
}
