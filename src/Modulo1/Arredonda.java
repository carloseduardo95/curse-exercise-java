package Modulo1;

import java.math.BigDecimal;

public class Arredonda {
	public static void main(String args[]) {
		double r = 125.99999197;
		int decimalPlace = 3;
		BigDecimal bd = new BigDecimal(r);
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_DOWN);
		r = bd.doubleValue();
		System.out.println(r);
	}
}
