package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongestNeighbour {
	
	//static void maximumAdjacent(int sizeOfArray, int arr[])

	//method 1 naive this has O(n*k) time complexity; 
	/*{
		for(int i=0; i <sizeOfArray-1 ; i++)
		{
			int temp =0;
			if (arr[i] > arr[i+1])
				temp = arr[i];
			else
				temp = arr[i+1];
			
			System.out.print(temp + " ");
		}
	
	}*/
	////method 2 improved method  this has O(1) or linear time complexity;
	//below is same as the above , no change in time complexity.
	/*{
		//if (sizeOfArray >=2)
		//{
		for (int i =0 ; i < (sizeOfArray-1); i ++)
		{
			int wL= arr[i];
			int wU= arr[i+1];
			int wMax ;
			if (wL <wU)
				wMax = wU;
			else
				wMax = wL;
			System.out.print(wMax + " ");
		}*/
		
		//else 
		//	System.out.println("Please make sure you provide minimum 2 elements in your array");
	
	//below is the efficient method 
	/*{
	
		StringBuffer sb = new StringBuffer();
		for (int i=0, j=1; i < sizeOfArray-1 && j<sizeOfArray ; i++, j++)
		{
			
			sb.append( Math.max(arr[i],arr[j]) + " ");
			
		}
		System.out.println(sb);
		 
	}*/
	
	/*public static double maximumAdjacent(int sizeOfArray, int arr[], int k )
	{
		int sum=0;
		int maxSum = Integer.MIN_VALUE;
		for (int i=0; i<k; ++i)
		{
			//sum += arr[i];
			sum = sum + arr[i];
		}
		for (int i =k; i<=sizeOfArray; ++i)
		{
			maxSum = Math.max(maxSum, sum);
			if(i==sizeOfArray) break;
			sum -=arr[i-k];
			sum += arr[i];
		}
		
			return maxSum*1.0/k;
		
	}
	*/
	public static void getMaxOfTwo(int size, int[] inputArray)
	{
		//int max = Integer.MIN_VALUE;
		StringBuffer sb = new StringBuffer();
		for (int i=0, j = 1; i< size-1 && j <size; i++, j++)
		{
			sb.append( Math.max(inputArray[i], inputArray[j])+ " ");
		}
		System.out.println(sb);
	}


	

	public static void main(String[] args) throws IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
int testcases = Integer.parseInt(br.readLine());

while (testcases-->0)
{
	int sizeOfArray = Integer.parseInt(br.readLine());
	int[] arr = new int[sizeOfArray];
	
	String line  = br.readLine();
	String[] elements = line.trim().split("\\s+");
			//("\\p{Punct}");
			
	for (int index=0; index<sizeOfArray; index++)
	{
		arr[index] = Integer.parseInt(elements[index]);
	}
	StrongestNeighbour obj = new StrongestNeighbour();
	obj.getMaxOfTwo(sizeOfArray, arr);
	
}
	
	}

	

}
