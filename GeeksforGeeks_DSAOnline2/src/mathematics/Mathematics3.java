package mathematics;

import java.io.*;
import java.util.*;

public class Mathematics3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while ( T--> 0)
		
		{
	    Quadratic obj = new Quadratic();
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		obj.quadraticRoots(a, b, c);
		System.out.println();
			
			
	}

}
}

class Quadratic 
{
    public void quadraticRoots(int a,int b,int c)
    {
        int d;
        d = ((b*b )-(4*a*c) / (2* a));
        System.out.println(d);
    }
}
