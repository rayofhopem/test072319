package algoExpert;

public class GetFibonacciIteration {
	
	public static int getNthFib(int n)
	{
		int[] lastTwo = { 0,1};
		int counter =3;
		while (counter <=n)
		{
			int nextFib =lastTwo[0] + lastTwo[1];
			lastTwo[0] = lastTwo[1];
			lastTwo[1] = nextFib;
			counter=+1;
		}
		return n>1?  lastTwo[1] : lastTwo[0];
	}

	public static void main(String[] args) {
		
System.out.println(GetFibonacciIteration.getNthFib(1));
	}

}
