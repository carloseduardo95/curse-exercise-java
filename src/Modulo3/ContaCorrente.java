package Modulo3;

public class ContaCorrente {
	private int conta, agencia;
	private double saldo;
	private String nomeCliente;

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ContaCorrente(int agencia, int conta) {
		super();
		this.conta = conta;
		this.agencia = agencia;
	}

	public ContaCorrente(int conta, int agencia, double saldo, String nomeCliente) {
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nomeCliente = nomeCliente;
	}

	public int sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return 1;
		}
		return 0;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void imprimir() {
		System.out.println("Número da conta: " + this.conta);
		System.out.println("Número da agência: " + this.agencia);
		System.out.println("Saldo da conta corrente: " + this.saldo);
		System.out.println("Nome do cliente: " + this.nomeCliente);
	}
}