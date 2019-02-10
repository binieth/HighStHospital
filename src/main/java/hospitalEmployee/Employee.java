package hospitalEmployee;

public abstract class Employee {
	
	public abstract int calculatePay();
	public abstract String toString();
	

	// creating variables or instance field.
	private String employeeName;
	private int employeeIdNumber;
	private String employmentPosition;

	// generating constructor:
	public Employee(String employeeName, int employeeIdNumber, String employmentPosition) {

		this.employeeName = employeeName;
		this.employeeIdNumber = employeeIdNumber;
		this.employmentPosition = employmentPosition;
	}

	// constructing get method. 
	public String getEmployeeName() {
		return employeeName;
	}

	
	public int getEmployeeIdNumber() {
		return employeeIdNumber;
	}

	
	public String getEmploymentPosition() {
		return employmentPosition;
	}


}
