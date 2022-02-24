
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses = "";
	private static int id = 100;
	private int tuitionBalance = 0;
	private static int costOfCourse = 500;

	// Constructor
	public Student() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name:");
		this.firstName = scan.nextLine();
		System.out.print("Enter Last Name:");
		this.lastName = scan.nextLine();
		System.out.print("Enter grade year:\n 1 for Fresher\n 2 for Junior\n 3 for Senior");
		this.gradeYear = scan.nextInt();
		generateStudentId();
	}

	// Method to enroll the student
	public void enroll() {
		do {
			System.out.print("Which courses would you like to enroll in? Press Q to Quit:");
			Scanner scanner = new Scanner(System.in);
			String course = scanner.nextLine();
			if (!course.equalsIgnoreCase("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				break;
			}
		} while (1 != 0);
		System.out.println("You enrolled in: " + courses);
	}

	// Method to generate student ID
	private void generateStudentId() {
		// Grade level + ID
		id++;
		this.studentId = gradeYear + "" + id;
	}

	// Method to view Balance
	public void viewBalance() {
		System.out.println("Your current balance is: £" + tuitionBalance);
	}

	// Method to pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: £");
		int payment = 0;
		Scanner scan = new Scanner(System.in);
		payment = scan.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of £" + payment);
		viewBalance();
	}

	// Method to Display info
	public String showInfo() {
		return "NAME: " + firstName + " " + lastName + "\n" + "STUDENT ID: " + studentId + "\n" + "COURSES ENROLLED: "
				+ courses + "\n" + "BALANCE: £" + tuitionBalance;
	}

}
