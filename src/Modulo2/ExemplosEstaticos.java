package Modulo2;

public class ExemplosEstaticos {
	public static void main(String[] args) {
		int inteiro = 100;
		// convertendo um tipo int para String
		String str = String.valueOf(inteiro);

		// Convertendo de String para Integer, que poderá ser Manipulado como um int.
		Integer inteiro2 = Integer.parseInt(str);

		String str2 = "Semana do curso de Java";
		char strVet[] = str2.toCharArray();
		for (int i = strVet.length - 1; i >= 0; i--) {
			System.out.println(strVet[i]);
		}
	}
}
