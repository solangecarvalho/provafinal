package br.univel;

public class X {

	public static int mod = 10;
	
	public X(int i) {
		mod = i;
	}
	
	public static void execute(Integer ii) {
		System.out.println(ii + getMod());
	}
	public static int getMod() {
		return mod;
	}
	public static void setMod(int mod) {
		X.mod = mod;
	}
}
