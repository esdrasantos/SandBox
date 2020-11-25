package util;

public class Calculator {
	// Declarando um constantes: final
	public static final double PI = 3.14159;
	
	public static double circumference(double radius)
	{
		return 2 * PI * Math.pow(radius, 2);
	}
	
	public static double volume(double radius)
	{
		return 4 * PI * Math.pow(radius, 3)/3.0;
	}
	
}
