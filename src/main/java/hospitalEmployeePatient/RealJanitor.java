package hospitalEmployeePatient;

public class RealJanitor extends Janitor implements SweepingHospital {
	
	private boolean mainTaskStatus;

	public RealJanitor(String employeeName, int employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		this.mainTaskStatus = true;
	}
	
	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}
	
	public void toggleMainTaskStatus() {
		mainTaskStatus = !mainTaskStatus;
	}

	@Override
	public int calculatePay() {
		return 40000;
	}

	@Override
	public String toString() {
		return getEmploymentPosition() + " " + getPatientName() + " " + getEmployeeIdNumber() + " " + mainTaskStatus;
	}

	@Override
	public void sweepHospital(Hospital hospital) {
		hospital.getHospitalCleaner(10);
	}

	@Override
	protected Object getPatientName() {
		
		return null;
	}
}
