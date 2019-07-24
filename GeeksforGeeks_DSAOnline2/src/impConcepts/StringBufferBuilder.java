package impConcepts;

public class StringBufferBuilder {

	public static void main(String[] args) {

		String first = "Welcome";
		//System.out.println(first + "Mrunalini");
		String second = new String("Welcome");
		//System.out.println(second);
		//System.out.println(second + " Mrunalini");

		//mutable, synchronised, thread safe , hence slow
		StringBuffer sb = new StringBuffer("Welcome");
	    //System.out.println(sb + " mrunalini");
		
		//mutable, not synchronised, faster than StringBuffer
		StringBuilder sbu = new StringBuilder("Welcome");
		System.out.println(sbu + " Malini");

	}

}
