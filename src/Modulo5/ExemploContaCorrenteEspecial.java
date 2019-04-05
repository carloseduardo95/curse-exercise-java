package Modulo5;

public class ExemploContaCorrenteEspecial extends ExemploContaCorrente {
	private double limite;

	public ExemploContaCorrenteEspecial() {
		super();
		limite = 1000;
	}

	// Este método sofreu override
	public void sacar(double valor) {
		System.out.println("Classe ExemploContaCorrenteEspecial, metodo sacar");
		saldo = saldo - valor;
	}

	public void depositar(double valor) {
		System.out.println("Classe ExemploContaCorrenteEspecial, metodo depositar");
	}

	public void imprimir() {
		super.imprimir(); // Executa o método imprimir da superclasse
		System.out.println("Metodo imprimir da classe ExemploContaCorrenteEspecial");
		System.out.println("Limite: " + limite);
	}
}