package org.simpliLearn;

class Employee{
	int eno;
	String name;
	
	//default constructor. Sets the values of instance variables to default values
	public Employee() {
	}

	//parameterized constructor which sets the values of the instance variables
	public Employee(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Employee number:"+eno);
		System.out.println("Employee name:"+name);
	}
	
}
public class Constructors {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(201,"Harish");
		e1.displayDetails();
		e2.displayDetails();
	}

}
