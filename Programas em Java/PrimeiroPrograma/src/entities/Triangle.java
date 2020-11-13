package entities;
import  java.util.Scanner;
public class Triangle {

	private double a;
	private double b;
	private double c;
	
	public void setA(double x) {
		if(x > 0)
			a = x;
		else {
			System.out.println("Please, set a valid side lenght");
			Scanner sc = new Scanner(System.in);
			this.setA(sc.nextDouble());
			sc.close();
		}
	}
	public void setB(double y) {
		if(y > 0)
			b = y;
		else {
			System.out.println("Please, set a valid side lenght");
			Scanner sc = new Scanner(System.in);
			this.setB(sc.nextDouble());
			sc.close();
		}
	}
	public void setC(double z) {
		if(z > 0)
			c = z;
		else {
			System.out.println("Please, set a valid side lenght");
			Scanner sc = new Scanner(System.in);
			this.setC(sc.nextDouble());
			sc.close();
		}
	}

}
