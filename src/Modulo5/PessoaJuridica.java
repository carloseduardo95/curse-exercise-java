package Modulo5;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void imprimir() {
		System.out.println("Imprimindo os dados da classe PessoaJuridica!");
		System.out.println(this.getCnpj());
		System.out.println(this.getRazaoSocial());
		
		System.out.println("Imprimindo os dados da classe Mãe Pessoa!");
		System.out.println(getNome());
		System.out.println(getEndereco());
	}
}
