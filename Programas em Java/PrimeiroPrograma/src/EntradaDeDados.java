import java.util.Locale;
import java.util.Scanner;
public class EntradaDeDados {
	
	public static void main(String[] args)
	{
		Locale.setDefault(new Locale("pt", "BR"));
		Scanner sc = new Scanner(System.in);
		// para o programa e espera até algo ser digitado no console
		
		System.out.println("Digite seu nome: ");
		String nome     = sc.next(); 
		System.out.println("Digite uma letra qualquer: ");
		char   primeira = sc.next().charAt(0);
		System.out.println("Digite sua idade: ");
		int    idade    = sc.nextInt();
		System.out.println("Digite sua altura: ");
		double altura   = sc.nextDouble();
		
		System.out.printf("Nome: %s Idade: %d altura %.2f ", nome, idade, altura);
		System.out.println(primeira);
		sc.close();
		
	}

}
