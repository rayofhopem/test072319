package mathematics;


	// Initial Template for Java
	/*package whatever //do not write package name here */
	import java.io.*;
	import java.util.*;
	class Mathematics1 {
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	       
	        int T = sc.nextInt();
	        
	        while (T > 0) {
	            int I = sc.nextInt();
	            Absolute obj = new Absolute();
	            System.out.println(obj.absolute(I));
	            T--;
	        }
	    }
	}

	

	/*Please note that it's Function problem i.e.
	you need to write your solution in the form of Function(s) only.
	Driver Code to call/invoke your function is mentioned above.*/

	// User function Template for Java
	class Absolute {
	    // You need to complete this function
	    public int absolute(int I) {
	        // Your code here
	        if (I<0)
	        return -(I);
	        else
	        return I;
	    }
	}