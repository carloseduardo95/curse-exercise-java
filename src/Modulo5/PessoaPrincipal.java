package Modulo5;

public class PessoaPrincipal {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Carlos");
		pf.setEndereco("Rua Alferes Poli");
		pf.setRg("12345-34");
		pf.setCpf("999.999.999-99");
		pf.imprimir();
		
		PessoaJuridica pj = new PessoaJuridica();
		System.out.println();
		pf.setNome("Pós FACET");
		pf.setEndereco("Rua Marechal Floriano");
		pj.setCnpj("123.124.345-34");
		pj.setRazaoSocial("FACET");
		pj.imprimir();
		
		//Pessoa pe = new PessoaFisica();
		
		Pessoa ref1;
		ref1 = new PessoaFisica();
		System.out.println();
		((PessoaFisica) ref1).setNome("joao");
		((PessoaFisica) ref1).setEndereco("Rua 24 de maio");
		((PessoaFisica) ref1).setRg("1212313");
		((PessoaFisica) ref1).setCpf("121.231.323-23");
		((PessoaFisica) ref1).imprimir();
		
		Pessoa ref2;
		ref2 = new PessoaJuridica();
		System.out.println();
		((PessoaJuridica) ref2).setNome("maria");
		((PessoaJuridica) ref2).setEndereco("Rua Sete de Setembro");
		((PessoaJuridica) ref2).setRazaoSocial("Info 7");
		((PessoaJuridica) ref2).setCnpj("675.341.876-88");
		((PessoaJuridica) ref2).imprimir();
	}

}
