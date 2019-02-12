package hospitalEmployeePatient;

import java.util.Scanner;



public class Application {
	
	//public static Scanner userInput = new Scanner(System.in);
	public static Hospital hospitalEmployeePatient = new Hospital();

	private static String patientName;
	private static String individualCare;
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Hospital hospital = new Hospital();

		Doctor doctor = new Doctor("Elshaday", 001, "Doctor");
		Surgeon surgeon = new Surgeon("Benjamin", 002, "Surgeon");
		Nurse nurse = new Nurse("Tsega", 003, "Nurse");
		Receptionist receptionist = new Receptionist("Eden", 004, "Receptionist");
		VampireJanitor vampireJanitor = new VampireJanitor("The_Scary_Person", 005, "Vampire Janitor");
		RealJanitor realJanitor = new RealJanitor("Lucy", 006, "Janitor");

		hospitalEmployeePatient.addEmployee((Employee) doctor);
		hospitalEmployeePatient.addEmployee((Employee) surgeon);
		hospitalEmployeePatient.addEmployee((Employee) nurse);
		hospitalEmployeePatient.addEmployee((Employee) receptionist);
		hospitalEmployeePatient.addEmployee((Employee) vampireJanitor);
		hospitalEmployeePatient.addEmployee((Employee) realJanitor);

		Patient patient1 = new Patient("Liya", 20, 10);
		Patient patient2 = new Patient("Afro", 20, 10);
		Patient patient3 = new Patient("Ziggy", 20, 10);
		Patient patient4 = new Patient("Marley", 20, 10);
		Patient patient5 = new Patient("Jordan", 20, 10);

		hospitalEmployeePatient.addPatient(patient1);
		hospitalEmployeePatient.addPatient(patient2);
		hospitalEmployeePatient.addPatient(patient3);
		hospitalEmployeePatient.addPatient(patient4);
		hospitalEmployeePatient.addPatient(patient5);
		System.out.println("Welcome to High St Hospital");
		System.out.println("---------------------------");

		boolean mainMenu = true;

		while (mainMenu) {

			hospital.tick();
			hospital.tickAllPatients();
			
			s("*******************************");
			s("* WELCOME TO HIGH ST HOSPITAL *");
			s("*******************************");

			s("Please Choose from the option below:");
			s("1. Check Employee Stats");
			s("2. Check Patient Stats");
			s("3. Care for All the patients");
			s("4. Care for Individual Patient");
			s("5. Requiest Janitor for cleaning");
			s("6. Exit");
			s("**************************************");

			String mainMenuChoice = input.nextLine();

			switch (mainMenuChoice) {

			case "1":

				boolean employeeStats = true;

				while (employeeStats) {

					s("What Information would you like to see?");
					s("1. Names, Employee ID #, or Job Position");
					s("2. Employee Annual Salary");
					s("3. Return to Main Menu");
					s("*****************************************");

					String employeeStatChoice = input.nextLine();

					if (employeeStatChoice.equals("1")) {
						for (Employee employee : hospital.getEmployees().values()) {
							s(employee.toString());
						}
						s("***************************************");
					} else if (employeeStatChoice.equals("2")) {
						hospital.listAllSalaries();
						s("***************************************");
					} else if (employeeStatChoice.equals("3")) {
						employeeStats = false;
					}
					break;
				}
				break;

			case "2":

				
				s("Patient Stats:");
				for (Patient patient : hospital.getPatients().values()) {
					System.out.println(patient.toString());
				}
				s("***************************************");
				break;

			case "3":

				boolean careForAllMenu = true;

				while (careForAllMenu) {

					s("What would you like to do?");
					s(" 1 Care for all patients");
					s(" 2 Draw Blood ");
					s(" 3 Return to Main Menu");
					s("***************************");

					individualCare = input.nextLine();

					switch (individualCare) {

					case "1":
						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
							nurse.careForPatient(patient);
							System.out.println(patient.toString());
						}
						s("*********************************************");
						hospital.tick();
						break;

					case "2":
						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
							nurse.drawBlood(patient);
							System.out.println(patient.toString());
						}
						s("**********************************************");
						break;

					case "3":
						careForAllMenu = false;
						break;
					}
				}
				break;

			case "4":

				boolean repeatIndividualCare = true;

				while (repeatIndividualCare) {
					
					hospital.tickAllPatients();
					hospital.tick();

					s(" 1 Care of individual patient");
					s(" 2 Draw blood from individual patient");
					s(" 3 Return to main menu");
					s("************************************");
					individualCare = input.nextLine();

					switch (individualCare) {

					case "1":

						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
						}
						s("************************************");
						s("Please Type patient name:");
						patientName = input.nextLine();
						while (!hospital.getPatients().containsKey(patientName)) {
							for (Patient patient : hospital.getPatients().values()) {
								System.out.println(patient.toString());
							}
							s("Provide patient name:");
							patientName = input.nextLine();
						}
						Patient patientChoice = hospital.findPatient(patientName);
						System.out.println(patientChoice.getPatientName() + " is happy now");

						nurse.careForPatient(patientChoice);
						s(patientChoice.toString());
						s("************************************");
						hospital.tickAllPatients();
						hospital.tick();
						break;

					case "2":

						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
						}
						s("************************************");
						s("Type in patient name to proceed");
						patientName = input.nextLine();
						Patient patientBloodChoice = hospital.findPatient(patientName);
						System.out.println(patientBloodChoice.getPatientName() + " is happy now");

						nurse.drawBlood(patientBloodChoice);
						System.out.println(patientBloodChoice.toString());
						s("************************************");
						break;

					case "3":
						repeatIndividualCare = false;
						break;
					}
				}
				break;

			case "5":

				boolean repeatJanitorMenu = true;
				while (repeatJanitorMenu) {

					s("What kind of Janitor would you like to have sweep the hospital?");
					s("1 Real Person Janitor");
					s("2 Vampire Janitor");
					s("3 Check Cleanliness Status of the Hospital");
					s("4 Return to main menu");
					s("***************************************************************");
					String janitorChoice = input.nextLine();
					hospital.tick();
					hospital.tick();
					hospital.tick();
					switch (janitorChoice) {

					case "1":
						realJanitor.sweepHospital(hospital);
						break;

					case "2":
						vampireJanitor.sweepHospital(hospital);
						System.out.println(hospital.getPatients().toString());
						vampireJanitor.drawBlood(patient1);
						vampireJanitor.drawBlood(patient2);
						vampireJanitor.drawBlood(patient3);
						vampireJanitor.drawBlood(patient4);
						vampireJanitor.drawBlood(patient5);
						System.out.println(hospital.getPatients().toString());
						System.out.println("The vampire janitor sucked the blood from all patients");
						s("******************************************************");
						break;

					case "3":
						System.out.println(hospital.getpreferedCleanliness());
						break;

					case "4":
						repeatJanitorMenu = false;
						break;
					}
				}
				break;

			case "6":

				mainMenu = false;
				s("Thank You Exiting Now....!");
				break;

			default:
				s("Invalid choice.");

			}
		}
	}


	private static void s(String s) {
		System.out.println(s);

	}

}