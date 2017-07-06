package br.univel;

public class A implements Show {

	@Override
	public void show(Integer num) {
		String str = String.valueOf(num);
		int result = Integer.parseInt(str.substring(5, 6));
		if (result > 10) {
			result = result % 10;
		}
		System.out.println(result);
		
	}

}
