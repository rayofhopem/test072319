package algoExpert;

import java.util.HashMap;

//O(n) time and O(n) 
public class GetFibonacci_Recursionmemoize {

	public static int getFib(int n) {
		HashMap<Integer, Integer> memoize = new HashMap<Integer, Integer>();
		memoize.put(1, 0);
		memoize.put(2, 1);
		return getNthFib(n, memoize);
	}

	public static int getNthFib(int n, HashMap<Integer, Integer> memoize) {
		if(memoize.containsKey(n))
		{
			return memoize.get(n);
		}
			else
			{
				memoize.put(n, getNthFib(n-1,memoize) + getNthFib(n-2,memoize));
			    return memoize.get(n);
			}
		}
	
	
	public static void main (String[] args)
	{
		//System.out.println(GetFibonacci_Recursionmemoize.getFib(5));
		
		
		String name = "mrunalini";
		String name1= name.substring(0, name.length()-1);
		System.out.println(name1);
		
		char lastChar = name.charAt(name.length() - 1);
		System.out.println(lastChar);
		
	}
		
	}


