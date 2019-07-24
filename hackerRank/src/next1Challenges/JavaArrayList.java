package next1Challenges;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaArrayList 
{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inputNoOfLines = scan.nextInt();

	    ArrayList<Integer> alist = new ArrayList<>();
	    
       
		for (int i = 0;i < inputNoOfLines; i++)
		{
			int a = scan.nextInt();
			alist.add(a) ;
			for (int j = 0; j < a; j++)
			{
				int b = scan.nextInt();
				alist.add(j,b);
			}
			
		}
	  //System.out.println(alist);
		scan.close();
		Iterator<Integer> itr = alist.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		
		//System.out.println(inputArray[i] + " ");

	}

}
