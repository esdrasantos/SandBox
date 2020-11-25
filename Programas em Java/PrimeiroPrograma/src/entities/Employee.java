package entities;

public class Employee {
	
	private String name;
	private int driverLicense;
	private double grossSalary;
	private double tax;
	
	
	public Employee(String name, double grossSalary, double tax) // construtor deve ter o mesmo nome da classe
	{
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	public double nextSalary()
	{	
		return grossSalary - tax;
	}
	public void increaseSalary(double increase) {
		grossSalary *= (1 + increase/100.0);
	}
	
	public String toString() {
		return String.format("Employee: %s, $ %.2f", name, nextSalary());
	}
	
}
