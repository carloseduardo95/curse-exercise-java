package Modulo2;

public class ClasseStatic {
	int a1;
	static int a2; // Manterá seu valor independentemente do objeto

	public int imprime() {
		System.out.println("a1:" + a1);
		System.out.println("a2:" + a2);
		return a2;
	}

	public static int estaticoImprime2() {
		// System.out.println("a1:" + a1);
		System.out.println("a2:" + a2);
		return a2;
	}
}
