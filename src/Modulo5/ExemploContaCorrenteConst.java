package Modulo5;

public class ExemploContaCorrenteConst {
	protected int atrib1;
	protected int atrib2;

	public ExemploContaCorrenteConst() {
		super();
		System.out.println("Estou no construtor da super-classe");
	}

	public void imprimir() {
		System.out.println("param1 - " + atrib1);
		System.out.println("param2 - " + atrib2);
	}

	public ExemploContaCorrenteConst(int param1, int param2) {
		super();
		atrib1 = param1;
		atrib2 = param2;
		System.out.println("Estou no construtor da super-classe com 2 parâmetros");
	}
}
