package Modulo1;

public class ExemploForAvancado1 {
	public static void main(String arg[]) {
		double arranjo[] = { 1.1964, 6.1995, 6.1935, 7.1931, 12.1968 };
		// for tradicional para exibição
		int tamanho = arranjo.length;
		for (int i = 0; i <= tamanho - 1; i++) {
			System.out.print(arranjo[i] + " ");
		}
		System.out.println();
		// for avançado para exibição
		for (double elemento : arranjo) {
			System.out.print(elemento + " ");
		}
	}
}
