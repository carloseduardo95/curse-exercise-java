package Modulo5;

public class ExemploContaPrincipal {
	public static void main(String[] args) {
		// Criando um objeto no formato tradicional
		ExemploContaCorrente tConta = new ExemploContaCorrente();
		tConta.sacar(10.0);
		ExemploContaCorrenteEspecial tContaEsp = new ExemploContaCorrenteEspecial();
		tContaEsp.sacar(10.0);
		// Apenas uma referência para ExemploContaCorrente.
		// Não é um objeto ainda
		ExemploContaCorrente ref;
		ref = new ExemploContaCorrenteEspecial(); // Agora tornou-se // um objeto
		ref.sacar(10.0);// irá executar o método sacar de
		// ExemploContaCorrenteEspecial
		tContaEsp.imprimir(); // Executa o método imprimir da classe
		// ExemploContaCorrenteEspecial
		tContaEsp.depositar(90); // Executa o método imprimir da //classe ExemploContaCorrenteEspecial
		tConta.imprimir(); // Executa o método imprimir da classe
		// ExemploContaCorrente
		/*
		 * Esta próxima linha gera erro de compilação. A classe ExemploContaCorrente não
		 * implementa o método depositar A classe ExemploContaCorrente não tem o método
		 * depositar, e por isto nunca * vai funcionar. Para que esta linha funcione
		 * será necessário criar o método depositar em ExemploContaCorrente
		 */
		// tConta.depositar ();
		/*
		 * Esta próxima linha gera erro de compilação também. Apesar do objeto ref ser
		 * instanciado como do tipo da classe ExemploContaCorrenteEspecial este é do
		 * tipo da classe ExemploContaCorrente. Como a classe ExemploContaCorrente não
		 * implementa o método depositar o compilador Java irá apresentar um * erro de
		 * compilação. Para que esta linha funcione será necessário usar downcasting e
		 * substitui a linha existente por:
		 * ((ExemploContaCorrenteEspecial)ref).depositar ();
		 */
		// ref.depositar ();
	}
}
