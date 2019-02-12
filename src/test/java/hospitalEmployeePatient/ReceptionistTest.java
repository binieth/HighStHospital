package hospitalEmployeePatient;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReceptionistTest {
	
	Receptionist underTest;
	
	@Before 
	public void setup() {
		underTest = new Receptionist("Eden", 004, "Receptionist");
	}
	
	@Test
	public void hangUpTheDamnPhone() {
		underTest.getMainTaskStatus();
		underTest.togglePhoneStatus();
		underTest.togglePhoneStatus();
		Boolean phoneStatusAfterHangingUp = underTest.getMainTaskStatus();
		assertEquals(false, phoneStatusAfterHangingUp);
	}

	@Test
	public void answerTheDamnPhone() {
		underTest.getMainTaskStatus();
		underTest.togglePhoneStatus();
		Boolean phoneStatusAfterAnswering = underTest.getMainTaskStatus();
		assertEquals(true, phoneStatusAfterAnswering);
	}
}


