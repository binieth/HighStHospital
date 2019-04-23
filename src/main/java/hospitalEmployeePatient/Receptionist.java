/*
 * 
 * 
 * 
 */

package hospitalEmployeePatient;

public class Receptionist extends Employee {

	private Boolean mainTaskStatus;

	public Receptionist(String employeeName, double employeeIdNumber, String employmentPosition) {
		super(employeeName, employeeIdNumber, employmentPosition);
		this.mainTaskStatus = true;
	}

	public Boolean getMainTaskStatus() {
		return mainTaskStatus;
	}

	public void togglePhoneStatus() {
		mainTaskStatus = !mainTaskStatus;
	}

	@Override
	public int calculatePay() {
		return 45000;
	}

//	@Override
//	public String toString() {
//		return getEmploymentPosition() + " " + getEmployeeIdNumber() + " " + getEmployeeIdNumber() + " "
//				+ mainTaskStatus;
//	}

	@Override
	protected Object getPatientName() {
		 
		return null;
	}

}
