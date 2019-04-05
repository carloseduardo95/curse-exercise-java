package Exercicios1ao12;

import java.util.Scanner;

public class PrincipalComputador {

	public static void main(String[] args) {
		Computador obj = new Computador();
		Scanner s = new Scanner(System.in).useDelimiter("\r\n");

		System.out.println("Ola!");
		System.out.println("Digite o nome da marca: ");
		obj.marca = s.next();
		System.out.println("Digite a cor: ");
		obj.cor = s.next();
		System.out.println("Digite o modelo: ");
		obj.modelo = s.next();
		System.out.println("Digite o número de série: ");
		obj.numeroSerie = s.nextInt();
		System.out.println("Digite o preço: ");
		obj.preco = s.nextFloat();


		System.out.println("\r\n----------------------------");
		obj.imprimir();
		obj.calcularValor();
		System.out.println("\r\n----------------------------");
		obj.imprimir();
		
		Computador obj2 = new Computador();
		System.out.println("Digite o nome da marca: ");
		obj2.marca = s.next();
		System.out.println("Digite a cor: ");
		obj2.cor = s.next();
		System.out.println("Digite o modelo: ");
		obj2.modelo = s.next();
		System.out.println("Digite o número de série: ");
		obj2.numeroSerie = s.nextInt();
		System.out.println("Digite o preço: ");
		obj2.preco = s.nextFloat();


		System.out.println("\r\n----------------------------");
		obj2.calcularValor();
		obj2.imprimir();
		
		switch(obj2.alterarValor(200)) {
		case 1:
			System.out.println("ALTERADO");
			break;
		case 0:
			System.out.println("NÃO ALTERADO");
			break;
		}
	}

}
