package Modulo1;

import java.util.Scanner;

public class ExemploBreak {
	public static void main(String args[]) {
		int pares = 0; // variável p/ contar pares encontrados
		int max = 0; // variável p/ indicar numero máximo de pares
		// leitura do número máximo de pares desejados
		System.out.print("Maximo no pares ? ");
		Scanner s = new Scanner(System.in);
		max = s.nextInt();
		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				System.out.println("i = " + i);
				pares++;
			}
			if (pares == max) {
				break;
			}
		}
	}
}
