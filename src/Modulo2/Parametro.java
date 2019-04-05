package Modulo2;

public class Parametro {
	public void one() {
		int y = 1;
		System.out.println(y);
		two(y);
		System.out.println(y);
	}

	public void two(int param) {
		param = 2;
		System.out.println(param);
	}

	public static void main(String[] args) {
		Parametro obj = new Parametro();
		obj.one();
	}
}