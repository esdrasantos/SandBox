import java.util.Scanner;
public class ValorDaConta {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos minutos: ");
		double minutos = sc.nextDouble();
		double conta   = 50.0;
		
		if(minutos > 100)
		{
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.println("O valor da conta eh: " + conta);
		
		sc.close();
	}

}
