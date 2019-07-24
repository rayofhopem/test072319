package impConcepts;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {

		// Object type
		Employee emp1 = new Employee(10);
		Employee emp2 = new Employee(10);

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));

		/*
		 * Map<Employee, String> map1 = new HashMap<Employee, String>();
		 * map1.put(emp1, "Mrunalini"); map1.put(emp2, "Mrunalini");
		 * System.out.println(map1.size());
		 * 
		 * 
		 * //primitive type Integer int1 = new Integer(1); Integer int2 = new
		 * Integer(1);
		 * 
		 * //System.out.println(int1==int2);
		 * //System.out.println(int1.equals(int2));
		 * 
		 * Map<Integer, String> map2 = new HashMap<Integer, String>();
		 * map2.put(int1, "one"); map2.put(int2, "one");
		 * 
		 * //System.out.println(map2.size());
		 * 
		 * //System.out.println(map1.hashCode() );
		 * //System.out.println(map2.hashCode()); }
		 */

	}
}

	class Employee {
		int EmployeeId;

		public Employee(int EmployeeId) {
			this.EmployeeId = EmployeeId;
		}

		/*@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + EmployeeId;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (EmployeeId != other.EmployeeId)
				return false;
			return true;
		}*/

		/*
		 * @Override public boolean equals(Object obj) { // TODO Auto-generated
		 * method stub return super.equals(obj); }
		 */

		/*
		 * @Override public boolean equals(Object obj) {
		 * 
		 * Employee otherEmployee = (Employee)obj; if
		 * (this.equals(otherEmployee)) return (this == obj); //return false; }
		 */

	}
