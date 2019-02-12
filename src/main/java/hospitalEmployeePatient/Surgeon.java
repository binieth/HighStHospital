package hospitalEmployeePatient;

public class Surgeon extends Doctor implements DrawBlood, CareForPatient {

	private boolean mainTaskStatus;
	private String specialty;
	
	public Surgeon(String employeeName, double employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		this.mainTaskStatus = false;
		this.specialty = "surgeon";
	}
	


	public boolean getMainTaskStatus() {
		return mainTaskStatus;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	@Override
	public int calculatePay() {
		return 120000;
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(5);	
		patient.increaseBlood(3);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(4);
	}
	
//	@Override
//	public String toString() {
//		return getEmploymentPosition() + " " + getPatientName() + " " + getEmployeeIdNumber() + " " + getMainTaskStatus();	
//	}
}
	