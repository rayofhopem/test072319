package next1Challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaArrayList2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		
		for (int row =0 ; row < n; row++)
		{
			
			
			//ArrayList<Integer> alTwo = new ArrayList<>(10);
			int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
			//alOne.add(a);
            
			
			for (int column = 0; column < d ; column ++)
			{
				list.add(scan.nextInt());
			}
			lists.add(list);
			
		}
		//scan.close();
		//System.out.println();
		int q = scan.nextInt();
		for (int i =0; i < q; i ++)
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			ArrayList<Integer> list = lists.get(x-1);
			if(y<=list.size())
			{
				System.out.println(list.get(y-1));
			}
			else
			{
				System.out.println("ERROR!");
			}
		}
		scan.close();
		
	}

}
