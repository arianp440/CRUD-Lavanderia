package br.unisul.aula.trabalho;

public class Pessoal extends Roupa {

	private boolean delicada;
	private int quantidade;

	public boolean isDelicada() {
		return delicada;
	}

	public void setDelicada(boolean delicada) {
		this.delicada = delicada;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public double calcularValor() {
		preco = 1;
		if (delicada) {
			preco = 7;
		} else {
			preco = 3;
		}

		return preco * quantidade;
	}

}
