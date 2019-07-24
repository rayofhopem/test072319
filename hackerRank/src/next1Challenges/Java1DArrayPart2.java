package next1Challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Java1DArrayPart2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int noOfQueries = scan.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		
		for (int row =0; row < noOfQueries ; row ++)
		{
			int n = scan.nextInt();
			int leap = scan.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			
			for (int j = 0; j < n ; j++)
			{
				int a =scan.nextInt();
				while((a ==0) || (a == 1 ))
				list.add(a);
				System.out.println("Please enter 0 or 1");
			}
			lists.add(list);
			
			Iterator<Integer> iterator = list.iterator();
			while (iterator.hasNext())
				System.out.print(iterator.next() + " ");
			
			System.out.println();
		}
		

	}

}
