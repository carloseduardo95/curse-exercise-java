package Exercicios1ao12;

import java.util.Scanner;

public class PrincipalAcampamento {
	public static void main(String[] args) {
		Acampamento obj = new Acampamento();
		Scanner s = new Scanner(System.in).useDelimiter("\r\n");
		
//		System.out.println("Ola!");
//		System.out.println("Digite o nome do Acampamento: "); obj.nome = s.next();
//		System.out.println("Digite a equipe: "); obj.equipe = s.next();
//		System.out.println("Digite a idade: "); obj.idade = s.nextInt();
//		
		System.out.println("\r\n----------------------------");
		obj.imprimir();
		obj.separarGrupo();
		obj.imprimir();
	}
}
