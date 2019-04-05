package Modulo6;

public class Carro {
	public final int numeroRodas = 4;
	public int numeroPortas = 4;

	public static void main(String args[]) {
		Carro c1, c2;
		final Carro c3; // Criando apenas uma referência
		c1 = new Carro();
		// erro de compilacao. Atributo numeroRodas é final
		//c1.numeroRodas = 5;
		// Atribuindo um objeto a referência pela primeira vez
		c2 = c3 = c1;
		c2.numeroPortas = 2;
		c3.numeroPortas = 2;
		//c3 = c2; // Novamente foi tentado realizar uma atribuição a um objeto final.
		// Erro de compilação.
		c1 = c2;
	}
}
