package Modulo1;

public class ExemploDoWhile {
	public static void main(String args[]) {
		if (args.length != 0) {
			int min = Integer.parseInt(args[0]);
			int max = Integer.parseInt(args[1]);
			do {
				System.out.println(min + " < " + max);
				min++;
			} while (min <= max);
			System.out.println(min + " < " + max + " Loop encerrado");
		} else {
			System.out.println("Passar dois parâmetros com o valor máximo e mínimo");
		}
	}
}