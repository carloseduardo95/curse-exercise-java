package Modulo2;

public class MetodoAcessoMod {
	public int dia = 0;

	// método de acesso
	public int getDia() {
		return dia;
	}

	// modificador
	public void setDia(int i) {
		if ((i >= 1) && (i <= 31)) {
			dia = i;
		} else {
			throw new IllegalArgumentException("Dia informado fora dos limites");
		}
	}

	public static void main(String args[]) {
		try {
			MetodoAcessoMod obj = new MetodoAcessoMod();
			obj.setDia(20);
			System.out.println(obj.getDia());
		} catch (IllegalArgumentException e) {
			System.out.println("Mensagem: " + e.getMessage());
		}
	}
}
