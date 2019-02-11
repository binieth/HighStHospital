package hospitalEmployeePatient;

import java.util.Scanner;

public class Application {

	private static int userInput;
	private static String patientName;
	private static String individualCare;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Hospital hospital = new Hospital();

		Doctor doctor = new Doctor("Elshaday", 001, "Doctor");
		Surgeon surgeon = new Surgeon("Benjamin", 002, "Surgeon");
		Nurse nurse = new Nurse("Tsega", 003, "Nurse");
		Receptionist receptionist = new Receptionist("Eden", 004, "Receptionist");
		VampireJanitor vampireJanitor = new VampireJanitor("The_Scary_Person", 005, "Vampire Janitor");
		RealJanitor realJanitor = new RealJanitor("Lucy", 006, "Janitor");

		hospital.addEmployee((Employee) doctor);
		hospital.addEmployee((Employee) surgeon);
		hospital.addEmployee((Employee) nurse);
		hospital.addEmployee((Employee) receptionist);
		hospital.addEmployee((Employee) vampireJanitor);
		hospital.addEmployee((Employee) realJanitor);

		Patient patient1 = new Patient("Liya ", 20, 10);
		Patient patient2 = new Patient("Afro ", 20, 10);
		Patient patient3 = new Patient("Ziggy ", 20, 10);
		Patient patient4 = new Patient("Marley ", 20, 10);
		Patient patient5 = new Patient("Jordan ", 20, 10);

		hospital.addPatient(patient1);
		hospital.addPatient(patient2);
		hospital.addPatient(patient3);
		hospital.addPatient(patient4);
		hospital.addPatient(patient5);

		s("*****************************");
		s("*WELCOME TO HIGH ST HOSPITAL*");
		s("*****************************");

		boolean mainMenu = true;

		while (mainMenu) {

			hospital.tick();
			hospital.tickAllPatients();

			s("Please Choose from the option below:");
			s("1. Check Employee Stats");
			s("2. Check Patient Stats");
			s("3. Care for All the patients");
			s("4. Care for Individual Patient");
			s("5. Call Janitor for cleaning");
			s("6. Exit");
			s("**************************************");

			String mainMenuChoice = input.nextLine();
			switch (mainMenuChoice) {

			case "1":
				boolean repeatEmployeeStats = true;
				while (repeatEmployeeStats) {

					s("What Information would you like to see?");
					s("1. Names, Employee ID #, or Job Position");
					s("2. Employee Annual Salary");
					s("3. Return to Main Menu");
					s("*****************************************");

					String employeeStatChoice = input.nextLine();

					if (employeeStatChoice.equals("1")) {
						for (Employee employee : hospital.getEmployees().values()) {
							System.out.println(employee.toString());
						}
						s("*******************************");
					} else if (employeeStatChoice.equals("2")) {
						hospital.listAllSalaries();
						s("********************************");
					} else if (employeeStatChoice.equals("3")) {
						repeatEmployeeStats = false;
					}
				}
				break;

			case "2":

				s("Patient Stats:");
				for (Patient patient : hospital.getPatients().values()) {
					s(patient.toString());
				}
				s("********************************");
				break;

			case "3":

				boolean repeatCareAllMenu = true;

				while (repeatCareAllMenu) {

					s("What would you like to do?");
					s(" 1 Care for all patients");
					s(" 2 Draw Blood ");
					s(" 3 Return to Main Menu");
					s("***************************");

					userInput = input.nextInt();

					switch (userInput) {

					case 1:
						for (Patient patient : hospital.getPatients().values()) {
							s(patient.toString());
							nurse.careForPatient(patient);
							s(patient.toString());
						}
						s("*****************************");
						hospital.tick();
						break;

					case 2:
						for (Patient patient : hospital.getPatients().values()) {
							s(patient.toString());
							nurse.drawBlood(patient);
							s(patient.toString());
						}
						s("****************************");
						break;

					case 3:
						repeatCareAllMenu = false;
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
						
						s("Type the name of the patient:-");
						patientName = input.nextLine();
						while (!hospital.getPatients().containsKey(patientName)) {
							for (Patient patient : hospital.getPatients().values()) {
								s(patient.toString());
							}
							s("Type in patient name to proceed");
							patientName = input.nextLine();
						}
						Patient patientChoice = hospital.findPatient(patientName);
						s(patientChoice.getPatientName() + " is so happy now!");

						nurse.careForPatient(patientChoice);
						s(patientChoice.toString());
						
						hospital.tickAllPatients();
						hospital.tick();
						break;

					case "2":

						for (Patient patient : hospital.getPatients().values()) {
							System.out.println(patient.toString());
						}
						s("*********************************");
						s("Please Type Patient Name:");
						patientName = input.nextLine();
						Patient patientBloodChoice = hospital.findPatient(patientName);
						s(patientBloodChoice.getPatientName() + " is so happy to be helped!");

						nurse.drawBlood(patientBloodChoice);
						s(patientBloodChoice.toString());
						s("********************************");
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

				
					s("What kind of Janitor would you like to have sweep?");
					s("1 Real Person Janitor");
					s("2 Vampire Janitor");
					s("3 Check Cleanliness Status of the Hospital");
					s("4 Return to main menu");
					s("**************************************************");
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
						s(hospital.getPatients().toString());
						s("Oh no! The vampire janitor sucked blood from all patients while sweeping!");
						s("-----------------------------------");
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
				s("Thank You For Your Visit!");
				s("See You Soon");
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