package Exercicios1ao12;

public class Acampamento {
	String nome, equipe;
	int idade;

	//GET END SET
	public void getNome()
	{
		return this.nome;
	}
	public String setNome()
	
	public int descricao(int value)
	{

	}
	public void imprimir() 
	{
		System.out.println("-------------Produto-------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Equipe: " + this.equipe);
		System.out.println("Idade: " + this.idade);
		System.out.println("-------------Produto-------------");
	}
	
	public void separarGrupo() {
		if (this.idade >= 6 && this.idade <= 10) {
			this.equipe = "A";
		}else if(this.idade >= 11 && this.idade <= 20) {
			this.equipe = "B";
		}else if (this.idade > 21) {
			this.equipe = "C";
		}else {
			System.out.println("idade incompat�vel");
		}
	}
}
