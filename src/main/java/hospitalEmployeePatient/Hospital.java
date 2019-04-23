/*
 * Hospital has Patients and Employees
 * since its a physical place its cleanliness level changes. Thus, you create a job for the Janitor.
 */

package hospitalEmployeePatient;

import java.util.HashMap;

public class Hospital {

	// creating the HashMap where the patient and the employees reside.

	private HashMap<String, Employee> employees = new HashMap<String, Employee>();
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

	public HashMap<String, Employee> getEmployees() {
		return employees;
	}
	public HashMap<String, Patient> getPatients() {
		return patients;
	}
		
	//public Hospital() {	
//		}


	// Generating a Variable to Set a perfect cleanliness Status for the Hospital

	private int preferedcleanliness = 100;

	public int getpreferedCleanliness() {
		return preferedcleanliness;
	}

	// in order to determine how clean the hospital is i have to have a scale:
	public void getHospitalCleaner(int i) {
		preferedcleanliness += i;
	}

	public void getHospitalDirtier(int i) {
		preferedcleanliness -= i;
	}

	// need to determine the employee number and patient number as follows:
	public int getHospitalEmployeeSize() {
		return employees.size();
	}

	public int getHospitalPatientSize() {
		return patients.size();
	}

	public void getEmployeeNames() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.getEmployeeName());
		}
	}

	public void getPatientNames() {
		for (Patient patient : patients.values()) {
			System.out.println(patient.getPatientName());
		}
	}

	public Patient findPatient(String patientName) {
		return patients.get(patientName);
	}

	public void addEmployee(Employee employee) {
		employees.put((String) employee.getEmployeeName(), employee);
	}

	public void removeEmployee(Employee employee) {
		employees.remove(employee.getEmployeeName());
	}

	public void addPatient(Patient patientName) {
		patients.put(((Patient) patientName).getPatientName(), patientName);
	}

	public void listAllSalaries() {
		for (Employee employee : employees.values()) {
			System.out.println(employee.getEmployeeName() + " " + "$" + employee.calculatePay());
		}
	}

	public void tick() {
		
		
	}

	public void tickAllPatients() {
		
		
	}

	public Patient findPatient(Patient patientName) {
		
		return patientName;
	}

}
