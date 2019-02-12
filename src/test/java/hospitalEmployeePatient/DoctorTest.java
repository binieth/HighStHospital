/*
 * 
 */
package hospitalEmployeePatient;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoctorTest {

	Doctor doctorUnderTest;
	Patient patientUnderTest;

	@Before
	public void setup() {
		doctorUnderTest = new Doctor("Elshaday", 001, "Doctor");
		patientUnderTest = new Patient("Liya", 20, 10);
	}

	@Test 
	public void shouldDrawBloodFromPatient() {
		int bloodLevelBefore = patientUnderTest.getBloodLevel();
		doctorUnderTest.drawBlood(patientUnderTest);
		int bloodLevelAfter = patientUnderTest.getBloodLevel();
		assertEquals(bloodLevelAfter, bloodLevelBefore);
	}
	@Test
	public void shouldCareForPatient() {
		int healthBefore = patientUnderTest.getHealthLevel();
		doctorUnderTest.careForPatient(patientUnderTest);
		int healthAfterCare = patientUnderTest.getHealthLevel();
		assertEquals(healthAfterCare, healthBefore);
	}
	@Test
	public void shouldPrintString() {
		doctorUnderTest.toString();
		System.out.println(doctorUnderTest.toString());
	}

	@Test
	public void shouldGetName() {
		doctorUnderTest.getPatientName();
		System.out.println(doctorUnderTest.getPatientName());
	}
	
}
