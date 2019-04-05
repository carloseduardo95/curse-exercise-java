package Modulo1;

import java.math.BigDecimal;

public class SaidaFormatadaDouble {
	public static void main(String a[]) {
		System.out.println("****** Exemplo com o tipo double");
		double pontod = 125.9870;
		System.out.printf("\nValor negativo com sinal de -: %f", -pontod);
		System.out.printf("\nValor negativo colocado entre parênteses: %(f", -pontod);
		System.out.printf("\nCom seis casas decimais(default): %f", pontod);
		System.out.printf("\nCom duas casas: %.2f", pontod);
		System.out.printf("\nCom uma casa: %.1f - Arredondou para 126,0", pontod);
		// Para não arredondar, usaremos BigDecimal
		BigDecimal bd = new BigDecimal(pontod);
		bd = bd.setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println("\nCom uma casa, sem arredondar: " + bd.doubleValue());
	}
}