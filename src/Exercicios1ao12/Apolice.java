package Exercicios1ao12;

public class Apolice {
	
	private String nomeSegurado;
	private int idade,cidade;
	private float valorPremio;
	public static int CURITIBA=1,RIO_DE_JANEIRO=2,SAO_PAULO=3,BELO_HORIZONTE=4; 
	
	
	public String getNomeSegurado() 
	{
		return nomeSegurado;
	}

	public void setNomeSegurado(String nomeSegurado) 
	{
		this.nomeSegurado = nomeSegurado;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public int getCidade()
	{
		return cidade;
	}

	public void setCidade(int cidade) 
	{
		this.cidade = cidade;
	}

	public float getValorPremio() 
	{
		return valorPremio;
	}

	public void setValorPremio(float valorPremio) 
	{
		this.valorPremio = valorPremio;
	}

	public void imprimir(Apolice ap) 
	{
		System.out.println("------------APOLICE--------------\n");
		System.out.println("Nome do segurado: " +ap.getNomeSegurado());
		System.out.println("Idade: "+ap.getIdade());
		System.out.println("Valor do Premio: "+ap.getValorPremio());
		System.out.println("\n------------APOLICE--------------");
	}
	
	public void calcularPremioApolice(Apolice ap)
	{
		
		if ( (ap.getIdade() > 18) && (ap.getIdade()<= 25)) {
			ap.setValorPremio((ap.getValorPremio()*20)/100);
		} else if (this.idade > 25 && this.idade <= 36) {
			ap.setValorPremio((ap.getValorPremio()*15)/100);
		} else if (this.idade > 36) {
			ap.setValorPremio((ap.getValorPremio()*10)/100);
		}else {
			System.out.println("Menor que 18 anos!");		
		}
		
	    
	}
	public String parseCidade(Apolice ap)
	{
		   if(ap.getCidade() == CURITIBA) {
			   return "Curitiba";
		   }
		   else if(ap.getCidade() == RIO_DE_JANEIRO) {
			   return "Rio de Janeiro";
		   }
		   else if(ap.getCidade() == SAO_PAULO) {
			   return "São Paulo";
		   }
		   else if(ap.getCidade() == BELO_HORIZONTE) {
			   return "Belo Horizonte";
		   }
		
		return "Nenhuma cidade";
	}
	
	public void oferecerDesconto(Apolice ap) {
		double desconto=0;
		switch (parseCidade(ap)) {
			case "Curitiba":
				desconto = (ap.getValorPremio() - (ap.getValorPremio() * 0.20));
				System.out.println("O valor com desconto : "+desconto);
				break;
			case "Rio de Janeiro":
				desconto = (ap.getValorPremio() - (ap.getValorPremio() * 0.15));
				System.out.println("O valor com desconto : "+desconto);
				break;
			case "São Paulo":
				desconto = (ap.getValorPremio() - (ap.getValorPremio() * 0.10));
				System.out.println("O valor com desconto : "+desconto);
				break;
			case "Belo Horizonte":
				desconto = (ap.getValorPremio() - (ap.getValorPremio() * 0.05));
				System.out.println("O valor com desconto : "+desconto);
				break;
		}
	}

}
