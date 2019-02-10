package hospitalEmployee;

import java.util.HashMap;

import virtualpet.Pet;

public class Hospital {

	private HashMap<String, Employee> employees = new HashMap<String, Employee>(); // <key, value>
	private HashMap<String, Patient> patients = new HashMap<String, Patient>();

	public void addEmployee(Employee hospitalEmployee) {
		employees.put(hospitalEmployee.getEmployeeName(), hospitalEmployee);

	}

	public Employee getEmployee(String currentEmployee) {
		return employees.get(currentEmployee);
	}

	public int getEmployeeLength() {
		return employees.size();

	}

	public void fireEmployee() {
		String employeeToFire = "";

		for (Employee employee : employees.values()) {
			if (employee.getDeathValue() == 1) {
				employeeToFire = employee.getEmployeeName();
			}
		}

	}

}
