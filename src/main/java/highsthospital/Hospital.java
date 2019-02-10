package highsthospital;

import java.util.HashMap;

public class Hospital {
	
	private HashMap<String, Employee> employees = new HashMap<String, Employee>(); // <key, value>

	public void addEmployee(Employee hospitalEmployee) {
		employees.put(hospitalEmployee.getEmployeeName(), hospitalEmployee);

	}
	
	private String employee;
	private String patient;
	
	public Hospital(String employee, String patient) {
	
		this.employee = employee;
		this.patient = patient;
	}
	
	// create a method
	public void hospitalEmployee () {
		
	}
	
	public void yearlySalery () {
		
		
	}
	
	public void hospitalPatient () {
		
	}
	

}
