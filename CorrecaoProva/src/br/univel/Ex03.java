package br.univel;

public class Ex03 {

	public static void execute(Integer ii) {
		String str = String.valueOf(ii);
		int parc = Integer.parseInt(str.substring(5, 6));
		Plunct a = new Plact(parc);
		Plact b = new Zoom(parc);
		System.out.println(a.getType() + b.getType());
	}
}

