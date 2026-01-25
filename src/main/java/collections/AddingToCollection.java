package main.java.collections;

import java.util.HashSet;
import java.util.Set;


class Employee {
	private String empName;
	public Employee(String empName) {
		this.empName = empName;
	}
	
	public String getEmployeeName() {
		return empName;
	}
	
	public boolean equals(Employee anoEmp) {
		if(anoEmp == this) {
			return true;
		}
		if(anoEmp.getEmployeeName().equals(this.getEmployeeName())) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.empName.hashCode();
	}
	
	public String toString() {
		return "Employee Name = " + this.empName;
	}
}


public class AddingToCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee e1 = new Employee("Antony");
		Employee e2 = new Employee("Antony"); //e1
		
		if(e1 == e2) {
			System.out.println("Both employee objects have the same ref.");
		} else {
			System.out.println("Both employee objects does not have the same ref.");
		}
		
		if(e1.equals(e2)){
			System.out.println("Both employee objects are equal");
		}
		
		Set<Employee> empSet = new HashSet<Employee>();
		//since i am using HashSet I have to override the main.java.hashcode method
		//to get desired results.
		empSet.add(e1);
		empSet.add(e2);
		
		System.out.println("Contents in Employee Set = " + empSet);
	
	}

}
