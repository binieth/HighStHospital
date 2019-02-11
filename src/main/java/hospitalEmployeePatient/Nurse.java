package hospitalEmployeePatient;

public class Nurse extends Employee implements DrawBlood, CareForPatient {

	public Nurse(String employeeName, int employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
	}
	

	@Override
	public int calculatePay() {
		return 50000;
	}

	@Override
	public void careForPatient(Patient patientName) {
		patientName.increaseHealth(2);
		patientName.increaseBlood(2);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(1);
	}

	@Override
	public String toString() {
		return getEmploymentPosition() + " " + getPatientName() + " " + getEmployeeIdNumber();
	}


	@Override
	protected Object getPatientName() {
		// TODO Auto-generated method stub
		return null;
	}
}
