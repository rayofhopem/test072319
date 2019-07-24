package binarySearch;

public class BinarySearchSmartIndex {

	static int getSmartIndex(int[] array, int low, int high) 
	{

		int middle_index = (low + (high - low) / 2);
		while (low <= high) {
			if (middle_index == array[middle_index])
				return middle_index;
			else if (middle_index > array[middle_index])

				return getSmartIndex(array, (middle_index + 1), high);
			// return findtheIndex(array, ( mid_index +1), end );

			else if (middle_index < array[middle_index])

				return getSmartIndex(array, low, (middle_index - 1));

		}
		return -1;

	}

	public static void main(String[] args) 
	{
		int[] sortedArray = new int[] { -20, -10, 0, 7, 5, 9 };
		int n = sortedArray.length;

		int smartIndex = getSmartIndex(sortedArray, 0, (n - 1));
		if (smartIndex == -1)
			System.out.println("smart Index is not found");
		else
			System.out.println("Smart Index found at " + smartIndex);

	}

}
