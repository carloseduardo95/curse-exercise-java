package Exercicios1ao12;

import java.util.Scanner;

public class PrincipalApolice {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in).useDelimiter("\r\n");	
		Apolice a1 = new Apolice();
		
		System.out.println("Ola!");
		System.out.println("Digite o nome do Segurado: "); a1.nomeSegurado = s.next();
		System.out.println("Digite a idade: "); a1.idade = s.nextInt();
		System.out.println("Digite o valor do prêmio: "); a1.valorPremio = s.nextFloat();
		System.out.println("Digite a cidade: "); String cidade = s.next();
		
		System.out.println("\r\n----------------------------");
		a1.calcularPremioApolice();
		a1.imprimir();
		a1.oferecerDesconto(cidade);
	}

}
