package Modulo1;

public class ContaCorrente {
	int conta;
	int agencia;
	double saldo;

	void efetuarSaque(double valor) {
		saldo = saldo - valor;
	}

	void efetuarDeposito(double valor) {
		saldo = saldo + valor;
	}

	void imprimirSaldo() {
		System.out.println(saldo);
	}
}
