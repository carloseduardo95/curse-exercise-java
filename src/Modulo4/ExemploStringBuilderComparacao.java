package Modulo4;

public class ExemploStringBuilderComparacao {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer("");
		StringBuilder strBuilder = new StringBuilder("");
		String str = new String();
		long i = System.currentTimeMillis();
		long f = 0;
		for (int q = 0; q < 10000000; q++) {
			strBuffer.append("a");
			f = System.currentTimeMillis();
		}
		System.out.println("Tempo StringBuffer em milissegundos: " + (f - i));
		i = System.currentTimeMillis();
		f = 0;
		for (int q = 0; q < 10000000; q++) {
			strBuilder.append("a");
			f = System.currentTimeMillis();
		}
		System.out.println("Tempo StringBuilder em milissegundos: " + (f - i));
		i = System.currentTimeMillis();
		f = 0;
		// Estamos executando uma quantidade menor de vezes. Porém é mais lento sempre.
		for (int q = 0; q < 100000; q++) {
			str += "a";
			f = System.currentTimeMillis();
		}
		System.out.println("Tempo String em milissegundos: " + (f - i));
	}
}
