package br.univel;

public class Plact extends Plunct {

	public Plact(int num) {
		super(num + 10);
	}
	int getType() {
		return super.getType() + 10;
	}
}
