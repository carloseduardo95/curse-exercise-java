package Modulo6;

public class Carro {
	public final int numeroRodas = 4;
	public int numeroPortas = 4;

	public static void main(String args[]) {
		Carro c1, c2;
		final Carro c3; // Criando apenas uma refer�ncia
		c1 = new Carro();
		// erro de compilacao. Atributo numeroRodas � final
		//c1.numeroRodas = 5;
		// Atribuindo um objeto a refer�ncia pela primeira vez
		c2 = c3 = c1;
		c2.numeroPortas = 2;
		c3.numeroPortas = 2;
		//c3 = c2; // Novamente foi tentado realizar uma atribui��o a um objeto final.
		// Erro de compila��o.
		c1 = c2;
	}
}
