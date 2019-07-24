package binarySearch;

public class SecondApproach {

	static int findtheIndex(int[]array, int start, int end )
	{
		if (start> end)
			return -1;
		int  mid_index = (start + end)/2;
	
		if   (mid_index == array[mid_index])
			return mid_index;
		if (mid_index > array[mid_index] )
			return findtheIndex(array, ( mid_index +1),  end );
		else return  findtheIndex(array, start,  (mid_index-1));
		
	}

	public static void main(String[] args) {

		int[] array2 = new int[] {1,9, 2,3,4,5,6};
		
		int n = array2.length;
		
		int index = findtheIndex(array2, 0, n-1);
		if (index==-1)
			System.out.println("no matching index");
		System.out.println("matching index is " + index);

	
		

	}

}
