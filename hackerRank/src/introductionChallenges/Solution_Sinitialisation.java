package introductionChallenges;

import java.util.Scanner;

public class Solution_Sinitialisation {
	public static int B=0;
	public static int H=0;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 B = scan.nextInt();
		 H = scan.nextInt();
		 
		 if(B>=1 && H >=1)
		 {
			 int Area = B*H;
			 System.out.println(Area);
		 }
		 else
			 System.out.println("Please enter positive values for both B and H");
		
		 scan.close();

	}

}
