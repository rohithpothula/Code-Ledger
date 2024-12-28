package Streams;


public class Employee {
	
	private String firstName;
	private String lastName;
	private int salary;
	private String email;
	
	public Employee(String firstName, String lastName, int salary, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
