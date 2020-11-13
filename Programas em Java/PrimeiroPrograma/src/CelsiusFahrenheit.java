import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double C = 0;
		double F = 0;
		char reply;
		do {
			System.out.print("Type the temperature value in Celsius.");
			C = sc.nextDouble();
			F = (9.0)/(5.0) * C + 32;
			System.out.printf("Fahrenheit equivalent: %.1f%n", F);
			System.out.println("Do you want to repeat? (y/n)");
			String s = sc.next();
			/*
			 * We can convert String to char in java using charAt() method of String class. 
			 * The charAt() method returns a single character only. 
			 * To get all characters, you can use loop.
			 */
			reply = s.charAt(0);
			
		}while(reply != 'n');
		
		sc.close();
	}

}
