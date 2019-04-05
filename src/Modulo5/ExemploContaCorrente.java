package Modulo5;

public class ExemploContaCorrente {
	protected int agencia;
	protected int conta;
	protected String nome;
	protected double saldo;

	public ExemploContaCorrente() {
		super();
		agencia = 10;
		conta = 300;
		nome = "Larrisa";
		saldo = 500;
	}

	public void sacar(double valor) {
		System.out.println("Classe ExemploContaCorrente, metodo sacar");
		saldo = saldo - valor;
	}

	public void imprimir() {
		System.out.println("Metodo imprimir da classe ExemploContaCorrente");
		System.out.println("Agencia : " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Nome: " + nome);
		System.out.println("Saldo: " + saldo);
	}
}
