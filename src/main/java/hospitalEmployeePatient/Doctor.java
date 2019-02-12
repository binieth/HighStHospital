/*
 * Doctors 
 */

package hospitalEmployeePatient;

public class Doctor extends Employee implements DrawBlood, CareForPatient {
	
	private String specialty;
	
	public Doctor(String employeeName, int employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		
		//this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public String toString() {
		return getEmploymentPosition() + " " + getPatientName() + " " + getEmployeeIdNumber() + " " + specialty;
	}
	
	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealth(3);	
		patient.increaseBlood(2);
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

