package arrays;

import java.util.Scanner;

public class Max1_2max {

	public static void FirstMax_SecondMax(int sizeOfArray, int arr[]) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		//int maxCounter =0;
		//int max2Counter =0;

		for (int i = 0; i < sizeOfArray; i++) 
		{
			if (arr[i] > max1)
			{
				max2 = max1;
				max1= arr[i];
			}
			else if ((arr[i] > max2) && (arr[i] != max1))
			{
				max2 = arr[i];
			}

		}

		System.out.println(max1 + " " +  max2);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sizeOfArray = s.nextInt();

		int[] arr = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) 
		{
			int x = s.nextInt();
			arr[i] = x;

		}

		Max1_2max.FirstMax_SecondMax(sizeOfArray, arr);

		s.close();

	}

}
