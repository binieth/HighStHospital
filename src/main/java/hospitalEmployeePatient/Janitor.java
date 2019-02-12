package hospitalEmployeePatient;

public abstract class Janitor extends Employee {
	
	private boolean mainTaskStatus;
	
	public Janitor(String employeeName, double employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		//this.mainTaskStatus = true;
	}

	public void setMainTaskStatus(boolean mainTaskStatus) {
		this.mainTaskStatus = mainTaskStatus;
	}

	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public void toggleWorkStatus() {
		mainTaskStatus = !mainTaskStatus;
	}	
}