package recursion;
//modular exponentiation concept
public class PowerOfNumbers {

	int power(int N, int R) {
		int p;
		long q;
		int x = 1000000007;
		if (R == 0) {
			return 1;
		}

		if (R % 2 == 0) {
			q = ((long) (power(N, R / 2) % x) * (power(N, R / 2) % x)) % x;
			//if (q < 0)
				//q = (q + x) % x;
			p = (int) q;
			return p;
		} else {
			q = (((long) (N % x) * (power(N, R - 1) % x)) % x);
			//if (q < 0)
				//q = (q + x) % x;
			p = (int) q;
			return p;
		}
	}
	
	public static void main(String[] args)
	{
		PowerOfNumbers obj = new PowerOfNumbers();
		long output = obj.power(21,0);
		System.out.println(output);
	}
}//311668616
