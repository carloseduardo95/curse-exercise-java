package main;


import java.util.Scanner;

import Exercicios1ao12.Computador;

public class PrincipalComputador {

	public static void main(String[] args) {
		System.out.println("Main RUN .....");
		Scanner sc = new Scanner(System.in);
		String opcao="n";
		
		//Teste entrada fixa de dados (Computador Exec 05) prof não falou como seria insercao :)
		 Computador pc = new Computador();
		 pc.setCor("Preto");
		 pc.setMarca(2);
		 pc.setModelo("Positivo");
		 pc.setNumeroSerie(1212121212);
		 pc.setPreco(100);
		 
		 pc.Descricao(pc);
		 
		 System.out.println("Deseja alterar o valor do Computador?? (s | n)");
		 opcao = sc.next();
		 if((opcao.equals("s")) || (opcao.equals("S")))
		 {    
			 System.out.println("Digite um valor \n");
			 float value=sc.nextFloat();
			 float value_old=pc.getPreco();
			 if(pc.alterarValor(value) ==0)
			 {
				 System.out.println("Valor não alterado");
			 }
			 System.out.println("Valor antigo:"+value_old+ "\n Valor  alterado para :"+pc.getPreco());
		 }
	}

}
