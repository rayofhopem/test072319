package arraylist;

import java.util.ArrayList;

public class Arraylist2 {
	
	

	public static void main(String[] args) {
		int n =3;
		ArrayList<Integer> [] al2 = new ArrayList[n];
		
		for (int i = 0; i < n ; i++)
		{
			al2[i]= new ArrayList<Integer>();
		}
		
		al2[0].add(0);
		al2[0].add(1);
		al2[0].add(2);
		al2[0].add(3);
		al2[0].add(4);
		
	//	System.out.println();
		al2[1].add(1);
		al2[1].add(2);
		al2[1].add(3);
		al2[1].add(4);
		al2[1].add(5);
		//System.out.println();
		al2[2].add(2);
		al2[2].add(3);
		al2[2].add(4);
		al2[2].add(5);
		al2[2].add(6);
		
		for(int i =0; i<n; i ++)
		{
			for (int j = 0;j< al2[i].size(); j++)
			{
				System.out.print(al2[i].get(j) + " ");
			}
			
			System.out.println();
		}
		
			
		
		

	}

}
