package Exercicios1ao12;

public class Computador {
	private String  cor, modelo;
	//precaucao para caso de buffer de memoria inicializar com 0
	private int numeroSerie =0,marca=0;
	private float preco =0;
	public static int DEFAULT=0,HP=1,IBM=2;

	
	//GET END SET
	public int getMarca()
	{
		return this.marca;
	}
	public void setMarca(int marca)
	{
		this.marca = marca;
	}
	public String getCor()
	{
		return this.cor;
	}
	public void setCor(String cor)
	{
		this.cor = cor;
	}
	public String getModelo()
	{
		return this.modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public int getNumeroSerie()
	{
		return this.numeroSerie;
	}
	public void setNumeroSerie(int serie)
	{
		this.numeroSerie = serie;
	}
	public float getPreco()
	{
		return this.preco;
	}
	public void setPreco(float preco)
	{
		this.preco = preco;
	}
	
	public String parseMarca(Computador pc)
	{
       if(pc.getMarca() == HP)
       {
    	   return "HP";
       }else if(pc.getMarca() == IBM) {
    	   return "IBM";
       }
       
       return "DEFAULT";
	}
	
	public void Descricao(Computador  computador)
	{
		
		System.out.println("------------VALORES------------------");
		System.out.println("Marca            :  " + parseMarca(computador));
		System.out.println("Cor              :  " + computador.getCor());
		System.out.println("Modelo           :  " + computador.getModelo());
		System.out.println("Numero de série  : " +  computador.getNumeroSerie());
		System.out.println("Preço            : " +  computador.getPreco());
		System.out.println("Com Juros        : " +  calcularValor(computador));
		System.out.println("------------VALORES------------------ \n\n\n");
	      	
	}
	public void imprimir(Computador pc) {
		//Achei meio tosco pois os dois metodo faz mesma coisa conforme enunciado :)
		Descricao(pc);
	}

	public float calcularValor(Computador pc) {
		float juros;
		switch (parseMarca(pc)) {
			case "HP":
				juros=(pc.getPreco() *30)/100;
				pc.setPreco(pc.getPreco()+juros);
				juros=0;
				return pc.getPreco();
			case "IBM":
				juros=(pc.getPreco() *50)/100;
				pc.setPreco(pc.getPreco()+juros);
				juros=0;
				return pc.getPreco();
			default:
				return pc.getPreco();
		}
	}
	
	public int alterarValor(float valor) {
		if (valor > 0) {
			this.setPreco(valor);
			return 1;
		}
		return 0;
		
	}
}
