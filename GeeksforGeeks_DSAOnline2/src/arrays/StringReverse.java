package arrays;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		String inputString = "mrunalini";

		char[] inputArray = inputString.toCharArray();

		int size = inputArray.length;

		ReverseString(inputArray, size, 0, size - 1);
		for (int i = 0; i < size-1; i ++)
		{
			System.out.print(inputArray[i] + " ");
		}

	}

	static void ReverseString(char[] inputArray, int size, int i, int j) {

		char temp;
		int low =0;
		int high =( size -1);
		while (low < high)
		{
			temp =  inputArray[low];
		    inputArray[low]	= inputArray[high];
		    inputArray[high]  =  temp;
		    low ++;
		    high --;
		}
		

	}

}
