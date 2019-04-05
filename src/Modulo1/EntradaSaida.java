package Modulo1;

//importação da classe Scanner do pacote java.util
import java.util.Scanner;

public class EntradaSaida {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in).useDelimiter("\r\n");
		System.out.println("Ola!"); // Mensagem inicial
		// Exibe mensagem e prepara entrada de dados
		System.out.print("Digite um inteiro: ");
		int valor = s.nextInt(); // declara e inicia variável
		// exibição do valor lido
		System.out.println("Valor digitado = " + valor);
	}
}
