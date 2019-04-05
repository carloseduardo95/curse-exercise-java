package Modulo3;

public class ExemploExercicioDadosPessoais {

	private String nome;
	private String telefone;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if ((idade <= 0) || (idade > 110)) {
			throw new IllegalArgumentException("Idade não compatível.");
		} else {
			this.idade = idade;
		}
	}

}
