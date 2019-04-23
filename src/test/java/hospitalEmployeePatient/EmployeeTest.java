/*
 * Here i will be testing the Employee Class.
 */
package hospitalEmployeePatient;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hospitalEmployeePatient.Employee;

public class EmployeeTest {
	
	@Test
	public void employeIdNumberShouldReturn001() {
		//Arrange 
		Employee underTest = new Employee("",123,"",true, 1);
		//Act
		int answer = underTest.getIdNumber();
		//Assert
		assertEquals(answer, 123);
	}
	
	@Test
	public void employeNameShouldReturnName() {
		//Arrange 
		Employee underTest = new Employee("Bini",123,"",true, 1);
		//Act
		String answer = underTest.getEmployeeName();
		//Assert
		assertEquals(answer, "Bini");
	}
	
	@Test
	public void employeSpecialityShouldReturnSpeciality() {
		//Arrange 
		Employee underTest = new Employee("",123,"Brain",true, 1);
		//Act
		String answer = underTest.getSpeciality();
		//Assert
		assertEquals(answer, "Brain");
	}
	
	@Test
	public void employeStatusShouldReturnHospitalEmployee() {
		//Arrange 
		Employee underTest = new Employee("",123,"",true, 1);
		//Act
		boolean answer = underTest.isHospitalEmployee();
		//Assert
		assertEquals(answer, true);
	}
	

	

	


}
