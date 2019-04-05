package Modulo3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalContaCorrente {
	ContaCorrente cc1; // cc1 representa uma referência para a classe ContaCorrente
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrincipalContaCorrente obj = new PrincipalContaCorrente();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Imprimir");
			System.out.print("Entre com a opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				obj.cadastrar();
				break;
			case 2:
				obj.imprimir();
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

	private void cadastrar() {
		char opcao;
		int agencia;
		int conta;
		String nome;
		double saldo;
		do {
			System.out.println("Digitar número da conta:");
			conta = sc.nextInt();
			System.out.println("Digitar número da agência:");
			agencia = sc.nextInt();
			System.out.println("Digitar saldo da conta:");
			saldo = sc.nextDouble();
			System.out.println("Digitar nome do cliente:");
			nome = sc.next();
		} while (agencia <= 0);
		// efetuar a leitura dos demais

		this.cc1 = new ContaCorrente(conta, agencia, saldo, nome);
	}

	private void imprimir() {
		System.out.println("------------------------------------------");
		System.out.println("Agência: " + this.cc1.getAgencia());
		System.out.println("Conta: " + this.cc1.getConta());
		System.out.println("Nome: " + this.cc1.getNomeCliente());
		NumberFormat formatter;
		formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		formatter.setMinimumFractionDigits(2);
		System.out.println("Saldo: " + formatter.format(this.cc1.getSaldo()));
	}
}
