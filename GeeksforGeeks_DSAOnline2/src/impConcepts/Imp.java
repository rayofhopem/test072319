package impConcepts;

public class Imp {

	public static void main(String[] args) {
	
		String obj1 = new String("Mrunalini");
		String obj2 = new String("Mrunalini1");
		// System.out.println(obj1==obj2);
		// System.out.println(obj1.equals(obj2));
		
//		String s3 ="Nina";
//		String s4 = "Ninas";
//		System.out.println(s3==s4);
//		System.out.println(s3.equals(s4));

		
		String s1 = "Sanjay";
		String s2 = new String("Reddy");
		System.out.println(s2.intern());
		String s3= s1.concat(s2);
		//System.out.println(s3);
		//System.out.println(s2);
		s1.hashCode();
		
	}

}
