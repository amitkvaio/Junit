package junit.test.example02.employeedetails;

public class EmployeeDetails {
	private String name;
	private int monthelySalary;
	private int age;

	public EmployeeDetails(String name, int monthlySalary, int age) {
		this.name = name;
		this.monthelySalary = monthlySalary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getMonthelySalary() {
		return monthelySalary;
	}

	public int getAge() {
		return age;
	}

}
