package Modulo1;

public class SaidaFormatadaStrings {

	public static void main(String a[]) {
		System.out.println("\n\n ****** Exemplos com String");
		String str = "abcdefghijklmn";
		System.out.printf("\nString normal: %s", str);
		System.out.printf("\nString em Maiúsculo: %S", str);
		System.out.printf("\nCorta a partir da letra k: %.11s\n", str);
		System.out.printf("\nImprime com espaços a esquerda: |%18s|\n", str);
	}
}
