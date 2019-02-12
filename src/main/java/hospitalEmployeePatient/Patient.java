
 /* In this package i will be working on the patient class:
 * Hospital Patients has the following information:- Name, health Level of 10, and healthy blood level of 20.
 */

package hospitalEmployeePatient;

public class Patient {

	// establishing variables in relate to the patient.
	private String patientName;
	public int bloodLevel;
	public int healthLevel;
	private int patientTick;

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

	public void AverageNormalBloodLevel(int i) { // CBC: Complete Blood Count Normal Range is b/n 13-17 for men.
		bloodLevel -= i;
	}

	public void ImprovingHealthStatus(int i) {
		healthLevel += i;
	}

	public String toString() {
		return patientName + " " + bloodLevel + " " + "and" + " " + healthLevel;
	}
	
	public void tick() {
		decreaseHealth(1);
		lowerBloodLevel(1);
		
		
	}
	private void decreaseHealth(int i) {
		
		
	}

	public int getTick() {
		
		return patientTick;
	}
		

	public void increaseHealth(int i) {
		
		
	}

	public void increaseBlood(int i) {
		
	}

	public void lowerBloodLevel(int i) {
		
	}
}
