package Modulo5;

public class ExemploContaCorrenteConstPrincipal {
	public static void main(String[] args) {
		ExemploContaCorrenteConstEspecial tContaEsp = new ExemploContaCorrenteConstEspecial(10, 20, 90);
		ExemploContaCorrenteConstEspecial tContaEsp1 = new ExemploContaCorrenteConstEspecial();
		tContaEsp1.imprimir();
	}
}
