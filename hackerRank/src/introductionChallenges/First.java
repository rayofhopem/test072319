package introductionChallenges;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		 int N =s.nextInt();
		 
		 for (int i = 1; i <=10; i++)
		 {
			 System.out.println(N +" x " + i + " = "+ N*i);
			 
		 }
		 s.close();

	}

}
