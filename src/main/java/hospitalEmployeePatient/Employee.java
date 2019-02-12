package hospitalEmployeePatient;

public abstract class Employee {
	
	public abstract int calculatePay();
	public abstract String toString();
	

	// creating variables or instance field.
	private String employeeName;
	private double employeeIdNumber;
	private String employmentPosition;

	// generating constructor:
	public Employee(String employeeName, double employeeIdNumber2, String employmentPosition) {

		this.employeeName = employeeName;
		this.employeeIdNumber = employeeIdNumber2;
		this.employmentPosition = employmentPosition;
	}

	// constructing get method. 
	public String getEmployeeName() {
		return employeeName;
	}

	
	public double getEmployeeIdNumber() {
		return employeeIdNumber;
	}

	
	public String getEmploymentPosition() {
		return employmentPosition;
	}
	protected abstract Object getPatientName();


}
