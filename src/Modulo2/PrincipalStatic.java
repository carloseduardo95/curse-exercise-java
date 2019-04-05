package Modulo2;

public class PrincipalStatic {
	public static void main(String[] args) {
		ClasseStatic obj1 = new ClasseStatic();
		obj1.a1 = 100;
		ClasseStatic.a2 = 200;
		System.out.println("Dados do objeto obj1:");
		obj1.imprime();
		System.out.println("----------");
		ClasseStatic obj2 = new ClasseStatic();
		obj2.a1 = 300;
		ClasseStatic.a2 = 400;
		System.out.println("Dados do objeto obj2:");
		obj2.imprime();
		System.out.println("----------");
		System.out.println("Novamente os dados do objeto obj1:");
		obj1.imprime();
		System.out.println("----------");
		System.out.println("Dados do objeto ClasseStatic:");
		ClasseStatic.estaticoImprime2();
		System.out.println("----------");
	}
}
