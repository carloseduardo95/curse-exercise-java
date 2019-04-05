package Modulo4;

public class ExemploString {
	public static void main(String[] args) {
		String nome = "Antonio Carlos";
		int idade = 30;
		System.out.println(nome + " tem: " + idade + " anos");
		String str = null;
		System.out.println(String.valueOf(idade)); // Conversão de int para String
		System.out.println(nome.substring(2, 4)); // Irá imprimir a partir do 2º byte até o 4º byte =to
		System.out.println(nome.replace('o', '9')); // Irá subst. o caracter o para 9 = Ant9ni9 Carl9s
		// retorna a String como um vetor de caracteres.
		char[] vetorCaracteres = nome.toCharArray();
		System.out.println(vetorCaracteres[0]); // imprime A
		String variavel01 = "Antonio Carlos da Silva Sauro";
		String[] vetorString = variavel01.split(" "); // Ret. um vetor de Strings separados pelo espaço
		System.out.println(vetorString[3]); // silva
		if (nome.equals("Antonio Carlos")) {
			System.out.println("Strings com conteúdos iguais");
		}
		if (nome.equalsIgnoreCase("ANTONIO CARLOS")) {
			System.out.println("Strings com conteúdos iguais");
		}
		if (nome == variavel01) {
			System.out.print("Strings com referências Iguais");
		}
		String var1 = "uva";
		String var2 = "abacaxi";
		if (var1.compareTo(var2) == 0)
			System.out.println("Strings iguais");
		else if (var1.compareTo(var2) > 0)
			System.out.println("String 1 maior que String 2");
		else if (var1.compareTo(var2) < 0)
			System.out.println("String 1 menor que String 2");
	}
}