package hospitalEmployeePatient;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JanitorTest {

	Janitor underTest;
	
	@Before
	public void setup() {
		underTest = new RealJanitor("Jorge", 006, "janitor");
	}
	
	@Test
	public void shouldStopDoingMainWorkTask() {
		boolean workStatusBeforeStopping = underTest.getMainTaskStatus();
		underTest.toggleWorkStatus();
		underTest.toggleWorkStatus();
		boolean workStatusAfterStopping = underTest.getMainTaskStatus();
		assertEquals(false, workStatusAfterStopping);
	}
}