package Modulo1;

public class ExemploVariaveis {
	  
	  int atributoNaoEstatico;
	  static int atributoEstatico;
	  
	  public static void main(String[] args) {
	    int variavelMetodo = 50;
	    
	    ExemploVariaveis obj = new ExemploVariaveis ();
		    obj.atributoNaoEstatico = 10;
		    obj.atributoEstatico = 20;
		    obj.imprimir();
	    
	    ExemploVariaveis obj1 = new ExemploVariaveis ();
		    obj1.atributoNaoEstatico = 160;
		    obj1.atributoEstatico = 320;
		    obj1.imprimir();
		    System.out.println("-------------------");
		    obj.imprimir(); // irá imprimir o valor que obj2 atribuiu
	  }
	  
	  public void imprimir (){
	     System.out.println("Atributo não estatico: " + atributoNaoEstatico);
	     System.out.println("Atributo estatico: " + atributoEstatico);
	  }
}