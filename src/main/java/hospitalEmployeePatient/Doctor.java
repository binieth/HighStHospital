/*
 * Doctors 
 */

package hospitalEmployeePatient;

public class Doctor extends Employee implements CareForPatient, DrawBlood {
	
	private String specialty;
	private String employmentPosition;
	
	public Doctor(String employeeName, double employeeIdNumber, String employmentPosition) {
		
		super(employeeName, employeeIdNumber, employmentPosition );
		
		this.employmentPosition = employmentPosition;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
//	public String toString() {
//		return getEmploymentPosition() + " " + getPatientName() + " " + getEmployeeIdNumber() + " " + specialty;
//	}
//	
	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(2);	
		patient.increaseBlood(1);
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.lowerBloodLevel(2);	
	}

	@Override
	public int calculatePay() {
		return 90000;
	}

	@Override
	protected Object getPatientName() {
		
		return null;
	}
}

