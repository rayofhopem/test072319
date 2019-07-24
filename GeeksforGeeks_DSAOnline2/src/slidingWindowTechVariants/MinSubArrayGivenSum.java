package slidingWindowTechVariants;
//sliding window problems https://gist.github.com/Schachte/87d7c0165a584f26b3ad7845f8010387
public class MinSubArrayGivenSum {
	
	public static int SmallestSubArraySumGiven(int[] arr, int TargetSum)
	{
		int minWindowSize = Integer.MAX_VALUE;
		int currentWindowSum = 0;
		int windowStart =0;
		for (int windowEnd = 0; windowEnd < arr.length; windowEnd++)
		{
			currentWindowSum = currentWindowSum + arr[windowEnd];
			while (currentWindowSum >= TargetSum)
			{
				minWindowSize = Math.min(minWindowSize, windowEnd- windowStart+1);
				currentWindowSum = currentWindowSum - arr[windowStart];
				windowStart++;
			}
		}
		return minWindowSize ;
	}

	public static void main(String[] args) {
		int[] arr = new int[]{4,2,2,7,8,1,2,8,10};
		int GivenSum = 8;
		System.out.println(SmallestSubArraySumGiven(arr, GivenSum));
		

	}

}
