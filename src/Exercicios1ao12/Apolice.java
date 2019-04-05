package Exercicios1ao12;

public class Apolice {
	
	String nomeSegurado;
	int idade;
	float valorPremio;
	
	public void imprimir() {
		System.out.println("Nome do segurado: " +this.nomeSegurado);
		System.out.println("Idade: "+this.idade);
		System.out.println("Valor do Prêmio: "+this.valorPremio);
	}
	
	public void calcularPremioApolice() {
		
		if ( this.idade > 18 && this.idade <= 25) {
			this.valorPremio += (this.valorPremio * 20)/100;
		} else if (this.idade > 25 && this.idade <= 36) {
			this.valorPremio += (this.valorPremio *15)/100;
		} else if (this.idade > 36) {
			this.valorPremio += (this.valorPremio * 10)/100;
		} else {
			System.out.println("Menor que 18 anos!");
		}
		
	}
	
	public void oferecerDesconto(String cidade) {
		double desconto;
		switch (cidade) {
			case "curitiba":
			case "Curitiba":
				desconto = (this.valorPremio - (this.valorPremio * 0.20));
				System.out.println("O valor com desconto é: "+desconto);
				break;
			case "rj":
			case "RJ":
				desconto = (this.valorPremio - (this.valorPremio * 0.15));
				System.out.println("O valor com desconto é: "+desconto);
				break;
			case "sp":
			case "SP":
				desconto = (this.valorPremio - (this.valorPremio * 0.10));
				System.out.println("O valor com desconto é: "+desconto);
				break;
			case "bh":
			case "BH":
				desconto = (this.valorPremio - (this.valorPremio * 0.05));
				System.out.println("O valor com desconto é: "+desconto);
				break;
		}
	}

}
