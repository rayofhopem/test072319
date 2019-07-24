package arrays;

import java.util.Scanner;

public class Arrays_majority_frequency 
{

	public int Array_major(int[] arr, int size, int x, int y) 
	{
		int counter_x = 0;
		int counter_y = 0;

		for (int i = 0; i < size; i++) 
		{
			if (arr[i] == x) 
			{
				counter_x++;
			}

			if (arr[i] == y) 
			{
				counter_y++;
			}

		}

		if (counter_x > counter_y)
			return x;

		else if (counter_y > counter_x)
			return y;
		else 
			return Math.min(x, y);

	}


	

	public static void main(String[] args) 
	{
		Arrays_majority_frequency obj1 = new Arrays_majority_frequency();
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) 
		{
			int x = s.nextInt();
			arr[i] = x;
		}
		int x = s.nextInt();
		int y = s.nextInt();

		System.out.println(obj1.Array_major(arr, size, x, y));
		s.close();
	}

}
