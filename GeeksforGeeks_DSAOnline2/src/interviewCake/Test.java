package interviewCake;

public class Test {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5}; 
		
		
		/*for (int i = 0; i<=(numbers.length)-1; i++)
		{
			System.out.print(numbers[i] + " " + "a" + " ");
		}*/
		
		for (int i : numbers)
		{
			for (int position =0;  position<=(numbers.length)-1; position++)
			{
				System.out.print(numbers[i] + " " + "a" + " ");
			}
		}

	}

}
