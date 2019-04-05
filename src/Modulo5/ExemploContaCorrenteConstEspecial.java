package Modulo5;

public class ExemploContaCorrenteConstEspecial extends ExemploContaCorrenteConst {
	private int novoParam;

	public ExemploContaCorrenteConstEspecial() {
		super();
		System.out.println("Estou no construtor da sub-classe");
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("param3 - " + novoParam);
	}

	public ExemploContaCorrenteConstEspecial(int param1, int param2, int terceiroParam) {
		super(param1, param2);
		novoParam = terceiroParam;
		System.out.println("Estou no construtor da sub-lasse com 3 parâmetros");
		imprimir();
	}
}
