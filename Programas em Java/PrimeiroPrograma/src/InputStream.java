import java.util.Scanner;
public class InputStream {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int index = 1;
        do
        {
            System.out.println(index + " " + sc.nextLine());
            index++;
        }while(sc.hasNext()); 
        
        /* hasNext() 
         * retorna TRUE se h� outra mensagem no fluxo de entrada e 
         * FALSE se n�o houver (presen�a do EOC - End of File)
         */
	}

}