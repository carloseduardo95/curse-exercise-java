package Modulo4;

import java.util.Vector;

public class TesteVector {
	public static void main(String[] args) {
		Vector vet = new Vector();
		// vet.add(10); // Apresenta erro versão 1.4 ou menor
		Integer temp = 10;
		vet.add(temp);
		vet.add(new Integer(20));
		vet.add(new Integer(30));
		Integer x = (Integer) vet.get(0);
		System.out.println(x.intValue());
		// ou
		System.out.println(((Integer) vet.get(0)).intValue());
	}
}