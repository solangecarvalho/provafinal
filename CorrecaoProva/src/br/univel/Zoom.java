package br.univel;

public class Zoom extends Plact {

	public Zoom(int num) {
		super(num + 10);
	}
	int getType() {
		return super.getType() + 10;
	}
}
