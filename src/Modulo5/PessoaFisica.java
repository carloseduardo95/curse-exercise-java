package Modulo5;

public class PessoaFisica extends Pessoa {
	private String rg;
	private String cpf;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimir() {
		System.out.println("Imprimindo os dados da classe PessoaFisica!");
		System.out.println(this.getRg());
		System.out.println(this.getCpf());
		
		System.out.println("Imprimindo os dados da classe Mãe Pessoa!");
		System.out.println(getNome());
		System.out.println(getEndereco());
	}
}
