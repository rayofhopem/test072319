package slidingWindowTechVariants;

public class MaxSumSubArray {
	
	public static int findMaxSumSubarray(int[] arr, int k)
	{
		int currentRunningSum = 0;
		int maxValue = Integer.MIN_VALUE;
		for (int i =0; i < arr.length; i++)
		{
			currentRunningSum = currentRunningSum + arr[i];
			if(i>=k-1)
			{
				maxValue = Math.max(maxValue, currentRunningSum);
				currentRunningSum = currentRunningSum -  (arr[i-(k-1)]);
			}
		}
		return maxValue;
	}

	public static void main(String[] args) 
	{
		
    System.out.println(findMaxSumSubarray(new int[] {1, 2, 2, 3, 4, 5}, 3));
    
	}

}
