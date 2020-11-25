package entities;
import java.util.Scanner;
public class Rectangle {
	
	private double width;
	private double height;
	
	public boolean setWidht(double width) {
		if(width > 0)
		{
			this.width = width;
			return false;
		}
		else
			return true;
	}
	
	public boolean setHeight(double height) {
		if(height > 0)
		{
			this.height = height;
			return false;
		}
		else
			return true;	
	}
	
	public double area() {
		return width * height;	
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		double power = Math.pow(width, 2) + Math.pow(height, 2);
		return (Math.sqrt(power));
	}
	
}
