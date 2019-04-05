package Modulo2;

public class ParamRef {
	int field = 0;

	public ParamRef() {
	}

	public ParamRef(int arg) {
		field = arg;
	}

	public void assign(int arg) {
		field = arg;
	}

	public String toString() {
		return Integer.toString(field);
	}

	public void one() {
		ParamRef y = new ParamRef(1);
		System.out.println(y);
		two(y);
		System.out.println(y);
	}

	public void two(ParamRef param) {
		param.assign(2);
		System.out.println(param);
	}

	public static void main(String[] args) {
		ParamRef obj = new ParamRef();
		obj.one();
	}
}