package binarySearch;

public class BasicSearch {
	
	static int basicBinarySerach(int t, int[]array)
	{
		int size = array.length;
		int low = 0;
		int high = size-1;
		while(low <=high)
		{
			int mid = (low +(high -low)/2);
			System.out.println("middle index is  " + mid);
			if ( array[mid]==t)
				return mid;
			if (array[mid] >t )
				high = mid-1;
			if (array[mid] < t)
				low = mid +1;
				
		}
		
		return -1;
	}

	public static void main(String[] args) {
		
		int[] array = new int[]{ 1, 2, 23, 45, 96, 234};
		
		int answerIndex = basicBinarySerach(96, array);
	
		if (answerIndex ==-1)
		
			System.out.println("the number is not found in the array");
		else 
			System.out.println("the number is found at index " + answerIndex);
		
			
	
		
		
		
		
		
		

	}

}
