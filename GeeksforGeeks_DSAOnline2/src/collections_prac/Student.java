package collections_prac;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
	
	int student_roll_num;
	String student_Fname;
	String student_Lname;
	int student_marks;
	
	
//constructor using fields
	public Student(int student_roll_num, String student_Fname, String student_Lname, int student_Marks) {
		//super();
		this.student_roll_num = student_roll_num;
		this.student_Fname = student_Fname;
		this.student_Lname = student_Lname;
		this.student_marks = student_Marks;
	}

	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String toString() {
		return "Student [student_roll_num=" + student_roll_num + ", student_Fname=" + student_Fname + ", student_Lname="
				+ student_Lname + ", student_marks=" + student_marks + "]";
	}


	class SortByRoll implements Comparator<Student>
	{

		
		public int compare(Student o1, Student o2) 
		{
			
			return o1.student_roll_num - o2.student_roll_num;
		}
		
	}
	
	class SortByMarks implements Comparator<Student>
	{

		
		public int compare(Student o1, Student o2) 
		{
			
			return o1.student_marks - o2.student_marks;
		}
		
	}
	



	public static void main(String[] args) {
		
		
		//creating a student Array
		
		Student[] arr = {new Student(1, "Nina", "Vontala",  100), 
				        new Student(2, "Sanjay", "Vonatala",150),
				        new Student(3, "Nithya", "Mekala",  200),
				        new Student(0, "Aadrithi", "Chitty",500) };     
		
		System.out.println("The unsorted Student array is " );

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] );
			
		}
		Arrays.sort(arr, new Student(). new SortByRoll()); 
		  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<arr.length; i++) 
            System.out.println(arr[i]); 
        
        
       Arrays.sort(arr, new Student().new SortByMarks());
       System.out.println("Sorted by marks");
       for (int i = 0; i <arr.length; i++)
    	   System.out.println(arr[i]);
	}

}
