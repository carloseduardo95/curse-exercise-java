package Modulo5;

public class VetorUnidimensional {
	private int[] dim1;
	protected int linha;
	protected final int TAMANHO = 2; // valor constante

	public int[] getDim1() {
		return dim1;
	}

	public void setDim1(int[] dim1) {
		this.dim1 = dim1;
	}
	
	public VetorUnidimensional() {
		this.dim1 = new int[this.TAMANHO];
	}

	public VetorUnidimensional(int param) {
		if ((param <= 0) || (param > 2000000)) {
			// System.out.println("Tamanho para o vetor recebido inválido.");
			throw new IllegalArgumentException("Tamanho para o vetor recebido inválido.");
		} else {
			this.dim1 = new int[param];
		}
	}

	public void adicionar(int valor) {
		this.dim1[this.linha] = valor;
		this.linha++;
		if (this.linha == this.dim1.length) {
			System.out
					.println("Vetor foi excedido. O próximo valor será colocado  na posição 0 do vetor. Recomeçando.");
			this.linha = 0;
		}
	}

	// Imprimir - Apresentar o vetor na tela.
	public void imprimir() {
		for (int i = 0; i < this.dim1.length; i++) {
			System.out.println("Elemento " + i + ": " + this.dim1[i]);
		}
	}
}
