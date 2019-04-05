package Modulo3;

public class Ponto2D {
	  // declaração da classe Ponto2D
	  // campos públicos pois não existe restrição de valores p/ coord. x e y
	  public double x, y;
	  // construtor default: ponto definido na origem (0, 0)
	  public Ponto2D() {
	    x = 0; y = 0;
	    System.out.println("Executando o construtor vazio");
	  }
	  // construtor parametrizado: ponto definido na instanciação
	  public Ponto2D(double px, double py) {
	    x = px; y = py;
	    System.out.println("Executando o construtor que recebe dois valores");
	  }
	  // método que determina distância entre instância e coordenada dada
	  public double distancia(double px, double py) {
	     return Math.sqrt(Math.pow(x - px, 2) + Math.pow(y - py, 2));
	  }
	  // método que determina distância entre instância e coordenada dada
	  public double distancia(Ponto2D p) {
	     return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
	  }
	  // método toString para auxiliar representação textual dos objetos
	  public String toString() {
	     return "Ponto2D[x=" + x + ",y=" + y + "]";
	  }
	  public static void main(String[] args) {
	     Ponto2D obj1 = new Ponto2D();
	     Ponto2D obj2 = new Ponto2D(1, 2);
	     System.out.println("Imprimindo o obj1: " + obj1);
	     System.out.println("Imprimindo o obj2: " + obj2);
	 }
	}