import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
	/*double pi = 3.1415;
	String nome = "Esdra";
	System.out.println("Hello, World!");
	System.out.printf("%.2f%n", pi);
	Locale.setDefault(new Locale("pt","BR"));
	System.out.printf("%.2f%n", pi);
	System.out.printf("pi é igual a " + pi + "%n");
	System.out.printf("pi é igual a %.2f%n", pi);*/
// não necessita instanciação, é um tipo... embora existam métodos especificos para objetos string
//	String product1 = new String();
	String product1 = "Computer";
//	String product2 = new String(); 
	String product2 = "Office desk";
	
	int age  		= 30;
	int code 		= 5290;
	char gender     = 'F';
	
	double price1   = 2100.0;
	double price2   = 650.50;
	double measure  = 53.234567;
	
	System.out.println("Products:");
	System.out.printf("Computer, which price is $%.2f%n", price1);
	System.out.printf("Office desk, which price is $%.2f%n%n", price2);
	System.out.printf("Record: %d years old, code %d and gender %s%n", age, code,gender);
	System.out.printf("Measure with eight decimal places: %.8f%n", measure);
	System.out.printf("three decimal places: %.3f%n", measure);
	Locale.setDefault(new Locale("pt","BR"));
	System.out.printf("with BR decimal point: %.3f%n", measure);
	
	double tax     = 0.2;
	System.out.printf("late payment fee: %.1f%n", (price1 * 0.2));
	
	}

}
