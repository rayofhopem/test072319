package impConcepts;

public class Student {
	
	private int StudentRollNumber;
	private String name;
	
	//constructor
	public Student(int StudentRollNumber,String name)
	
	{
		this.StudentRollNumber=StudentRollNumber;
		this.name = name ;
	}
	
	
	
	
	
	

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudentRollNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
*/





	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudentRollNumber != other.StudentRollNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/






	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Student s1 = new Student(1000, "Abhilash");
		Student s2 = new Student(2000, "Mrunalini");
		Student s3 = new Student(2000, "Mrunalini");
		
		Student s4 = s3;
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		
		System.out.println();
		
		//System.out.println(s3==s4);
		//System.out.println(s3.equals(s4));
		System.out.println();
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
*/
		
		//String s1 = "Mrunalini";
		//String s2 = "Mrunalini";
		
		
		String s1 = new String("Mrunalini");
		String s2 = new String ("Mrunalini");
		
		
		System.out.println(s1.equals(s2));
		//System.out.println(s1.hashCode() + " " + s2.hashCode() );
		System.out.println(s1==s2);
		//System.out.println(s1 + " " + s2);
		//
		
		//System.out.println(s2.hashCode());
	}

}
