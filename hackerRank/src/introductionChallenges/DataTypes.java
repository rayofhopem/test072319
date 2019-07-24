package introductionChallenges;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int testCases = scan.nextInt();
		for (int i=0; i<testCases; i++)
		{
//			try
//			{
//				 long x =  scan.nextLong();
//			  System.out.println(x + " can be fitted in:");
//				 if(x>=-128 && x<=127)
//					 System.out.println("* byte");
//				  if(x>=-32768 && x<=32767)
//					 System.out.println(" * short");
//				 if(x>=-Math.pow(2, 31) && x<=Math.pow(2, 31)-1)
//					 System.out.println(" * int");
//				  if(x>=-Math.pow(2, 63) && x<=Math.pow(2, 63)-1)
//					 System.out.println(" * long");
//			}
//			catch (Exception e)
//			{
//				System.out.println(scan.nextInt() + " can't be fitted anywhere");
//			}
			try {
                long x = scan.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
		
		 
		 
		}
	}

}
