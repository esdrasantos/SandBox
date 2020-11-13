
public class StringOperations {

	public static void main(String[] args) {
		String clientName = "Pedro Alvares Cabral  ";
		String clientLowerName = clientName.toLowerCase();
		String clientUpperName = clientName.toUpperCase();
		String clientNameWithoutSpaces = clientName.trim();
		String clientCutName = clientName.substring(6);
		String clientReplaced = clientName.replace('a', 'x');
		String clientWithReplacedName = clientName.replace("Pedro", "Maria");
		// argumento pode ser um char ou uma substring
		int first = clientReplaced.indexOf('x'); 
		int last  = clientReplaced.lastIndexOf('x');
		
		System.out.println("Client's name: " + clientName);
		System.out.println("Client's name in lower case: " + clientLowerName);
		System.out.println("Client's name in upper case " + clientUpperName);
		System.out.println("Client's name without spaces: " + clientNameWithoutSpaces);
		System.out.println("Client's name with cuted name: " + clientCutName);
		System.out.println("Client's with characters replaced: " + clientReplaced);
		System.out.println("Client's with first name replaced: " + clientWithReplacedName);
		System.out.println("First appearance of 'x' at names with characters replaced: " + first);
		System.out.println("Last appearance of 'x' at names with characters replaced: " + last);
		
		String credenciais = "Erny Steigleder, 88, NH, RS";
		String[] address = credenciais.split(",");
		String rua = address[0].trim();
		String numero = address[1].trim();
		String cidade = address[2].trim();
		String estado = address[3].trim();
		
		System.out.println("Rua: " + rua);
		System.out.println("Estado: " + estado);
		
	}

}
