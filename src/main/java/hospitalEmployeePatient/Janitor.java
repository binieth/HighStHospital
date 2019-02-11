package hospitalEmployeePatient;

public abstract class Janitor extends Employee {
	
	private boolean mainTaskStatus;
	
	public Janitor(String employeeName, int employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		this.mainTaskStatus = false;
	}

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public void toggleWorkStatus() {
		mainTaskStatus = !mainTaskStatus;
	}	
}