package interviewCake;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PermutationString {
	

	//method or function to get Permutations of a given inputString
	public static Set<String> getPermutations(String inputString)
	{
		if (inputString.length()<=1)
		{
			return new HashSet<>(Collections.singletonList(inputString));
		}
		
		String allCharsExceptLast = inputString.substring(0, inputString.length()-1);
		char LastChar =  inputString.charAt(inputString.length()-1);
		
		
		//recursive call: get all possible permutations for all chars except last
		Set<String>  permutationsOfAllCharsExceptLast = getPermutations(allCharsExceptLast);
		
		//put the last char in all possible positions for each of the above permutations 
		 Set<String> permutations = new HashSet<>();
		 for (String permutationOfAllCharsExceptLast :permutationsOfAllCharsExceptLast)
		 {
			 for(int position = 0; position<= allCharsExceptLast.length(); position++)
			 {
				 String permutation = permutationOfAllCharsExceptLast.substring(0, position)+ LastChar
			      + permutationOfAllCharsExceptLast.substring(position);
				 permutations.add(permutation);
				 
				 
			 }
		 }
		
			
		return permutations;

	}
	
	public static void main(String[] args) 
	{
		System.out.println(PermutationString.getPermutations("ca"));
	}
	
	
	

}
