package br.univel;

public class CompartimentoLista<T> {

	private T objeto;
	private CompartimentoLista<T> proximo;

	public CompartimentoLista(T t) {
		this.objeto = t;
	}

	public T getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public CompartimentoLista<T> getProximo() {
		return proximo;
	}

	public void setProximo(CompartimentoLista<T> proximo) {
		this.proximo = proximo;
	}
}
