package org.emp;

public class Employee {
	private void empId() {
		System.out.println("Employee information");
	}

	private void empId(String name) {
System.out.println("Employee name is "+name);
	}
//short showing error
	private void empId(int id) {
		System.out.println("Employee id is "+id);

	}
	private void empId(char c) {
		System.out.println("Employee malr or femail "+c);

	}
	private void empId(float weight) {
		System.out.println("Employee weight is "+weight);

	}
	public static void main(String[] args) {
		Employee t = new Employee();
		t.empId();
		t.empId("kumar");
		t.empId(456);
		t.empId('m');
		t.empId(78.98f);
	}
}
