package seleniumExpress;

import java.util.HashMap;


public class PrintDuplicate {

	public static void main(String[] args) {

	
		PrintDuplicate.findDuplicateWord("I am am learning java java");
	}

	 static void findDuplicateWord(String str) 
	{
		HashMap<String, Integer> hm = new HashMap<>();
		String[] ss = str.split(" ");

		for (String tempString : ss) 
		{
			if (hm.get(tempString) != null) 
			{
				hm.put(tempString, hm.get(tempString)+1);
			} 
			else 
			{
				hm.put(tempString, 1);
			}
		}
		System.out.println(hm);
	}

}
