package Modulo6;

public class VetorUnidimensional extends ClasseAbstrataDimensao {
	protected int[] dim1;
	protected static int linha;

	public int[] getDim1() {
		return dim1;
	}

	public void setDim1(int[] dim1) {
		this.dim1 = dim1;
	}

	public static int getLinha() {
		return linha;
	}

	public static void setLinha(int linha) {
		VetorUnidimensional.linha = linha;
	}

	public VetorUnidimensional() {
		// executando o construtor vazio da superclasse
		super();
		this.dim1 = new int[this.TAMANHO];
	}

	public VetorUnidimensional(int param) {
		// executando o construtor vazio da superclasse
		super();
		if ((param <= 0) || (param > 2000000)) {
			System.out.println("Tamanho para o vetor recebido inválido.");
		} else {
			this.dim1 = new int[param];
		}
	}

	public void adicionar(int valor) {
		this.dim1[linha] = valor;
		linha++;
		if (linha == this.dim1.length) {
			System.out.println("Vetor foi excedido. O próximo valor será colocado na posição 0 do vetor. Recomeçando.");
			linha = 0;
		}
	}

	// imprimir - Apresentar o vetor na tela.
	public void imprimir() {
		for (int i = 0; i < this.dim1.length; i++) {
			System.out.println("Elemento " + i + " : " + this.dim1[i]);
		}
	}
}
