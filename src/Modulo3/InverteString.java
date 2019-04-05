package Modulo3;

public class InverteString {
	public static void main(String[] args) {
		System.out.println(metodo("Palavra"));
	}

	public static String metodo(String inicial) {
		int i, tam = inicial.length();
		StringBuffer dest = new StringBuffer(tam);
		for (i = (tam - 1); i >= 0; i--) {
			dest.append(inicial.charAt(i));
		}
		return dest.toString();
	}
}
