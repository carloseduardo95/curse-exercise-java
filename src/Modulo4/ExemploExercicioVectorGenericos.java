package Modulo4;

import java.util.Scanner;
import java.util.Vector;

public class ExemploExercicioVectorGenericos {
	private Vector dados = new Vector();
	private Vector<ExemploExercicioDadosPessoais> dadosGenericos = new Vector<ExemploExercicioDadosPessoais>();

	public static void main(String[] args) {
		ExemploExercicioVectorGenericos obj = new ExemploExercicioVectorGenericos();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Listar vetor no formato da versão 1.4.");
			System.out.println("3 - Listar vetor no formato da versão 5.0.");
			System.out.println("9 - Sair.");
			System.out.print("Entre com uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				obj.cadastrar();
				break;
			case 2:
				obj.listar();
				break;
			case 3:
				obj.listarFormatoGenerico();
				break;
			default:
				if (opcao == 9) {
					System.exit(0);
				}
				System.out.println("Opção inválida.");
			}
		}
	}

	private void cadastrar() {
		Scanner sc = new Scanner(System.in);
		ExemploExercicioDadosPessoais obj = new ExemploExercicioDadosPessoais();
		System.out.println("Entre com nome:");
		String nome = sc.nextLine();
		obj.setNome(nome);
		System.out.println("Entre com o telefone:");
		String telefone = sc.nextLine();
		obj.setTelefone(telefone);
		do {
			System.out.println("Entre com a idade:");
			int idade = sc.nextInt();
			obj.setIdade(idade);
		} while (obj.getIdade() == 0);
		this.dados.add(obj);
		this.dadosGenericos.add(obj);
	}

	private void listar() {
		for (int i = 0; i < this.dados.size(); i++) {
			ExemploExercicioDadosPessoais obj = (ExemploExercicioDadosPessoais) dados.get(i);
			System.out.println("*************************");
			System.out.println("Nome: " + obj.getNome());
			System.out.println("Idade: " + obj.getIdade());
			System.out.println("Telefone: " + obj.getTelefone());
			System.out.println("*************************");
		}
	}

	private void listarFormatoGenerico() {
		for (int i = 0; i < this.dadosGenericos.size(); i++) {
			ExemploExercicioDadosPessoais obj = this.dadosGenericos.get(i);
			System.out.println("*************************");
			System.out.println("Nome: " + obj.getNome());
			System.out.println("Idade: " + obj.getIdade());
			System.out.println("Telefone: " + obj.getTelefone());
			System.out.println("*************************");
		}
	}
}