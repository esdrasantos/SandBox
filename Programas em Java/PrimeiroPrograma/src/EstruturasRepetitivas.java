import java.util.Scanner;
public class EstruturasRepetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0)
		{
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma = " + soma);
		
		System.out.println("Digite quantos numeros devem ser somados. ");
		
		int count = sc.nextInt();
		x = 0;
		soma = 0;
		for(int i = 0; i < count; i++) {
			x = sc.nextInt();
			soma += x;
		}
		System.out.println("Soma = " + soma);
		
		sc.close();
		
	}

}
