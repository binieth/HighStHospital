package hospitalEmployeePatient;

public class VampireJanitor extends Janitor implements DrawBlood, SweepingHospital {

	boolean mainTaskStatus;
	boolean bloodSucking;

	public VampireJanitor(String employeeName, int employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		
		this.bloodSucking = false;
		this.mainTaskStatus = false;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(2);
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
		hospital.getHospitalCleaner(5);
	}

	@Override
	protected Object getPatientName() {
		
		return null;
	}
}
