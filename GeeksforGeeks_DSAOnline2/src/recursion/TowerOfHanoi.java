package recursion;

public class TowerOfHanoi {
	
	
	/*
	 * public static void Hanoi(int n, char from, char to, char aux) {
	 * 
	 * 
	 * if(n==1) 
	 * { 
	 * System.out.println("Move disk 1 from rod " + from + " to rod " + to);
	 * 
	 * return; 
	 * } 
	 * 
	 * 
	 * {
	 *  Hanoi( n-1, from, aux, to);
	 * 
	 * System.out.println("Move disk " + n + " from rod " + from + " to rod " +
	 * to);
	 * 
	 * Hanoi(n-1, aux, to, from); 
	 * 
	 * }
	 * 
	 * }
	 */
	
	public long moves=1;
    public void toh(int n, int from, int to, int aux, long moves) 
    {
        //base case
        if(n==1)
        {
        	
        	System.out.println(" Move disk 1 from rod " +  from + " to rod " + to); 
        	//moves++;
            //importance of return statement;
            return;
		}
		else
        {
		
		//aux = 6-to-1;
		toh(n-1, from, aux, to, moves);
		
		System.out.println(" Move disk " + n + " from rod " + from + " to rod " + to);
		moves++;
		
		toh(n-1, aux, to, from, moves);
		
	
        }
		
    }

	public static void main(String[] args) 
	{
	
		TowerOfHanoi obj = new TowerOfHanoi();
		
		//obj.toh(2, 1, 3, 2, obj.moves);
		//System.out.println();
		obj.toh(3, 1, 3, 2, obj.moves);
				
		
		
	}

}
