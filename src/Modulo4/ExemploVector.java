package Modulo4;

import java.util.Vector;

public class ExemploVector {
	public static void main(String args[]) {
		MyClassVector obj = new MyClassVector();
		Vector meuVetor = new Vector();
		obj.setNome("Mauricio Saraiva");
		obj.setEndereco("Av. São Jose");
		obj.setTelefone(33333333);
		meuVetor.add(obj);
		obj = new MyClassVector();
		obj.setNome("Antunes da silva");
		obj.setEndereco("Av. Cristo Rei");
		obj.setTelefone(36224545);
		meuVetor.add(obj);
		MyClassVector o = (MyClassVector) meuVetor.get(0);
		System.out.println(o.getNome());
		System.out.println(((MyClassVector) meuVetor.get(0)).getNome());
		System.out.println(((MyClassVector) meuVetor.get(0)).getNome());
		System.out.println(((MyClassVector) meuVetor.get(0)).getEndereco());
		System.out.println(((MyClassVector) meuVetor.get(0)).getTelefone());
		System.out.println(((MyClassVector) meuVetor.get(1)).getNome());
		System.out.println(((MyClassVector) meuVetor.get(1)).getEndereco());
		System.out.println(((MyClassVector) meuVetor.get(1)).getTelefone());
		obj = new MyClassVector();
		obj.setNome("Tania Mendes");
		obj.setEndereco("Av. Atilio Borio");
		obj.setTelefone(34346224);
		meuVetor.setElementAt(obj, 0);
		System.out.println(((MyClassVector) meuVetor.get(0)).getNome());
		System.out.println(((MyClassVector) meuVetor.get(0)).getEndereco());
		System.out.println(((MyClassVector) meuVetor.get(0)).getTelefone());
		System.out.println("Exemplos do metodo set");
		obj = new MyClassVector();
		obj.setNome("Antonio Carlos");
		obj.setEndereco("Av. Castelo Branco");
		obj.setTelefone(34346224);
		obj = (MyClassVector) meuVetor.set(0, obj);

		System.out.println(obj.getNome());
		System.out.println(obj.getEndereco());
		System.out.println(obj.getTelefone());

		System.out.println(((MyClassVector) meuVetor.get(0)).getNome());
		System.out.println(((MyClassVector) meuVetor.get(0)).getEndereco());
		System.out.println(((MyClassVector) meuVetor.get(0)).getTelefone());
	}
}
