package application;
import  java.util.Scanner;
import  entities.Student;
public class GradeManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student;
		
		System.out.println("Enter the credentials below that belongs to the student");
		
		System.out.print("NAME: ");
		student = new Student();
		student.name = scanner.nextLine();
		System.out.print("1th term grade: ");
		student.gradeFirstTerm = Double.parseDouble(scanner.nextLine());
		System.out.print("2nd term grade: ");
		student.gradeSecondTerm = Double.parseDouble(scanner.nextLine());
		System.out.print("3rd term grade: ");
		student.gradeThirdTerm = Double.parseDouble(scanner.nextLine());
		
		System.out.println("FINAL GRADE: " + student.finalGrade());
		System.out.println(student.finalDecision());
		
		scanner.close();
	
	}

}
