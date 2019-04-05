package Exercicios1ao12;

public class Computador {
	public String marca, cor, modelo;
	public int numeroSerie;
	public float preco;

	public void imprimir() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.cor);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Numero de série: " + this.numeroSerie);
		System.out.println("Preço: " + this.preco);
	}

	public void calcularValor() {
		switch (this.marca) {
			case "hp":
			case "HP":
				this.preco += ((this.preco*30)/100);
				System.out.println(this.preco);
				break;
			case "ibm":
			case "IBM":
				this.preco += ((this.preco*50)/100);
				System.out.println(this.preco);
				break;
			default:
				System.out.println(this.preco);
		}
	}
	
	public int alterarValor(float valor) {
		if (valor > 0) {
			this.preco = valor;
			return 1;
		}else {
			return 0;
		}
		
	}
}
