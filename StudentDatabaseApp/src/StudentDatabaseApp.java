import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		// How many students will be enrolled?
		System.out.println("How many students would you like to enroll?:");
		Scanner scan = new Scanner(System.in);
		int numberOfStudents = scan.nextInt();
		Student[] students = new Student[numberOfStudents];

		// Create n number of new Students
		for (int i = 0; i < numberOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}

		// Printing
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(students[i].showInfo());
		}

	}

}
