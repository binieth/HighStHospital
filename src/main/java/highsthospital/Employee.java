package highsthospital;

public class Employee {

	// creating variables or instance field.
	private String name;
	private int idNumber;
	private String speciality;
	private boolean hospitalEmployee;

	// creating a constructor

	public Employee(String name, int idNumber, String speciality, boolean hospitalEmployee) {

		this.name = name;
		this.idNumber = idNumber;
		this.speciality = speciality;
		this.hospitalEmployee =true;
	}
	
	// creating a method:

	public String getName() {
		return name;
	}

	
	public int getIdNumber() {
		return idNumber;
	}

	
	public String getSpeciality() {
		return speciality;
	}

	public boolean isHospitalEmployee() {
		return hospitalEmployee;
	}

	
		
}
