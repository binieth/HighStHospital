package hospitalEmployeePatient;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NurseTest {
	
	Nurse underTest;
	Patient patientTest;
	
	@Before
	public void setup() {
		underTest = new Nurse("Tsega", 003, "nurse");
		patientTest = new Patient("Liya", 20, 10);
	}
	
	
	@Test
	public void shouldDrawBloodFromPatient() {
		int bloodLevelBeforeDrawn = patientTest.getBloodLevel();
		underTest.drawBlood(patientTest);
		int bloodLevelAfterDrawn = patientTest.getBloodLevel();
		assertEquals(bloodLevelAfterDrawn, bloodLevelBeforeDrawn - 2);
	}
	@Test
	public void shouldCareForPatient() {
		int healthBeforeCare = patientTest.getHealthLevel();
		underTest.careForPatient(patientTest);
		int healthAfterCare = patientTest.getHealthLevel();
		assertEquals(healthAfterCare, healthBeforeCare );
	}
}