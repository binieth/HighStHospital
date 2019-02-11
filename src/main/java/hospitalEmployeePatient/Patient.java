/*
 * In this package i will be working on the patient class:
 * Hospital Patients has the following information:- Name, health Level of 10, and healthy blood level of 20.
 */

package hospitalEmployeePatient;

public class Patient {

	// establishing variables in relate to the patient.
	private String patientName;
	public int bloodLevel;
	public int healthLevel;

	// Generating Constructor using the field above:

	public Patient(String patientName, int bloodLevel, int healthLevel) {
		super();
		this.patientName = patientName;
		this.bloodLevel = 20;
		this.healthLevel = 10;
	}

	// constructing getter methods:-

	public String getPatientName() {
		return patientName;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	// creating a method to help determine the blood level and health status.

	public void AverageNormalBloodLevel(int CBC) { // CBC: Complete Blood Count Normal Range is b/n 13-17 for men.
		bloodLevel -= CBC;
	}

	public void ImprovingHealthStatus(int HS) {
		healthLevel += HS;
	}

	public String toString() {
		return patientName + "'s " + " " + bloodLevel + " " + "and" + " " + healthLevel;
	}

	public void increaseHealth(int HS) {
		
		
	}

	public void increaseBlood(int IBL) {
		
	}

	public void lowerBloodLevel(int LBL) {
		
	}
}
