package Modulo1;

public class SaidaFormatadaInteiros {
	public static void main(String a[]) {
		// Exemplos com int
		int inteiro = 1254;
		System.out.println("****** Exemplo com o tipo int");
		System.out.printf("Valor normal:  |%d|", inteiro);
		System.out.printf("\nValor representado com milhar:  |%,d|", inteiro);
		System.out.printf("\nValor Negativo:  |%(d|", -inteiro);
		System.out.printf("\nValor com sinal positivo: |%+d| ", inteiro);
		System.out.printf("\nValor com sinal negativo: |-%d| ", inteiro);
		System.out.printf("\nValor com zeros a esquerda: |%07d|", inteiro);
		System.out.printf("\nValor com zeros a esquerda e o sinal de +: |%+07d|", inteiro);
		System.out.printf("\nValor com espaços a esquerda: |%7d|", inteiro);
		System.out.printf("\nValor com 10 espaços e alinhado a esquerda: |%-10d|",inteiro);
		System.out.printf("\nValor em percentual:  |%d%%|", inteiro);
		}
}
