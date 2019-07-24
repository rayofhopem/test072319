package algoExpert;

//naive method 
//with Time Complexity of  O(2^n) and Space Complexity of O(n)
public class GetFibonacci_recursion {

	// {0,1,1, 2, 3, 5, 8, 13, 21, 34}

	public static int Fib(int n)
	{
	
	if (n  == 2)
	{
	return 1;
	}
	else if (n == 1)
	{
	return 0;
	}
	else if (n>2)
	{
	return Fib(n-1) + Fib(n-2);
	}
	return Fib(n-1) + Fib(n-2);
	
	
	}
	

	public static void main(String[] args) 
	{

		//System.out.println(GetFibonacci.Fib(1));
		//System.out.println(GetFibonacci.Fib(2));
		System.out.println(GetFibonacci_recursion.Fib(5));

	}

}


