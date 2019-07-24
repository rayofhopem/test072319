package arrays;

import java.util.Scanner;

/*int low = 0;
       int high = sizeOfArray - 1;
       
       while(low < high){
           
           int temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           
           low++;
           high--;*/
public class ArrayReverse {

	public static void reverseArray(int[] arr, int sizeOfArray) {
		

			int low = 0;
			int high = sizeOfArray - 1;
			while (low < high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;

				low++;
				high--;
			}
			
		}

	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();

		int sizeOfArray = s.nextInt();

		int[] arr = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) {
			int x;
			arr[i] = s.nextInt();

		}

		ArrayReverse.reverseArray(arr, sizeOfArray);
		for (int i = 0; i < sizeOfArray; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
