package Modulo6;

public class MatrizBidimensional extends VetorUnidimensional {
	private int[][] dim2;
	private int coluna;
	
	public int[][] getDim2() {
		return dim2;
	}

	public void setDim2(int[][] dim2) {
		this.dim2 = dim2;
	}

	public MatrizBidimensional() {
		/*
		 * O atributo TAMANHO esta disponível nesta classe devido ter sido criado como
		 * protected e a classe MatrizBidimensional estender a classe
		 * VetorUnidimensional.
		 */
		this.dim2 = new int[this.TAMANHO][this.TAMANHO];
	}

	public MatrizBidimensional(int pLinha, int pColuna) {
		if (((pLinha <= 0) || (pLinha > 2000000)) || ((pColuna <= 0) || (pColuna > 2000000))) {
			System.out.println("Parâmetro pLinha ou pColuna fora dos limites.");
		} else {
			this.dim2 = new int[pLinha][pColuna];
		}
	}

	public void adicionar(int valor) {
		this.dim2[this.linha][this.coluna] = valor;
		if (this.linha < this.dim2.length) {
			this.coluna++;
		}
		// utiliza-se [linha] para identificar a quantidade de colunas de cada linha
		if (this.coluna == this.dim2[linha].length) {
			this.linha++;
			this.coluna = 0;
		}
		if (this.linha == this.dim2.length) {
			this.linha = 0;
			this.coluna = 0;
			System.out.println(
					"Matriz foi excedida. O próximo valor será colocado na posição linha 0 e coluna 0 da matriz. Recomeçando.");
		}
	}

	public void imprimir() {
		// dim2.length - retorna a quantidade de linhas.
		for (int i = 0; i < this.dim2.length; i++) {
			// dim2[0].length - retorna a quantidade de colunas.
			for (int j = 0; j < this.dim2[linha].length; j++) {
				System.out.println("Elemento " + i + " : " + this.dim2[i][j]);
			}
		}
	}
}
