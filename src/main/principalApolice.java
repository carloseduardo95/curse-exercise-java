package main;

import java.util.Scanner;

import Exercicios1ao12.Apolice;

public class principalApolice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in).useDelimiter("\r\n");	
		Apolice a1 = new Apolice();
		
		System.out.println("Ola!");
		//System.out.println("Digite o nome do Segurado: "); 
		a1.setNomeSegurado("Joao carlos da Rocha");
		//System.out.println("Digite a idade: "); 
		a1.setIdade(24);
		//System.out.println("Digite o valor do pr�mio: ");
		a1.setValorPremio(1200);;
		//System.out.println("Digite a cidade: "); 
		//CURITIBA=1,RIO_DE_JANEIRO=2,SAO_PAULO=3,BELO_HORIZONTE=4; 
		a1.setCidade(3);
		
		a1.calcularPremioApolice(a1);
		a1.imprimir(a1);
		a1.oferecerDesconto(a1);
	}

}
