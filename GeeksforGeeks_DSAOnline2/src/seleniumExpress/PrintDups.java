package seleniumExpress;

public class PrintDups {
	
	static final int no_of_chars = 256;
	
	static void fillCharCounts(String inputString, int[] count )
	{
		for (int i=0; i<inputString.length(); i++)
		{
			count[inputString.charAt(i)]++;
			
		}
	}
	
	static void printdups(String inputString)
	{
		int[] count = new int[no_of_chars];
		fillCharCounts(inputString, count);
		
		for(int i=0;i<no_of_chars; i++)
		{
			if(count[i]>1)
				System.out.printf("%c,  count = %d \n", i,  count[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputString = "test string";
        		
        printdups(inputString);
        
	}

}
