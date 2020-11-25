package entities;
import  java.util.Scanner;
public class Triangle {

	private double a;
	private double b;
	private double c;
	
	public void setA(Scanner scanner) {
		
		System.out.println("Determine the measurements of side x.");
		double x;
		x = Double.parseDouble(scanner.nextLine());
     	if(x > 0)
			a = x;
		else {
			System.out.println("Please, set a valid side lenght");
			this.setA(scanner);	
		}
     	
	}
	public void setB(Scanner scanner) {
		System.out.println("Determine the measurements of side y.");
		double y = Double.parseDouble(scanner.nextLine());
		if(y > 0)
			b = y;
		else {
			System.out.println("Please, set a valid side lenght");
			this.setB(scanner);
		}
	}
	public void setC(Scanner scanner) {
		System.out.println("Determine the measurements of side z.");
		Double z = Double.parseDouble(scanner.nextLine());
		if(z > 0)
			c = z;
		else {
			System.out.println("Please, set a valid side lenght");
			Scanner sc = new Scanner(System.in);
			this.setC(scanner);
		}
	}
	
	public double calculateArea() {
		
		double p = (a+b+c)/2.0;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}

}
