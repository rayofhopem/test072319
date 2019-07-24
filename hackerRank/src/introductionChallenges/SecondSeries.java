package introductionChallenges;

import java.util.Scanner;

public class SecondSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int testcases = s.nextInt();

		for (int i = 0; i < testcases; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();

			int final_v = a;

			for (int k = 0; k < n; k++) {

				final_v += (Math.pow(2, k) * b);

				System.out.print(final_v + " ");
			}
		}
		s.close();

	}

}
