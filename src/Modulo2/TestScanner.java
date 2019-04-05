package Modulo2;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useDelimiter("\r\n");
		System.out.print("Digite um número: ");
		int number = input.nextInt();
		System.out.print("O quadrado de 	" + number + " é: 	" + number * number);
		System.out.print("Digite um nome: ");
		String nome = input.next();
		System.out.println("Nome Lido: " + nome);
	}
}