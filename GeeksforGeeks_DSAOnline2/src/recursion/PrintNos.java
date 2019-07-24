package recursion;

import java.util.Scanner;

public class PrintNos {

	/*
	 * public static String printNos(int n) { if (n<=1) return "1";
	 * 
	 * 
	 * 
	 * return printNos( n-1) + " " + n;
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { Scanner s = new
	 * Scanner(System.in);
	 * 
	 * int n = s.nextInt(); System.out.println(PrintNos.printNos(n)); s.close();
	 * 
	 * }
	 */
	// **************************************************
	/*
	 * public static void printNos(int n) 
	 * 
	 * { if (n>0) { printNos( n-1);
	 * System.out.print(n + " "); 
	 * 
	 * }
	 * 
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { Scanner s = new
	 * Scanner(System.in);
	 * 
	 * int n = s.nextInt(); PrintNos.printNos(n); s.close();
	 * 
	 * }
	 */
	/////////////////////////////////////////////////////////////////

	/*public static int printNos(int n) {
		if (n <= 1)
			return 1;

		else {
			System.out.print(n + " ");

			return  printNos(n - 1);
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		PrintNos.printNos(n);
		s.close();

	}*/
}
