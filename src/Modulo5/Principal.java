package Modulo5;

import java.util.Scanner;

public class Principal {
	/*
	 * devido a classe MatrizBidimensional estender a classe VetorUnidimensional,
	 * podemos definir dimensão como do tipo da superclasse.
	 */
	private VetorUnidimensional dimensao = null;

	public static void main(String[] args) {
		Principal obj = new Principal();
		obj.executar();
	}

	// Método executar: Representar um menu para que seja escolhido entre vetor e
	// matriz.
	private void executar() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Vetor");
			System.out.println("2 - Matriz");
			System.out.println("3 - Sair");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				vetorMenu();
				break;
			case 2:
				matrizMenu();
				break;
			default:
				if (opcao == 3)
					System.exit(0);
				System.out.println("Opção inválida.");
			}
		}
	}

	private void vetorMenu() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("1 - Adicionar Vetor Tamanho Padrão.");
			System.out.println("2 - Adicionar Vetor Tamanho Especificado via teclado.");
			System.out.println("3 - Imprimir vetor criado.");
			System.out.println("4 - Sair.");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				vetorAdicionarPadrao();
				break;
			case 2:
				vetorAdicionarTamEspecifico();
				break;
			case 3:
				imprimir();
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}
	private void vetorAdicionarPadrao() {
		// vai executar o construtor sem parâmetros
		this.dimensao = new VetorUnidimensional();
		adicionar();
	}

	// Adicionar em um vetor com tamanho sendo definido por um valor lido do teclado
	private void vetorAdicionarTamEspecifico() {
		Scanner sc = new Scanner(System.in);
		// vai executar o construtor com um parâmetro inteiro
		int tam = 0;
		do {
			System.out.println("Entre com o tamanho do vetor: ");
			
			tam = sc.nextInt();
			this.dimensao = new VetorUnidimensional(tam);
			// estamos usando downcasting
		} while (((VetorUnidimensional) this.dimensao).getDim1() == null);
		adicionar();
	}

	private void adicionar() {
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Entre com um valor. <0 - para finalizar>: ");
			valor = sc.nextInt();
			if (valor == 0) {
				break;
			}
			this.dimensao.adicionar(valor);
		}
	}

	private void imprimir() {
		if (this.dimensao != null) {
			this.dimensao.imprimir();
		}
	}

	private void matrizMenu() {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("1 - Adicionar Matriz Tamanho Padrão.");
			System.out.println("2 - Adicionar Matriz Tamanho Especificado via teclado.");
			System.out.println("3 - Imprimir matriz criada.");
			System.out.println("4 - Sair.");
			System.out.println("Entre com uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				matrizAdicionarPadrao();
				break;
			case 2:
				matrizAdicionarTamEspecifico();
				break;
			case 3:
				imprimir();
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	private void matrizAdicionarPadrao() {
		// vai executar o construtor sem parâmetros
		this.dimensao = new MatrizBidimensional();
		adicionar();
	}

	// Adicionar em uma matriz com tamanho sendo definido por dois valores lidos do
	// teclado.
	private void matrizAdicionarTamEspecifico() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Entre com a quantidade de linhas: ");
			int tamLinha = sc.nextInt();
			System.out.println("Entre com a quantidade de colunas: ");
			int tamColuna = sc.nextInt();
			// vai executar o construtor com dois parâmetros inteiro
			this.dimensao = new MatrizBidimensional(tamLinha, tamColuna);
			// Estamos usando downcasting ((MatrizBidimensional)) no comando while
		} while (((MatrizBidimensional) this.dimensao).getDim2() == null);
		adicionar();
	}
}