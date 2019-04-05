package Modulo5;

public class ExemploContaPrincipal {
	public static void main(String[] args) {
		// Criando um objeto no formato tradicional
		ExemploContaCorrente tConta = new ExemploContaCorrente();
		tConta.sacar(10.0);
		ExemploContaCorrenteEspecial tContaEsp = new ExemploContaCorrenteEspecial();
		tContaEsp.sacar(10.0);
		// Apenas uma refer�ncia para ExemploContaCorrente.
		// N�o � um objeto ainda
		ExemploContaCorrente ref;
		ref = new ExemploContaCorrenteEspecial(); // Agora tornou-se // um objeto
		ref.sacar(10.0);// ir� executar o m�todo sacar de
		// ExemploContaCorrenteEspecial
		tContaEsp.imprimir(); // Executa o m�todo imprimir da classe
		// ExemploContaCorrenteEspecial
		tContaEsp.depositar(90); // Executa o m�todo imprimir da //classe ExemploContaCorrenteEspecial
		tConta.imprimir(); // Executa o m�todo imprimir da classe
		// ExemploContaCorrente
		/*
		 * Esta pr�xima linha gera erro de compila��o. A classe ExemploContaCorrente n�o
		 * implementa o m�todo depositar A classe ExemploContaCorrente n�o tem o m�todo
		 * depositar, e por isto nunca * vai funcionar. Para que esta linha funcione
		 * ser� necess�rio criar o m�todo depositar em ExemploContaCorrente
		 */
		// tConta.depositar ();
		/*
		 * Esta pr�xima linha gera erro de compila��o tamb�m. Apesar do objeto ref ser
		 * instanciado como do tipo da classe ExemploContaCorrenteEspecial este � do
		 * tipo da classe ExemploContaCorrente. Como a classe ExemploContaCorrente n�o
		 * implementa o m�todo depositar o compilador Java ir� apresentar um * erro de
		 * compila��o. Para que esta linha funcione ser� necess�rio usar downcasting e
		 * substitui a linha existente por:
		 * ((ExemploContaCorrenteEspecial)ref).depositar ();
		 */
		// ref.depositar ();
	}
}
