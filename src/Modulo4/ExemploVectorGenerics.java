package Modulo4;

import java.util.Vector;

public class ExemploVectorGenerics {
	public static void main(String args[]) {
		MyClassVector obj = new MyClassVector();
		Vector<MyClassVector> meuVetor = new Vector<MyClassVector>();
		obj.setNome("Mauricio Saraiva");
		obj.setEndereco("Av. São Jose");
		obj.setTelefone(33333333);
		meuVetor.add(obj);
		obj = new MyClassVector();
		obj.setNome("Antunes da silva");
		obj.setEndereco("Av. Cristo Rei");
		obj.setTelefone(36224545);
		meuVetor.add(obj);
		MyClassVector o = meuVetor.get(0);
		System.out.println(o.getNome());
		System.out.println(meuVetor.get(0).getNome());
		System.out.println(meuVetor.get(0).getNome());
		System.out.println(meuVetor.get(0).getEndereco());
		System.out.println(meuVetor.get(0).getTelefone());
		System.out.println(meuVetor.get(1).getNome());
	}
}
