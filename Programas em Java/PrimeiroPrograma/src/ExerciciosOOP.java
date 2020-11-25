import java.util.Scanner;
import entities.Rectangle;

public class ExerciciosOOP {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean error = true;
		Rectangle rectangle = new Rectangle();
		
		do
		{
			System.out.println("Determine the width's rectangle.");
			error = rectangle.setWidht(scanner.nextDouble());
			
		}while(error);
		
		do
		{
			System.out.println("Determine the height's rectangle.");
			error = rectangle.setHeight(scanner.nextDouble());
		}while(error);
		
		System.out.printf("Area = %.2f%n", rectangle.area());
		System.out.printf("Perimeter = %.2f%n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f%n", rectangle.diagonal());
		scanner.close();

	}

}
