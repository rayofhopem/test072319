package arrays;

public class MaxOfTwo {
	
	public static int getMaxOfTwo(int[] inputArray)
	{
		int max = Integer.MIN_VALUE;
		for (int i=0, j = 1; i< inputArray.length-1 && j <inputArray.length; i++, j++)
		{
			max = Math.max(inputArray[i], inputArray[j]);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArray = new int[]{1, 2, 2, 3, 4, 5};
		System.out.println(getMaxOfTwo(inputArray));
	}

}
