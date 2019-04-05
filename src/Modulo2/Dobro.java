package Modulo2;

public class Dobro {
	// declaração da classe Dobro
	private static int instancias = 0;// armazena número de instâncias da classe
	public int ultimoValor;

	public Dobro() {
		instancias++;
	} // construtor que atualiza no. de instâncias
		// retorna no. de instâncias

	public static int getInstancias() {
		return instancias;
	}

	public int dobro(int valor) {
		ultimoValor = valor;
		return 2 * valor;
	} // calcula o dobro
}
