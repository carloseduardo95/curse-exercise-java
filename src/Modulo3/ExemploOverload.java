package Modulo3;

public class ExemploOverload {
	int calcular() {
		return 2;
	}

	int calcular(int a) {
		return a + 2;
	}

	/*
	 * // Gera erro de compilação devido a ter apenas o tipo de retorno diferente
	 * float calcular (int a){ return a + 2; }
	 */
	int calcular(int b, float f) {
		return b + (int) f;
	}

	int calcular(float f, int b) {
		return b + (int) f + 10;
	}
	
	public static void main(String args[]) {
		ExemploOverload x = new ExemploOverload();
		x.calcular(5);
	}
}
