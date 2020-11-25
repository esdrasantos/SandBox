package companies;
import  entities.Product;
import  entities.Employee;
import  java.util.Scanner;
public class DunderMifflin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	/*
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name ");
		product.setName(scanner.nextLine());
		System.out.print("Price ");
		product.price = Double.parseDouble(scanner.nextLine());
		System.out.print("Quantity in stock ");
		product.quantity = Integer.parseInt(scanner.nextLine());
		System.out.print("Product Data: ");
		System.out.println(product.toString());
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(scanner.nextInt());
		System.out.print("Update Data: ");
		System.out.println(product.toString());
		
		System.out.print("Enter the number of products to be removed in stock: ");
		product.removeProducts(scanner.nextInt());
		System.out.print("Update Data: ");
		System.out.println(product.toString());
		
	*/	
		Employee employee;
		
		System.out.print("Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Gross salary: ");
		Double grossSalary = scanner.nextDouble();
		
		System.out.print("Tax: ");
		Double tax = scanner.nextDouble();
		
		employee = new Employee(name, grossSalary, tax);
		System.out.println(employee);
		
		System.out.print("Which porcentage to increase salary? ");
		employee.increaseSalary(scanner.nextDouble());
		
		System.out.println("Updated data: " + employee);
		
		
		scanner.close();
	}

}
