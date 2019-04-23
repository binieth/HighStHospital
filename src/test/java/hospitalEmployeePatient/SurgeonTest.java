/*
 * 
 */
package hospitalEmployeePatient;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SurgeonTest {
	Surgeon underTest;
	Patient patientTest;

	@Before
	public void setup() {
		underTest = new Surgeon("Benjamin", 002, "surgeon");
		patientTest = new Patient("Liya",  20, 10);
	}


	@Test
	public void shouldDrawnBloodFromPatient() {
		int bloodLevelBeforeDrawn = patientTest.getBloodLevel();
		underTest.drawBlood(patientTest);
		int bloodLevelAfterDrawn = patientTest.getBloodLevel();
		assertEquals(bloodLevelAfterDrawn, bloodLevelBeforeDrawn - 1);
	}
	@Test
	public void shouldCareForPatient() {
		int healthBeforeCare = patientTest.getHealthLevel();
		underTest.careForPatient(patientTest);
		int healthAfterCare = patientTest.getHealthLevel();
		assertEquals(healthAfterCare, healthBeforeCare + 1);
	}
}