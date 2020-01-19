package junit.test.example02.employeedetails;

public class EmployeeBusinessLogic {
	//calculate the yearly salary of employee
	public int calculateYearlySalary(EmployeeDetails details) {
		return details.getMonthelySalary() * 12;
	}
	
	//calculate the appraisal amount of the employee
	public int calculateAppraisal(EmployeeDetails employeeDetails) {
		int appraisal = 0;
		if(employeeDetails.getMonthelySalary() < 1000) {
			appraisal=500;
		}else {
			appraisal=1000;
		}
		return appraisal;
	}
}
