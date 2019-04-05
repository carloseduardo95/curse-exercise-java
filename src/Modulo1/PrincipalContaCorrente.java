package Modulo1;

public class PrincipalContaCorrente {
	
	public static void main(String args[]) {
		
		ContaCorrente objeto1 = new ContaCorrente();
		objeto1.saldo = 10;
		objeto1.efetuarSaque(5);
		objeto1.imprimirSaldo();
		
		ContaCorrente objeto2 = new ContaCorrente();
		objeto2.saldo = 40;
		objeto2.imprimirSaldo();
	}
}