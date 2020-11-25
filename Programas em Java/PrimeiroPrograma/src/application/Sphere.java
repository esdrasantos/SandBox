package application;
import  java.util.Scanner;
import  util.Calculator;
public class Sphere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = scanner.nextDouble();
		double c      = Calculator.circumference(r);
		double v      = Calculator.volume(r);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.println("Value of PI = " + String.format("%.2f", Calculator.PI));
		
		scanner.close();
	}
}
