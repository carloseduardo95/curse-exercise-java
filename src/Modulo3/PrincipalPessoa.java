package Modulo3;

import java.util.Scanner;

public class PrincipalPessoa {
	
	Pessoa pessoa;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrincipalPessoa obj = new PrincipalPessoa();
		
		while (true) {
			   System.out.println("1 – Cadastrar");    
			   System.out.println("2 - Imprimir");
			   System.out.print("Entre com uma opção: ");
			   int opcao = sc.nextInt();
	
			switch (opcao) {
			      case 1:
			          obj .cadastrar();
			          break;
			      case 2:
			          obj.imprimir(); break;
			      default:
			          System.out.println("Opção inválida.");
			   }
		}
	}
	private void cadastrar() {
		   Scanner sc = new Scanner(System.in).useDelimiter("\r\n");
		   System.out.print("Entre com o nome: ");
		   String nome = sc.next();
		   String dtNasc;
		   do {
		      do {
		          System.out.print("Entre com a data de nascimento (DD/MM/AAAA): ");
		          dtNasc = sc.next();
		      } while (dtNasc.length() != 10);
		   } while (dtNasc.charAt(2) != '/' || (dtNasc.charAt(5)) != '/');
		   System.out.print("Entre com o cpf: ");
		   int cpf = sc.nextInt();
		   // executando o construtor passando três variáveis como parâmetros
		   this.pessoa = new Pessoa(cpf, nome, dtNasc);
	}
	
	private void imprimir() {
		   System.out.println("CPF: " + this.pessoa.getCpf());
		   System.out.println("Nome: " + this.pessoa.getNome());
		   System.out.println("Data de nascimento: " + this.pessoa.getDataNasc());
	}
}