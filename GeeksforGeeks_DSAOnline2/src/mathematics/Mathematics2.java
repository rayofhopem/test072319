package mathematics;


	//Initial Template for Java
	/*package whatever //do not write package name here */
	import java.io.*;
	import java.util.*;
	class Mathematics2 {
		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int T=sc.nextInt();
			while(T-->0)
			{
			    CelsiusToFahrenheit obj=new CelsiusToFahrenheit();
			    
			    int C;
			    C=sc.nextInt();
			    
			    System.out.println((int)obj.cToF(C));
			}
			
		}
	}

	

	/*Please note that it's Function problem i.e.
	you need to write your solution in the form of Function(s) only.
	Driver Code to call/invoke your function is mentioned above.*/

	//User function Template for Java
	class CelsiusToFahrenheit
	{
	    public double cToF(int C)
	    {
	        double F;
	        F = (C  *  9/5) + 32;
	        return F;
	    }
	}
