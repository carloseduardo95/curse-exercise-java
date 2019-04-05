package Modulo4;

import java.util.Scanner;
import java.util.Vector;

public class ExemploCarroPrincipal {
	private Vector<ExemploCarro> carro = new Vector<ExemploCarro>();

	public static void main(String[] args) {
		ExemploCarroPrincipal obj = new ExemploCarroPrincipal();
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Listar vetor");
			System.out.println("0 - Sair.");
			System.out.print("Entre com uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				obj.cadastrar();
				break;
			case 2:
				obj.listar();
				break;
			default:
				if (opcao == 0) {
					System.exit(0);
				}
				System.out.println("Opção inválida.");
			}
		}
	}

	private void cadastrar() {
		Scanner sc = new Scanner(System.in);
		ExemploCarro obj = new ExemploCarro();
		
		System.out.println("Entre com uma Marca:");
		String marca = sc.nextLine();
		obj.setMarca(marca);
		
		System.out.println("Entre com um fabricante:");
		String fabricante = sc.nextLine();
		obj.setFabricante(fabricante);
		
		System.out.println("Entre com a data de fabricação:");
		String dtFabricacao = sc.nextLine();
		obj.setDtFabricacao(dtFabricacao);
		
		System.out.println("Entre com um Chassi:");
		int chassi = sc.nextInt();
		obj.setChassi(chassi);
		
		this.carro.add(obj);
	}

	private void listar() {
		for (int i = 0; i < this.carro.size(); i++) {
			ExemploCarro obj = (ExemploCarro) carro.get(i);
			System.out.println("*************************");
			System.out.println("Marca: " + obj.getMarca());
			System.out.println("Fabricante: " + obj.getFabricante());
			System.out.println("Data de Fabricação: " + obj.getDtFabricacao());
			System.out.println("Chassi: " + obj.getChassi());
			System.out.println("*************************");
		}
	}
}
