import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class MaiorNumero {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();
		System.out.println("Digite os numeros que quiser e aperte M para achar o maior");
		
		int tecla = sc.nextInt();
		
		while(tecla != 'M') {
			numeros.add(tecla);
			tecla = sc.nextInt();
		}
		
		int higher = max(numeros);
		
		sc.close();
	}
	
	public static int max(List<Integer> lista)
	{
		int maxValue = 0;
		for(int i = 0; i < lista.size(); i++)
		{
			if(lista.get(i) > maxValue)
				maxValue = lista.get(i);
		}
		return maxValue;
	}

}
