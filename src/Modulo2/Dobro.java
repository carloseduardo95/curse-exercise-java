package Modulo2;

public class Dobro {
	// declara��o da classe Dobro
	private static int instancias = 0;// armazena n�mero de inst�ncias da classe
	public int ultimoValor;

	public Dobro() {
		instancias++;
	} // construtor que atualiza no. de inst�ncias
		// retorna no. de inst�ncias

	public static int getInstancias() {
		return instancias;
	}

	public int dobro(int valor) {
		ultimoValor = valor;
		return 2 * valor;
	} // calcula o dobro
}
