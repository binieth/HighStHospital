package hospitalEmployeePatient;

public abstract class Employee {
	
	public abstract int calculatePay();

	

	// creating variables or instance field.
	private String employeeName;
	private double employeeIdNumber;
	private String employmentPosition;

	// generating constructor:
	public Employee(String employeeName, double employeeIdNumber, String employmentPosition) {

		this.employeeName = employeeName;
		this.employeeIdNumber = employeeIdNumber;
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
@Override
public String toString() {
	return employeeName + " ," + employeeIdNumber + " ," + employmentPosition;
}

}
