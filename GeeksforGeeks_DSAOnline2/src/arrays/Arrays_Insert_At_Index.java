package arrays;

import java.util.Scanner;

public class Arrays_Insert_At_Index {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sizeofArray = s.nextInt();
		System.out.println("size of array is " + sizeofArray);

		int[] array = new int[sizeofArray];

		for (int i = 0; i < sizeofArray - 1; i++) {
			int x;
			x = s.nextInt();

			array[i] = x;
			// System.out.print(array[i] + " ");
		}

		Arrays_Insert_At_Index obj1 = new Arrays_Insert_At_Index();
		int index = s.nextInt();
		System.out.println("index is " + index);
		int element = s.nextInt();
		obj1.InsertAtIndex(array, sizeofArray, index, element);

		for (int i = 0; i < sizeofArray; i++) {
			System.out.print(array[i] + " ");
		}
		s.close();

	}

	// insertAtIndex() that takes arr, sizeOfArray, index, element as input.
	public void InsertAtIndex(int[] arr, int sizeOfArray, int index, int element) {

		for (int i = (sizeOfArray - 2); i >= index; i--) {

			arr[i + 1] = arr[i];

		}
		arr[index] = element;

	}

}
