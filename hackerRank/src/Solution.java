
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'winner' function below.
	 *
	 * The function is expected to return a STRING. The function accepts
	 * following parameters: 1. STRING erica 2. STRING bob
	 */

	public static String winner(String erica, String bob) 
	{
		// Write your code here

		char[] E = erica.toCharArray();
		char[] B = bob.toCharArray();
		int maxE = 0;
		int maxB = 0;
		for (int i = 0; i < E.length; i++) 
		{
			// int maxE =0;
			if (E[i] == 'E')
				maxE = 1;
			else if (E[i] == 'M')
				maxE = 3;
			else if (E[i] == 'H')
				maxE = 5;
			maxE++;

		}
		for (int j = 0; j < B.length; j++) 
		{
			// int maxB =0;
			if (B[j] == 'E')
				maxB = 1;
			else if (B[j] == 'M')
				maxB = 3;
			else if (B[j] == 'H')
				maxB = 5;
			maxB++;

		}

		// int maxScore = Math.max(maxE, maxB);
		if (maxE > maxB)
			return "Erica is the winner";
		else
			return "Bob is the winner";

	}
}



public class Solution {
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Please enter ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String erica = bufferedReader.readLine();

		String bob = bufferedReader.readLine();
		System.out.println(erica + "" + bob);

		String result = Result.winner(erica, bob);
		//System.out.println(result);
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
	// Scanner sc = new Scanner(System.in);
	// String erica = sc.next();
	// String bob = sc.next();
	//
	// String result = Result.winner(erica, bob);
	// System.out.println(result);


