package br.univel;

public class Gen {

	protected int num;
	protected int parc;
	public Gen(int parc, int num) {
		this.parc = parc;
		this.num = num;
	}
	public void imprimir() {
		System.out.println((num % 2) - this.parc);
	}
	public void imprime() {
		// TODO Auto-generated method stub
		
	}
}
