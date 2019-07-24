package next1Challenges;

import java.util.Scanner;

public class JavaSubarray {

	public static int PrintNegSumSubArrayNum(int[] inputArray, int inputSize) {
		int counter = 0;

		for (int i = 0; i < inputSize; i++) {
			int currentRunningSum = 0;
			for (int k = i; k < inputSize; k++) {
				currentRunningSum += inputArray[k];
				if (currentRunningSum < 0) {
					counter++;

				}
			}
		}
		return (counter);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int inputSize = scan.nextInt();
		int[] inputArray = new int[inputSize];
		for (int i = 0; i < inputSize; i++) {

			inputArray[i] = scan.nextInt();

		}

		System.out.println(PrintNegSumSubArrayNum(inputArray,inputSize));
		scan.close();

	}

}
