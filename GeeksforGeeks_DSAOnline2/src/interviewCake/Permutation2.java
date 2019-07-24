package interviewCake;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
	
	public static List<List<Integer>> generate_permutations(List<Integer> A) 
	{
	    List<List<Integer>> permutations = new ArrayList<>();
	    if (A.size() <= 1) 
	    {
	        permutations.add(A);
	        return permutations;
	    }
	    Integer first = A.get(A.size() - 1);
	    List<Integer> remaining = A.subList(0, 1);
	    List<List<Integer>> result = generate_permutations(remaining);
	    for (int i = 0; i < permutations.size(); i++) 
	    {
	        for (int j = 0; j < A.size(); j++) 
	        {
	            List<Integer> copy = new ArrayList<>(permutations.get(i));
	            copy.add(j, first);
	            permutations.add(copy);
	        }
	    }
	    return permutations;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] InputArray = { 1, 2, 3, 4, 5 };
		List<Integer> InputList = new ArrayList<>(InputArray. length);
		 System.out.println(Permutation2.generate_permutations( InputList));
	}

}
