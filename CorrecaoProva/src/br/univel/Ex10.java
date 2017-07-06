package br.univel;

public class Ex10 {

	public static void execute(Integer ra) {
		int num = (ra % 3) + 8;
		X x1 = new X(num);
		
		X.setMod(X.getMod() + 1);
		X x2 = new X(num) ;
		
		X.setMod(X.getMod() + 1);
		X x3 = new X(num);
		
		X.setMod(X.getMod() + 1);
		X x4 = new X(num);
		
		x1.execute(num);
	}
}
